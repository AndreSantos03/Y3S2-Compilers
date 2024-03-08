package pt.up.fe.comp2024.symboltable;

import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Type;
import pt.up.fe.comp2024.ast.TypeUtils;
import pt.up.fe.specs.util.exceptions.NotImplementedException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JmmSymbolTable implements SymbolTable {

    private final String className;
    private final String superClassName;
    private final List<String> methods;
    private final Map<String, Type> returnTypes;
    private final Map<String, List<Symbol>> params;
    private final Map<String, List<Symbol>> locals;
    private final Set<String> imports;


    public JmmSymbolTable(String className, String superClassName,
                          List<String> methods,
                          Map<String, Type> returnTypes,
                          Map<String, List<Symbol>> params,
                          Map<String, List<Symbol>> locals,
                          Set<String> imports) {
        this.className = className;
        this.superClassName = superClassName;
        this.methods = methods;
        this.returnTypes = returnTypes;
        this.params = params;
        this.locals = locals;
        this.imports = imports;
    }

    @Override
    public List<String> getImports() {
        return Collections.unmodifiableList(new ArrayList<>(imports));
    }


    @Override
    public String getClassName() {
        return className;
    }

    @Override
    public String getSuper() {
        return superClassName;
    }

    @Override
    public List<Symbol> getFields() {
        return Collections.emptyList();
    }

    @Override
    public List<String> getMethods() {
        return Collections.unmodifiableList(methods);
    }

    @Override
    public Type getReturnType(String methodSignature) {
        Type returnType = returnTypes.get(methodSignature);
        if (returnType == null) {
            // Return a default type or throw an exception if needed
            return new Type("void", false); // Assuming a default return type of void
        }
        return returnType;
    }

    @Override
    public List<Symbol> getParameters(String methodSignature) {
        List<Symbol> parameters = params.get(methodSignature);
        if (parameters == null) {
            // Return an empty list or throw an exception if needed
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(parameters);
    }

    @Override
    public List<Symbol> getLocalVariables(String methodSignature) {
        List<Symbol> localVariables = locals.get(methodSignature);
        if (localVariables == null) {
            // Return an empty list or throw an exception if needed
            return Collections.emptyList();
        }
        return Collections.unmodifiableList(localVariables);
    }
}