# JavaMinusMinus (Jmm) Compiler
## Comp2024 Project

## Project Overview

The JavaMinusMinus (Jmm) Compiler is a comprehensive compiler designed for a simplified subset of Java, known as JavaMinusMinus. This compiler handles various Java features, including methods, variables, arrays, and varargs, and generates Jasmin code, which can be assembled into Java bytecode. The project is divided into five main components:

1. **Syntax Analysis with ANTLR:** 
   - This phase involves parsing the source code using ANTLR to construct the Abstract Syntax Tree (AST) from the input Jmm code.
   
2. **Symbol Table Builder:**
   - This component constructs a symbol table that keeps track of the scope and binding information of variables and methods throughout the source code.
   
3. **Semantic Analysis:**
   - This phase involves checking the source code for semantic errors, such as type mismatches, undeclared variables, and incorrect method calls.
   
4. **Jasmin Code Generation:**
   - In this stage, the AST is traversed to generate Jasmin code, which is an assembly language for the Java Virtual Machine (JVM).
   
5. **Optimizations:**
   - This phase includes optimization techniques like constant folding to enhance the performance of the generated code.


The Jmm Compiler provides a streamlined workflow from parsing source code to generating optimized bytecode, ensuring both correctness and efficiency in the compilation process.


## Group Members

1. **André Santos (up202108658)**

### Contributions

- Syntax Grammar: Expressions Construction
- Symbol Table
- Semantic Analysis
- Jasmin Generation
- Optimization: Constant Propagation


Percentage of work: **60%**

Self-Assessment: **18/20**

1. **Pedro Beirão (up202108718)**

### Contributions

- Syntax Grammar
- Semantic Analysis:
- Jasmin Generation


Percentage of work: **40%**

Self-Assessment: **16/20**
  
## How to Run

1. **Install Dependencies:**
   - Make sure you have Gradle installed on your system.

2. **Build the Project:**
   - Navigate to the project directory and run the following command to build the project and install the distribution:
     ```bash
     gradle installDist
     ```

3. **Prepare the Input File:**
   - Write the Jmm code you want to compile into a file named `input.txt`.

4. **Run the Compiler:**
   - To compile the code without optimizations, use the following command:
     ```bash
     ./jmm input.txt
     ```
   - To compile the code with optimizations, use the following command:
     ```bash
     ./jmm input.txt -o
     ```

By following these steps, you can compile your Jmm code and generate optimized bytecode as needed.