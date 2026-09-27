package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.CodingConvention codingConvention5 = null;
        compiler0.defaultCodingConvention = codingConvention5;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap8 = null;
        compiler0.setCssRenamingMap(cssRenamingMap8);
        com.google.javascript.jscomp.ScopeCreator scopeCreator10 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler0.tracker = performanceTracker12;
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Region region17 = compiler0.getSourceRegion("hi!", 0);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNull(region17);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compiler0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope8 = compiler0.getTopScope();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(config3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker2 = compiler1.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = compiler1.options;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler1.getModuleGraph();
        org.junit.Assert.assertNull(performanceTracker2);
        org.junit.Assert.assertNull(compilerOptions3);
        org.junit.Assert.assertNull(jSModuleGraph4);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        compiler0.reportCodeChange();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNotNull(intermediateState4);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter3 = compiler0.getReverseAbstractInterpreter();
        java.lang.String str4 = compiler0.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.getOptions();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(compilerOptions5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        boolean boolean12 = compiler0.precheck();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node14 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention15 = null;
        compiler0.defaultCodingConvention = codingConvention15;
        com.google.javascript.jscomp.Result result17 = compiler0.getResult();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput19 = compiler0.getInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(result17);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compiler5.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler5.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler5.getWarnings();
        com.google.javascript.rhino.Node node11 = null;
        compiler5.jsRoot = node11;
        java.lang.String str13 = compiler5.toSource();
        com.google.javascript.rhino.Node node15 = compiler5.parseTestCode("");
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler5.getErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier17 = compiler5.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler5.createPassConfigInternal();
        compiler0.setPassConfig(passConfig18);
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler0.getPassConfig();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(config4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(strSupplier17);
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(passConfig20);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        boolean boolean3 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = compiler0.parse(jSSourceFile4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler9.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler9.getUniqueNameIdSupplier();
        boolean boolean13 = compiler9.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler9.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler9.getState();
        com.google.javascript.rhino.Node node16 = intermediateState15.externsRoot;
        compiler0.setState(intermediateState15);
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler19 = null;
        compiler18.removeChangeHandler(codeChangeHandler19);
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler18.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier22 = compiler18.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState23 = compiler18.getState();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager25 = compiler24.getErrorManager();
        compiler24.addToDebugLog("");
        boolean boolean28 = compiler24.hasHaltingErrors();
        boolean boolean29 = compiler24.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node31 = compiler24.parseTestCode("hi!");
        intermediateState23.externsRoot = node31;
        java.lang.String str33 = compiler0.toSource(node31);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(variableMap11);
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(passConfig21);
        org.junit.Assert.assertNotNull(strSupplier22);
        org.junit.Assert.assertNotNull(intermediateState23);
        org.junit.Assert.assertNotNull(errorManager25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler14 = null;
        compiler13.removeChangeHandler(codeChangeHandler14);
        com.google.javascript.jscomp.PassConfig passConfig16 = compiler13.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier17 = compiler13.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState18 = compiler13.getState();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler19.getErrorManager();
        compiler19.addToDebugLog("");
        boolean boolean23 = compiler19.hasHaltingErrors();
        boolean boolean24 = compiler19.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("hi!");
        intermediateState18.externsRoot = node26;
        com.google.javascript.rhino.Node node28 = intermediateState18.externsRoot;
        compiler0.setState(intermediateState18);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(passConfig16);
        org.junit.Assert.assertNotNull(strSupplier17);
        org.junit.Assert.assertNotNull(intermediateState18);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node28);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker3 = null;
        compiler0.tracker = performanceTracker3;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = compiler0.parse(jSSourceFile5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNull(referenceMap2);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap6 = null;
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        compiler7.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler7.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray12 = compiler7.getWarnings();
        com.google.javascript.rhino.Node node13 = null;
        compiler7.jsRoot = node13;
        com.google.javascript.jscomp.Region region17 = compiler7.getSourceRegion("", 0);
        int int18 = compiler7.getWarningCount();
        boolean boolean19 = compiler7.precheck();
        compiler7.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler7.getPassConfig();
        com.google.javascript.rhino.Node node24 = compiler7.parseSyntheticCode("hi!", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.updateGlobalVarReferences(varMap6, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertNotNull(jSErrorArray12);
        org.junit.Assert.assertArrayEquals(jSErrorArray12, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(passConfig21);
        org.junit.Assert.assertNotNull(node24);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler7 = null;
        compiler6.removeChangeHandler(codeChangeHandler7);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator18 = compiler16.getTypeValidator();
        compiler16.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        compiler20.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler20.options;
        compiler16.options = compilerOptions24;
        compiler6.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions24);
        compiler0.init(jSSourceFileArray4, jSModuleArray5, compilerOptions24);
        com.google.javascript.rhino.Node node28 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler30 = null;
        compiler29.removeChangeHandler(codeChangeHandler30);
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler29.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList34 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, jSSourceFileArray33);
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList37 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList37, jSModuleArray36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler39.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator41 = compiler39.getTypeValidator();
        compiler39.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        compiler39.options = compilerOptions47;
        compiler29.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList37, compilerOptions47);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler51 = null;
        compiler50.removeChangeHandler(codeChangeHandler51);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList55 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, jSSourceFileArray54);
        com.google.javascript.jscomp.JSModule[] jSModuleArray57 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList58 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList58, jSModuleArray57);
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager61 = compiler60.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator62 = compiler60.getTypeValidator();
        compiler60.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler64.getErrorManager();
        compiler64.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler64.options;
        compiler60.options = compilerOptions68;
        compiler50.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList58, compilerOptions68);
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager72 = compiler71.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator73 = compiler71.getTypeValidator();
        compiler71.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager76 = compiler75.getErrorManager();
        compiler75.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler75.options;
        compiler71.options = compilerOptions79;
        com.google.javascript.jscomp.Result result81 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, compilerOptions79);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap82 = null;
        compiler0.setCssRenamingMap(cssRenamingMap82);
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.PassConfig passConfig85 = compiler0.createPassConfigInternal();
        compiler0.initInputsByNameMap();
        com.google.javascript.rhino.Node node87 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray4, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray5);
        org.junit.Assert.assertArrayEquals(jSModuleArray5, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertArrayEquals(jSModuleArray13, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(typeValidator18);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(compilerOptions24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray33, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSModuleArray36);
        org.junit.Assert.assertArrayEquals(jSModuleArray36, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(typeValidator41);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(codingConvention53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray54, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSModuleArray57);
        org.junit.Assert.assertArrayEquals(jSModuleArray57, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(errorManager61);
        org.junit.Assert.assertNotNull(typeValidator62);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertNotNull(errorManager72);
        org.junit.Assert.assertNotNull(typeValidator73);
        org.junit.Assert.assertNotNull(errorManager76);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result81);
        org.junit.Assert.assertNotNull(passConfig85);
        org.junit.Assert.assertNull(node87);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.rhino.Node node10 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph13 = compiler0.getModuleGraph();
        java.lang.Exception exception15 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("", exception15);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNull(jSModuleGraph13);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(compilerInputList5);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("hi!");
        int int3 = codeBuilder0.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder5 = codeBuilder0.append("");
        java.lang.String str6 = codeBuilder5.toString();
        java.lang.String str7 = codeBuilder5.toString();
        int int8 = codeBuilder5.getColumnIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(codeBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.rhino.Node node10 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler0.getUniqueNameIdSupplier();
        java.lang.String str13 = compiler0.toSource();
        java.lang.String str14 = compiler0.getAstDotGraph();
        com.google.javascript.rhino.Node node16 = compiler0.parseSyntheticCode("hi!");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(node16);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CompilerInput compilerInput6 = compiler0.getInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(compilerInput6);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode12 = compiler0.languageMode();
        com.google.javascript.jscomp.ScopeCreator scopeCreator13 = compiler0.getTypedScopeCreator();
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + languageMode12 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode12.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scopeCreator13);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getWarnings();
        com.google.javascript.rhino.Node node10 = null;
        compiler4.jsRoot = node10;
        java.lang.String str12 = compiler4.toSource();
        compiler4.disableThreads();
        boolean boolean14 = compiler4.isInliningForbidden();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str16 = codeBuilder15.toString();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler18.getErrorManager();
        compiler18.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler18.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler18.getWarnings();
        com.google.javascript.rhino.Node node24 = null;
        compiler18.jsRoot = node24;
        com.google.javascript.jscomp.Region region28 = compiler18.getSourceRegion("", 0);
        int int29 = compiler18.getWarningCount();
        boolean boolean30 = compiler18.precheck();
        compiler18.disableThreads();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        compiler32.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler32.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray37 = compiler32.getWarnings();
        com.google.javascript.rhino.Node node38 = null;
        compiler32.jsRoot = node38;
        java.lang.String str40 = compiler32.toSource();
        com.google.javascript.rhino.Node node42 = compiler32.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray48 = compiler43.getWarnings();
        com.google.javascript.rhino.Node node49 = null;
        compiler43.jsRoot = node49;
        java.lang.String str51 = compiler43.toSource();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = compiler52.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler52.getErrorManager();
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("hi!");
        compiler43.externsRoot = node56;
        boolean boolean58 = compiler18.areNodesEqualForInlining(node42, node56);
        compiler4.toSource(codeBuilder15, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler61.getErrorManager();
        compiler61.addToDebugLog("");
        boolean boolean65 = compiler61.hasHaltingErrors();
        boolean boolean66 = compiler61.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node68 = compiler61.parseTestCode("hi!");
        compiler0.toSource(codeBuilder15, 1, node68);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap70 = null;
        compiler0.setCssRenamingMap(cssRenamingMap70);
        com.google.common.base.Supplier<java.lang.String> strSupplier72 = compiler0.getUniqueNameIdSupplier();
        boolean boolean73 = compiler0.hasErrors();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertArrayEquals(jSErrorArray3, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(jSErrorArray37);
        org.junit.Assert.assertArrayEquals(jSErrorArray37, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(jSErrorArray48);
        org.junit.Assert.assertArrayEquals(jSErrorArray48, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(strSupplier72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState6 = compiler0.getState();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(intermediateState6);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.PassConfig passConfig9 = compiler0.getPassConfig();
        boolean boolean10 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getWarnings();
        boolean boolean12 = compiler0.hasHaltingErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(passConfig9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        java.lang.Class<?> wildcardClass7 = compiler0.getClass();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result2);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNull(functionInformationMap5);
        org.junit.Assert.assertNotNull(passConfig6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = null;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = compiler6.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler6.getErrorManager();
        com.google.javascript.rhino.Node node10 = compiler6.parseTestCode("hi!");
        compiler0.toSource(codeBuilder4, 10, node10);
        int int12 = compiler0.getWarningCount();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler0.getExternsForTesting();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(compilerInputList13);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.CodingConvention codingConvention5 = null;
        compiler0.defaultCodingConvention = codingConvention5;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        compiler0.startPass("");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap12 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("hi!");
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler15.getWarnings();
        com.google.javascript.rhino.Node node21 = null;
        compiler15.jsRoot = node21;
        java.lang.String str23 = compiler15.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler15.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler26 = null;
        compiler25.removeChangeHandler(codeChangeHandler26);
        com.google.javascript.jscomp.CodingConvention codingConvention28 = compiler25.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention28;
        java.lang.String str30 = compiler15.toSource();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups31 = compiler15.getDiagnosticGroups();
        com.google.javascript.rhino.Node node34 = compiler15.parseSyntheticCode("hi!", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler0.externAndJsRoot = node34;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNull(performanceTracker10);
        org.junit.Assert.assertNull(codingConvention11);
        org.junit.Assert.assertNull(functionInformationMap12);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(codingConvention28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(diagnosticGroups31);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList13, jSModuleArray12);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        compiler4.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList13, compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler22 = null;
        compiler21.removeChangeHandler(codeChangeHandler22);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList26 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, jSSourceFileArray25);
        com.google.javascript.jscomp.JSModule[] jSModuleArray28 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList29 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList29, jSModuleArray28);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager32 = compiler31.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator33 = compiler31.getTypeValidator();
        compiler31.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager36 = compiler35.getErrorManager();
        compiler35.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler35.options;
        compiler31.options = compilerOptions39;
        compiler21.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList26, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList29, compilerOptions39);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = compiler42.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler42.getErrorManager();
        com.google.javascript.rhino.Node node46 = compiler42.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention47 = compiler42.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler42.getOptions();
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList29, compilerOptions48);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler50.getErrorManager();
        compiler50.addToDebugLog("");
        boolean boolean54 = compiler50.isIdeMode();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap55 = compiler50.getCssRenamingMap();
        compiler50.disableThreads();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager58 = compiler57.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler(errorManager58);
        compiler50.setErrorManager(errorManager58);
        compiler0.setErrorManager(errorManager58);
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter62 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = compiler63.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler63.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray66 = compiler63.getWarnings();
        com.google.javascript.jscomp.CodingConvention codingConvention67 = compiler63.getCodingConvention();
        compiler0.defaultCodingConvention = codingConvention67;
        com.google.javascript.jscomp.CodingConvention codingConvention69 = null;
        compiler0.defaultCodingConvention = codingConvention69;
        boolean boolean71 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray9, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(codingConvention24);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSModuleArray28);
        org.junit.Assert.assertArrayEquals(jSModuleArray28, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(errorManager32);
        org.junit.Assert.assertNotNull(typeValidator33);
        org.junit.Assert.assertNotNull(errorManager36);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertNotNull(codingConvention47);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(cssRenamingMap55);
        org.junit.Assert.assertNotNull(errorManager58);
        org.junit.Assert.assertNotNull(errorReporter62);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(jSErrorArray66);
        org.junit.Assert.assertArrayEquals(jSErrorArray66, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(codingConvention67);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getExternsForTesting();
        int int10 = compiler0.getErrorCount();
        com.google.javascript.jscomp.JSError[] jSErrorArray11 = compiler0.getErrors();
        com.google.javascript.jscomp.JSModule jSModule12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = compiler0.getNodeForCodeInsertion(jSModule12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap6 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator9 = compiler7.getTypeValidator();
        compiler7.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder11 = null;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = compiler13.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler13.getErrorManager();
        com.google.javascript.rhino.Node node17 = compiler13.parseTestCode("hi!");
        compiler7.toSource(codeBuilder11, 10, node17);
        int int19 = compiler7.getWarningCount();
        com.google.common.base.Supplier<java.lang.String> strSupplier20 = compiler7.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.PassConfig passConfig21 = compiler7.createPassConfigInternal();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: this.passes has already been assigned");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(functionInformationMap6);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(typeValidator9);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strSupplier20);
        org.junit.Assert.assertNotNull(passConfig21);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState5 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray6 = compiler0.getErrors();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(intermediateState5);
        org.junit.Assert.assertNotNull(jSErrorArray6);
        org.junit.Assert.assertArrayEquals(jSErrorArray6, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        java.lang.String str13 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap14 = compiler11.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList24, jSModuleArray23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler26.getErrorManager();
        compiler26.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler26.options;
        compiler15.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList24, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler33 = null;
        compiler32.removeChangeHandler(codeChangeHandler33);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList37 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, jSSourceFileArray36);
        com.google.javascript.jscomp.JSModule[] jSModuleArray39 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList40 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList40, jSModuleArray39);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler42.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator44 = compiler42.getTypeValidator();
        compiler42.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler46.getErrorManager();
        compiler46.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler46.options;
        compiler42.options = compilerOptions50;
        compiler32.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions50);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = compiler53.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler53.getErrorManager();
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention58 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler53.getOptions();
        compiler11.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions59);
        com.google.javascript.jscomp.JSModule[] jSModuleArray61 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList62 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList62, jSModuleArray61);
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler64.getErrorManager();
        compiler64.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler64.options;
        com.google.javascript.jscomp.CodingConvention codingConvention69 = null;
        compiler64.defaultCodingConvention = codingConvention69;
        com.google.common.base.Supplier<java.lang.String> strSupplier71 = compiler64.getUniqueNameIdSupplier();
        compiler64.startPass("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = compiler64.getOptions();
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList62, compilerOptions74);
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getErrors();
        java.lang.String str77 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.TypeValidator typeValidator78 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.ScopeCreator scopeCreator79 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(functionInformationMap14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray20, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSModuleArray39);
        org.junit.Assert.assertArrayEquals(jSModuleArray39, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(typeValidator44);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorManager55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(codingConvention58);
        org.junit.Assert.assertNotNull(compilerOptions59);
        org.junit.Assert.assertNotNull(jSModuleArray61);
        org.junit.Assert.assertArrayEquals(jSModuleArray61, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertNotNull(strSupplier71);
        org.junit.Assert.assertNotNull(compilerOptions74);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(typeValidator78);
        org.junit.Assert.assertNull(scopeCreator79);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        compiler0.disableThreads();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = null;
        compiler0.tracker = performanceTracker5;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap7 = compiler0.getFunctionalInformationMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNull(functionInformationMap7);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler0.defaultCodingConvention;
        compiler0.startPass("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeInput("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(codingConvention9);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap6 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler8 = null;
        compiler7.removeChangeHandler(codeChangeHandler8);
        com.google.javascript.jscomp.CodingConvention codingConvention10 = compiler7.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler12 = null;
        compiler11.removeChangeHandler(codeChangeHandler12);
        com.google.javascript.jscomp.PassConfig passConfig14 = compiler11.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier15 = compiler11.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = compiler16.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler16.getErrorManager();
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("hi!");
        compiler11.externAndJsRoot = node20;
        compiler7.jsRoot = node20;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        java.lang.String str25 = compiler23.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap26 = compiler23.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        compiler27.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler27.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler27.getWarnings();
        com.google.javascript.rhino.Node node33 = null;
        compiler27.jsRoot = node33;
        java.lang.String str35 = compiler27.toSource();
        compiler27.addToDebugLog("");
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager39 = compiler38.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator40 = compiler38.getTypeValidator();
        compiler38.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder42 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = compiler44.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager46 = compiler44.getErrorManager();
        com.google.javascript.rhino.Node node48 = compiler44.parseTestCode("hi!");
        compiler38.toSource(codeBuilder42, 10, node48);
        java.lang.String str50 = compiler27.toSource(node48);
        compiler23.externsRoot = node48;
        compiler7.jsRoot = node48;
        compiler0.externsRoot = node48;
        int int54 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Scope scope55 = compiler0.getTopScope();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList56 = compiler0.getInputsForTesting();
        compiler0.startPass("hi!");
        com.google.javascript.rhino.Node node59 = compiler0.externAndJsRoot;
        boolean boolean60 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph61 = compiler0.getModuleGraph();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(functionInformationMap6);
        org.junit.Assert.assertNotNull(codingConvention10);
        org.junit.Assert.assertNotNull(passConfig14);
        org.junit.Assert.assertNotNull(strSupplier15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(functionInformationMap26);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertArrayEquals(jSErrorArray32, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(errorManager39);
        org.junit.Assert.assertNotNull(typeValidator40);
        org.junit.Assert.assertNull(node45);
        org.junit.Assert.assertNotNull(errorManager46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(scope55);
        org.junit.Assert.assertNull(compilerInputList56);
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(jSModuleGraph61);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = compiler9.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler9.getErrorManager();
        com.google.javascript.rhino.Node node13 = compiler9.parseTestCode("hi!");
        compiler0.externsRoot = node13;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker15 = null;
        compiler0.tracker = performanceTracker15;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(node13);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isTypeCheckingEnabled();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ScopeCreator scopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.JSError[] jSErrorArray7 = compiler0.getMessages();
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile9 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile10 = null;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        java.lang.String str13 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap14 = compiler11.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList24, jSModuleArray23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler26.getErrorManager();
        compiler26.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler26.options;
        compiler15.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList24, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler33 = null;
        compiler32.removeChangeHandler(codeChangeHandler33);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList37 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, jSSourceFileArray36);
        com.google.javascript.jscomp.JSModule[] jSModuleArray39 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList40 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList40, jSModuleArray39);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler42.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator44 = compiler42.getTypeValidator();
        compiler42.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler46.getErrorManager();
        compiler46.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler46.options;
        compiler42.options = compilerOptions50;
        compiler32.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions50);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = compiler53.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler53.getErrorManager();
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention58 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler53.getOptions();
        compiler11.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions59);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result61 = compiler0.compile(jSSourceFile9, jSSourceFile10, compilerOptions59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(scopeCreator6);
        org.junit.Assert.assertNotNull(jSErrorArray7);
        org.junit.Assert.assertArrayEquals(jSErrorArray7, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(functionInformationMap14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray20, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSModuleArray39);
        org.junit.Assert.assertArrayEquals(jSModuleArray39, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(typeValidator44);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorManager55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(codingConvention58);
        org.junit.Assert.assertNotNull(compilerOptions59);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.hasHaltingErrors();
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("hi!");
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config12 = compiler9.getParserConfig();
        com.google.javascript.jscomp.TypeValidator typeValidator13 = compiler9.getTypeValidator();
        com.google.javascript.rhino.Node node14 = null;
        compiler9.prepareAst(node14);
        com.google.javascript.jscomp.Tracer tracer17 = compiler9.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler0.stopTracer(tracer17, "");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(variableMap11);
        org.junit.Assert.assertNotNull(config12);
        org.junit.Assert.assertNotNull(typeValidator13);
        org.junit.Assert.assertNotNull(tracer17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.CodingConvention codingConvention3 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList5 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, jSSourceFileArray4);
        com.google.javascript.jscomp.JSModule[] jSModuleArray7 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList8 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList8, jSModuleArray7);
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler10.getTypeValidator();
        compiler10.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler14.getErrorManager();
        compiler14.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler14.options;
        compiler10.options = compilerOptions18;
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList5, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList8, compilerOptions18);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler22.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler22.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier25 = compiler22.getUniqueNameIdSupplier();
        boolean boolean26 = compiler22.isIdeMode();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler22.getState();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        compiler28.addToDebugLog("");
        boolean boolean32 = compiler28.isIdeMode();
        compiler28.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager35 = compiler34.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator36 = compiler34.getTypeValidator();
        compiler34.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder38 = null;
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = compiler40.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler40.getErrorManager();
        com.google.javascript.rhino.Node node44 = compiler40.parseTestCode("hi!");
        compiler34.toSource(codeBuilder38, 10, node44);
        compiler28.prepareAst(node44);
        intermediateState27.externsRoot = node44;
        compiler0.setState(intermediateState27);
        boolean boolean49 = compiler0.hasErrors();
        org.junit.Assert.assertNotNull(codingConvention3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray4, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(jSModuleArray7);
        org.junit.Assert.assertArrayEquals(jSModuleArray7, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNotNull(typeValidator12);
        org.junit.Assert.assertNotNull(errorManager15);
        org.junit.Assert.assertNotNull(compilerOptions18);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNotNull(strSupplier25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorManager35);
        org.junit.Assert.assertNotNull(typeValidator36);
        org.junit.Assert.assertNull(node41);
        org.junit.Assert.assertNotNull(errorManager42);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode7 = compiler4.languageMode();
        com.google.javascript.jscomp.Tracer tracer9 = compiler4.newTracer("hi!");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.stopTracer(tracer9, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertTrue("'" + languageMode7 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode7.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(tracer9);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        boolean boolean8 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler9.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap11 = compiler9.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler9.getUniqueNameIdSupplier();
        boolean boolean13 = compiler9.isIdeMode();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler9.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler9.getState();
        com.google.javascript.rhino.Node node16 = intermediateState15.externsRoot;
        compiler0.setState(intermediateState15);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str19 = codeBuilder18.toString();
        int int20 = codeBuilder18.getLength();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = compiler22.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler22.getErrorManager();
        com.google.javascript.rhino.Node node26 = compiler22.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention27 = compiler22.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler22.getOptions();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager30 = compiler29.getErrorManager();
        compiler29.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler29.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray34 = compiler29.getWarnings();
        com.google.javascript.rhino.Node node35 = null;
        compiler29.jsRoot = node35;
        com.google.javascript.jscomp.Region region39 = compiler29.getSourceRegion("", 0);
        int int40 = compiler29.getWarningCount();
        boolean boolean41 = compiler29.precheck();
        compiler29.disableThreads();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray48 = compiler43.getWarnings();
        com.google.javascript.rhino.Node node49 = null;
        compiler43.jsRoot = node49;
        java.lang.String str51 = compiler43.toSource();
        com.google.javascript.rhino.Node node53 = compiler43.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler54.getErrorManager();
        compiler54.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler54.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray59 = compiler54.getWarnings();
        com.google.javascript.rhino.Node node60 = null;
        compiler54.jsRoot = node60;
        java.lang.String str62 = compiler54.toSource();
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = compiler63.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler63.getErrorManager();
        com.google.javascript.rhino.Node node67 = compiler63.parseTestCode("hi!");
        compiler54.externsRoot = node67;
        boolean boolean69 = compiler29.areNodesEqualForInlining(node53, node67);
        compiler22.jsRoot = node67;
        compiler0.toSource(codeBuilder18, (int) (short) 1, node67);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder73 = codeBuilder18.append("hi!");
        int int74 = codeBuilder18.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder76 = codeBuilder18.append("");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(variableMap11);
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(codingConvention27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(errorManager30);
        org.junit.Assert.assertNotNull(compilerOptions33);
        org.junit.Assert.assertNotNull(jSErrorArray34);
        org.junit.Assert.assertArrayEquals(jSErrorArray34, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(jSErrorArray48);
        org.junit.Assert.assertArrayEquals(jSErrorArray48, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(errorManager55);
        org.junit.Assert.assertNotNull(compilerOptions58);
        org.junit.Assert.assertNotNull(jSErrorArray59);
        org.junit.Assert.assertArrayEquals(jSErrorArray59, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(codeBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 3 + "'", int74 == 3);
        org.junit.Assert.assertNotNull(codeBuilder76);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        boolean boolean12 = compiler0.precheck();
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node14 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.JSError[] jSErrorArray15 = compiler0.getMessages();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler0.getOptions();
        com.google.javascript.rhino.Node node17 = compiler0.getRoot();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSErrorArray15);
        org.junit.Assert.assertArrayEquals(jSErrorArray15, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        boolean boolean12 = compiler0.precheck();
        compiler0.disableThreads();
        com.google.javascript.jscomp.SourceMap sourceMap14 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray20 = compiler15.getWarnings();
        com.google.javascript.rhino.Node node21 = null;
        compiler15.jsRoot = node21;
        com.google.javascript.jscomp.Region region25 = compiler15.getSourceRegion("", 0);
        int int26 = compiler15.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler27.getErrorManager();
        compiler27.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler27.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray32 = compiler27.getWarnings();
        com.google.javascript.rhino.Node node33 = null;
        compiler27.jsRoot = node33;
        java.lang.String str35 = compiler27.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList36 = compiler27.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler38 = null;
        compiler37.removeChangeHandler(codeChangeHandler38);
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler37.defaultCodingConvention;
        compiler27.defaultCodingConvention = codingConvention40;
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap42 = null;
        compiler27.setCssRenamingMap(cssRenamingMap42);
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager45 = compiler44.getErrorManager();
        compiler44.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions48 = compiler44.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray49 = compiler44.getWarnings();
        com.google.javascript.rhino.Node node50 = null;
        compiler44.jsRoot = node50;
        java.lang.String str52 = compiler44.toSource();
        com.google.javascript.rhino.Node node54 = compiler44.parseTestCode("");
        compiler27.externsRoot = node54;
        compiler15.externAndJsRoot = node54;
        compiler0.externsRoot = node54;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange58 = compiler0.recentChange;
        com.google.javascript.jscomp.JSModule jSModule59 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray60 = compiler0.toSourceArray(jSModule59);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(sourceMap14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(jSErrorArray32);
        org.junit.Assert.assertArrayEquals(jSErrorArray32, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(compilerInputList36);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNotNull(errorManager45);
        org.junit.Assert.assertNotNull(compilerOptions48);
        org.junit.Assert.assertNotNull(jSErrorArray49);
        org.junit.Assert.assertArrayEquals(jSErrorArray49, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(recentChange58);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.startPass("hi!");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList7 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap8 = compiler0.getGlobalVarReferences();
        com.google.javascript.rhino.Node node9 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(compilerInputList7);
        org.junit.Assert.assertNull(referenceMap8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.rhino.Node node10 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator14 = compiler12.getTypeValidator();
        compiler12.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        compiler16.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.options;
        compiler12.options = compilerOptions20;
        com.google.javascript.jscomp.ScopeCreator scopeCreator22 = compiler12.getTypedScopeCreator();
        boolean boolean23 = compiler12.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState24 = compiler12.getState();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler25.getErrorManager();
        compiler25.addToDebugLog("");
        boolean boolean29 = compiler25.isIdeMode();
        compiler25.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange31 = compiler25.recentChange;
        com.google.javascript.rhino.Node node33 = compiler25.parseTestCode("");
        intermediateState24.externsRoot = node33;
        compiler0.setState(intermediateState24);
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler37 = null;
        compiler36.removeChangeHandler(codeChangeHandler37);
        com.google.javascript.jscomp.PassConfig passConfig39 = compiler36.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier40 = compiler36.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = compiler41.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler41.getErrorManager();
        com.google.javascript.rhino.Node node45 = compiler41.parseTestCode("hi!");
        compiler36.externAndJsRoot = node45;
        java.lang.String str47 = compiler36.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier48 = compiler36.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.PassConfig passConfig49 = compiler36.createPassConfigInternal();
        com.google.javascript.rhino.Node node50 = compiler36.externAndJsRoot;
        intermediateState24.externsRoot = node50;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(typeValidator14);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNull(scopeCreator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(intermediateState24);
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(recentChange31);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(passConfig39);
        org.junit.Assert.assertNotNull(strSupplier40);
        org.junit.Assert.assertNull(node42);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSupplier48);
        org.junit.Assert.assertNotNull(passConfig49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getWarnings();
        com.google.javascript.rhino.Node node10 = null;
        compiler4.jsRoot = node10;
        java.lang.String str12 = compiler4.toSource();
        compiler4.disableThreads();
        boolean boolean14 = compiler4.isInliningForbidden();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str16 = codeBuilder15.toString();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler18.getErrorManager();
        compiler18.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler18.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler18.getWarnings();
        com.google.javascript.rhino.Node node24 = null;
        compiler18.jsRoot = node24;
        com.google.javascript.jscomp.Region region28 = compiler18.getSourceRegion("", 0);
        int int29 = compiler18.getWarningCount();
        boolean boolean30 = compiler18.precheck();
        compiler18.disableThreads();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        compiler32.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler32.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray37 = compiler32.getWarnings();
        com.google.javascript.rhino.Node node38 = null;
        compiler32.jsRoot = node38;
        java.lang.String str40 = compiler32.toSource();
        com.google.javascript.rhino.Node node42 = compiler32.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray48 = compiler43.getWarnings();
        com.google.javascript.rhino.Node node49 = null;
        compiler43.jsRoot = node49;
        java.lang.String str51 = compiler43.toSource();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = compiler52.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler52.getErrorManager();
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("hi!");
        compiler43.externsRoot = node56;
        boolean boolean58 = compiler18.areNodesEqualForInlining(node42, node56);
        compiler4.toSource(codeBuilder15, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler61.getErrorManager();
        compiler61.addToDebugLog("");
        boolean boolean65 = compiler61.hasHaltingErrors();
        boolean boolean66 = compiler61.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node68 = compiler61.parseTestCode("hi!");
        compiler0.toSource(codeBuilder15, 1, node68);
        boolean boolean71 = codeBuilder15.endsWith("");
        int int72 = codeBuilder15.getLength();
        int int73 = codeBuilder15.getColumnIndex();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder75 = codeBuilder15.append("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertArrayEquals(jSErrorArray3, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(jSErrorArray37);
        org.junit.Assert.assertArrayEquals(jSErrorArray37, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(jSErrorArray48);
        org.junit.Assert.assertArrayEquals(jSErrorArray48, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(codeBuilder75);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        compiler1.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray9 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList10 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, jSSourceFileArray9);
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList13 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList13, jSModuleArray12);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        compiler4.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList10, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList13, compilerOptions19);
        boolean boolean21 = compiler4.acceptEcmaScript5();
        com.google.javascript.rhino.Node node22 = compiler4.externAndJsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList23 = compiler4.getInputsInOrder();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler4.getOptions();
        compiler1.initOptions(compilerOptions24);
        compiler1.disableThreads();
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(jSSourceFileArray9);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray9, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(compilerInputList23);
        org.junit.Assert.assertNotNull(compilerOptions24);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.Result result8 = compiler0.getResult();
        com.google.javascript.jscomp.ScopeCreator scopeCreator9 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(config4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(compilerInputList6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNotNull(result8);
        org.junit.Assert.assertNull(scopeCreator9);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler6.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator8 = compiler6.getTypeValidator();
        compiler6.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder10 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = compiler12.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        com.google.javascript.rhino.Node node16 = compiler12.parseTestCode("hi!");
        compiler6.toSource(codeBuilder10, 10, node16);
        compiler0.prepareAst(node16);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList19 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker20 = null;
        compiler0.tracker = performanceTracker20;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(typeValidator8);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(compilerInputList19);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
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
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        java.lang.String str13 = compiler11.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap14 = compiler11.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager16 = compiler15.getErrorManager();
        compiler15.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList21 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, jSSourceFileArray20);
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList24 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList24, jSModuleArray23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager27 = compiler26.getErrorManager();
        compiler26.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler26.options;
        compiler15.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList24, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler33 = null;
        compiler32.removeChangeHandler(codeChangeHandler33);
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler32.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList37 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, jSSourceFileArray36);
        com.google.javascript.jscomp.JSModule[] jSModuleArray39 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList40 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList40, jSModuleArray39);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager43 = compiler42.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator44 = compiler42.getTypeValidator();
        compiler42.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager47 = compiler46.getErrorManager();
        compiler46.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler46.options;
        compiler42.options = compilerOptions50;
        compiler32.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList37, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions50);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = compiler53.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager55 = compiler53.getErrorManager();
        com.google.javascript.rhino.Node node57 = compiler53.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention58 = compiler53.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = compiler53.getOptions();
        compiler11.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList40, compilerOptions59);
        com.google.javascript.jscomp.JSModule[] jSModuleArray61 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList62 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList62, jSModuleArray61);
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler64.getErrorManager();
        compiler64.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler64.options;
        com.google.javascript.jscomp.CodingConvention codingConvention69 = null;
        compiler64.defaultCodingConvention = codingConvention69;
        com.google.common.base.Supplier<java.lang.String> strSupplier71 = compiler64.getUniqueNameIdSupplier();
        compiler64.startPass("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions74 = compiler64.getOptions();
        compiler0.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList21, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList62, compilerOptions74);
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getErrors();
        boolean boolean77 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap78 = compiler0.getCssRenamingMap();
        java.lang.String[] strArray79 = compiler0.toSourceArray();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(functionInformationMap14);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray20, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(errorManager27);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jSModuleArray39);
        org.junit.Assert.assertArrayEquals(jSModuleArray39, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(errorManager43);
        org.junit.Assert.assertNotNull(typeValidator44);
        org.junit.Assert.assertNotNull(errorManager47);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNull(node54);
        org.junit.Assert.assertNotNull(errorManager55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(codingConvention58);
        org.junit.Assert.assertNotNull(compilerOptions59);
        org.junit.Assert.assertNotNull(jSModuleArray61);
        org.junit.Assert.assertArrayEquals(jSModuleArray61, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertNotNull(strSupplier71);
        org.junit.Assert.assertNotNull(compilerOptions74);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNull(cssRenamingMap78);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] {});
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.CodingConvention codingConvention5 = null;
        compiler0.defaultCodingConvention = codingConvention5;
        java.lang.String str7 = compiler0.toSource();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getExternsForTesting();
        boolean boolean10 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError jSError11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strSupplier8);
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.startPass("hi!");
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = compiler7.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler7.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler7.getWarnings();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler11.getWarnings();
        com.google.javascript.rhino.Node node17 = null;
        compiler11.jsRoot = node17;
        java.lang.String str19 = compiler11.toSource();
        compiler11.disableThreads();
        boolean boolean21 = compiler11.isInliningForbidden();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder22 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str23 = codeBuilder22.toString();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler25.getErrorManager();
        compiler25.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler25.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler25.getWarnings();
        com.google.javascript.rhino.Node node31 = null;
        compiler25.jsRoot = node31;
        com.google.javascript.jscomp.Region region35 = compiler25.getSourceRegion("", 0);
        int int36 = compiler25.getWarningCount();
        boolean boolean37 = compiler25.precheck();
        compiler25.disableThreads();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler39.getErrorManager();
        compiler39.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler39.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray44 = compiler39.getWarnings();
        com.google.javascript.rhino.Node node45 = null;
        compiler39.jsRoot = node45;
        java.lang.String str47 = compiler39.toSource();
        com.google.javascript.rhino.Node node49 = compiler39.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler50.getErrorManager();
        compiler50.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler50.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray55 = compiler50.getWarnings();
        com.google.javascript.rhino.Node node56 = null;
        compiler50.jsRoot = node56;
        java.lang.String str58 = compiler50.toSource();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = compiler59.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager61 = compiler59.getErrorManager();
        com.google.javascript.rhino.Node node63 = compiler59.parseTestCode("hi!");
        compiler50.externsRoot = node63;
        boolean boolean65 = compiler25.areNodesEqualForInlining(node49, node63);
        compiler11.toSource(codeBuilder22, (int) (byte) 0, node49);
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager69 = compiler68.getErrorManager();
        compiler68.addToDebugLog("");
        boolean boolean72 = compiler68.hasHaltingErrors();
        boolean boolean73 = compiler68.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node75 = compiler68.parseTestCode("hi!");
        compiler7.toSource(codeBuilder22, 1, node75);
        compiler0.externAndJsRoot = node75;
        compiler0.disableThreads();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertArrayEquals(jSErrorArray30, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertNotNull(jSErrorArray44);
        org.junit.Assert.assertArrayEquals(jSErrorArray44, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(jSErrorArray55);
        org.junit.Assert.assertArrayEquals(jSErrorArray55, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(errorManager61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(errorManager69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node75);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.addToDebugLog("");
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
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
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList19 = compiler0.getInputsInOrder();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler0.getOptions();
        compiler0.removeInput("");
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter23 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(compilerInputList19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter23);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        java.lang.String str7 = compiler0.toSource();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler0.getVariableMap();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(variableMap8);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        boolean boolean13 = compiler0.hasErrors();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter14 = compiler0.getDefaultErrorReporter();
        compiler0.startPass("hi!");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(errorReporter14);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler4.getErrorManager();
        compiler4.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler4.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray9 = compiler4.getWarnings();
        com.google.javascript.rhino.Node node10 = null;
        compiler4.jsRoot = node10;
        java.lang.String str12 = compiler4.toSource();
        compiler4.disableThreads();
        boolean boolean14 = compiler4.isInliningForbidden();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str16 = codeBuilder15.toString();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler18.getErrorManager();
        compiler18.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler18.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray23 = compiler18.getWarnings();
        com.google.javascript.rhino.Node node24 = null;
        compiler18.jsRoot = node24;
        com.google.javascript.jscomp.Region region28 = compiler18.getSourceRegion("", 0);
        int int29 = compiler18.getWarningCount();
        boolean boolean30 = compiler18.precheck();
        compiler18.disableThreads();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        compiler32.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler32.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray37 = compiler32.getWarnings();
        com.google.javascript.rhino.Node node38 = null;
        compiler32.jsRoot = node38;
        java.lang.String str40 = compiler32.toSource();
        com.google.javascript.rhino.Node node42 = compiler32.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray48 = compiler43.getWarnings();
        com.google.javascript.rhino.Node node49 = null;
        compiler43.jsRoot = node49;
        java.lang.String str51 = compiler43.toSource();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = compiler52.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler52.getErrorManager();
        com.google.javascript.rhino.Node node56 = compiler52.parseTestCode("hi!");
        compiler43.externsRoot = node56;
        boolean boolean58 = compiler18.areNodesEqualForInlining(node42, node56);
        compiler4.toSource(codeBuilder15, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager62 = compiler61.getErrorManager();
        compiler61.addToDebugLog("");
        boolean boolean65 = compiler61.hasHaltingErrors();
        boolean boolean66 = compiler61.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node68 = compiler61.parseTestCode("hi!");
        compiler0.toSource(codeBuilder15, 1, node68);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap70 = null;
        compiler0.setCssRenamingMap(cssRenamingMap70);
        com.google.javascript.jscomp.ErrorManager errorManager72 = compiler0.getErrorManager();
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap73 = null;
        com.google.javascript.rhino.Node node74 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.updateGlobalVarReferences(varMap73, node74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertArrayEquals(jSErrorArray3, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNotNull(jSErrorArray9);
        org.junit.Assert.assertArrayEquals(jSErrorArray9, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNotNull(jSErrorArray23);
        org.junit.Assert.assertArrayEquals(jSErrorArray23, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(jSErrorArray37);
        org.junit.Assert.assertArrayEquals(jSErrorArray37, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(jSErrorArray48);
        org.junit.Assert.assertArrayEquals(jSErrorArray48, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(node53);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorManager62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertNotNull(errorManager72);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        com.google.javascript.jscomp.Region region10 = compiler0.getSourceRegion("", 0);
        int int11 = compiler0.getWarningCount();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = compiler12.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler12.getErrorManager();
        compiler0.setErrorManager(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = compiler16.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler16.getErrorManager();
        com.google.javascript.rhino.Node node20 = compiler16.parseTestCode("hi!");
        compiler0.externAndJsRoot = node20;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter22 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler0.getPropertyMap();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertNull(variableMap23);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList3 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState4 = compiler0.getState();
        com.google.javascript.rhino.Node node7 = compiler0.parseSyntheticCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n", "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(compilerInputList3);
        org.junit.Assert.assertNotNull(intermediateState4);
        org.junit.Assert.assertNotNull(node7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler(errorManager2);
        com.google.javascript.jscomp.ErrorManager errorManager4 = compiler3.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler(errorManager4);
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(errorManager4);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray4 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray5 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler7 = null;
        compiler6.removeChangeHandler(codeChangeHandler7);
        com.google.javascript.jscomp.CodingConvention codingConvention9 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator18 = compiler16.getTypeValidator();
        compiler16.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager21 = compiler20.getErrorManager();
        compiler20.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler20.options;
        compiler16.options = compilerOptions24;
        compiler6.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions24);
        compiler0.init(jSSourceFileArray4, jSModuleArray5, compilerOptions24);
        com.google.javascript.rhino.Node node28 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler30 = null;
        compiler29.removeChangeHandler(codeChangeHandler30);
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler29.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList34 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, jSSourceFileArray33);
        com.google.javascript.jscomp.JSModule[] jSModuleArray36 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList37 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList37, jSModuleArray36);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler39.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator41 = compiler39.getTypeValidator();
        compiler39.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        compiler39.options = compilerOptions47;
        compiler29.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList37, compilerOptions47);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler51 = null;
        compiler50.removeChangeHandler(codeChangeHandler51);
        com.google.javascript.jscomp.CodingConvention codingConvention53 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList55 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, jSSourceFileArray54);
        com.google.javascript.jscomp.JSModule[] jSModuleArray57 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList58 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList58, jSModuleArray57);
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager61 = compiler60.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator62 = compiler60.getTypeValidator();
        compiler60.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager65 = compiler64.getErrorManager();
        compiler64.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions68 = compiler64.options;
        compiler60.options = compilerOptions68;
        compiler50.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList58, compilerOptions68);
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager72 = compiler71.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator73 = compiler71.getTypeValidator();
        compiler71.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager76 = compiler75.getErrorManager();
        compiler75.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler75.options;
        compiler71.options = compilerOptions79;
        com.google.javascript.jscomp.Result result81 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList34, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList55, compilerOptions79);
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.ReverseAbstractInterpreter reverseAbstractInterpreter83 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.VariableMap variableMap84 = compiler0.getVariableMap();
        compiler0.setHasRegExpGlobalReferences(true);
        compiler0.removeInput("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertNotNull(jSSourceFileArray4);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray4, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray5);
        org.junit.Assert.assertArrayEquals(jSModuleArray5, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(codingConvention9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertArrayEquals(jSModuleArray13, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(typeValidator18);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNotNull(compilerOptions24);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray33, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jSModuleArray36);
        org.junit.Assert.assertArrayEquals(jSModuleArray36, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(typeValidator41);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(codingConvention53);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray54, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jSModuleArray57);
        org.junit.Assert.assertArrayEquals(jSModuleArray57, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(errorManager61);
        org.junit.Assert.assertNotNull(typeValidator62);
        org.junit.Assert.assertNotNull(errorManager65);
        org.junit.Assert.assertNotNull(compilerOptions68);
        org.junit.Assert.assertNotNull(errorManager72);
        org.junit.Assert.assertNotNull(typeValidator73);
        org.junit.Assert.assertNotNull(errorManager76);
        org.junit.Assert.assertNotNull(compilerOptions79);
        org.junit.Assert.assertNotNull(result81);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter83);
        org.junit.Assert.assertNull(variableMap84);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        java.lang.String str1 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier2 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("");
        compiler0.setHasRegExpGlobalReferences(true);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strSupplier2);
        org.junit.Assert.assertNotNull(node4);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.startPass("hi!");
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = compiler7.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler7.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler7.getWarnings();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler11.getWarnings();
        com.google.javascript.rhino.Node node17 = null;
        compiler11.jsRoot = node17;
        java.lang.String str19 = compiler11.toSource();
        compiler11.disableThreads();
        boolean boolean21 = compiler11.isInliningForbidden();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder22 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str23 = codeBuilder22.toString();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager26 = compiler25.getErrorManager();
        compiler25.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler25.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler25.getWarnings();
        com.google.javascript.rhino.Node node31 = null;
        compiler25.jsRoot = node31;
        com.google.javascript.jscomp.Region region35 = compiler25.getSourceRegion("", 0);
        int int36 = compiler25.getWarningCount();
        boolean boolean37 = compiler25.precheck();
        compiler25.disableThreads();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler39.getErrorManager();
        compiler39.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler39.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray44 = compiler39.getWarnings();
        com.google.javascript.rhino.Node node45 = null;
        compiler39.jsRoot = node45;
        java.lang.String str47 = compiler39.toSource();
        com.google.javascript.rhino.Node node49 = compiler39.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler50.getErrorManager();
        compiler50.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler50.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray55 = compiler50.getWarnings();
        com.google.javascript.rhino.Node node56 = null;
        compiler50.jsRoot = node56;
        java.lang.String str58 = compiler50.toSource();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = compiler59.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager61 = compiler59.getErrorManager();
        com.google.javascript.rhino.Node node63 = compiler59.parseTestCode("hi!");
        compiler50.externsRoot = node63;
        boolean boolean65 = compiler25.areNodesEqualForInlining(node49, node63);
        compiler11.toSource(codeBuilder22, (int) (byte) 0, node49);
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager69 = compiler68.getErrorManager();
        compiler68.addToDebugLog("");
        boolean boolean72 = compiler68.hasHaltingErrors();
        boolean boolean73 = compiler68.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node75 = compiler68.parseTestCode("hi!");
        compiler7.toSource(codeBuilder22, 1, node75);
        compiler0.externAndJsRoot = node75;
        boolean boolean78 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(errorManager26);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertArrayEquals(jSErrorArray30, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertNotNull(jSErrorArray44);
        org.junit.Assert.assertArrayEquals(jSErrorArray44, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(jSErrorArray55);
        org.junit.Assert.assertArrayEquals(jSErrorArray55, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(node60);
        org.junit.Assert.assertNotNull(errorManager61);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(errorManager69);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
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
        compiler0.parse();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter22 = compiler0.getDefaultErrorReporter();
        boolean boolean23 = compiler0.acceptConstKeyword();
        com.google.javascript.rhino.Node node25 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.TypeValidator typeValidator26 = compiler0.getTypeValidator();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSSourceFileArray5);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray5, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(errorReporter22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(typeValidator26);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler0.options;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker10 = null;
        compiler0.tracker = performanceTracker10;
        com.google.javascript.jscomp.TypeValidator typeValidator12 = compiler0.getTypeValidator();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(typeValidator12);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.parsing.Config config3 = compiler0.getParserConfig();
        boolean boolean4 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        compiler0.setCssRenamingMap(cssRenamingMap5);
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager8 = compiler7.getErrorManager();
        compiler7.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions11 = compiler7.options;
        com.google.javascript.jscomp.CodingConvention codingConvention12 = null;
        compiler7.defaultCodingConvention = codingConvention12;
        com.google.common.base.Supplier<java.lang.String> strSupplier14 = compiler7.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap15 = null;
        compiler7.setCssRenamingMap(cssRenamingMap15);
        boolean boolean17 = compiler7.acceptEcmaScript5();
        com.google.javascript.rhino.Node node18 = compiler7.jsRoot;
        com.google.javascript.jscomp.PassConfig passConfig19 = compiler7.createPassConfigInternal();
        com.google.javascript.rhino.Node node21 = compiler7.parseTestCode("hi!");
        compiler0.prepareAst(node21);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(config3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(errorManager8);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertNotNull(strSupplier14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(passConfig19);
        org.junit.Assert.assertNotNull(node21);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
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
        com.google.javascript.rhino.Node node14 = compiler0.parseTestCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scopeCreator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNotNull(node14);
    }
}

