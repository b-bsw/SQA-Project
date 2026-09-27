package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput2 = compiler0.newExternInput("");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.newExternInput("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("hi!");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray1 = compiler0.toSourceArray();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getInput("hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = compiler0.parseInputs();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler3.toSourceArray();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("hi!", (int) '#');
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = compiler0.toSource();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.isIdeMode();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.getInput("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsInOrder();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = compiler0.parseSyntheticCode("hi!");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.getSourceLine("hi!", (int) (byte) 1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        boolean boolean3 = compiler0.isInliningForbidden();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region6 = compiler0.getSourceRegion("", 10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler4.getInput("hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getInputsInOrder();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler8.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = compiler8.getUniqueNameIdSupplier();
        boolean boolean12 = compiler8.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = compiler14.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("hi!");
        intermediateState13.externsRoot = node18;
        compiler0.setState(intermediateState13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node21 = compiler0.parseInputs();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("hi!", (int) 'a');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.hasErrors();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry1 = compiler0.getTypeRegistry();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        compiler2.reportCodeChange();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler2.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler2.newExternInput("hi!");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode2 = compiler0.languageMode();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseInputs();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.getInput("");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("", (int) (byte) 100);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("hi!", 100);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.getInput("hi!");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.getInput("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler4.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler4.toSource();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler4.getInputsInOrder();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap7 = compiler0.getCssRenamingMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseInputs();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.hasHaltingErrors();
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions15);
        boolean boolean17 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node18 = compiler0.externAndJsRoot;
        compiler0.rebuildInputsFromModules();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput21 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions15);
        java.lang.String[] strArray17 = compiler0.toSourceArray();
        compiler0.initInputsByNameMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph19 = compiler0.computeCFG();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = compiler0.toSourceArray();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = compiler7.parseSyntheticCode("hi!");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        compiler0.setErrorManager(errorManager8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(errorManager8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler11.getInput("");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("hi!", (int) '4');
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions15);
        boolean boolean17 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph19 = compiler0.computeCFG();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.hasHaltingErrors();
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph8 = compiler0.computeCFG();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler(errorManager1);
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = compiler3.getCssRenamingMap();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        compiler0.reportCodeChange();
        java.lang.String str8 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsInOrder();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph4 = compiler0.computeCFG();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler4.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler4.getTypeRegistry();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler6.check();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler4.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler4.getUniqueNameIdSupplier();
        boolean boolean8 = compiler4.isTypeCheckingEnabled();
        compiler4.reportCodeChange();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler4.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        boolean boolean15 = compiler11.isIdeMode();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler11.recentChange;
        compiler4.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node20 = compiler0.parseInputs();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler4.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler4.check();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap6 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        compiler7.addToDebugLog("");
        boolean boolean11 = compiler7.isIdeMode();
        compiler7.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange13 = compiler7.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node16 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("", (int) (short) 0);
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph7 = compiler0.computeCFG();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        compiler0.reportCodeChange();
        java.lang.String str8 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getVariableMap();
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph6 = compiler0.computeCFG();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("hi!", (int) '#');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions15);
        boolean boolean17 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Tracer tracer20 = compiler0.newTracer("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput22 = compiler0.newExternInput("");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.startPass("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = compiler5.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.rhino.Node node10 = compiler9.getRoot();
        boolean boolean11 = compiler9.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler9.removeTryCatchFinally();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        java.lang.String str5 = compiler0.toSource();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = compiler0.getSourceLine("hi!", 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler4.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler(errorManager6);
        compiler7.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler7.rebuildInputsFromModules();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        boolean boolean3 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap4 = compiler0.getGlobalVarReferences();
        boolean boolean5 = compiler0.hasHaltingErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.getInput("");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.getSourceLine("hi!", 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler8.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = compiler8.getUniqueNameIdSupplier();
        boolean boolean12 = compiler8.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = compiler14.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("hi!");
        intermediateState13.externsRoot = node18;
        compiler0.setState(intermediateState13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput22 = compiler0.newExternInput("");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        compiler0.options = compilerOptions8;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler0.getTypedScopeCreator();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        boolean boolean12 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node13 = compiler0.parseInputs();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseInputs();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = compiler5.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.rhino.Node node10 = compiler9.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler9.parse();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        compiler0.setErrorManager(errorManager8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler(errorManager8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler11.normalize();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsInOrder();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler6.hasErrors();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        java.lang.String str7 = compiler0.getSourceLine("", (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseInputs();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter6 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap7 = compiler0.getGlobalVarReferences();
        compiler0.disableThreads();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode11 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = compiler0.parseInputs();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        boolean boolean6 = compiler0.hasHaltingErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("hi!", (int) (short) 1);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        java.lang.String str7 = compiler0.toSource();
        boolean boolean8 = compiler0.isIdeMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph9 = compiler0.computeCFG();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        java.lang.String str6 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler8.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier11 = compiler8.getUniqueNameIdSupplier();
        boolean boolean12 = compiler8.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState13 = compiler8.getState();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = compiler14.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler14.getErrorManager();
        com.google.javascript.rhino.Node node18 = compiler14.parseTestCode("hi!");
        intermediateState13.externsRoot = node18;
        compiler0.setState(intermediateState13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler6.getCodingConvention();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        compiler0.options = compilerOptions8;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler0.getTypedScopeCreator();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        boolean boolean12 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = compiler0.getSourceLine("hi!", (int) (byte) 10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        java.lang.String str7 = compiler0.toSource();
        boolean boolean8 = compiler0.isIdeMode();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput11 = compiler0.newExternInput("");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        compiler0.options = compilerOptions8;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler0.getTypedScopeCreator();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler0.getCodingConvention();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node14 = compiler0.parseInputs();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList7 = compiler0.getInputsInOrder();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler3.newExternInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getInputsInOrder();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        compiler0.options = compilerOptions8;
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.getInput("hi!");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.Tracer tracer4 = compiler0.newTracer("hi!");
        boolean boolean5 = compiler0.hasErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region8 = compiler0.getSourceRegion("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", (int) (short) 10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        compiler0.addToDebugLog("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        compiler0.options = compilerOptions8;
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler0.getTypedScopeCreator();
        boolean boolean11 = compiler0.isTypeCheckingEnabled();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList12 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput14 = compiler0.getInput("");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.getInput("hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("hi!", (int) '4');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        com.google.javascript.jscomp.CodingConvention codingConvention6 = compiler0.getCodingConvention();
        boolean boolean7 = compiler0.acceptConstKeyword();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseInputs();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getErrorCount();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        boolean boolean5 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph6 = compiler0.computeCFG();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray5 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList6 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, jSSourceFileArray5);
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList9 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList9, jSModuleArray8);
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList6, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList9, compilerOptions15);
        boolean boolean17 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.Node node18 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.Scope scope19 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node20 = compiler0.getRoot();
        compiler0.initInputsByNameMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph22 = compiler0.computeCFG();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        int int5 = compiler0.getWarningCount();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseInputs();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseSyntheticCode("");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.precheck();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("");
        compiler0.removeInput("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput8 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler0.recentChange;
        java.lang.String str7 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph8 = compiler0.computeCFG();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        compiler6.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList12 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, jSSourceFileArray11);
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList15 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList15, jSModuleArray14);
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler17.getErrorManager();
        compiler17.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler17.options;
        compiler6.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList12, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList15, compilerOptions21);
        boolean boolean23 = compiler6.acceptEcmaScript5();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Tracer tracer26 = compiler6.newTracer("hi!");
        compiler0.stopTracer(tracer26, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.getInput("");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseInputs();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getVariableMap();
        compiler4.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler4.isIdeMode();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups7 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("hi!");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler0.getTypeValidator();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager8);
        compiler0.setErrorManager(errorManager8);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph11 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput13 = compiler0.newExternInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = compiler5.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler(errorManager7);
        com.google.javascript.rhino.Node node10 = compiler9.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node12 = compiler9.parseSyntheticCode("hi!");
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.getOptions();
        compiler0.addToDebugLog("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByNameMap();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        compiler0.setHasRegExpGlobalReferences(false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler(errorManager5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler6.getReverseAbstractInterpreter();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isIdeMode();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Scope scope6 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler4.languageMode();
        com.google.javascript.jscomp.Tracer tracer9 = compiler4.newTracer("hi!");
        compiler0.stopTracer(tracer9, "hi!");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups12 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Result result13 = compiler0.getResult();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput15 = compiler0.getInput("hi!");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = compiler5.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler5.getErrorManager();
        compiler0.setErrorManager(errorManager7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler0.getVariableMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeInput("");
    }
}

