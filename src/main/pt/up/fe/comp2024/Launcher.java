package pt.up.fe.comp2024;

import pt.up.fe.comp.TestUtils;
import pt.up.fe.comp.jmm.analysis.JmmSemanticsResult;
import pt.up.fe.comp.jmm.jasmin.JasminResult;
import pt.up.fe.comp.jmm.ollir.OllirResult;
import pt.up.fe.comp.jmm.parser.JmmParserResult;
import pt.up.fe.comp2024.analysis.JmmAnalysisImpl;
import pt.up.fe.comp2024.optimization_jasmin.AstToJasminImpl;
import pt.up.fe.comp2024.optimization.JmmOptimizationImpl;
import pt.up.fe.comp2024.parser.JmmParserImpl;
import pt.up.fe.specs.util.SpecsIo;
import pt.up.fe.specs.util.SpecsSystem;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Launcher {

    public static void main(String[] args) {
        SpecsSystem.programStandardInit();

        Map<String, String> config = CompilerConfig.parseArgs(args);

        var inputFile = CompilerConfig.getInputFile(config).orElseThrow();
        if (!inputFile.isFile()) {
            throw new RuntimeException("Option '-i' expects a path to an existing input file, got '" + args[0] + "'.");
        }

        String code = SpecsIo.read(inputFile);

        // Parsing stage
        JmmParserImpl parser = new JmmParserImpl();
        JmmParserResult parserResult = parser.parse(code, config);
        
        TestUtils.noErrors(parserResult.getReports());

        // Print AST
        System.out.println(parserResult.getRootNode().toTree());

        // Semantic Analysis stage
        JmmAnalysisImpl sema = new JmmAnalysisImpl();
        JmmSemanticsResult semanticsResult = sema.semanticAnalysis(parserResult);        

        TestUtils.noErrors(semanticsResult.getReports());

        System.out.println(semanticsResult.getSymbolTable().print()); 

        
        // // Optimization stage
        // JmmOptimizationImpl ollirGen = new JmmOptimizationImpl();
        // OllirResult ollirResult = ollirGen.toOllir(semanticsResult);
        // TestUtils.noErrors(ollirResult.getReports());
        // // Print OLLIR code
        // System.out.println(ollirResult.getOllirCode());

        // Code generation stage
        AstToJasminImpl jasminGen = new AstToJasminImpl();
        JasminResult jasminResult = jasminGen.toJasmin(semanticsResult);
        TestUtils.noErrors(jasminResult.getReports());
        
        // Print Jasmin code
        System.out.println(jasminResult.getJasminCode());


        //Get all the Jasmin Code to input.j
        String jasminCode = jasminResult.getJasminCode();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("input.j"))) {
            writer.write(jasminCode);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //try to compile the jasmin code
        try {
            Process process = new ProcessBuilder("java", "-jar", "libs/jasmin.jar", "input.j").start();
            int exitCode = process.waitFor();
            if (exitCode != 0) {
                System.err.println("Error executing Jasmin code. Exit code: " + exitCode);
            } else {
                System.out.println("Jasmin code executed successfully");
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }

}
