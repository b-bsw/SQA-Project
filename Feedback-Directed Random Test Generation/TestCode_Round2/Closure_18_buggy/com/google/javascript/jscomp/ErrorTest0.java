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
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry3 = compiler0.getTypeRegistry();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("2569/09/27 15:58", (int) '#');
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = compiler0.getErrorCount();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile3 = compiler0.getSourceFileByName("[]");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.getSourceLine("hi!", (int) '#');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator3 = compiler0.getTypeValidator();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray2 = compiler0.toSourceArray();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = compiler0.getErrorCount();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = compiler0.getWarningCount();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = compiler0.loadLibraryCode("hi!");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseSyntheticCode("hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray2 = compiler0.getErrors();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isIdeMode();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("hi!");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.newExternInput("[Unversioned directory]");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.getCodingConvention();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter4 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray3 = compiler0.toSourceArray();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node3 = compiler0.loadLibraryCode("[singleton]");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isIdeMode();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getErrorCount();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator4 = compiler0.getTypeValidator();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode5 = compiler0.languageMode();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getErrors();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph5 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.ensureLibraryInjected("");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isInliningForbidden();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getErrors();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable3 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasErrors();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler6.getSourceMap();
        compiler6.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange11 = compiler9.recentChange;
        compiler6.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph14 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = compiler0.isIdeMode();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsInOrder();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = compiler0.getWarningCount();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getInputsInOrder();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.hasErrors();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String[] strArray4 = compiler0.toSourceArray();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.acceptConstKeyword();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer5 = compiler0.newTracer("[[hi!]]");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.getCodingConvention();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = compiler0.toSource();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsInOrder();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap7 = compiler0.getInputsById();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = compiler0.getErrorCount();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.check();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.startPass("{SyntheticVarsDeclar}");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.isInliningForbidden();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler3.getPropertyMap();
        com.google.javascript.rhino.Node node6 = compiler3.parseTestCode("2569/09/27 15:58");
        java.lang.String str7 = compiler0.toSource(node6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile9 = compiler0.getSourceFileByName("hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder3 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean5 = codeBuilder3.endsWith("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups10 = compiler7.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler7.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList12 = compiler7.getInputsForTesting();
        com.google.javascript.rhino.Node node14 = compiler7.parseTestCode("2569/09/27 15:58");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.toSource(codeBuilder3, (int) (short) -1, node14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseInputs();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry10 = compiler0.getTypeRegistry();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region4 = compiler0.getSourceRegion("[singleton]", (int) 'a');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = compiler0.getSourceLine("[Unversioned directory]", (int) (byte) 10);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = compiler0.toSource();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput3 = compiler0.getSynthesizedExternsInput();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = compiler0.getSourceLine("[2569/09/27 15:58]", (int) '4');
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node3 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node6 = compiler0.loadLibraryCode("[2569/09/27 15:58]");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList4 = compiler0.getExternsInOrder();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        compiler3.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler3.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler3.newCompilerOptions();
        compiler0.options = compilerOptions7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsInOrder();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups2 = compiler0.getDiagnosticGroups();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("[Unversioned directory]");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable7 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = compiler0.getWarningCount();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        compiler0.addToDebugLog("[hi!]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.loadLibraryCode("hi!");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getMessages();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = compiler0.toSource();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler0.parseSyntheticCode("[]");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.parseInputs();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.getCodingConvention();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("[[singleton]]", (int) (byte) 10);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node4 = compiler0.externsRoot;
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Result result10 = compiler0.getResult();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        boolean boolean7 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = compiler0.loadLibraryCode("2569/09/27 15:58");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node9 = compiler0.loadLibraryCode("hi!");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.addToDebugLog("[[singleton]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap10 = compiler0.getInputsById();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler8.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap10 = compiler8.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler12.getSourceMap();
        compiler12.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler15.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler15.recentChange;
        compiler12.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        compiler11.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        com.google.javascript.rhino.head.ErrorReporter errorReporter20 = compiler11.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler11.getErrorManager();
        compiler8.setErrorManager(errorManager21);
        compiler0.setErrorManager(errorManager21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean24 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.normalize();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.resetUniqueNameId();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter10 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer6 = compiler0.newTracer("[[[singleton]]]");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator6 = compiler0.getTypeValidator();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput4 = compiler0.newExternInput("[hi!]");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        java.lang.String str4 = compiler0.getAstDotGraph();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsInOrder();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compiler0.getDefaultErrorReporter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = compiler0.getSourceLine("[{SyntheticVarsDeclar}]", (int) (byte) 1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler5.removeTryCatchFinally();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = compiler0.isTypeCheckingEnabled();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = compiler0.hasHaltingErrors();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        java.lang.String str13 = compiler0.toSource(node12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node15 = compiler0.loadLibraryCode("[[hi!]]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        compiler0.addToDebugLog("[[singleton]]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = compiler0.getWarningCount();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap6 = compiler0.getCssRenamingMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.parseInputs();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsInOrder();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getWarnings();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator10 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph11 = compiler0.getDegenerateModuleGraph();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        compiler0.setProgress((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.removeTryCatchFinally();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        compiler0.resetUniqueNameId();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.Tracer tracer8 = compiler0.newTracer("");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node4 = compiler0.loadLibraryCode("[[2569/09/27 15:58]]");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap11 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler5.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler5.getSynthesizedExternsInput();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = compiler0.getSourceLine("", 25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = compiler0.loadLibraryCode("");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray4 = compiler0.getMessages();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler0.getDiagnosticGroups();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = compiler0.getErrorCount();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SourceFile sourceFile5 = compiler0.getSourceFileByName("");
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler0.getPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = compiler0.isIdeMode();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler6.getErrorManager();
        compiler5.setErrorManager(errorManager12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler5.processDefines();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.Tracer tracer8 = compiler0.newTracer("[singleton]");
        com.google.javascript.rhino.Node node10 = compiler0.parseSyntheticCode("[Unversioned directory]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput12 = compiler0.newExternInput("[2569/09/27 15:58]");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups2 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator4 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        compiler4.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        compiler4.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange9);
        compiler3.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange9);
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compiler3.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler3.getErrorManager();
        compiler0.setErrorManager(errorManager13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = compiler0.toSource();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler6.getErrorManager();
        compiler5.setErrorManager(errorManager12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = compiler5.isTypeCheckingEnabled();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        compiler3.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler3.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler3.newCompilerOptions();
        compiler0.options = compilerOptions7;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = compiler0.getSourceLine("Unversioned directory", 100);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry7 = compiler0.getTypeRegistry();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.getRoot();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.optimize();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap11 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.SymbolTable symbolTable12 = compiler0.buildKnownSymbolTable();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        compiler4.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler7.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler7.newCompilerOptions();
        compiler4.options = compilerOptions11;
        compiler0.initOptions(compilerOptions11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler0.options;
        boolean boolean15 = compiler0.acceptEcmaScript5();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler0.getModuleGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.initInputsByIdMap();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        compiler0.addToDebugLog("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode4 = compiler0.languageMode();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        compiler4.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        compiler7.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler7.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler7.newCompilerOptions();
        compiler4.options = compilerOptions11;
        compiler0.initOptions(compilerOptions11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = compiler0.options;
        boolean boolean15 = compiler0.acceptEcmaScript5();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry16 = compiler0.getTypeRegistry();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node18 = compiler0.parseSyntheticCode("[singleton]");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups2 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler0.newCompilerOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = compiler0.acceptEcmaScript5();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node5 = compiler0.externAndJsRoot;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap6 = compiler0.getCssRenamingMap();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap10 = compiler0.getFunctionalInformationMap();
        boolean boolean11 = compiler0.precheck();
        compiler0.reportCodeChange();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler0.getInputsInOrder();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState10 = compiler0.getState();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processDefines();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("2569/09/27 15:58");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = compiler0.parseInputs();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler0.getFunctionalInformationMap();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = compiler0.isIdeMode();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        double double6 = compiler3.getProgress();
        com.google.javascript.rhino.Node node8 = compiler3.parseTestCode("Unversioned directory");
        compiler0.externsRoot = node8;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.TypeValidator typeValidator11 = compiler0.getTypeValidator();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.Tracer tracer8 = compiler0.newTracer("[singleton]");
        java.lang.String str9 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node11 = compiler0.loadLibraryCode("hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler5.getExternsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node8 = compiler5.ensureLibraryInjected("[[2569/09/27 15:58]]");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node3 = compiler0.externsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.recordFunctionInformation();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.parse();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph6 = compiler0.computeCFG();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        compiler0.addToDebugLog("[]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput9 = compiler0.newExternInput("[[singleton]]");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        compiler1.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler4.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler4.recentChange;
        compiler1.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange6);
        com.google.javascript.rhino.head.ErrorReporter errorReporter9 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator10 = compiler0.getTypedScopeCreator();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.processAMDAndCommonJSModules();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler0.tracker;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph3 = compiler0.computeCFG();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry6 = compiler0.getTypeRegistry();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler0.getOptions();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.CompilerInput compilerInput5 = compiler0.newExternInput("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler0.getErrorManager();
        compiler0.disableThreads();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph6 = compiler0.computeCFG();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        java.lang.String str4 = compiler0.getAstDotGraph();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        compiler0.rebuildInputsFromModules();
    }
}

