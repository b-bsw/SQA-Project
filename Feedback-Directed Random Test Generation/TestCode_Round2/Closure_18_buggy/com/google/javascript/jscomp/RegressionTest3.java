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
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler17.getVariableMap();
        com.google.javascript.rhino.Node node25 = compiler17.parseTestCode("[hi!]");
        java.lang.String str26 = compiler9.toSource(node25);
        compiler0.externsRoot = node25;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph28 = compiler0.getModuleGraph();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(jSModuleGraph28);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.CodingConvention codingConvention4 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap5 = compiler0.getFunctionalInformationMap();
        com.google.javascript.rhino.InputId inputId6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput7 = compiler0.getInput(inputId6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(errorReporter2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(codingConvention4);
        org.junit.Assert.assertNull(functionInformationMap5);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler3 = null;
        compiler0.removeChangeHandler(codeChangeHandler3);
        java.lang.String str5 = compiler0.getAstDotGraph();
        java.lang.Class<?> wildcardClass6 = compiler0.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        int int29 = compiler0.getErrorCount();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler0.options;
        com.google.javascript.jscomp.Result result31 = compiler0.getResult();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(result31);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        double double29 = compiler0.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler0.getWarnings();
        boolean boolean31 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertArrayEquals(jSErrorArray30, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler0.getModuleGraph();
        compiler0.setHasRegExpGlobalReferences(true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.getSourceLine("{SyntheticVarsDeclar}", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModuleGraph4);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        boolean boolean2 = codeBuilder0.endsWith("Unversioned directory");
        int int3 = codeBuilder0.getLineIndex();
        boolean boolean5 = codeBuilder0.endsWith("[2569/09/27 15:58]");
        java.lang.String str6 = codeBuilder0.toString();
        int int7 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        compiler0.options = compilerOptions10;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        compiler13.options = compilerOptions16;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler13.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.initCompilerOptionsIfTesting();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap35 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        java.lang.Class<?> wildcardClass11 = compiler0.getClass();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        compiler0.options = compilerOptions10;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.rhino.Node node17 = null;
        compiler13.prepareAst(node17);
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler13.getVariableMap();
        com.google.javascript.jscomp.Scope scope20 = compiler13.getTopScope();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap24 = compiler21.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler25.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap27 = compiler25.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.prepareAst(node29);
        com.google.javascript.jscomp.Scope scope31 = compiler28.getTopScope();
        com.google.javascript.rhino.Node node32 = null;
        compiler28.prepareAst(node32);
        com.google.javascript.jscomp.VariableMap variableMap34 = compiler28.getVariableMap();
        com.google.javascript.rhino.Node node36 = compiler28.parseTestCode("[hi!]");
        java.lang.String str37 = compiler25.toSource(node36);
        compiler21.jsRoot = node36;
        java.lang.String str39 = compiler13.toSource(node36);
        compiler0.jsRoot = node36;
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(globalVarReferenceMap24);
        org.junit.Assert.assertNull(variableMap26);
        org.junit.Assert.assertNull(globalVarReferenceMap27);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(variableMap34);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        compiler0.disableThreads();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator3 = compiler0.getTypedScopeCreator();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.prepareAst(node6);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        compiler5.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler10.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler10.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups13 = compiler10.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig14 = compiler10.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList15 = compiler10.getInputsForTesting();
        com.google.javascript.rhino.Node node17 = compiler10.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder18 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int19 = codeBuilder18.getLength();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        compiler21.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler21.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode27 = compiler21.languageMode();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange30 = compiler28.recentChange;
        double double31 = compiler28.getProgress();
        com.google.javascript.rhino.Node node33 = compiler28.parseTestCode("Unversioned directory");
        compiler21.externAndJsRoot = node33;
        compiler10.toSource(codeBuilder18, (int) (byte) 0, node33);
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.prepareAst(node38);
        com.google.javascript.jscomp.Scope scope40 = compiler37.getTopScope();
        com.google.javascript.rhino.Node node41 = null;
        compiler37.prepareAst(node41);
        com.google.javascript.jscomp.VariableMap variableMap43 = compiler37.getVariableMap();
        com.google.javascript.rhino.Node node45 = compiler37.parseTestCode("[hi!]");
        compiler5.toSource(codeBuilder18, (int) (byte) 0, node45);
        compiler0.jsRoot = node45;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator49 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(memoizedScopeCreator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(recentChange12);
        org.junit.Assert.assertNotNull(diagnosticGroups13);
        org.junit.Assert.assertNotNull(defaultPassConfig14);
        org.junit.Assert.assertNull(compilerInputList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertTrue("'" + languageMode27 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode27.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertNotNull(recentChange30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(variableMap43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(memoizedScopeCreator49);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        com.google.javascript.rhino.Node node20 = null;
        compiler16.prepareAst(node20);
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler16.getVariableMap();
        com.google.javascript.rhino.Node node24 = compiler16.parseTestCode("[hi!]");
        compiler0.externAndJsRoot = node24;
        com.google.javascript.jscomp.TypeValidator typeValidator26 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.Result result27 = compiler0.getResult();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(variableMap22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(typeValidator26);
        org.junit.Assert.assertNotNull(result27);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler18 = null;
        compiler17.removeChangeHandler(codeChangeHandler18);
        com.google.javascript.jscomp.Region region22 = compiler17.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler39.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups42 = compiler39.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig43 = compiler39.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList44 = compiler39.getInputsForTesting();
        com.google.javascript.rhino.Node node46 = compiler39.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int48 = codeBuilder47.getLength();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention55 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler50.languageMode();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler57.recentChange;
        double double60 = compiler57.getProgress();
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("Unversioned directory");
        compiler50.externAndJsRoot = node62;
        compiler39.toSource(codeBuilder47, (int) (byte) 0, node62);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        compiler34.toSource(codeBuilder47, (int) (byte) 0, node74);
        java.lang.String str76 = compiler23.toSource(node74);
        java.lang.String str77 = compiler17.toSource(node74);
        java.lang.String str78 = compiler0.toSource(node74);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap79 = null;
        compiler0.setCssRenamingMap(cssRenamingMap79);
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node82 = null;
        compiler81.prepareAst(node82);
        com.google.javascript.jscomp.Scope scope84 = compiler81.getTopScope();
        com.google.javascript.rhino.Node node85 = null;
        compiler81.prepareAst(node85);
        boolean boolean87 = compiler81.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList88 = compiler81.getExternsForTesting();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph89 = compiler81.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig90 = compiler81.ensureDefaultPassConfig();
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig90);
        java.lang.Class<?> wildcardClass92 = compiler0.getClass();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNotNull(diagnosticGroups42);
        org.junit.Assert.assertNotNull(defaultPassConfig43);
        org.junit.Assert.assertNull(compilerInputList44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(codingConvention55);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(compilerInputList88);
        org.junit.Assert.assertNull(jSModuleGraph89);
        org.junit.Assert.assertNotNull(defaultPassConfig90);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.io.PrintStream printStream0 = null;
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler(printStream0);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder2 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str3 = codeBuilder2.toString();
        codeBuilder2.reset();
        codeBuilder2.reset();
        int int6 = codeBuilder2.getLineIndex();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter13 = compiler8.getDefaultErrorReporter();
        int int14 = compiler8.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap17 = compiler15.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        compiler19.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler22.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler22.recentChange;
        compiler19.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        compiler18.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        com.google.javascript.rhino.head.ErrorReporter errorReporter27 = compiler18.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager28 = compiler18.getErrorManager();
        compiler15.setErrorManager(errorManager28);
        compiler8.setErrorManager(errorManager28);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler31.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap33 = compiler31.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        com.google.javascript.rhino.Node node38 = null;
        compiler34.prepareAst(node38);
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler34.getVariableMap();
        com.google.javascript.rhino.Node node42 = compiler34.parseTestCode("[hi!]");
        java.lang.String str43 = compiler31.toSource(node42);
        compiler8.externsRoot = node42;
        // The following exception was thrown during execution in test generation
        try {
            compiler1.toSource(codeBuilder2, 0, node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(errorReporter13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNull(globalVarReferenceMap17);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNotNull(errorReporter27);
        org.junit.Assert.assertNotNull(errorManager28);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(globalVarReferenceMap33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(variableMap40);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node20 = compiler0.jsRoot;
        boolean boolean21 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.head.ErrorReporter errorReporter22 = compiler0.getDefaultErrorReporter();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(jSErrorArray19);
        org.junit.Assert.assertArrayEquals(jSErrorArray19, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(errorReporter22);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        double double8 = compiler5.getProgress();
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler11.getSourceMap();
        compiler11.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler14.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler5.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler0.jsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler0.getSourceMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Tracer tracer23 = compiler0.newTracer("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(sourceMap21);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention21;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap23 = compiler0.getGlobalVarReferences();
        compiler0.setHasRegExpGlobalReferences(true);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getInputsInOrder();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.Scope scope30 = compiler27.getTopScope();
        com.google.javascript.rhino.Node node31 = null;
        compiler27.prepareAst(node31);
        boolean boolean33 = compiler27.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig39 = compiler36.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler36.newCompilerOptions();
        com.google.javascript.jscomp.Result result41 = compiler27.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler42.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler42.recentChange;
        compiler27.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList47 = compiler0.getExternsInOrder();
        boolean boolean48 = compiler0.precheck();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertNull(globalVarReferenceMap23);
        org.junit.Assert.assertNotNull(compilerInputList26);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray34, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray35);
        org.junit.Assert.assertArrayEquals(jSModuleArray35, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig39);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertNotNull(result41);
        org.junit.Assert.assertNull(sourceMap43);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(compilerInputList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node20 = compiler0.parseTestCode("[singleton]");
        boolean boolean21 = compiler0.hasErrors();
        com.google.javascript.jscomp.JSError[] jSErrorArray22 = compiler0.getMessages();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups23 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jSErrorArray22);
        org.junit.Assert.assertArrayEquals(jSErrorArray22, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(diagnosticGroups23);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler11.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap13 = compiler11.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.prepareAst(node15);
        com.google.javascript.jscomp.Scope scope17 = compiler14.getTopScope();
        com.google.javascript.rhino.Node node18 = null;
        compiler14.prepareAst(node18);
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler14.getVariableMap();
        com.google.javascript.rhino.Node node22 = compiler14.parseTestCode("[hi!]");
        java.lang.String str23 = compiler11.toSource(node22);
        compiler0.jsRoot = node22;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry25 = compiler0.getTypeRegistry();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNull(globalVarReferenceMap13);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(jSTypeRegistry25);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        boolean boolean35 = compiler29.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        compiler38.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig41 = compiler38.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler38.newCompilerOptions();
        com.google.javascript.jscomp.Result result43 = compiler29.compile(jSSourceFileArray36, jSModuleArray37, compilerOptions42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler29.getOptions();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.prepareAst(node46);
        com.google.javascript.jscomp.Scope scope48 = compiler45.getTopScope();
        compiler45.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler45.defaultCodingConvention;
        compiler29.defaultCodingConvention = codingConvention50;
        compiler0.defaultCodingConvention = codingConvention50;
        java.lang.String str55 = compiler0.getSourceLine("[singleton]", (int) (byte) 10);
        com.google.javascript.rhino.Node node56 = compiler0.externsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler0.recentChange;
        java.lang.String str58 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler60 = null;
        compiler59.removeChangeHandler(codeChangeHandler60);
        com.google.javascript.jscomp.Region region64 = compiler59.getSourceRegion("hi!", (int) (short) -1);
        compiler59.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap68 = compiler67.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange69 = compiler67.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups70 = compiler67.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig71 = compiler67.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList72 = compiler67.getInputsForTesting();
        com.google.javascript.rhino.Node node74 = compiler67.parseTestCode("2569/09/27 15:58");
        compiler59.externsRoot = node74;
        compiler0.externsRoot = node74;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig77 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray37);
        org.junit.Assert.assertArrayEquals(jSModuleArray37, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig41);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNotNull(result43);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(region64);
        org.junit.Assert.assertNull(sourceMap68);
        org.junit.Assert.assertNotNull(recentChange69);
        org.junit.Assert.assertNotNull(diagnosticGroups70);
        org.junit.Assert.assertNotNull(defaultPassConfig71);
        org.junit.Assert.assertNull(compilerInputList72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(defaultPassConfig77);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler23 = null;
        compiler22.removeChangeHandler(codeChangeHandler23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        compiler26.options = compilerOptions29;
        boolean boolean31 = compiler26.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        compiler26.init(jSSourceFileArray32, jSModuleArray41, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        boolean boolean60 = compiler54.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray61 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray62 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        compiler63.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig66 = compiler63.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.newCompilerOptions();
        com.google.javascript.jscomp.Result result68 = compiler54.compile(jSSourceFileArray61, jSModuleArray62, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig72 = compiler69.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler69.newCompilerOptions();
        compiler22.init(jSSourceFileArray32, jSSourceFileArray61, compilerOptions73);
        compiler0.options = compilerOptions73;
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getMessages();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList77 = compiler0.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray61);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray61, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray62);
        org.junit.Assert.assertArrayEquals(jSModuleArray62, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNotNull(defaultPassConfig72);
        org.junit.Assert.assertNotNull(compilerOptions73);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertArrayEquals(jSErrorArray76, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap10 = compiler9.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap11 = compiler9.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.prepareAst(node13);
        com.google.javascript.jscomp.Scope scope15 = compiler12.getTopScope();
        com.google.javascript.rhino.Node node16 = null;
        compiler12.prepareAst(node16);
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler12.getVariableMap();
        com.google.javascript.rhino.Node node20 = compiler12.parseTestCode("[hi!]");
        java.lang.String str21 = compiler9.toSource(node20);
        boolean boolean22 = compiler9.hasErrors();
        boolean boolean23 = compiler9.isInliningForbidden();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler9.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange24);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = compiler0.ensureLibraryInjected("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertNull(variableMap10);
        org.junit.Assert.assertNull(globalVarReferenceMap11);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(variableMap18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(recentChange24);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node3 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.prepareAst(node6);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        com.google.javascript.rhino.Node node9 = null;
        compiler5.prepareAst(node9);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler5.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.rhino.Node node17 = null;
        compiler13.prepareAst(node17);
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler13.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph20 = compiler13.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler21.getVariableMap();
        com.google.javascript.rhino.Node node29 = compiler21.parseTestCode("[hi!]");
        java.lang.String str30 = compiler13.toSource(node29);
        intermediateState12.externsRoot = node29;
        compiler0.setState(intermediateState12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler0.options;
        com.google.javascript.jscomp.JsAst jsAst34 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(memoizedScopeCreator11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertNull(jSModuleGraph20);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(compilerOptions33);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("", (int) (short) 1);
        com.google.javascript.jscomp.JSError[] jSErrorArray10 = compiler0.getWarnings();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry11 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups12 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNotNull(jSErrorArray10);
        org.junit.Assert.assertArrayEquals(jSErrorArray10, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSTypeRegistry11);
        org.junit.Assert.assertNotNull(diagnosticGroups12);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        boolean boolean13 = compiler0.hasErrors();
        java.lang.String str14 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        com.google.javascript.rhino.Node node35 = null;
        compiler31.prepareAst(node35);
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler31.getVariableMap();
        com.google.javascript.rhino.Node node39 = compiler31.parseTestCode("[hi!]");
        compiler15.externAndJsRoot = node39;
        compiler0.jsRoot = node39;
        com.google.javascript.jscomp.JSError[] jSErrorArray42 = compiler0.getMessages();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile43 = null;
        com.google.javascript.jscomp.Compiler compiler44 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node45 = null;
        compiler44.prepareAst(node45);
        com.google.javascript.jscomp.Scope scope47 = compiler44.getTopScope();
        com.google.javascript.rhino.Node node48 = null;
        compiler44.prepareAst(node48);
        boolean boolean50 = compiler44.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray51 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray52 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        compiler53.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig56 = compiler53.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler53.newCompilerOptions();
        com.google.javascript.jscomp.Result result58 = compiler44.compile(jSSourceFileArray51, jSModuleArray52, compilerOptions57);
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node60 = null;
        compiler59.prepareAst(node60);
        com.google.javascript.jscomp.Scope scope62 = compiler59.getTopScope();
        com.google.javascript.rhino.Node node63 = null;
        compiler59.prepareAst(node63);
        com.google.javascript.jscomp.VariableMap variableMap65 = compiler59.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph66 = compiler59.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node68 = null;
        compiler67.prepareAst(node68);
        com.google.javascript.jscomp.Scope scope70 = compiler67.getTopScope();
        com.google.javascript.rhino.Node node71 = null;
        compiler67.prepareAst(node71);
        com.google.javascript.jscomp.VariableMap variableMap73 = compiler67.getVariableMap();
        com.google.javascript.rhino.Node node75 = compiler67.parseTestCode("[hi!]");
        java.lang.String str76 = compiler59.toSource(node75);
        com.google.javascript.jscomp.PassConfig passConfig77 = compiler59.getPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = compiler59.newCompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions79 = compiler59.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result80 = compiler0.compile(jSSourceFile43, jSModuleArray52, compilerOptions79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(variableMap37);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(jSErrorArray42);
        org.junit.Assert.assertArrayEquals(jSErrorArray42, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(scope47);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray51);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray51, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray52);
        org.junit.Assert.assertArrayEquals(jSModuleArray52, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig56);
        org.junit.Assert.assertNotNull(compilerOptions57);
        org.junit.Assert.assertNotNull(result58);
        org.junit.Assert.assertNull(scope62);
        org.junit.Assert.assertNull(variableMap65);
        org.junit.Assert.assertNull(jSModuleGraph66);
        org.junit.Assert.assertNull(scope70);
        org.junit.Assert.assertNull(variableMap73);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(passConfig77);
        org.junit.Assert.assertNotNull(compilerOptions78);
        org.junit.Assert.assertNotNull(compilerOptions79);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler17.getVariableMap();
        com.google.javascript.rhino.Node node25 = compiler17.parseTestCode("[hi!]");
        java.lang.String str26 = compiler9.toSource(node25);
        compiler0.externsRoot = node25;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PassConfig passConfig29 = compiler0.createPassConfigInternal();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention31 = compiler0.defaultCodingConvention;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(passConfig29);
        org.junit.Assert.assertNotNull(codingConvention31);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        compiler0.addToDebugLog("[hi!]");
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(passConfig10);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = compiler0.getErrorCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler17.getVariableMap();
        com.google.javascript.rhino.Node node25 = compiler17.parseTestCode("[hi!]");
        java.lang.String str26 = compiler9.toSource(node25);
        compiler0.externsRoot = node25;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.VariableMap variableMap29 = compiler0.getPropertyMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModuleGraph jSModuleGraph30 = compiler0.getDegenerateModuleGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(variableMap29);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler18 = null;
        compiler17.removeChangeHandler(codeChangeHandler18);
        com.google.javascript.jscomp.Region region22 = compiler17.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler39.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups42 = compiler39.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig43 = compiler39.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList44 = compiler39.getInputsForTesting();
        com.google.javascript.rhino.Node node46 = compiler39.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int48 = codeBuilder47.getLength();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention55 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler50.languageMode();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler57.recentChange;
        double double60 = compiler57.getProgress();
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("Unversioned directory");
        compiler50.externAndJsRoot = node62;
        compiler39.toSource(codeBuilder47, (int) (byte) 0, node62);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        compiler34.toSource(codeBuilder47, (int) (byte) 0, node74);
        java.lang.String str76 = compiler23.toSource(node74);
        java.lang.String str77 = compiler17.toSource(node74);
        java.lang.String str78 = compiler0.toSource(node74);
        boolean boolean79 = compiler0.isTypeCheckingEnabled();
        boolean boolean80 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node82 = null;
        compiler81.prepareAst(node82);
        com.google.javascript.jscomp.Scope scope84 = compiler81.getTopScope();
        compiler81.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention86 = compiler81.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode87 = compiler81.languageMode();
        compiler81.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap89 = compiler81.getSourceMap();
        com.google.javascript.rhino.Node node90 = compiler81.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier91 = compiler81.getUniqueNameIdSupplier();
        com.google.javascript.rhino.head.ErrorReporter errorReporter92 = compiler81.getDefaultErrorReporter();
        com.google.javascript.jscomp.JSError[] jSErrorArray93 = compiler81.getWarnings();
        com.google.javascript.jscomp.Tracer tracer95 = compiler81.newTracer("[[singleton]]");
        compiler0.stopTracer(tracer95, "[{SyntheticVarsDeclar}]");
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode98 = compiler0.languageMode();
        com.google.javascript.jscomp.JSError[] jSErrorArray99 = compiler0.getMessages();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNotNull(diagnosticGroups42);
        org.junit.Assert.assertNotNull(defaultPassConfig43);
        org.junit.Assert.assertNull(compilerInputList44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(codingConvention55);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertNotNull(codingConvention86);
        org.junit.Assert.assertTrue("'" + languageMode87 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode87.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap89);
        org.junit.Assert.assertNull(node90);
        org.junit.Assert.assertNotNull(strSupplier91);
        org.junit.Assert.assertNotNull(errorReporter92);
        org.junit.Assert.assertNotNull(jSErrorArray93);
        org.junit.Assert.assertArrayEquals(jSErrorArray93, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(tracer95);
        org.junit.Assert.assertTrue("'" + languageMode98 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode98.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(jSErrorArray99);
        org.junit.Assert.assertArrayEquals(jSErrorArray99, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler0.getState();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups17 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.prepareAst(node19);
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        com.google.javascript.rhino.Node node22 = null;
        compiler18.prepareAst(node22);
        boolean boolean24 = compiler18.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        compiler27.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig30 = compiler27.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler27.newCompilerOptions();
        com.google.javascript.jscomp.Result result32 = compiler18.compile(jSSourceFileArray25, jSModuleArray26, compilerOptions31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler18.getOptions();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention39 = compiler34.defaultCodingConvention;
        compiler18.defaultCodingConvention = codingConvention39;
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.prepareAst(node42);
        com.google.javascript.jscomp.Scope scope44 = compiler41.getTopScope();
        com.google.javascript.rhino.Node node45 = null;
        compiler41.prepareAst(node45);
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler41.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph48 = compiler41.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node50 = null;
        compiler49.prepareAst(node50);
        com.google.javascript.jscomp.Scope scope52 = compiler49.getTopScope();
        com.google.javascript.rhino.Node node53 = null;
        compiler49.prepareAst(node53);
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler49.getVariableMap();
        com.google.javascript.rhino.Node node57 = compiler49.parseTestCode("[hi!]");
        java.lang.String str58 = compiler41.toSource(node57);
        com.google.javascript.rhino.Node node59 = compiler41.jsRoot;
        com.google.javascript.rhino.Node node61 = compiler41.parseTestCode("[singleton]");
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node63 = null;
        compiler62.prepareAst(node63);
        com.google.javascript.jscomp.Scope scope65 = compiler62.getTopScope();
        com.google.javascript.rhino.Node node66 = null;
        compiler62.prepareAst(node66);
        com.google.javascript.jscomp.VariableMap variableMap68 = compiler62.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph69 = compiler62.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node71 = null;
        compiler70.prepareAst(node71);
        com.google.javascript.jscomp.Scope scope73 = compiler70.getTopScope();
        com.google.javascript.rhino.Node node74 = null;
        compiler70.prepareAst(node74);
        com.google.javascript.jscomp.VariableMap variableMap76 = compiler70.getVariableMap();
        com.google.javascript.rhino.Node node78 = compiler70.parseTestCode("[hi!]");
        java.lang.String str79 = compiler62.toSource(node78);
        com.google.javascript.rhino.Node node80 = compiler62.jsRoot;
        com.google.javascript.rhino.Node node82 = compiler62.parseTestCode("[singleton]");
        boolean boolean83 = compiler18.areNodesEqualForInlining(node61, node82);
        compiler0.prepareAst(node82);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(diagnosticGroups17);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray26);
        org.junit.Assert.assertArrayEquals(jSModuleArray26, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig30);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(result32);
        org.junit.Assert.assertNotNull(compilerOptions33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNotNull(codingConvention39);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNull(variableMap47);
        org.junit.Assert.assertNull(jSModuleGraph48);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNull(variableMap55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(node59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertNull(scope65);
        org.junit.Assert.assertNull(variableMap68);
        org.junit.Assert.assertNull(jSModuleGraph69);
        org.junit.Assert.assertNull(scope73);
        org.junit.Assert.assertNull(variableMap76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Region region7 = compiler0.getSourceRegion("{SyntheticVarsDeclar}", (int) (byte) -1);
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(region7);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.rhino.Node node5 = compiler0.externsRoot;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        compiler7.options = compilerOptions10;
        boolean boolean12 = compiler7.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.prepareAst(node15);
        com.google.javascript.jscomp.Scope scope17 = compiler14.getTopScope();
        com.google.javascript.rhino.Node node18 = null;
        compiler14.prepareAst(node18);
        boolean boolean20 = compiler14.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray21 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray22 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        compiler23.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig26 = compiler23.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler23.newCompilerOptions();
        com.google.javascript.jscomp.Result result28 = compiler14.compile(jSSourceFileArray21, jSModuleArray22, compilerOptions27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        compiler29.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig32 = compiler29.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler29.newCompilerOptions();
        compiler7.init(jSSourceFileArray13, jSModuleArray22, compilerOptions33);
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.prepareAst(node36);
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = null;
        compiler35.options = compilerOptions38;
        boolean boolean40 = compiler35.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.prepareAst(node43);
        com.google.javascript.jscomp.Scope scope45 = compiler42.getTopScope();
        com.google.javascript.rhino.Node node46 = null;
        compiler42.prepareAst(node46);
        boolean boolean48 = compiler42.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray49 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray50 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        compiler51.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig54 = compiler51.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler51.newCompilerOptions();
        com.google.javascript.jscomp.Result result56 = compiler42.compile(jSSourceFileArray49, jSModuleArray50, compilerOptions55);
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        compiler57.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig60 = compiler57.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler57.newCompilerOptions();
        compiler35.init(jSSourceFileArray41, jSModuleArray50, compilerOptions61);
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.prepareAst(node64);
        com.google.javascript.jscomp.Scope scope66 = compiler63.getTopScope();
        com.google.javascript.rhino.Node node67 = null;
        compiler63.prepareAst(node67);
        boolean boolean69 = compiler63.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray70 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray71 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        compiler72.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig75 = compiler72.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler72.newCompilerOptions();
        com.google.javascript.jscomp.Result result77 = compiler63.compile(jSSourceFileArray70, jSModuleArray71, compilerOptions76);
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = compiler63.getOptions();
        com.google.javascript.jscomp.Result result79 = compiler0.compile(jSSourceFileArray13, jSModuleArray50, compilerOptions78);
        com.google.javascript.rhino.Node node80 = compiler0.parseInputs();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph81 = compiler0.getModuleGraph();
        com.google.javascript.rhino.Node node83 = compiler0.parseSyntheticCode("[Unversioned directory]");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange84 = compiler0.recentChange;
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray21);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray21, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray22);
        org.junit.Assert.assertArrayEquals(jSModuleArray22, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNotNull(result28);
        org.junit.Assert.assertNotNull(defaultPassConfig32);
        org.junit.Assert.assertNotNull(compilerOptions33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray49);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray49, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray50);
        org.junit.Assert.assertArrayEquals(jSModuleArray50, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNotNull(result56);
        org.junit.Assert.assertNotNull(defaultPassConfig60);
        org.junit.Assert.assertNotNull(compilerOptions61);
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray70);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray70, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray71);
        org.junit.Assert.assertArrayEquals(jSModuleArray71, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig75);
        org.junit.Assert.assertNotNull(compilerOptions76);
        org.junit.Assert.assertNotNull(result77);
        org.junit.Assert.assertNotNull(compilerOptions78);
        org.junit.Assert.assertNotNull(result79);
        org.junit.Assert.assertNull(node80);
        org.junit.Assert.assertNull(jSModuleGraph81);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(recentChange84);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(errorReporter5);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig5 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNotNull(defaultPassConfig3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(defaultPassConfig5);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        com.google.javascript.rhino.Node node11 = intermediateState10.externsRoot;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.prepareAst(node13);
        com.google.javascript.jscomp.Scope scope15 = compiler12.getTopScope();
        com.google.javascript.rhino.Node node16 = null;
        compiler12.prepareAst(node16);
        boolean boolean18 = compiler12.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler21.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler21.newCompilerOptions();
        com.google.javascript.jscomp.Result result26 = compiler12.compile(jSSourceFileArray19, jSModuleArray20, compilerOptions25);
        com.google.javascript.jscomp.PassConfig passConfig27 = compiler12.createPassConfigInternal();
        compiler12.setProgress((double) 0.0f);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap32 = compiler31.getSourceMap();
        compiler31.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        compiler31.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        compiler30.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange36);
        com.google.javascript.rhino.head.ErrorReporter errorReporter39 = compiler30.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager40 = compiler30.getErrorManager();
        compiler12.setErrorManager(errorManager40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.prepareAst(node43);
        com.google.javascript.jscomp.Scope scope45 = compiler42.getTopScope();
        compiler42.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention47 = compiler42.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode48 = compiler42.languageMode();
        compiler42.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap50 = compiler42.getSourceMap();
        com.google.javascript.rhino.Node node51 = compiler42.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier52 = compiler42.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap54 = compiler53.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap55 = compiler53.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.prepareAst(node57);
        com.google.javascript.jscomp.Scope scope59 = compiler56.getTopScope();
        com.google.javascript.rhino.Node node60 = null;
        compiler56.prepareAst(node60);
        com.google.javascript.jscomp.VariableMap variableMap62 = compiler56.getVariableMap();
        com.google.javascript.rhino.Node node64 = compiler56.parseTestCode("[hi!]");
        java.lang.String str65 = compiler53.toSource(node64);
        compiler42.jsRoot = node64;
        com.google.javascript.jscomp.Tracer tracer68 = compiler42.newTracer("2569/09/27 15:58");
        compiler12.stopTracer(tracer68, "[2569/09/27 15:58]");
        com.google.javascript.jscomp.VariableMap variableMap71 = compiler12.getVariableMap();
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap73 = compiler72.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange74 = compiler72.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups75 = compiler72.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig76 = compiler72.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList77 = compiler72.getInputsForTesting();
        com.google.javascript.rhino.Node node79 = compiler72.parseTestCode("2569/09/27 15:58");
        java.lang.String str80 = compiler12.toSource(node79);
        intermediateState10.externsRoot = node79;
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray19, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray20);
        org.junit.Assert.assertArrayEquals(jSModuleArray20, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(result26);
        org.junit.Assert.assertNotNull(passConfig27);
        org.junit.Assert.assertNull(sourceMap32);
        org.junit.Assert.assertNull(sourceMap35);
        org.junit.Assert.assertNotNull(recentChange36);
        org.junit.Assert.assertNotNull(errorReporter39);
        org.junit.Assert.assertNotNull(errorManager40);
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertNotNull(codingConvention47);
        org.junit.Assert.assertTrue("'" + languageMode48 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode48.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap50);
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(strSupplier52);
        org.junit.Assert.assertNull(variableMap54);
        org.junit.Assert.assertNull(globalVarReferenceMap55);
        org.junit.Assert.assertNull(scope59);
        org.junit.Assert.assertNull(variableMap62);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(tracer68);
        org.junit.Assert.assertNull(variableMap71);
        org.junit.Assert.assertNull(sourceMap73);
        org.junit.Assert.assertNotNull(recentChange74);
        org.junit.Assert.assertNotNull(diagnosticGroups75);
        org.junit.Assert.assertNotNull(defaultPassConfig76);
        org.junit.Assert.assertNull(compilerInputList77);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Tracer tracer8 = compiler0.newTracer("[[hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput10 = compiler0.newExternInput("2569/09/27 15:58");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(tracer8);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder14 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int15 = codeBuilder14.getLineIndex();
        java.lang.String str16 = codeBuilder14.toString();
        boolean boolean18 = codeBuilder14.endsWith("[[[singleton]]]");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.toSource(codeBuilder14, (int) (short) -1, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Scope scope4 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler0.languageMode();
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(scope4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        java.lang.String str17 = compiler0.getAstDotGraph();
        boolean boolean18 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups22 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler19.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler19.getInputsForTesting();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int28 = codeBuilder27.getLength();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        compiler30.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = compiler30.languageMode();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler37.recentChange;
        double double40 = compiler37.getProgress();
        com.google.javascript.rhino.Node node42 = compiler37.parseTestCode("Unversioned directory");
        compiler30.externAndJsRoot = node42;
        compiler19.toSource(codeBuilder27, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.prepareAst(node46);
        com.google.javascript.rhino.head.ErrorReporter errorReporter48 = compiler45.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap49 = compiler45.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap51 = compiler50.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange52 = compiler50.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups53 = compiler50.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig54 = compiler50.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList55 = compiler50.getInputsForTesting();
        com.google.javascript.rhino.Node node57 = compiler50.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = compiler50.options;
        compiler45.initOptions(compilerOptions58);
        com.google.javascript.jscomp.CodingConvention codingConvention60 = compiler45.getCodingConvention();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange61 = compiler45.recentChange;
        compiler19.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange61);
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry63 = compiler19.getTypeRegistry();
        com.google.javascript.jscomp.PassConfig passConfig64 = compiler19.getPassConfig();
        compiler0.setPassConfig(passConfig64);
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(diagnosticGroups22);
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(errorReporter48);
        org.junit.Assert.assertNull(globalVarReferenceMap49);
        org.junit.Assert.assertNull(sourceMap51);
        org.junit.Assert.assertNotNull(recentChange52);
        org.junit.Assert.assertNotNull(diagnosticGroups53);
        org.junit.Assert.assertNotNull(defaultPassConfig54);
        org.junit.Assert.assertNull(compilerInputList55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(compilerOptions58);
        org.junit.Assert.assertNotNull(codingConvention60);
        org.junit.Assert.assertNotNull(recentChange61);
        org.junit.Assert.assertNotNull(jSTypeRegistry63);
        org.junit.Assert.assertNotNull(passConfig64);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray16 = compiler0.getWarnings();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(jSErrorArray16);
        org.junit.Assert.assertArrayEquals(jSErrorArray16, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager14);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager14);
        compiler16.setHasRegExpGlobalReferences(true);
        com.google.javascript.jscomp.ErrorManager errorManager19 = compiler16.getErrorManager();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler16.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler21.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap23 = compiler21.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange24 = compiler21.recentChange;
        com.google.javascript.jscomp.Scope scope25 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node27 = compiler21.parseTestCode("[]");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler21.getState();
        int int29 = compiler21.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler30.getPropertyMap();
        com.google.javascript.rhino.Node node32 = compiler30.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap33 = compiler30.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange34 = compiler30.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler30.options;
        compiler30.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker37 = compiler30.tracker;
        com.google.javascript.jscomp.ErrorManager errorManager38 = compiler30.getErrorManager();
        compiler21.setErrorManager(errorManager38);
        compiler16.setErrorManager(errorManager38);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler(errorManager38);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(errorManager19);
        org.junit.Assert.assertNotNull(passConfig20);
        org.junit.Assert.assertNull(variableMap22);
        org.junit.Assert.assertNull(globalVarReferenceMap23);
        org.junit.Assert.assertNotNull(recentChange24);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(variableMap31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNull(functionInformationMap33);
        org.junit.Assert.assertNotNull(recentChange34);
        org.junit.Assert.assertNull(compilerOptions35);
        org.junit.Assert.assertNull(performanceTracker37);
        org.junit.Assert.assertNotNull(errorManager38);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState3 = compiler0.getState();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.prepareAst(node5);
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        com.google.javascript.rhino.Node node8 = null;
        compiler4.prepareAst(node8);
        boolean boolean10 = compiler4.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        compiler13.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig16 = compiler13.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler13.newCompilerOptions();
        com.google.javascript.jscomp.Result result18 = compiler4.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        compiler4.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange21);
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler4.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention23;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList25 = compiler0.getInputsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intermediateState3);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(result18);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(codingConvention23);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        double double8 = compiler5.getProgress();
        com.google.javascript.rhino.Node node10 = compiler5.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler11.getSourceMap();
        compiler11.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler14.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler5.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.Node node20 = compiler0.jsRoot;
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler23.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap25 = compiler23.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler23.recentChange;
        com.google.javascript.jscomp.Scope scope27 = compiler23.getTopScope();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.prepareAst(node29);
        com.google.javascript.jscomp.Scope scope31 = compiler28.getTopScope();
        com.google.javascript.rhino.Node node32 = null;
        compiler28.prepareAst(node32);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator34 = compiler28.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState35 = compiler28.getState();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler36.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler40.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler40.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.rhino.Node node51 = compiler43.parseTestCode("[hi!]");
        java.lang.String str52 = compiler40.toSource(node51);
        compiler36.jsRoot = node51;
        intermediateState35.externsRoot = node51;
        compiler23.externAndJsRoot = node51;
        compiler0.externsRoot = node51;
        com.google.javascript.rhino.Node node58 = compiler0.parseTestCode("[hi!]");
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNull(compilerOptions22);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNull(globalVarReferenceMap25);
        org.junit.Assert.assertNotNull(recentChange26);
        org.junit.Assert.assertNull(scope27);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(memoizedScopeCreator34);
        org.junit.Assert.assertNotNull(intermediateState35);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertNull(variableMap41);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(node58);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Tracer tracer7 = compiler0.newTracer("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap8 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(tracer7);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        compiler0.options = compilerOptions10;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry12 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = null;
        compiler13.options = compilerOptions16;
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler13.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.jscomp.TypeValidator typeValidator34 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap35 = null;
        compiler0.setCssRenamingMap(cssRenamingMap35);
        com.google.javascript.rhino.Node node37 = compiler0.jsRoot;
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNotNull(jSTypeRegistry12);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(typeValidator34);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        double double21 = compiler0.getProgress();
        java.lang.String[] strArray22 = compiler0.toSourceArray();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph23 = compiler0.getDegenerateModuleGraph();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(jSModuleGraph23);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator3 = compiler0.getTypedScopeCreator();
        compiler0.setHasRegExpGlobalReferences(true);
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        compiler7.options = compilerOptions10;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler12.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler12.recentChange;
        double double15 = compiler12.getProgress();
        com.google.javascript.rhino.Node node17 = compiler12.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        compiler18.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler21.recentChange;
        compiler18.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        compiler12.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        compiler7.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState27 = compiler7.getState();
        com.google.javascript.rhino.Node node28 = intermediateState27.externsRoot;
        com.google.javascript.rhino.Node node29 = null;
        intermediateState27.externsRoot = node29;
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        com.google.javascript.rhino.Node node35 = null;
        compiler31.prepareAst(node35);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator37 = compiler31.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState38 = compiler31.getState();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.prepareAst(node40);
        com.google.javascript.jscomp.Scope scope42 = compiler39.getTopScope();
        com.google.javascript.rhino.Node node43 = null;
        compiler39.prepareAst(node43);
        com.google.javascript.jscomp.VariableMap variableMap45 = compiler39.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph46 = compiler39.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node48 = null;
        compiler47.prepareAst(node48);
        com.google.javascript.jscomp.Scope scope50 = compiler47.getTopScope();
        com.google.javascript.rhino.Node node51 = null;
        compiler47.prepareAst(node51);
        com.google.javascript.jscomp.VariableMap variableMap53 = compiler47.getVariableMap();
        com.google.javascript.rhino.Node node55 = compiler47.parseTestCode("[hi!]");
        java.lang.String str56 = compiler39.toSource(node55);
        intermediateState38.externsRoot = node55;
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.prepareAst(node59);
        com.google.javascript.jscomp.Scope scope61 = compiler58.getTopScope();
        com.google.javascript.rhino.Node node62 = null;
        compiler58.prepareAst(node62);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator64 = compiler58.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap66 = compiler65.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange67 = compiler65.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups68 = compiler65.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig69 = compiler65.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList70 = compiler65.getInputsForTesting();
        com.google.javascript.rhino.Node node72 = compiler65.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder73 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int74 = codeBuilder73.getLength();
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node77 = null;
        compiler76.prepareAst(node77);
        com.google.javascript.jscomp.Scope scope79 = compiler76.getTopScope();
        compiler76.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention81 = compiler76.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode82 = compiler76.languageMode();
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap84 = compiler83.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange85 = compiler83.recentChange;
        double double86 = compiler83.getProgress();
        com.google.javascript.rhino.Node node88 = compiler83.parseTestCode("Unversioned directory");
        compiler76.externAndJsRoot = node88;
        compiler65.toSource(codeBuilder73, (int) (byte) 0, node88);
        compiler58.externAndJsRoot = node88;
        intermediateState38.externsRoot = node88;
        intermediateState27.externsRoot = node88;
        java.lang.String str94 = compiler0.toSource(node88);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SymbolTable symbolTable95 = compiler0.buildKnownSymbolTable();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(memoizedScopeCreator3);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(intermediateState27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(memoizedScopeCreator37);
        org.junit.Assert.assertNotNull(intermediateState38);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(variableMap45);
        org.junit.Assert.assertNull(jSModuleGraph46);
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertNull(variableMap53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNull(memoizedScopeCreator64);
        org.junit.Assert.assertNull(sourceMap66);
        org.junit.Assert.assertNotNull(recentChange67);
        org.junit.Assert.assertNotNull(diagnosticGroups68);
        org.junit.Assert.assertNotNull(defaultPassConfig69);
        org.junit.Assert.assertNull(compilerInputList70);
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNull(scope79);
        org.junit.Assert.assertNotNull(codingConvention81);
        org.junit.Assert.assertTrue("'" + languageMode82 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode82.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap84);
        org.junit.Assert.assertNotNull(recentChange85);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 0.0d + "'", double86 == 0.0d);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator27 = compiler21.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler21.getState();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler29.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph36 = compiler29.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.prepareAst(node38);
        com.google.javascript.jscomp.Scope scope40 = compiler37.getTopScope();
        com.google.javascript.rhino.Node node41 = null;
        compiler37.prepareAst(node41);
        com.google.javascript.jscomp.VariableMap variableMap43 = compiler37.getVariableMap();
        com.google.javascript.rhino.Node node45 = compiler37.parseTestCode("[hi!]");
        java.lang.String str46 = compiler29.toSource(node45);
        intermediateState28.externsRoot = node45;
        compiler0.setState(intermediateState28);
        com.google.javascript.rhino.Node node49 = intermediateState28.externsRoot;
        com.google.javascript.rhino.Node node50 = intermediateState28.externsRoot;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(memoizedScopeCreator27);
        org.junit.Assert.assertNotNull(intermediateState28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(variableMap35);
        org.junit.Assert.assertNull(jSModuleGraph36);
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertNull(variableMap43);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNotNull(node50);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler0.getWarnings();
        compiler0.reportCodeChange();
        double double21 = compiler0.getProgress();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(jSErrorArray19);
        org.junit.Assert.assertArrayEquals(jSErrorArray19, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap7 = compiler6.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler6.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups9 = compiler6.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig10 = compiler6.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList11 = compiler6.getInputsForTesting();
        com.google.javascript.rhino.Node node13 = compiler6.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node13;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig15 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node16 = compiler0.getRoot();
        com.google.javascript.rhino.Node node17 = compiler0.jsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList18 = compiler0.getExternsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNotNull(diagnosticGroups9);
        org.junit.Assert.assertNotNull(defaultPassConfig10);
        org.junit.Assert.assertNull(compilerInputList11);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(defaultPassConfig15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(compilerInputList18);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        compiler0.initInputsByIdMap();
        com.google.javascript.jscomp.JSError[] jSErrorArray40 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSModule jSModule41 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray42 = compiler0.toSourceArray(jSModule41);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNotNull(jSErrorArray40);
        org.junit.Assert.assertArrayEquals(jSErrorArray40, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        double double7 = compiler0.getProgress();
        com.google.javascript.rhino.Node node8 = compiler0.externAndJsRoot;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = compiler0.loadLibraryCode("[2569/09/27 15:58]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator22 = compiler0.getTypedScopeCreator();
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = compiler0.loadLibraryCode("{SyntheticVarsDeclar}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(memoizedScopeCreator22);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        com.google.javascript.rhino.Node node20 = null;
        compiler16.prepareAst(node20);
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler16.getVariableMap();
        com.google.javascript.rhino.Node node24 = compiler16.parseTestCode("[hi!]");
        compiler0.externAndJsRoot = node24;
        compiler0.parse();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.Scope scope30 = compiler27.getTopScope();
        compiler27.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.Node node34 = compiler27.parseSyntheticCode("[[singleton]]", "[]");
        compiler0.prepareAst(node34);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(variableMap22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNotNull(node34);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler16.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        double double26 = compiler23.getProgress();
        com.google.javascript.rhino.Node node28 = compiler23.parseTestCode("Unversioned directory");
        compiler16.externAndJsRoot = node28;
        compiler5.toSource(codeBuilder13, (int) (byte) 0, node28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler32.getVariableMap();
        com.google.javascript.rhino.Node node40 = compiler32.parseTestCode("[hi!]");
        compiler0.toSource(codeBuilder13, (int) (byte) 0, node40);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder43 = codeBuilder13.append("[[singleton]]");
        int int44 = codeBuilder13.getLineIndex();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(codeBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler7 = null;
        compiler6.removeChangeHandler(codeChangeHandler7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node11 = null;
        compiler10.prepareAst(node11);
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = null;
        compiler10.options = compilerOptions13;
        boolean boolean15 = compiler10.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray16 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        boolean boolean23 = compiler17.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray24 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray25 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        compiler26.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig29 = compiler26.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler26.newCompilerOptions();
        com.google.javascript.jscomp.Result result31 = compiler17.compile(jSSourceFileArray24, jSModuleArray25, compilerOptions30);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        compiler32.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig35 = compiler32.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler32.newCompilerOptions();
        compiler10.init(jSSourceFileArray16, jSModuleArray25, compilerOptions36);
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.prepareAst(node39);
        com.google.javascript.jscomp.Scope scope41 = compiler38.getTopScope();
        com.google.javascript.rhino.Node node42 = null;
        compiler38.prepareAst(node42);
        boolean boolean44 = compiler38.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray45 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray46 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        compiler47.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig50 = compiler47.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler47.newCompilerOptions();
        com.google.javascript.jscomp.Result result52 = compiler38.compile(jSSourceFileArray45, jSModuleArray46, compilerOptions51);
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        compiler53.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig56 = compiler53.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler53.newCompilerOptions();
        compiler6.init(jSSourceFileArray16, jSSourceFileArray45, compilerOptions57);
        com.google.javascript.jscomp.JSModule[] jSModuleArray59 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node61 = null;
        compiler60.prepareAst(node61);
        com.google.javascript.jscomp.Scope scope63 = compiler60.getTopScope();
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler60.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions65 = compiler60.newCompilerOptions();
        compiler0.init(jSSourceFileArray16, jSModuleArray59, compilerOptions65);
        compiler0.resetUniqueNameId();
        boolean boolean68 = compiler0.hasRegExpGlobalReferences();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray16);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray16, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray24);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray24, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray25);
        org.junit.Assert.assertArrayEquals(jSModuleArray25, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNotNull(result31);
        org.junit.Assert.assertNotNull(defaultPassConfig35);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray45);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray45, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray46);
        org.junit.Assert.assertArrayEquals(jSModuleArray46, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNotNull(result52);
        org.junit.Assert.assertNotNull(defaultPassConfig56);
        org.junit.Assert.assertNotNull(compilerOptions57);
        org.junit.Assert.assertNotNull(jSModuleArray59);
        org.junit.Assert.assertArrayEquals(jSModuleArray59, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNull(scope63);
        org.junit.Assert.assertNull(variableMap64);
        org.junit.Assert.assertNotNull(compilerOptions65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler5.options;
        compiler0.initOptions(compilerOptions13);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope17 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler18.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap20 = compiler18.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler21.getVariableMap();
        com.google.javascript.rhino.Node node29 = compiler21.parseTestCode("[hi!]");
        java.lang.String str30 = compiler18.toSource(node29);
        boolean boolean31 = compiler18.hasErrors();
        java.lang.String str32 = compiler18.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler18.getSourceMap();
        java.lang.String str34 = compiler18.toSource();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.prepareAst(node36);
        com.google.javascript.jscomp.Scope scope38 = compiler35.getTopScope();
        com.google.javascript.rhino.Node node39 = null;
        compiler35.prepareAst(node39);
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler35.getVariableMap();
        com.google.javascript.jscomp.Scope scope42 = compiler35.getTopScope();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        compiler43.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap46 = compiler43.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap48 = compiler47.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap49 = compiler47.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        com.google.javascript.rhino.Node node54 = null;
        compiler50.prepareAst(node54);
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler50.getVariableMap();
        com.google.javascript.rhino.Node node58 = compiler50.parseTestCode("[hi!]");
        java.lang.String str59 = compiler47.toSource(node58);
        compiler43.jsRoot = node58;
        java.lang.String str61 = compiler35.toSource(node58);
        compiler18.externsRoot = node58;
        compiler0.externsRoot = node58;
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.prepareAst(node65);
        com.google.javascript.jscomp.Scope scope67 = compiler64.getTopScope();
        com.google.javascript.rhino.Node node68 = null;
        compiler64.prepareAst(node68);
        com.google.javascript.jscomp.VariableMap variableMap70 = compiler64.getVariableMap();
        com.google.javascript.jscomp.Scope scope71 = compiler64.getTopScope();
        com.google.javascript.jscomp.Compiler compiler72 = new com.google.javascript.jscomp.Compiler();
        compiler72.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap75 = compiler72.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap77 = compiler76.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap78 = compiler76.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node80 = null;
        compiler79.prepareAst(node80);
        com.google.javascript.jscomp.Scope scope82 = compiler79.getTopScope();
        com.google.javascript.rhino.Node node83 = null;
        compiler79.prepareAst(node83);
        com.google.javascript.jscomp.VariableMap variableMap85 = compiler79.getVariableMap();
        com.google.javascript.rhino.Node node87 = compiler79.parseTestCode("[hi!]");
        java.lang.String str88 = compiler76.toSource(node87);
        compiler72.jsRoot = node87;
        java.lang.String str90 = compiler64.toSource(node87);
        compiler0.prepareAst(node87);
        java.lang.Class<?> wildcardClass92 = node87.getClass();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertNull(globalVarReferenceMap20);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(sourceMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertNull(variableMap41);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(globalVarReferenceMap46);
        org.junit.Assert.assertNull(variableMap48);
        org.junit.Assert.assertNull(globalVarReferenceMap49);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNull(variableMap56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNull(variableMap70);
        org.junit.Assert.assertNull(scope71);
        org.junit.Assert.assertNull(globalVarReferenceMap75);
        org.junit.Assert.assertNull(variableMap77);
        org.junit.Assert.assertNull(globalVarReferenceMap78);
        org.junit.Assert.assertNull(scope82);
        org.junit.Assert.assertNull(variableMap85);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = compiler0.ensureLibraryInjected("[singleton]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange3 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler4.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap6 = compiler4.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler4.recentChange;
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler9 = null;
        compiler8.removeChangeHandler(codeChangeHandler9);
        com.google.javascript.jscomp.Region region13 = compiler8.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        compiler14.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler14.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler14.newCompilerOptions();
        compiler8.options = compilerOptions18;
        compiler4.initOptions(compilerOptions18);
        compiler0.options = compilerOptions18;
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNotNull(recentChange3);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNull(globalVarReferenceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNull(region13);
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNotNull(compilerOptions18);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.prepareAst(node3);
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        compiler2.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler2.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention7;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler10 = null;
        compiler9.removeChangeHandler(codeChangeHandler10);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph12 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig13 = compiler9.ensureDefaultPassConfig();
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        com.google.javascript.rhino.Node node34 = null;
        compiler30.prepareAst(node34);
        boolean boolean36 = compiler30.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray38 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        compiler39.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig42 = compiler39.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler39.newCompilerOptions();
        com.google.javascript.jscomp.Result result44 = compiler30.compile(jSSourceFileArray37, jSModuleArray38, compilerOptions43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler30.getOptions();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.prepareAst(node47);
        com.google.javascript.jscomp.Scope scope49 = compiler46.getTopScope();
        compiler46.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler46.defaultCodingConvention;
        compiler30.defaultCodingConvention = codingConvention51;
        compiler15.defaultCodingConvention = codingConvention51;
        compiler0.defaultCodingConvention = codingConvention51;
        com.google.javascript.rhino.Node node55 = compiler0.jsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention56 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig57 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(jSModuleGraph12);
        org.junit.Assert.assertNotNull(defaultPassConfig13);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray37, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray38);
        org.junit.Assert.assertArrayEquals(jSModuleArray38, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig42);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertNotNull(result44);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNotNull(codingConvention56);
        org.junit.Assert.assertNotNull(defaultPassConfig57);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        boolean boolean35 = compiler29.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        compiler38.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig41 = compiler38.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler38.newCompilerOptions();
        com.google.javascript.jscomp.Result result43 = compiler29.compile(jSSourceFileArray36, jSModuleArray37, compilerOptions42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler29.getOptions();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.prepareAst(node46);
        com.google.javascript.jscomp.Scope scope48 = compiler45.getTopScope();
        compiler45.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler45.defaultCodingConvention;
        compiler29.defaultCodingConvention = codingConvention50;
        compiler0.defaultCodingConvention = codingConvention50;
        java.lang.String str55 = compiler0.getSourceLine("[singleton]", (int) (byte) 10);
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.prepareAst(node57);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator59 = compiler56.getTypedScopeCreator();
        java.lang.String str60 = compiler56.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.prepareAst(node62);
        com.google.javascript.jscomp.Scope scope64 = compiler61.getTopScope();
        compiler61.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention66 = compiler61.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode67 = compiler61.languageMode();
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap69 = compiler68.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange70 = compiler68.recentChange;
        double double71 = compiler68.getProgress();
        com.google.javascript.rhino.Node node73 = compiler68.parseTestCode("Unversioned directory");
        compiler61.externAndJsRoot = node73;
        com.google.javascript.jscomp.ErrorManager errorManager75 = compiler61.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler76 = new com.google.javascript.jscomp.Compiler(errorManager75);
        compiler56.setErrorManager(errorManager75);
        compiler0.setErrorManager(errorManager75);
        java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap79 = compiler0.getInputsById();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray37);
        org.junit.Assert.assertArrayEquals(jSModuleArray37, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig41);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNotNull(result43);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(memoizedScopeCreator59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(scope64);
        org.junit.Assert.assertNotNull(codingConvention66);
        org.junit.Assert.assertTrue("'" + languageMode67 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode67.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap69);
        org.junit.Assert.assertNotNull(recentChange70);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(errorManager75);
        org.junit.Assert.assertNotNull(inputIdMap79);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler16.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        double double26 = compiler23.getProgress();
        com.google.javascript.rhino.Node node28 = compiler23.parseTestCode("Unversioned directory");
        compiler16.externAndJsRoot = node28;
        compiler5.toSource(codeBuilder13, (int) (byte) 0, node28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler32.getVariableMap();
        com.google.javascript.rhino.Node node40 = compiler32.parseTestCode("[hi!]");
        compiler0.toSource(codeBuilder13, (int) (byte) 0, node40);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder43 = codeBuilder13.append("[[singleton]]");
        java.lang.String str44 = codeBuilder43.toString();
        int int45 = codeBuilder43.getLength();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(codeBuilder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "[[singleton]]" + "'", str44, "[[singleton]]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 13 + "'", int45 == 13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        boolean boolean9 = compiler3.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray11 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        compiler12.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig15 = compiler12.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler12.newCompilerOptions();
        com.google.javascript.jscomp.Result result17 = compiler3.compile(jSSourceFileArray10, jSModuleArray11, compilerOptions16);
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler3.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler3.getVariableMap();
        java.lang.String str20 = compiler3.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig23 = compiler21.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap24 = compiler21.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        compiler25.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        compiler28.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig31 = compiler28.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler28.newCompilerOptions();
        compiler25.options = compilerOptions32;
        compiler21.initOptions(compilerOptions32);
        compiler3.initOptions(compilerOptions32);
        compiler0.initOptions(compilerOptions32);
        com.google.javascript.rhino.Node node39 = compiler0.parseSyntheticCode("Unversioned directory", "{SyntheticVarsDeclar}");
        com.google.javascript.rhino.Node node41 = compiler0.parseTestCode("[hi!]");
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray11);
        org.junit.Assert.assertArrayEquals(jSModuleArray11, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig15);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(result17);
        org.junit.Assert.assertNotNull(compilerOptions18);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(passConfig23);
        org.junit.Assert.assertNull(functionInformationMap24);
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(defaultPassConfig31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = compiler0.getCssRenamingMap();
        boolean boolean6 = compiler0.precheck();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(cssRenamingMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.setProgress((double) 0.0f);
        compiler0.processAMDAndCommonJSModules();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler19.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap21 = compiler19.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.prepareAst(node23);
        com.google.javascript.jscomp.Scope scope25 = compiler22.getTopScope();
        com.google.javascript.rhino.Node node26 = null;
        compiler22.prepareAst(node26);
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler22.getVariableMap();
        com.google.javascript.rhino.Node node30 = compiler22.parseTestCode("[hi!]");
        java.lang.String str31 = compiler19.toSource(node30);
        boolean boolean32 = compiler19.hasErrors();
        java.lang.String str33 = compiler19.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        com.google.javascript.rhino.Node node38 = null;
        compiler34.prepareAst(node38);
        boolean boolean40 = compiler34.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        compiler43.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig46 = compiler43.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.newCompilerOptions();
        com.google.javascript.jscomp.Result result48 = compiler34.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions47);
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler34.getOptions();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        com.google.javascript.rhino.Node node54 = null;
        compiler50.prepareAst(node54);
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler50.getVariableMap();
        com.google.javascript.rhino.Node node58 = compiler50.parseTestCode("[hi!]");
        compiler34.externAndJsRoot = node58;
        compiler19.jsRoot = node58;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups61 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler19.options;
        compiler0.initOptions(compilerOptions62);
        com.google.javascript.jscomp.Region region66 = compiler0.getSourceRegion("hi!", (int) (byte) 10);
        compiler0.addToDebugLog("hi!");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertNull(globalVarReferenceMap21);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(variableMap28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig46);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(result48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNull(variableMap56);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(diagnosticGroups61);
        org.junit.Assert.assertNotNull(compilerOptions62);
        org.junit.Assert.assertNull(region66);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler16.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        double double26 = compiler23.getProgress();
        com.google.javascript.rhino.Node node28 = compiler23.parseTestCode("Unversioned directory");
        compiler16.externAndJsRoot = node28;
        compiler5.toSource(codeBuilder13, (int) (byte) 0, node28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler32.getVariableMap();
        com.google.javascript.rhino.Node node40 = compiler32.parseTestCode("[hi!]");
        compiler0.toSource(codeBuilder13, (int) (byte) 0, node40);
        int int42 = codeBuilder13.getLineIndex();
        int int43 = codeBuilder13.getLength();
        boolean boolean45 = codeBuilder13.endsWith("[2569/09/27 15:58]");
        codeBuilder13.reset();
        int int47 = codeBuilder13.getLength();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler0.getPropertyMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Tracer tracer42 = compiler0.newTracer("[[[singleton]]]");
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler0.newCompilerOptions();
        boolean boolean44 = compiler0.hasHaltingErrors();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(variableMap39);
        org.junit.Assert.assertNotNull(tracer42);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getColumnIndex();
        int int3 = codeBuilder0.getLineIndex();
        int int4 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        java.lang.String str2 = codeBuilder0.toString();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder4 = codeBuilder0.append("[[hi!]]");
        int int5 = codeBuilder4.getLineIndex();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(codeBuilder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler5.options;
        compiler0.initOptions(compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler16 = null;
        compiler15.removeChangeHandler(codeChangeHandler16);
        com.google.javascript.jscomp.Region region20 = compiler15.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node21 = compiler15.externAndJsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig22 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler24 = null;
        compiler23.removeChangeHandler(codeChangeHandler24);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph26 = compiler23.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler23.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.prepareAst(node29);
        com.google.javascript.jscomp.Scope scope31 = compiler28.getTopScope();
        com.google.javascript.rhino.Node node32 = null;
        compiler28.prepareAst(node32);
        com.google.javascript.jscomp.VariableMap variableMap34 = compiler28.getVariableMap();
        com.google.javascript.jscomp.Scope scope35 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler36.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler40.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler40.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.rhino.Node node51 = compiler43.parseTestCode("[hi!]");
        java.lang.String str52 = compiler40.toSource(node51);
        compiler36.jsRoot = node51;
        java.lang.String str54 = compiler28.toSource(node51);
        compiler23.externsRoot = node51;
        compiler15.jsRoot = node51;
        compiler0.externAndJsRoot = node51;
        compiler0.reportCodeChange();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNull(region20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(defaultPassConfig22);
        org.junit.Assert.assertNull(jSModuleGraph26);
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(variableMap34);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertNull(variableMap41);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler(errorManager13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager13);
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(errorReporter12);
        org.junit.Assert.assertNotNull(errorManager13);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig6 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions7 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap8 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        com.google.javascript.jscomp.PerformanceTracker performanceTracker11 = null;
        compiler0.tracker = performanceTracker11;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(defaultPassConfig6);
        org.junit.Assert.assertNotNull(compilerOptions7);
        org.junit.Assert.assertNull(globalVarReferenceMap8);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator21 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNull(memoizedScopeCreator21);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
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
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        boolean boolean11 = compiler0.precheck();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.Node node14 = compiler0.parseTestCode("[[]]");
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        java.lang.String str2 = codeBuilder0.toString();
        int int3 = codeBuilder0.getLineIndex();
        java.lang.String str4 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.rhino.Node node18 = compiler0.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.JsAst jsAst19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = compiler0.addNewSourceAst(jsAst19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        boolean boolean5 = compiler0.precheck();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setCssRenamingMap(cssRenamingMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(errorReporter2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Region region20 = compiler0.getSourceRegion("{SyntheticVarsDeclar}", (int) (short) 10);
        com.google.javascript.rhino.Node node22 = compiler0.parseTestCode("[[[singleton]]]");
        java.lang.Exception exception24 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("[Unversioned directory]", exception24);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?[Unversioned directory]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNull(region20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler23 = null;
        compiler22.removeChangeHandler(codeChangeHandler23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        compiler26.options = compilerOptions29;
        boolean boolean31 = compiler26.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        compiler26.init(jSSourceFileArray32, jSModuleArray41, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        boolean boolean60 = compiler54.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray61 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray62 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        compiler63.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig66 = compiler63.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.newCompilerOptions();
        com.google.javascript.jscomp.Result result68 = compiler54.compile(jSSourceFileArray61, jSModuleArray62, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig72 = compiler69.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler69.newCompilerOptions();
        compiler22.init(jSSourceFileArray32, jSSourceFileArray61, compilerOptions73);
        compiler0.options = compilerOptions73;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.recordFunctionInformation();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray61);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray61, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray62);
        org.junit.Assert.assertArrayEquals(jSModuleArray62, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNotNull(defaultPassConfig72);
        org.junit.Assert.assertNotNull(compilerOptions73);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler6.getPropertyMap();
        com.google.javascript.rhino.Node node8 = compiler6.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap9 = compiler6.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        compiler11.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler11.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap17 = compiler15.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.prepareAst(node19);
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        com.google.javascript.rhino.Node node22 = null;
        compiler18.prepareAst(node22);
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler18.getVariableMap();
        com.google.javascript.rhino.Node node26 = compiler18.parseTestCode("[hi!]");
        java.lang.String str27 = compiler15.toSource(node26);
        compiler11.jsRoot = node26;
        compiler6.externsRoot = node26;
        compiler0.externsRoot = node26;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile32 = compiler0.getSourceFileByName("[{SyntheticVarsDeclar}]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(functionInformationMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNull(globalVarReferenceMap14);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNull(globalVarReferenceMap17);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler0.newCompilerOptions();
        boolean boolean20 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler21.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups24 = compiler21.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler21.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler21.getInputsForTesting();
        com.google.javascript.rhino.Node node28 = compiler21.parseTestCode("2569/09/27 15:58");
        com.google.javascript.rhino.Node node30 = compiler21.parseSyntheticCode("hi!");
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler21.getWarnings();
        com.google.javascript.jscomp.Tracer tracer33 = compiler21.newTracer("[[[singleton]]]");
        compiler0.stopTracer(tracer33, "{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter36 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.JSError[] jSErrorArray37 = compiler0.getMessages();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(diagnosticGroups24);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNull(compilerInputList26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(jSErrorArray31);
        org.junit.Assert.assertArrayEquals(jSErrorArray31, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(tracer33);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter36);
        org.junit.Assert.assertNotNull(jSErrorArray37);
        org.junit.Assert.assertArrayEquals(jSErrorArray37, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.prepareAst(node41);
        com.google.javascript.jscomp.Scope scope43 = compiler40.getTopScope();
        compiler40.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler40.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode46 = compiler40.languageMode();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler47.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler47.recentChange;
        double double50 = compiler47.getProgress();
        com.google.javascript.rhino.Node node52 = compiler47.parseTestCode("Unversioned directory");
        compiler40.externAndJsRoot = node52;
        compiler0.jsRoot = node52;
        boolean boolean55 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap57 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap58 = compiler56.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler56.recentChange;
        com.google.javascript.jscomp.Scope scope60 = compiler56.getTopScope();
        com.google.javascript.rhino.Node node62 = compiler56.parseTestCode("[]");
        com.google.javascript.jscomp.Tracer tracer64 = compiler56.newTracer("[singleton]");
        compiler0.stopTracer(tracer64, "hi!");
        compiler0.processDefines();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(sourceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertTrue("'" + languageMode46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode46.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(variableMap57);
        org.junit.Assert.assertNull(globalVarReferenceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(tracer64);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        int int6 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap9 = compiler7.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler11.getSourceMap();
        compiler11.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler14.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler10.getErrorManager();
        compiler7.setErrorManager(errorManager20);
        compiler0.setErrorManager(errorManager20);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler23.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap25 = compiler23.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler26.getVariableMap();
        com.google.javascript.rhino.Node node34 = compiler26.parseTestCode("[hi!]");
        java.lang.String str35 = compiler23.toSource(node34);
        compiler0.externsRoot = node34;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange37 = compiler0.recentChange;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig38 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(variableMap8);
        org.junit.Assert.assertNull(globalVarReferenceMap9);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(errorReporter19);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNull(globalVarReferenceMap25);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(recentChange37);
        org.junit.Assert.assertNotNull(defaultPassConfig38);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler16 = null;
        compiler15.removeChangeHandler(codeChangeHandler16);
        com.google.javascript.jscomp.Region region20 = compiler15.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler21.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler21.newCompilerOptions();
        compiler15.options = compilerOptions25;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry27 = compiler15.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.prepareAst(node29);
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = null;
        compiler28.options = compilerOptions31;
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap34 = compiler33.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange35 = compiler33.recentChange;
        double double36 = compiler33.getProgress();
        com.google.javascript.rhino.Node node38 = compiler33.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        compiler39.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler42.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler42.recentChange;
        compiler39.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler33.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler28.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler15.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap51 = compiler50.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap52 = compiler50.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.prepareAst(node54);
        com.google.javascript.jscomp.Scope scope56 = compiler53.getTopScope();
        com.google.javascript.rhino.Node node57 = null;
        compiler53.prepareAst(node57);
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler53.getVariableMap();
        com.google.javascript.rhino.Node node61 = compiler53.parseTestCode("[hi!]");
        java.lang.String str62 = compiler50.toSource(node61);
        boolean boolean63 = compiler50.hasErrors();
        java.lang.String str64 = compiler50.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node66 = null;
        compiler65.prepareAst(node66);
        com.google.javascript.jscomp.Scope scope68 = compiler65.getTopScope();
        com.google.javascript.rhino.Node node69 = null;
        compiler65.prepareAst(node69);
        boolean boolean71 = compiler65.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray72 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray73 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler();
        compiler74.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig77 = compiler74.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions78 = compiler74.newCompilerOptions();
        com.google.javascript.jscomp.Result result79 = compiler65.compile(jSSourceFileArray72, jSModuleArray73, compilerOptions78);
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler65.getOptions();
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node82 = null;
        compiler81.prepareAst(node82);
        com.google.javascript.jscomp.Scope scope84 = compiler81.getTopScope();
        com.google.javascript.rhino.Node node85 = null;
        compiler81.prepareAst(node85);
        com.google.javascript.jscomp.VariableMap variableMap87 = compiler81.getVariableMap();
        com.google.javascript.rhino.Node node89 = compiler81.parseTestCode("[hi!]");
        compiler65.externAndJsRoot = node89;
        compiler50.jsRoot = node89;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups92 = compiler50.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions93 = compiler50.options;
        compiler0.options = compilerOptions93;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(defaultPassConfig10);
        org.junit.Assert.assertNotNull(compilerOptions11);
        org.junit.Assert.assertNotNull(compilerOptions14);
        org.junit.Assert.assertNull(region20);
        org.junit.Assert.assertNotNull(defaultPassConfig24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(jSTypeRegistry27);
        org.junit.Assert.assertNull(sourceMap34);
        org.junit.Assert.assertNotNull(recentChange35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNull(sourceMap43);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNull(variableMap51);
        org.junit.Assert.assertNull(globalVarReferenceMap52);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(variableMap59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(scope68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray72);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray72, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray73);
        org.junit.Assert.assertArrayEquals(jSModuleArray73, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig77);
        org.junit.Assert.assertNotNull(compilerOptions78);
        org.junit.Assert.assertNotNull(result79);
        org.junit.Assert.assertNotNull(compilerOptions80);
        org.junit.Assert.assertNull(scope84);
        org.junit.Assert.assertNull(variableMap87);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(diagnosticGroups92);
        org.junit.Assert.assertNotNull(compilerOptions93);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        compiler0.processAMDAndCommonJSModules();
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node30 = compiler0.parseInputs();
        java.lang.Exception exception32 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("[Unversioned directory]", exception32);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?[Unversioned directory]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNull(node30);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler6.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler6.getVariableMap();
        java.lang.String str23 = compiler6.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig26 = compiler24.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap27 = compiler24.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        compiler28.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        compiler31.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig34 = compiler31.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions35 = compiler31.newCompilerOptions();
        compiler28.options = compilerOptions35;
        compiler24.initOptions(compilerOptions35);
        compiler6.initOptions(compilerOptions35);
        compiler0.options = compilerOptions35;
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler0.getCodingConvention();
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertNull(variableMap22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNotNull(passConfig26);
        org.junit.Assert.assertNull(functionInformationMap27);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertNotNull(defaultPassConfig34);
        org.junit.Assert.assertNotNull(compilerOptions35);
        org.junit.Assert.assertNotNull(codingConvention40);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getColumnIndex();
        codeBuilder0.reset();
        int int3 = codeBuilder0.getLength();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        boolean boolean39 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker40 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler0.defaultCodingConvention;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList42 = compiler0.getExternsInOrder();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(performanceTracker40);
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertNotNull(compilerInputList42);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        com.google.javascript.rhino.Node node23 = null;
        compiler19.prepareAst(node23);
        boolean boolean25 = compiler19.precheck();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig26 = compiler19.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler19.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.jscomp.Region region34 = compiler0.getSourceRegion("[[[singleton]]]", 0);
        com.google.javascript.jscomp.JSModule jSModule35 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = compiler0.toSource(jSModule35);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(defaultPassConfig26);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNull(region34);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler23 = null;
        compiler22.removeChangeHandler(codeChangeHandler23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        compiler26.options = compilerOptions29;
        boolean boolean31 = compiler26.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        compiler26.init(jSSourceFileArray32, jSModuleArray41, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        boolean boolean60 = compiler54.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray61 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray62 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        compiler63.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig66 = compiler63.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.newCompilerOptions();
        com.google.javascript.jscomp.Result result68 = compiler54.compile(jSSourceFileArray61, jSModuleArray62, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig72 = compiler69.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler69.newCompilerOptions();
        compiler22.init(jSSourceFileArray32, jSSourceFileArray61, compilerOptions73);
        compiler0.options = compilerOptions73;
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getMessages();
        int int77 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState78 = compiler0.getState();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList79 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention80 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.SourceMap sourceMap81 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node83 = null;
        compiler82.prepareAst(node83);
        com.google.javascript.jscomp.Scope scope85 = compiler82.getTopScope();
        compiler82.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.Node node89 = compiler82.parseSyntheticCode("[[singleton]]", "[]");
        compiler0.prepareAst(node89);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.SourceFile sourceFile92 = compiler0.getSourceFileByName("2569/09/27 15:58");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray61);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray61, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray62);
        org.junit.Assert.assertArrayEquals(jSModuleArray62, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNotNull(defaultPassConfig72);
        org.junit.Assert.assertNotNull(compilerOptions73);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertArrayEquals(jSErrorArray76, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(intermediateState78);
        org.junit.Assert.assertNull(compilerInputList79);
        org.junit.Assert.assertNotNull(codingConvention80);
        org.junit.Assert.assertNull(sourceMap81);
        org.junit.Assert.assertNull(scope85);
        org.junit.Assert.assertNotNull(node89);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLineIndex();
        int int2 = codeBuilder0.getColumnIndex();
        int int3 = codeBuilder0.getLineIndex();
        java.lang.String str4 = codeBuilder0.toString();
        int int5 = codeBuilder0.getLength();
        boolean boolean7 = codeBuilder0.endsWith("Unversioned directory");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        boolean boolean27 = compiler21.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList28 = compiler21.getExternsForTesting();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph29 = compiler21.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig30 = compiler21.ensureDefaultPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier31 = compiler21.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = null;
        compiler21.tracker = performanceTracker32;
        compiler21.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap37 = compiler36.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange38 = compiler36.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups39 = compiler36.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig40 = compiler36.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList41 = compiler36.getInputsForTesting();
        com.google.javascript.rhino.Node node43 = compiler36.parseTestCode("2569/09/27 15:58");
        java.lang.String str44 = compiler21.toSource(node43);
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler45.getPropertyMap();
        com.google.javascript.jscomp.PassConfig passConfig47 = compiler45.createPassConfigInternal();
        com.google.javascript.rhino.Node node49 = compiler45.parseTestCode("2569/09/27 15:58");
        boolean boolean50 = compiler0.areNodesEqualForInlining(node43, node49);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(compilerInputList28);
        org.junit.Assert.assertNull(jSModuleGraph29);
        org.junit.Assert.assertNotNull(defaultPassConfig30);
        org.junit.Assert.assertNotNull(strSupplier31);
        org.junit.Assert.assertNull(sourceMap37);
        org.junit.Assert.assertNotNull(recentChange38);
        org.junit.Assert.assertNotNull(diagnosticGroups39);
        org.junit.Assert.assertNotNull(defaultPassConfig40);
        org.junit.Assert.assertNull(compilerInputList41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNull(variableMap46);
        org.junit.Assert.assertNotNull(passConfig47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap15 = compiler0.getCssRenamingMap();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(cssRenamingMap15);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        boolean boolean35 = compiler29.precheck();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig36 = compiler29.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler37.recentChange;
        compiler29.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange39);
        com.google.javascript.rhino.Node node42 = compiler29.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node42;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry44 = compiler0.getTypeRegistry();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(defaultPassConfig36);
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNotNull(jSTypeRegistry44);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
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
        com.google.javascript.rhino.head.ErrorReporter errorReporter12 = compiler0.getDefaultErrorReporter();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(functionInformationMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(errorReporter12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap3 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups6 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(globalVarReferenceMap3);
        org.junit.Assert.assertNotNull(diagnosticGroups6);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.prepareAst(node3);
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        compiler2.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler2.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention7;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler10 = null;
        compiler9.removeChangeHandler(codeChangeHandler10);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph12 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig13 = compiler9.ensureDefaultPassConfig();
        compiler0.setPassConfig((com.google.javascript.jscomp.PassConfig) defaultPassConfig13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        com.google.javascript.rhino.Node node34 = null;
        compiler30.prepareAst(node34);
        boolean boolean36 = compiler30.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray38 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        compiler39.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig42 = compiler39.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions43 = compiler39.newCompilerOptions();
        com.google.javascript.jscomp.Result result44 = compiler30.compile(jSSourceFileArray37, jSModuleArray38, compilerOptions43);
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler30.getOptions();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.prepareAst(node47);
        com.google.javascript.jscomp.Scope scope49 = compiler46.getTopScope();
        compiler46.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention51 = compiler46.defaultCodingConvention;
        compiler30.defaultCodingConvention = codingConvention51;
        compiler15.defaultCodingConvention = codingConvention51;
        compiler0.defaultCodingConvention = codingConvention51;
        com.google.javascript.rhino.Node node55 = compiler0.jsRoot;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph56 = compiler0.getModuleGraph();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNull(jSModuleGraph12);
        org.junit.Assert.assertNotNull(defaultPassConfig13);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray37, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray38);
        org.junit.Assert.assertArrayEquals(jSModuleArray38, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig42);
        org.junit.Assert.assertNotNull(compilerOptions43);
        org.junit.Assert.assertNotNull(result44);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNotNull(codingConvention51);
        org.junit.Assert.assertNull(node55);
        org.junit.Assert.assertNull(jSModuleGraph56);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler15.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler15.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler0.defaultCodingConvention;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList20 = compiler0.getInputsForTesting();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNotNull(compilerInputList20);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler6.getPropertyMap();
        com.google.javascript.rhino.Node node8 = compiler6.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap9 = compiler6.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler6.recentChange;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        compiler11.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler11.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler15.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap17 = compiler15.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.prepareAst(node19);
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        com.google.javascript.rhino.Node node22 = null;
        compiler18.prepareAst(node22);
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler18.getVariableMap();
        com.google.javascript.rhino.Node node26 = compiler18.parseTestCode("[hi!]");
        java.lang.String str27 = compiler15.toSource(node26);
        compiler11.jsRoot = node26;
        compiler6.externsRoot = node26;
        compiler0.externsRoot = node26;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode31 = compiler0.languageMode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(functionInformationMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNull(globalVarReferenceMap14);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNull(globalVarReferenceMap17);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Scope scope2 = compiler0.getTopScope();
        compiler0.addToDebugLog("[singleton]");
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(scope2);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention21;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap23 = compiler0.getGlobalVarReferences();
        compiler0.setHasRegExpGlobalReferences(true);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getInputsInOrder();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.Scope scope30 = compiler27.getTopScope();
        com.google.javascript.rhino.Node node31 = null;
        compiler27.prepareAst(node31);
        boolean boolean33 = compiler27.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray34 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray35 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig39 = compiler36.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions40 = compiler36.newCompilerOptions();
        com.google.javascript.jscomp.Result result41 = compiler27.compile(jSSourceFileArray34, jSModuleArray35, compilerOptions40);
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler42.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler42.recentChange;
        compiler27.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList47 = compiler0.getExternsInOrder();
        com.google.javascript.rhino.Node node49 = compiler0.parseTestCode("{SyntheticVarsDeclar}");
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertNull(globalVarReferenceMap23);
        org.junit.Assert.assertNotNull(compilerInputList26);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray34);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray34, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray35);
        org.junit.Assert.assertArrayEquals(jSModuleArray35, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig39);
        org.junit.Assert.assertNotNull(compilerOptions40);
        org.junit.Assert.assertNotNull(result41);
        org.junit.Assert.assertNull(sourceMap43);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertNotNull(compilerInputList47);
        org.junit.Assert.assertNotNull(node49);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node3 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.JSModule jSModule4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = compiler0.getNodeForCodeInsertion(jSModule4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(node3);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder14 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int15 = codeBuilder14.getLineIndex();
        int int16 = codeBuilder14.getLineIndex();
        int int17 = codeBuilder14.getColumnIndex();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups22 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler19.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler19.getInputsForTesting();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int28 = codeBuilder27.getLength();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        compiler30.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = compiler30.languageMode();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler37.recentChange;
        double double40 = compiler37.getProgress();
        com.google.javascript.rhino.Node node42 = compiler37.parseTestCode("Unversioned directory");
        compiler30.externAndJsRoot = node42;
        compiler19.toSource(codeBuilder27, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap46 = compiler45.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler45.recentChange;
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange50 = compiler48.recentChange;
        double double51 = compiler48.getProgress();
        com.google.javascript.rhino.Node node53 = compiler48.parseTestCode("Unversioned directory");
        compiler45.externsRoot = node53;
        compiler19.externsRoot = node53;
        compiler0.toSource(codeBuilder14, 0, node53);
        boolean boolean58 = codeBuilder14.endsWith("[Unversioned directory]");
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(diagnosticGroups22);
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(sourceMap46);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNull(sourceMap49);
        org.junit.Assert.assertNotNull(recentChange50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        java.lang.String[] strArray18 = compiler0.toSourceArray();
        com.google.javascript.jscomp.Scope scope19 = compiler0.getTopScope();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertNull(scope19);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        boolean boolean35 = compiler29.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        compiler38.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig41 = compiler38.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler38.newCompilerOptions();
        com.google.javascript.jscomp.Result result43 = compiler29.compile(jSSourceFileArray36, jSModuleArray37, compilerOptions42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler29.getOptions();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.prepareAst(node46);
        com.google.javascript.jscomp.Scope scope48 = compiler45.getTopScope();
        compiler45.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler45.defaultCodingConvention;
        compiler29.defaultCodingConvention = codingConvention50;
        compiler0.defaultCodingConvention = codingConvention50;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap53 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.JSError jSError54 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel55 = compiler0.getErrorLevel(jSError54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray37);
        org.junit.Assert.assertArrayEquals(jSModuleArray37, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig41);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNotNull(result43);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNull(globalVarReferenceMap53);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        java.lang.String str17 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler0.tracker = performanceTracker18;
        com.google.javascript.jscomp.Tracer tracer21 = compiler0.newTracer("[[]]");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(tracer21);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler18 = null;
        compiler17.removeChangeHandler(codeChangeHandler18);
        com.google.javascript.jscomp.Region region22 = compiler17.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler39.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups42 = compiler39.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig43 = compiler39.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList44 = compiler39.getInputsForTesting();
        com.google.javascript.rhino.Node node46 = compiler39.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int48 = codeBuilder47.getLength();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention55 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler50.languageMode();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler57.recentChange;
        double double60 = compiler57.getProgress();
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("Unversioned directory");
        compiler50.externAndJsRoot = node62;
        compiler39.toSource(codeBuilder47, (int) (byte) 0, node62);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        compiler34.toSource(codeBuilder47, (int) (byte) 0, node74);
        java.lang.String str76 = compiler23.toSource(node74);
        java.lang.String str77 = compiler17.toSource(node74);
        java.lang.String str78 = compiler0.toSource(node74);
        boolean boolean79 = compiler0.isTypeCheckingEnabled();
        boolean boolean80 = compiler0.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNotNull(diagnosticGroups42);
        org.junit.Assert.assertNotNull(defaultPassConfig43);
        org.junit.Assert.assertNull(compilerInputList44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(codingConvention55);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph6 = compiler0.getModuleGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler8.getPropertyMap();
        com.google.javascript.rhino.Node node10 = compiler8.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap11 = compiler8.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler8.recentChange;
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        compiler13.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap16 = compiler13.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler17.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap19 = compiler17.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.prepareAst(node21);
        com.google.javascript.jscomp.Scope scope23 = compiler20.getTopScope();
        com.google.javascript.rhino.Node node24 = null;
        compiler20.prepareAst(node24);
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler20.getVariableMap();
        com.google.javascript.rhino.Node node28 = compiler20.parseTestCode("[hi!]");
        java.lang.String str29 = compiler17.toSource(node28);
        compiler13.jsRoot = node28;
        compiler8.externsRoot = node28;
        compiler0.externAndJsRoot = node28;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList33 = compiler0.getExternsInOrder();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(jSModuleGraph6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(functionInformationMap11);
        org.junit.Assert.assertNotNull(recentChange12);
        org.junit.Assert.assertNull(globalVarReferenceMap16);
        org.junit.Assert.assertNull(variableMap18);
        org.junit.Assert.assertNull(globalVarReferenceMap19);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(variableMap26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig3 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator5 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNotNull(defaultPassConfig3);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNull(memoizedScopeCreator5);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList7 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler0.ensureDefaultPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CodingConvention codingConvention11 = compiler0.defaultCodingConvention;
        java.lang.String str14 = compiler0.getSourceLine("[[singleton]]", (-1));
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(compilerInputList7);
        org.junit.Assert.assertNull(jSModuleGraph8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(codingConvention11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        boolean boolean13 = compiler0.hasErrors();
        boolean boolean14 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap15 = compiler0.getGlobalVarReferences();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(globalVarReferenceMap15);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node9 = compiler0.parseTestCode("[singleton]");
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap10 = compiler0.getGlobalVarReferences();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(globalVarReferenceMap10);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Tracer tracer7 = compiler0.newTracer("");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        compiler8.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler8.defaultCodingConvention;
        com.google.javascript.jscomp.Tracer tracer15 = compiler8.newTracer("");
        compiler0.stopTracer(tracer15, "[[2569/09/27 15:58]]");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(tracer7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNotNull(tracer15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.CodingConvention codingConvention6 = null;
        compiler0.defaultCodingConvention = codingConvention6;
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler0.getPassConfig();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNotNull(passConfig8);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator4 = compiler0.getTypedScopeCreator();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        compiler0.setProgress(0.0d);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node14 = compiler8.parseTestCode("Unversioned directory");
        com.google.javascript.rhino.Node node16 = compiler8.parseSyntheticCode("[[[singleton]]]");
        java.lang.String str17 = compiler0.toSource(node16);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(memoizedScopeCreator4);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        java.lang.String str17 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig20 = compiler18.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap21 = compiler18.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap23 = compiler22.getSourceMap();
        compiler22.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        compiler25.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig28 = compiler25.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = compiler25.newCompilerOptions();
        compiler22.options = compilerOptions29;
        compiler18.initOptions(compilerOptions29);
        compiler0.initOptions(compilerOptions29);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node49 = null;
        compiler48.prepareAst(node49);
        com.google.javascript.jscomp.Scope scope51 = compiler48.getTopScope();
        com.google.javascript.rhino.Node node52 = null;
        compiler48.prepareAst(node52);
        boolean boolean54 = compiler48.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray55 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        compiler57.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig60 = compiler57.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions61 = compiler57.newCompilerOptions();
        com.google.javascript.jscomp.Result result62 = compiler48.compile(jSSourceFileArray55, jSModuleArray56, compilerOptions61);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = compiler48.getOptions();
        com.google.javascript.jscomp.Compiler compiler64 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node65 = null;
        compiler64.prepareAst(node65);
        com.google.javascript.jscomp.Scope scope67 = compiler64.getTopScope();
        compiler64.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention69 = compiler64.defaultCodingConvention;
        compiler48.defaultCodingConvention = codingConvention69;
        compiler33.defaultCodingConvention = codingConvention69;
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler33.getPropertyMap();
        com.google.javascript.rhino.Node node74 = compiler33.parseSyntheticCode("[singleton]");
        compiler0.externsRoot = node74;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(passConfig20);
        org.junit.Assert.assertNull(functionInformationMap21);
        org.junit.Assert.assertNull(sourceMap23);
        org.junit.Assert.assertNotNull(defaultPassConfig28);
        org.junit.Assert.assertNotNull(compilerOptions29);
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNull(scope51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray55);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray55, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray56);
        org.junit.Assert.assertArrayEquals(jSModuleArray56, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig60);
        org.junit.Assert.assertNotNull(compilerOptions61);
        org.junit.Assert.assertNotNull(result62);
        org.junit.Assert.assertNotNull(compilerOptions63);
        org.junit.Assert.assertNull(scope67);
        org.junit.Assert.assertNotNull(codingConvention69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        compiler0.setProgress((double) (-1L));
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.Scope scope16 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node18 = compiler9.parseTestCode("[singleton]");
        compiler0.jsRoot = node18;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(node18);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter7 = compiler0.getReverseAbstractInterpreter();
        compiler0.setProgress((double) 1.0f);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter7);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        com.google.javascript.rhino.Node node5 = compiler0.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler6.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap8 = compiler6.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.rhino.Node node17 = compiler9.parseTestCode("[hi!]");
        java.lang.String str18 = compiler6.toSource(node17);
        compiler0.externsRoot = node17;
        com.google.javascript.rhino.Node node22 = compiler0.parseSyntheticCode("[2569/09/27 15:58]", "[2569/09/27 15:58]");
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertNull(globalVarReferenceMap8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        compiler0.initCompilerOptionsIfTesting();
        boolean boolean19 = compiler0.hasHaltingErrors();
        java.lang.String str20 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        boolean boolean27 = compiler21.precheck();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig30 = compiler28.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap31 = compiler28.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler32.getSourceMap();
        compiler32.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig38 = compiler35.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler35.newCompilerOptions();
        compiler32.options = compilerOptions39;
        compiler28.initOptions(compilerOptions39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler28.options;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler44 = null;
        compiler43.removeChangeHandler(codeChangeHandler44);
        com.google.javascript.jscomp.Region region48 = compiler43.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        compiler49.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig52 = compiler49.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler49.newCompilerOptions();
        compiler43.options = compilerOptions53;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = compiler43.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.prepareAst(node57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = null;
        compiler56.options = compilerOptions59;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange63 = compiler61.recentChange;
        double double64 = compiler61.getProgress();
        com.google.javascript.rhino.Node node66 = compiler61.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap68 = compiler67.getSourceMap();
        compiler67.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange72 = compiler70.recentChange;
        compiler67.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler61.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler56.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler43.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        com.google.javascript.jscomp.Region region82 = compiler0.getSourceRegion("[[2569/09/27 15:58]]", (int) (short) -1);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertNotNull(passConfig30);
        org.junit.Assert.assertNull(functionInformationMap31);
        org.junit.Assert.assertNull(sourceMap33);
        org.junit.Assert.assertNotNull(defaultPassConfig38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNull(region48);
        org.junit.Assert.assertNotNull(defaultPassConfig52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNotNull(jSTypeRegistry55);
        org.junit.Assert.assertNull(sourceMap62);
        org.junit.Assert.assertNotNull(recentChange63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(sourceMap68);
        org.junit.Assert.assertNull(sourceMap71);
        org.junit.Assert.assertNotNull(recentChange72);
        org.junit.Assert.assertNull(region82);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseSyntheticCode("[[singleton]]", "[]");
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getWarnings();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        boolean boolean13 = compiler0.hasErrors();
        java.lang.String str14 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler0.getSourceMap();
        java.lang.String str16 = compiler0.toSource();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap17 = compiler0.getCssRenamingMap();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups22 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler19.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler19.getInputsForTesting();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker27 = null;
        compiler19.tracker = performanceTracker27;
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler30 = null;
        compiler29.removeChangeHandler(codeChangeHandler30);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph32 = compiler29.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig33 = compiler29.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        com.google.javascript.rhino.Node node38 = null;
        compiler34.prepareAst(node38);
        com.google.javascript.jscomp.VariableMap variableMap40 = compiler34.getVariableMap();
        com.google.javascript.jscomp.Scope scope41 = compiler34.getTopScope();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap45 = compiler42.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler46.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap48 = compiler46.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node50 = null;
        compiler49.prepareAst(node50);
        com.google.javascript.jscomp.Scope scope52 = compiler49.getTopScope();
        com.google.javascript.rhino.Node node53 = null;
        compiler49.prepareAst(node53);
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler49.getVariableMap();
        com.google.javascript.rhino.Node node57 = compiler49.parseTestCode("[hi!]");
        java.lang.String str58 = compiler46.toSource(node57);
        compiler42.jsRoot = node57;
        java.lang.String str60 = compiler34.toSource(node57);
        compiler29.externsRoot = node57;
        compiler19.externsRoot = node57;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.prepareAst(node64);
        com.google.javascript.jscomp.Scope scope66 = compiler63.getTopScope();
        com.google.javascript.rhino.Node node67 = null;
        compiler63.prepareAst(node67);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator69 = compiler63.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState70 = compiler63.getState();
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        compiler71.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap74 = compiler71.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap76 = compiler75.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap77 = compiler75.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node79 = null;
        compiler78.prepareAst(node79);
        com.google.javascript.jscomp.Scope scope81 = compiler78.getTopScope();
        com.google.javascript.rhino.Node node82 = null;
        compiler78.prepareAst(node82);
        com.google.javascript.jscomp.VariableMap variableMap84 = compiler78.getVariableMap();
        com.google.javascript.rhino.Node node86 = compiler78.parseTestCode("[hi!]");
        java.lang.String str87 = compiler75.toSource(node86);
        compiler71.jsRoot = node86;
        intermediateState70.externsRoot = node86;
        compiler19.externsRoot = node86;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = compiler0.areNodesEqualForInlining(node18, node86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(cssRenamingMap17);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(diagnosticGroups22);
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(jSModuleGraph32);
        org.junit.Assert.assertNotNull(defaultPassConfig33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(variableMap40);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNull(globalVarReferenceMap45);
        org.junit.Assert.assertNull(variableMap47);
        org.junit.Assert.assertNull(globalVarReferenceMap48);
        org.junit.Assert.assertNull(scope52);
        org.junit.Assert.assertNull(variableMap55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertNull(memoizedScopeCreator69);
        org.junit.Assert.assertNotNull(intermediateState70);
        org.junit.Assert.assertNull(globalVarReferenceMap74);
        org.junit.Assert.assertNull(variableMap76);
        org.junit.Assert.assertNull(globalVarReferenceMap77);
        org.junit.Assert.assertNull(scope81);
        org.junit.Assert.assertNull(variableMap84);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler18 = null;
        compiler17.removeChangeHandler(codeChangeHandler18);
        com.google.javascript.jscomp.Region region22 = compiler17.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler39.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups42 = compiler39.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig43 = compiler39.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList44 = compiler39.getInputsForTesting();
        com.google.javascript.rhino.Node node46 = compiler39.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int48 = codeBuilder47.getLength();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention55 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler50.languageMode();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler57.recentChange;
        double double60 = compiler57.getProgress();
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("Unversioned directory");
        compiler50.externAndJsRoot = node62;
        compiler39.toSource(codeBuilder47, (int) (byte) 0, node62);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        compiler34.toSource(codeBuilder47, (int) (byte) 0, node74);
        java.lang.String str76 = compiler23.toSource(node74);
        java.lang.String str77 = compiler17.toSource(node74);
        java.lang.String str78 = compiler0.toSource(node74);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap79 = null;
        compiler0.setCssRenamingMap(cssRenamingMap79);
        compiler0.reportCodeChange();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNotNull(diagnosticGroups42);
        org.junit.Assert.assertNotNull(defaultPassConfig43);
        org.junit.Assert.assertNull(compilerInputList44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(codingConvention55);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        com.google.javascript.rhino.Node node20 = null;
        compiler16.prepareAst(node20);
        com.google.javascript.jscomp.VariableMap variableMap22 = compiler16.getVariableMap();
        com.google.javascript.rhino.Node node24 = compiler16.parseTestCode("[hi!]");
        compiler0.externAndJsRoot = node24;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getExternsForTesting();
        com.google.common.base.Supplier<java.lang.String> strSupplier27 = compiler0.getUniqueNameIdSupplier();
        compiler0.initInputsByIdMap();
        com.google.javascript.jscomp.JSSourceFile jSSourceFile29 = null;
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = null;
        compiler30.options = compilerOptions33;
        boolean boolean35 = compiler30.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node38 = null;
        compiler37.prepareAst(node38);
        com.google.javascript.jscomp.Scope scope40 = compiler37.getTopScope();
        com.google.javascript.rhino.Node node41 = null;
        compiler37.prepareAst(node41);
        boolean boolean43 = compiler37.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray44 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray45 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        compiler46.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig49 = compiler46.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions50 = compiler46.newCompilerOptions();
        com.google.javascript.jscomp.Result result51 = compiler37.compile(jSSourceFileArray44, jSModuleArray45, compilerOptions50);
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        compiler52.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig55 = compiler52.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler52.newCompilerOptions();
        compiler30.init(jSSourceFileArray36, jSModuleArray45, compilerOptions56);
        com.google.javascript.jscomp.CompilerOptions compilerOptions58 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result59 = compiler0.compile(jSSourceFile29, jSModuleArray45, compilerOptions58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNull(variableMap22);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(compilerInputList26);
        org.junit.Assert.assertNotNull(strSupplier27);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray44);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray44, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray45);
        org.junit.Assert.assertArrayEquals(jSModuleArray45, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig49);
        org.junit.Assert.assertNotNull(compilerOptions50);
        org.junit.Assert.assertNotNull(result51);
        org.junit.Assert.assertNotNull(defaultPassConfig55);
        org.junit.Assert.assertNotNull(compilerOptions56);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.rhino.Node node5 = compiler0.externsRoot;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.Node node7 = compiler0.getRoot();
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
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
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap11 = null;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler12.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler12.recentChange;
        com.google.javascript.jscomp.Scope scope16 = compiler12.getTopScope();
        com.google.javascript.rhino.Node node18 = compiler12.parseTestCode("[]");
        com.google.javascript.jscomp.Tracer tracer20 = compiler12.newTracer("[singleton]");
        com.google.javascript.rhino.Node node22 = compiler12.parseSyntheticCode("[Unversioned directory]");
        // The following exception was thrown during execution in test generation
        try {
            compiler0.updateGlobalVarReferences(varMap11, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertNull(variableMap13);
        org.junit.Assert.assertNull(globalVarReferenceMap14);
        org.junit.Assert.assertNotNull(recentChange15);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(tracer20);
        org.junit.Assert.assertNotNull(node22);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node3 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.getPassConfig();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.prepareAst(node6);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        com.google.javascript.rhino.Node node9 = null;
        compiler5.prepareAst(node9);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler5.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.rhino.Node node17 = null;
        compiler13.prepareAst(node17);
        com.google.javascript.jscomp.VariableMap variableMap19 = compiler13.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph20 = compiler13.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler21.getVariableMap();
        com.google.javascript.rhino.Node node29 = compiler21.parseTestCode("[hi!]");
        java.lang.String str30 = compiler13.toSource(node29);
        intermediateState12.externsRoot = node29;
        compiler0.setState(intermediateState12);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = null;
        compiler33.tracker = performanceTracker34;
        com.google.javascript.jscomp.SourceMap sourceMap36 = compiler33.getSourceMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph37 = compiler33.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.prepareAst(node39);
        com.google.javascript.jscomp.Scope scope41 = compiler38.getTopScope();
        com.google.javascript.rhino.Node node42 = null;
        compiler38.prepareAst(node42);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator44 = compiler38.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState45 = compiler38.getState();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        compiler46.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap49 = compiler46.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap51 = compiler50.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap52 = compiler50.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node54 = null;
        compiler53.prepareAst(node54);
        com.google.javascript.jscomp.Scope scope56 = compiler53.getTopScope();
        com.google.javascript.rhino.Node node57 = null;
        compiler53.prepareAst(node57);
        com.google.javascript.jscomp.VariableMap variableMap59 = compiler53.getVariableMap();
        com.google.javascript.rhino.Node node61 = compiler53.parseTestCode("[hi!]");
        java.lang.String str62 = compiler50.toSource(node61);
        compiler46.jsRoot = node61;
        intermediateState45.externsRoot = node61;
        compiler33.setState(intermediateState45);
        com.google.javascript.rhino.Node node67 = compiler33.parseTestCode("Unversioned directory");
        intermediateState12.externsRoot = node67;
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(passConfig4);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(memoizedScopeCreator11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertNull(variableMap19);
        org.junit.Assert.assertNull(jSModuleGraph20);
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(sourceMap36);
        org.junit.Assert.assertNull(jSModuleGraph37);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNull(memoizedScopeCreator44);
        org.junit.Assert.assertNotNull(intermediateState45);
        org.junit.Assert.assertNull(globalVarReferenceMap49);
        org.junit.Assert.assertNull(variableMap51);
        org.junit.Assert.assertNull(globalVarReferenceMap52);
        org.junit.Assert.assertNull(scope56);
        org.junit.Assert.assertNull(variableMap59);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(node67);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph3 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.prepareAst(node6);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        com.google.javascript.rhino.Node node9 = null;
        compiler5.prepareAst(node9);
        boolean boolean11 = compiler5.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        compiler14.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig17 = compiler14.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions18 = compiler14.newCompilerOptions();
        com.google.javascript.jscomp.Result result19 = compiler5.compile(jSSourceFileArray12, jSModuleArray13, compilerOptions18);
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler20.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange22 = compiler20.recentChange;
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange22);
        com.google.javascript.jscomp.CodingConvention codingConvention24 = compiler5.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention24;
        org.junit.Assert.assertNull(jSModuleGraph3);
        org.junit.Assert.assertNull(compilerOptions4);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray12, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertArrayEquals(jSModuleArray13, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig17);
        org.junit.Assert.assertNotNull(compilerOptions18);
        org.junit.Assert.assertNotNull(result19);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNotNull(recentChange22);
        org.junit.Assert.assertNotNull(codingConvention24);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler0.getErrorManager();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNotNull(errorManager6);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.PassConfig passConfig6 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertNotNull(passConfig6);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
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
        boolean boolean11 = compiler0.hasRegExpGlobalReferences();
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(intermediateState10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler3 = null;
        compiler0.removeChangeHandler(codeChangeHandler3);
        java.lang.String str5 = compiler0.getAstDotGraph();
        compiler0.initCompilerOptionsIfTesting();
        compiler0.disableThreads();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler5.options;
        compiler0.initOptions(compilerOptions13);
        com.google.javascript.jscomp.CodingConvention codingConvention15 = compiler0.getCodingConvention();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler0.getOptions();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph18 = compiler0.getModuleGraph();
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(codingConvention15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNull(jSModuleGraph18);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        boolean boolean7 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter8 = compiler0.getReverseAbstractInterpreter();
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter8);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        boolean boolean11 = compiler0.precheck();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler16.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        double double26 = compiler23.getProgress();
        com.google.javascript.rhino.Node node28 = compiler23.parseTestCode("Unversioned directory");
        compiler16.externAndJsRoot = node28;
        compiler5.toSource(codeBuilder13, (int) (byte) 0, node28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler32.getVariableMap();
        com.google.javascript.rhino.Node node40 = compiler32.parseTestCode("[hi!]");
        compiler0.toSource(codeBuilder13, (int) (byte) 0, node40);
        int int42 = codeBuilder13.getLineIndex();
        int int43 = codeBuilder13.getColumnIndex();
        int int44 = codeBuilder13.getLength();
        codeBuilder13.reset();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
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
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        boolean boolean11 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler0.createPassConfigInternal();
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(passConfig12);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        compiler0.initCompilerOptionsIfTesting();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.ControlFlowGraph<com.google.javascript.rhino.Node> nodeControlFlowGraph19 = compiler0.computeCFG();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler1 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap2 = compiler1.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler1.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups4 = compiler1.getDiagnosticGroups();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler1.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = null;
        compiler6.options = compilerOptions9;
        boolean boolean11 = compiler6.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray12 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node14 = null;
        compiler13.prepareAst(node14);
        com.google.javascript.jscomp.Scope scope16 = compiler13.getTopScope();
        com.google.javascript.rhino.Node node17 = null;
        compiler13.prepareAst(node17);
        boolean boolean19 = compiler13.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray20 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray21 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        com.google.javascript.jscomp.Result result27 = compiler13.compile(jSSourceFileArray20, jSModuleArray21, compilerOptions26);
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        compiler28.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig31 = compiler28.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler28.newCompilerOptions();
        compiler6.init(jSSourceFileArray12, jSModuleArray21, compilerOptions32);
        com.google.javascript.jscomp.PassConfig passConfig34 = compiler6.createPassConfigInternal();
        compiler1.setPassConfig(passConfig34);
        compiler0.setPassConfig(passConfig34);
        double double37 = compiler0.getProgress();
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNotNull(diagnosticGroups4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray12);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray12, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray20);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray20, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray21);
        org.junit.Assert.assertArrayEquals(jSModuleArray21, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(result27);
        org.junit.Assert.assertNotNull(defaultPassConfig31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(passConfig34);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler23 = null;
        compiler22.removeChangeHandler(codeChangeHandler23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        compiler26.options = compilerOptions29;
        boolean boolean31 = compiler26.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        compiler26.init(jSSourceFileArray32, jSModuleArray41, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        boolean boolean60 = compiler54.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray61 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray62 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        compiler63.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig66 = compiler63.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.newCompilerOptions();
        com.google.javascript.jscomp.Result result68 = compiler54.compile(jSSourceFileArray61, jSModuleArray62, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig72 = compiler69.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler69.newCompilerOptions();
        compiler22.init(jSSourceFileArray32, jSSourceFileArray61, compilerOptions73);
        compiler0.options = compilerOptions73;
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getMessages();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator77 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Region region80 = compiler0.getSourceRegion("", (-1));
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray61);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray61, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray62);
        org.junit.Assert.assertArrayEquals(jSModuleArray62, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNotNull(defaultPassConfig72);
        org.junit.Assert.assertNotNull(compilerOptions73);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertArrayEquals(jSErrorArray76, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(memoizedScopeCreator77);
        org.junit.Assert.assertNull(region80);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        boolean boolean26 = compiler0.isIdeMode();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSModule jSModule29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray30 = compiler0.toSourceArray(jSModule29);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.NullPointerException");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNull(sourceMap28);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
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
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler16.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange18 = compiler16.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups19 = compiler16.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig20 = compiler16.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList21 = compiler16.getInputsForTesting();
        com.google.javascript.rhino.Node node23 = compiler16.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder24 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int25 = codeBuilder24.getLength();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.Scope scope30 = compiler27.getTopScope();
        compiler27.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention32 = compiler27.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode33 = compiler27.languageMode();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap35 = compiler34.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler34.recentChange;
        double double37 = compiler34.getProgress();
        com.google.javascript.rhino.Node node39 = compiler34.parseTestCode("Unversioned directory");
        compiler27.externAndJsRoot = node39;
        compiler16.toSource(codeBuilder24, (int) (byte) 0, node39);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.rhino.Node node51 = compiler43.parseTestCode("[hi!]");
        compiler11.toSource(codeBuilder24, (int) (byte) 0, node51);
        java.lang.String str53 = compiler0.toSource(node51);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder54 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int55 = codeBuilder54.getLineIndex();
        int int56 = codeBuilder54.getColumnIndex();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.prepareAst(node59);
        com.google.javascript.jscomp.Scope scope61 = compiler58.getTopScope();
        com.google.javascript.rhino.Node node62 = null;
        compiler58.prepareAst(node62);
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler58.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph65 = compiler58.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        java.lang.String str75 = compiler58.toSource(node74);
        compiler0.toSource(codeBuilder54, (int) (byte) -1, node74);
        java.lang.String str77 = compiler0.getAstDotGraph();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<com.google.javascript.rhino.InputId, com.google.javascript.jscomp.CompilerInput> inputIdMap78 = compiler0.getInputsById();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNotNull(recentChange18);
        org.junit.Assert.assertNotNull(diagnosticGroups19);
        org.junit.Assert.assertNotNull(defaultPassConfig20);
        org.junit.Assert.assertNull(compilerInputList21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNotNull(codingConvention32);
        org.junit.Assert.assertTrue("'" + languageMode33 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode33.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap35);
        org.junit.Assert.assertNotNull(recentChange36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.0d + "'", double37 == 0.0d);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNull(variableMap64);
        org.junit.Assert.assertNull(jSModuleGraph65);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler15.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler15.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        compiler0.processAMDAndCommonJSModules();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig20 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(defaultPassConfig20);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph6 = compiler0.getModuleGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.getOptions();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.normalize();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(jSModuleGraph6);
        org.junit.Assert.assertNotNull(strSupplier7);
        org.junit.Assert.assertNull(compilerOptions8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        compiler6.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler6.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler6.newCompilerOptions();
        compiler0.options = compilerOptions10;
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.prepareAst(node13);
        com.google.javascript.jscomp.Scope scope15 = compiler12.getTopScope();
        compiler12.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention17 = compiler12.defaultCodingConvention;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler12.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler12.newCompilerOptions();
        compiler0.options = compilerOptions19;
        boolean boolean21 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.CodingConvention codingConvention22 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNotNull(compilerOptions10);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(codingConvention17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(codingConvention22);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        compiler0.initCompilerOptionsIfTesting();
        boolean boolean19 = compiler0.hasHaltingErrors();
        java.lang.String str20 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node22 = null;
        compiler21.prepareAst(node22);
        com.google.javascript.jscomp.Scope scope24 = compiler21.getTopScope();
        com.google.javascript.rhino.Node node25 = null;
        compiler21.prepareAst(node25);
        boolean boolean27 = compiler21.precheck();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap29 = compiler28.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig30 = compiler28.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap31 = compiler28.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap33 = compiler32.getSourceMap();
        compiler32.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig38 = compiler35.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler35.newCompilerOptions();
        compiler32.options = compilerOptions39;
        compiler28.initOptions(compilerOptions39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler28.options;
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler44 = null;
        compiler43.removeChangeHandler(codeChangeHandler44);
        com.google.javascript.jscomp.Region region48 = compiler43.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        compiler49.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig52 = compiler49.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler49.newCompilerOptions();
        compiler43.options = compilerOptions53;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry55 = compiler43.getTypeRegistry();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.prepareAst(node57);
        com.google.javascript.jscomp.CompilerOptions compilerOptions59 = null;
        compiler56.options = compilerOptions59;
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange63 = compiler61.recentChange;
        double double64 = compiler61.getProgress();
        com.google.javascript.rhino.Node node66 = compiler61.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap68 = compiler67.getSourceMap();
        compiler67.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap71 = compiler70.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange72 = compiler70.recentChange;
        compiler67.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler61.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler56.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler43.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler28.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler21.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange72);
        com.google.javascript.jscomp.CodingConvention codingConvention80 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(scope24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(sourceMap29);
        org.junit.Assert.assertNotNull(passConfig30);
        org.junit.Assert.assertNull(functionInformationMap31);
        org.junit.Assert.assertNull(sourceMap33);
        org.junit.Assert.assertNotNull(defaultPassConfig38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNull(region48);
        org.junit.Assert.assertNotNull(defaultPassConfig52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNotNull(jSTypeRegistry55);
        org.junit.Assert.assertNull(sourceMap62);
        org.junit.Assert.assertNotNull(recentChange63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNull(sourceMap68);
        org.junit.Assert.assertNull(sourceMap71);
        org.junit.Assert.assertNotNull(recentChange72);
        org.junit.Assert.assertNotNull(codingConvention80);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.rhino.InputId inputId22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler0.getInput(inputId22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        compiler8.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap11 = compiler8.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler12.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler15.getVariableMap();
        com.google.javascript.rhino.Node node23 = compiler15.parseTestCode("[hi!]");
        java.lang.String str24 = compiler12.toSource(node23);
        compiler8.jsRoot = node23;
        java.lang.String str26 = compiler0.toSource(node23);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups27 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.type.ReverseAbstractInterpreter reverseAbstractInterpreter28 = compiler0.getReverseAbstractInterpreter();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator29 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        com.google.javascript.rhino.Node node34 = compiler30.externsRoot;
        com.google.javascript.rhino.Node node35 = compiler30.externsRoot;
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler36.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler40.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler40.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.rhino.Node node51 = compiler43.parseTestCode("[hi!]");
        java.lang.String str52 = compiler40.toSource(node51);
        compiler36.jsRoot = node51;
        compiler30.externsRoot = node51;
        com.google.javascript.jscomp.Compiler compiler55 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap56 = compiler55.getPropertyMap();
        com.google.javascript.rhino.Node node57 = compiler55.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap58 = compiler55.getFunctionalInformationMap();
        compiler55.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap62 = compiler61.getPropertyMap();
        com.google.javascript.rhino.Node node63 = compiler61.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap64 = compiler61.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange65 = compiler61.recentChange;
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        compiler66.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap69 = compiler66.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap71 = compiler70.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap72 = compiler70.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node74 = null;
        compiler73.prepareAst(node74);
        com.google.javascript.jscomp.Scope scope76 = compiler73.getTopScope();
        com.google.javascript.rhino.Node node77 = null;
        compiler73.prepareAst(node77);
        com.google.javascript.jscomp.VariableMap variableMap79 = compiler73.getVariableMap();
        com.google.javascript.rhino.Node node81 = compiler73.parseTestCode("[hi!]");
        java.lang.String str82 = compiler70.toSource(node81);
        compiler66.jsRoot = node81;
        compiler61.externsRoot = node81;
        compiler55.externsRoot = node81;
        boolean boolean86 = compiler0.areNodesEqualForInlining(node51, node81);
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState88 = compiler0.getState();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(globalVarReferenceMap11);
        org.junit.Assert.assertNull(variableMap13);
        org.junit.Assert.assertNull(globalVarReferenceMap14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(variableMap21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(diagnosticGroups27);
        org.junit.Assert.assertNotNull(reverseAbstractInterpreter28);
        org.junit.Assert.assertNull(memoizedScopeCreator29);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(node34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertNull(variableMap41);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(variableMap56);
        org.junit.Assert.assertNull(node57);
        org.junit.Assert.assertNull(functionInformationMap58);
        org.junit.Assert.assertNull(variableMap62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(functionInformationMap64);
        org.junit.Assert.assertNotNull(recentChange65);
        org.junit.Assert.assertNull(globalVarReferenceMap69);
        org.junit.Assert.assertNull(variableMap71);
        org.junit.Assert.assertNull(globalVarReferenceMap72);
        org.junit.Assert.assertNull(scope76);
        org.junit.Assert.assertNull(variableMap79);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(intermediateState88);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler8.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap11 = compiler8.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler12.getSourceMap();
        compiler12.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        compiler12.options = compilerOptions19;
        compiler8.initOptions(compilerOptions19);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = compiler8.options;
        compiler0.options = compilerOptions22;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler0.getErrorManager();
        compiler0.addToDebugLog("[[singleton]]");
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(passConfig10);
        org.junit.Assert.assertNull(functionInformationMap11);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(compilerOptions22);
        org.junit.Assert.assertNull(errorManager24);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler11.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap13 = compiler11.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.prepareAst(node15);
        com.google.javascript.jscomp.Scope scope17 = compiler14.getTopScope();
        com.google.javascript.rhino.Node node18 = null;
        compiler14.prepareAst(node18);
        com.google.javascript.jscomp.VariableMap variableMap20 = compiler14.getVariableMap();
        com.google.javascript.rhino.Node node22 = compiler14.parseTestCode("[hi!]");
        java.lang.String str23 = compiler11.toSource(node22);
        compiler0.jsRoot = node22;
        com.google.javascript.jscomp.Tracer tracer26 = compiler0.newTracer("2569/09/27 15:58");
        com.google.javascript.jscomp.JSError[] jSErrorArray27 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = compiler0.getSourceLine("2569/09/27 15:58", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNull(globalVarReferenceMap13);
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertNull(variableMap20);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(tracer26);
        org.junit.Assert.assertNotNull(jSErrorArray27);
        org.junit.Assert.assertArrayEquals(jSErrorArray27, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler17.getVariableMap();
        com.google.javascript.rhino.Node node25 = compiler17.parseTestCode("[hi!]");
        java.lang.String str26 = compiler9.toSource(node25);
        compiler0.externsRoot = node25;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.VariableMap variableMap29 = compiler0.getPropertyMap();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = compiler0.ensureLibraryInjected("Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(variableMap29);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler15.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler15.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler0.defaultCodingConvention;
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry20 = compiler0.getTypeRegistry();
        com.google.javascript.rhino.Node node21 = compiler0.jsRoot;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNotNull(jSTypeRegistry20);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups2 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        compiler3.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention8 = compiler3.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode9 = compiler3.languageMode();
        com.google.javascript.jscomp.Scope scope10 = compiler3.getTopScope();
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
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = null;
        compiler22.prepareAst(node23);
        com.google.javascript.jscomp.Scope scope25 = compiler22.getTopScope();
        compiler22.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups30 = compiler27.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig31 = compiler27.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList32 = compiler27.getInputsForTesting();
        com.google.javascript.rhino.Node node34 = compiler27.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder35 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int36 = codeBuilder35.getLength();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node39 = null;
        compiler38.prepareAst(node39);
        com.google.javascript.jscomp.Scope scope41 = compiler38.getTopScope();
        compiler38.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention43 = compiler38.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode44 = compiler38.languageMode();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap46 = compiler45.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler45.recentChange;
        double double48 = compiler45.getProgress();
        com.google.javascript.rhino.Node node50 = compiler45.parseTestCode("Unversioned directory");
        compiler38.externAndJsRoot = node50;
        compiler27.toSource(codeBuilder35, (int) (byte) 0, node50);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler54.getVariableMap();
        com.google.javascript.rhino.Node node62 = compiler54.parseTestCode("[hi!]");
        compiler22.toSource(codeBuilder35, (int) (byte) 0, node62);
        java.lang.String str64 = compiler11.toSource(node62);
        compiler3.jsRoot = node62;
        compiler0.externsRoot = node62;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSError[] jSErrorArray67 = compiler0.getErrors();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(diagnosticGroups2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(codingConvention8);
        org.junit.Assert.assertTrue("'" + languageMode9 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode9.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(errorReporter20);
        org.junit.Assert.assertNotNull(errorManager21);
        org.junit.Assert.assertNull(scope25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(diagnosticGroups30);
        org.junit.Assert.assertNotNull(defaultPassConfig31);
        org.junit.Assert.assertNull(compilerInputList32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(scope41);
        org.junit.Assert.assertNotNull(codingConvention43);
        org.junit.Assert.assertTrue("'" + languageMode44 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode44.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap46);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertNull(variableMap60);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler6 = null;
        compiler5.removeChangeHandler(codeChangeHandler6);
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler5.getPassConfig();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph9 = compiler5.getModuleGraph();
        java.lang.String str10 = compiler5.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.CompilerOptions compilerOptions14 = null;
        compiler11.options = compilerOptions14;
        boolean boolean16 = compiler11.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray17 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.prepareAst(node19);
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        com.google.javascript.rhino.Node node22 = null;
        compiler18.prepareAst(node22);
        boolean boolean24 = compiler18.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray26 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        compiler27.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig30 = compiler27.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions31 = compiler27.newCompilerOptions();
        com.google.javascript.jscomp.Result result32 = compiler18.compile(jSSourceFileArray25, jSModuleArray26, compilerOptions31);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        compiler33.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig36 = compiler33.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler33.newCompilerOptions();
        compiler11.init(jSSourceFileArray17, jSModuleArray26, compilerOptions37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.prepareAst(node40);
        com.google.javascript.jscomp.Scope scope42 = compiler39.getTopScope();
        com.google.javascript.rhino.Node node43 = null;
        compiler39.prepareAst(node43);
        boolean boolean45 = compiler39.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray47 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        com.google.javascript.jscomp.Result result53 = compiler39.compile(jSSourceFileArray46, jSModuleArray47, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap55 = compiler54.getSourceMap();
        compiler54.disableThreads();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.prepareAst(node58);
        com.google.javascript.jscomp.Scope scope60 = compiler57.getTopScope();
        com.google.javascript.rhino.Node node61 = null;
        compiler57.prepareAst(node61);
        boolean boolean63 = compiler57.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray64 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray65 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        compiler66.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig69 = compiler66.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions70 = compiler66.newCompilerOptions();
        com.google.javascript.jscomp.Result result71 = compiler57.compile(jSSourceFileArray64, jSModuleArray65, compilerOptions70);
        com.google.javascript.jscomp.CompilerOptions compilerOptions72 = compiler57.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap73 = compiler57.getVariableMap();
        java.lang.String str74 = compiler57.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap76 = compiler75.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig77 = compiler75.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap78 = compiler75.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap80 = compiler79.getSourceMap();
        compiler79.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler();
        compiler82.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig85 = compiler82.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions86 = compiler82.newCompilerOptions();
        compiler79.options = compilerOptions86;
        compiler75.initOptions(compilerOptions86);
        compiler57.initOptions(compilerOptions86);
        compiler54.initOptions(compilerOptions86);
        compiler5.init(jSSourceFileArray17, jSSourceFileArray46, compilerOptions86);
        compiler0.options = compilerOptions86;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.endPass();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Tracer should not be null at the end of a pass.");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNull(jSModuleGraph9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray17);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray17, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray26);
        org.junit.Assert.assertArrayEquals(jSModuleArray26, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig30);
        org.junit.Assert.assertNotNull(compilerOptions31);
        org.junit.Assert.assertNotNull(result32);
        org.junit.Assert.assertNotNull(defaultPassConfig36);
        org.junit.Assert.assertNotNull(compilerOptions37);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray46, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray47);
        org.junit.Assert.assertArrayEquals(jSModuleArray47, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNotNull(result53);
        org.junit.Assert.assertNull(sourceMap55);
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray64);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray64, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray65);
        org.junit.Assert.assertArrayEquals(jSModuleArray65, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig69);
        org.junit.Assert.assertNotNull(compilerOptions70);
        org.junit.Assert.assertNotNull(result71);
        org.junit.Assert.assertNotNull(compilerOptions72);
        org.junit.Assert.assertNull(variableMap73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(sourceMap76);
        org.junit.Assert.assertNotNull(passConfig77);
        org.junit.Assert.assertNull(functionInformationMap78);
        org.junit.Assert.assertNull(sourceMap80);
        org.junit.Assert.assertNotNull(defaultPassConfig85);
        org.junit.Assert.assertNotNull(compilerOptions86);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node20 = compiler0.parseTestCode("[singleton]");
        double double21 = compiler0.getProgress();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Tracer tracer7 = compiler0.newTracer("[singleton]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler0.getState();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = compiler0.parseInputs();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap27 = compiler26.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange28 = compiler26.recentChange;
        double double29 = compiler26.getProgress();
        com.google.javascript.rhino.Node node31 = compiler26.parseTestCode("Unversioned directory");
        java.lang.String str32 = compiler0.toSource(node31);
        boolean boolean33 = compiler0.isTypeCheckingEnabled();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(sourceMap27);
        org.junit.Assert.assertNotNull(recentChange28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        java.lang.String str13 = compiler0.getAstDotGraph();
        boolean boolean14 = compiler0.precheck();
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler0.getVariableMap();
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(variableMap15);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.prepareAst(node5);
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        com.google.javascript.rhino.Node node8 = null;
        compiler4.prepareAst(node8);
        boolean boolean10 = compiler4.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        compiler13.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig16 = compiler13.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler13.newCompilerOptions();
        com.google.javascript.jscomp.Result result18 = compiler4.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions17);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.CompilerOptions compilerOptions22 = null;
        compiler19.options = compilerOptions22;
        boolean boolean24 = compiler19.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray25 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        boolean boolean32 = compiler26.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray34 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig38 = compiler35.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler35.newCompilerOptions();
        com.google.javascript.jscomp.Result result40 = compiler26.compile(jSSourceFileArray33, jSModuleArray34, compilerOptions39);
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        compiler41.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig44 = compiler41.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler41.newCompilerOptions();
        compiler19.init(jSSourceFileArray25, jSModuleArray34, compilerOptions45);
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node48 = null;
        compiler47.prepareAst(node48);
        com.google.javascript.jscomp.Scope scope50 = compiler47.getTopScope();
        com.google.javascript.rhino.Node node51 = null;
        compiler47.prepareAst(node51);
        boolean boolean53 = compiler47.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray54 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        compiler56.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig59 = compiler56.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = compiler56.newCompilerOptions();
        com.google.javascript.jscomp.Result result61 = compiler47.compile(jSSourceFileArray54, jSModuleArray55, compilerOptions60);
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler47.getOptions();
        com.google.javascript.jscomp.Result result63 = compiler0.compile(jSSourceFileArray11, jSModuleArray34, compilerOptions62);
        com.google.common.base.Supplier<java.lang.String> strSupplier64 = compiler0.getUniqueNameIdSupplier();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node66 = compiler0.ensureLibraryInjected("[singleton]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(result18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray25);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray25, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray33, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray34);
        org.junit.Assert.assertArrayEquals(jSModuleArray34, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(result40);
        org.junit.Assert.assertNotNull(defaultPassConfig44);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray54);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray54, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray55);
        org.junit.Assert.assertArrayEquals(jSModuleArray55, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig59);
        org.junit.Assert.assertNotNull(compilerOptions60);
        org.junit.Assert.assertNotNull(result61);
        org.junit.Assert.assertNotNull(compilerOptions62);
        org.junit.Assert.assertNotNull(result63);
        org.junit.Assert.assertNotNull(strSupplier64);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList2 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = compiler0.getNodeForCodeInsertion(jSModule3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(compilerInputList2);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        com.google.javascript.jscomp.SourceMap sourceMap3 = compiler0.getSourceMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = null;
        compiler5.prepareAst(node6);
        com.google.javascript.jscomp.Scope scope8 = compiler5.getTopScope();
        com.google.javascript.rhino.Node node9 = null;
        compiler5.prepareAst(node9);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator11 = compiler5.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        compiler13.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap16 = compiler13.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap18 = compiler17.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap19 = compiler17.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node21 = null;
        compiler20.prepareAst(node21);
        com.google.javascript.jscomp.Scope scope23 = compiler20.getTopScope();
        com.google.javascript.rhino.Node node24 = null;
        compiler20.prepareAst(node24);
        com.google.javascript.jscomp.VariableMap variableMap26 = compiler20.getVariableMap();
        com.google.javascript.rhino.Node node28 = compiler20.parseTestCode("[hi!]");
        java.lang.String str29 = compiler17.toSource(node28);
        compiler13.jsRoot = node28;
        intermediateState12.externsRoot = node28;
        compiler0.setState(intermediateState12);
        com.google.javascript.rhino.Node node34 = compiler0.parseTestCode("Unversioned directory");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler0.getInputsForTesting();
        org.junit.Assert.assertNull(sourceMap3);
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(memoizedScopeCreator11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertNull(globalVarReferenceMap16);
        org.junit.Assert.assertNull(variableMap18);
        org.junit.Assert.assertNull(globalVarReferenceMap19);
        org.junit.Assert.assertNull(scope23);
        org.junit.Assert.assertNull(variableMap26);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNull(compilerInputList35);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Scope scope9 = compiler0.getTopScope();
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = compiler0.parseSyntheticCode("hi!", "[[2569/09/27 15:58]]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler26.getVariableMap();
        com.google.javascript.jscomp.Scope scope33 = compiler26.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap37 = compiler34.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler38.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap40 = compiler38.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.prepareAst(node42);
        com.google.javascript.jscomp.Scope scope44 = compiler41.getTopScope();
        com.google.javascript.rhino.Node node45 = null;
        compiler41.prepareAst(node45);
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler41.getVariableMap();
        com.google.javascript.rhino.Node node49 = compiler41.parseTestCode("[hi!]");
        java.lang.String str50 = compiler38.toSource(node49);
        compiler34.jsRoot = node49;
        java.lang.String str52 = compiler26.toSource(node49);
        compiler0.externsRoot = node49;
        com.google.javascript.jscomp.JSError[] jSErrorArray54 = compiler0.getWarnings();
        com.google.javascript.jscomp.Region region57 = compiler0.getSourceRegion("", (-1));
        com.google.javascript.rhino.Node node58 = compiler0.jsRoot;
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(globalVarReferenceMap37);
        org.junit.Assert.assertNull(variableMap39);
        org.junit.Assert.assertNull(globalVarReferenceMap40);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNull(variableMap47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(jSErrorArray54);
        org.junit.Assert.assertArrayEquals(jSErrorArray54, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region57);
        org.junit.Assert.assertNull(node58);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        boolean boolean39 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.SourceFile sourceFile41 = compiler0.getSourceFileByName("[]");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(sourceFile41);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler0.newCompilerOptions();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNotNull(compilerOptions39);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.prepareAst(node41);
        com.google.javascript.jscomp.Scope scope43 = compiler40.getTopScope();
        compiler40.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler40.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode46 = compiler40.languageMode();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler47.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler47.recentChange;
        double double50 = compiler47.getProgress();
        com.google.javascript.rhino.Node node52 = compiler47.parseTestCode("Unversioned directory");
        compiler40.externAndJsRoot = node52;
        compiler0.jsRoot = node52;
        boolean boolean55 = compiler0.isTypeCheckingEnabled();
        compiler0.resetUniqueNameId();
        compiler0.setProgress(1.0d);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap59 = compiler0.getCssRenamingMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier60 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups61 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions62 = compiler0.options;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(sourceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertTrue("'" + languageMode46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode46.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(cssRenamingMap59);
        org.junit.Assert.assertNotNull(strSupplier60);
        org.junit.Assert.assertNotNull(diagnosticGroups61);
        org.junit.Assert.assertNotNull(compilerOptions62);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        boolean boolean26 = compiler0.isIdeMode();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig28 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(defaultPassConfig28);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(variableMap16);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        boolean boolean28 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph29 = compiler0.getDegenerateModuleGraph();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(jSModuleGraph29);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.rhino.head.ErrorReporter errorReporter29 = compiler26.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap30 = compiler26.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap32 = compiler31.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange33 = compiler31.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups34 = compiler31.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig35 = compiler31.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList36 = compiler31.getInputsForTesting();
        com.google.javascript.rhino.Node node38 = compiler31.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler31.options;
        compiler26.initOptions(compilerOptions39);
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler26.getCodingConvention();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange42 = compiler26.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange42);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig44 = compiler0.ensureDefaultPassConfig();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(errorReporter29);
        org.junit.Assert.assertNull(globalVarReferenceMap30);
        org.junit.Assert.assertNull(sourceMap32);
        org.junit.Assert.assertNotNull(recentChange33);
        org.junit.Assert.assertNotNull(diagnosticGroups34);
        org.junit.Assert.assertNotNull(defaultPassConfig35);
        org.junit.Assert.assertNull(compilerInputList36);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertNotNull(recentChange42);
        org.junit.Assert.assertNotNull(defaultPassConfig44);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        double double29 = compiler0.getProgress();
        com.google.javascript.jscomp.JSError[] jSErrorArray30 = compiler0.getWarnings();
        com.google.javascript.jscomp.JSError[] jSErrorArray31 = compiler0.getErrors();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertNotNull(jSErrorArray30);
        org.junit.Assert.assertArrayEquals(jSErrorArray30, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(jSErrorArray31);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.setProgress(0.0d);
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        org.junit.Assert.assertNull(compilerOptions5);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        com.google.javascript.rhino.Node node23 = null;
        compiler19.prepareAst(node23);
        boolean boolean25 = compiler19.precheck();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig26 = compiler19.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler19.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        boolean boolean32 = compiler0.hasErrors();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput33 = compiler0.getSynthesizedExternsInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(defaultPassConfig26);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        codeBuilder0.reset();
        codeBuilder0.reset();
        int int4 = codeBuilder0.getLineIndex();
        int int5 = codeBuilder0.getColumnIndex();
        int int6 = codeBuilder0.getLineIndex();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.prepareAst(node41);
        com.google.javascript.jscomp.Scope scope43 = compiler40.getTopScope();
        compiler40.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler40.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode46 = compiler40.languageMode();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler47.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler47.recentChange;
        double double50 = compiler47.getProgress();
        com.google.javascript.rhino.Node node52 = compiler47.parseTestCode("Unversioned directory");
        compiler40.externAndJsRoot = node52;
        compiler0.jsRoot = node52;
        boolean boolean55 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap57 = compiler56.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig58 = compiler56.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap59 = compiler56.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap60 = compiler56.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap62 = compiler61.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange63 = compiler61.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups64 = compiler61.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig65 = compiler61.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList66 = compiler61.getInputsForTesting();
        com.google.javascript.rhino.Node node68 = compiler61.parseTestCode("2569/09/27 15:58");
        java.lang.String str69 = compiler56.toSource(node68);
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap71 = compiler70.getPropertyMap();
        com.google.javascript.rhino.Node node72 = compiler70.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap73 = compiler70.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange74 = compiler70.recentChange;
        com.google.javascript.jscomp.Compiler compiler75 = new com.google.javascript.jscomp.Compiler();
        compiler75.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap78 = compiler75.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler79 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap80 = compiler79.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap81 = compiler79.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler82 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node83 = null;
        compiler82.prepareAst(node83);
        com.google.javascript.jscomp.Scope scope85 = compiler82.getTopScope();
        com.google.javascript.rhino.Node node86 = null;
        compiler82.prepareAst(node86);
        com.google.javascript.jscomp.VariableMap variableMap88 = compiler82.getVariableMap();
        com.google.javascript.rhino.Node node90 = compiler82.parseTestCode("[hi!]");
        java.lang.String str91 = compiler79.toSource(node90);
        compiler75.jsRoot = node90;
        compiler70.externsRoot = node90;
        boolean boolean94 = compiler0.areNodesEqualForInlining(node68, node90);
        compiler0.processDefines();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange96 = compiler0.recentChange;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(sourceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertTrue("'" + languageMode46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode46.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(sourceMap57);
        org.junit.Assert.assertNotNull(passConfig58);
        org.junit.Assert.assertNull(functionInformationMap59);
        org.junit.Assert.assertNull(variableMap60);
        org.junit.Assert.assertNull(sourceMap62);
        org.junit.Assert.assertNotNull(recentChange63);
        org.junit.Assert.assertNotNull(diagnosticGroups64);
        org.junit.Assert.assertNotNull(defaultPassConfig65);
        org.junit.Assert.assertNull(compilerInputList66);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(variableMap71);
        org.junit.Assert.assertNull(node72);
        org.junit.Assert.assertNull(functionInformationMap73);
        org.junit.Assert.assertNotNull(recentChange74);
        org.junit.Assert.assertNull(globalVarReferenceMap78);
        org.junit.Assert.assertNull(variableMap80);
        org.junit.Assert.assertNull(globalVarReferenceMap81);
        org.junit.Assert.assertNull(scope85);
        org.junit.Assert.assertNull(variableMap88);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(recentChange96);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap16 = compiler0.getVariableMap();
        java.lang.String str17 = compiler0.getAstDotGraph();
        boolean boolean18 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node20 = compiler0.parseTestCode("[]");
        com.google.javascript.jscomp.parsing.Config config21 = compiler0.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler22.getPropertyMap();
        com.google.javascript.rhino.Node node24 = compiler22.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap25 = compiler22.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler22.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange26);
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState28 = compiler0.getState();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap29 = null;
        compiler0.setCssRenamingMap(cssRenamingMap29);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(variableMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertNotNull(config21);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(functionInformationMap25);
        org.junit.Assert.assertNotNull(recentChange26);
        org.junit.Assert.assertNotNull(intermediateState28);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        compiler0.setProgress((double) 0L);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setCssRenamingMap(cssRenamingMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap3);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        java.lang.String str17 = compiler0.getAstDotGraph();
        boolean boolean18 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups22 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler19.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler19.getInputsForTesting();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int28 = codeBuilder27.getLength();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        compiler30.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = compiler30.languageMode();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler37.recentChange;
        double double40 = compiler37.getProgress();
        com.google.javascript.rhino.Node node42 = compiler37.parseTestCode("Unversioned directory");
        compiler30.externAndJsRoot = node42;
        compiler19.toSource(codeBuilder27, (int) (byte) 0, node42);
        compiler0.externsRoot = node42;
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator46 = compiler0.getTypedScopeCreator();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(diagnosticGroups22);
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(memoizedScopeCreator46);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker5 = compiler0.tracker;
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.getOptions();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker9 = null;
        compiler0.tracker = performanceTracker9;
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(performanceTracker5);
        org.junit.Assert.assertNotNull(compilerOptions6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        compiler8.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap11 = compiler8.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap13 = compiler12.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap14 = compiler12.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler15.getVariableMap();
        com.google.javascript.rhino.Node node23 = compiler15.parseTestCode("[hi!]");
        java.lang.String str24 = compiler12.toSource(node23);
        compiler8.jsRoot = node23;
        java.lang.String str26 = compiler0.toSource(node23);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups27 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap28 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = null;
        compiler29.options = compilerOptions32;
        boolean boolean34 = compiler29.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray35 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.prepareAst(node37);
        com.google.javascript.jscomp.Scope scope39 = compiler36.getTopScope();
        com.google.javascript.rhino.Node node40 = null;
        compiler36.prepareAst(node40);
        boolean boolean42 = compiler36.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        compiler45.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig48 = compiler45.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler45.newCompilerOptions();
        com.google.javascript.jscomp.Result result50 = compiler36.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions49);
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        compiler51.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig54 = compiler51.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions55 = compiler51.newCompilerOptions();
        compiler29.init(jSSourceFileArray35, jSModuleArray44, compilerOptions55);
        compiler29.processAMDAndCommonJSModules();
        com.google.javascript.jscomp.Compiler compiler58 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node59 = null;
        compiler58.prepareAst(node59);
        com.google.javascript.jscomp.Scope scope61 = compiler58.getTopScope();
        com.google.javascript.rhino.Node node62 = null;
        compiler58.prepareAst(node62);
        com.google.javascript.jscomp.VariableMap variableMap64 = compiler58.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph65 = compiler58.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        java.lang.String str75 = compiler58.toSource(node74);
        com.google.javascript.rhino.Node node76 = compiler58.jsRoot;
        com.google.javascript.rhino.Node node78 = compiler58.parseTestCode("[singleton]");
        java.lang.String str79 = compiler29.toSource(node78);
        java.lang.String str80 = compiler0.toSource(node78);
        com.google.javascript.rhino.Node node81 = compiler0.externsRoot;
        compiler0.setProgress((double) (byte) 100);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(globalVarReferenceMap11);
        org.junit.Assert.assertNull(variableMap13);
        org.junit.Assert.assertNull(globalVarReferenceMap14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertNull(variableMap21);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(diagnosticGroups27);
        org.junit.Assert.assertNull(globalVarReferenceMap28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray35);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray35, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray43);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray43, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray44);
        org.junit.Assert.assertArrayEquals(jSModuleArray44, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNotNull(defaultPassConfig54);
        org.junit.Assert.assertNotNull(compilerOptions55);
        org.junit.Assert.assertNull(scope61);
        org.junit.Assert.assertNull(variableMap64);
        org.junit.Assert.assertNull(jSModuleGraph65);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNull(node76);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "[singleton]" + "'", str79, "[singleton]");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "[singleton]" + "'", str80, "[singleton]");
        org.junit.Assert.assertNull(node81);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList8 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap9 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = compiler0.getOptions();
        compiler0.resetUniqueNameId();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(compilerInputList8);
        org.junit.Assert.assertNull(globalVarReferenceMap9);
        org.junit.Assert.assertNull(compilerOptions10);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups11 = compiler8.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler8.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler8.getInputsForTesting();
        com.google.javascript.rhino.Node node15 = compiler8.parseTestCode("2569/09/27 15:58");
        compiler0.externsRoot = node15;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler18 = null;
        compiler17.removeChangeHandler(codeChangeHandler18);
        com.google.javascript.jscomp.Region region22 = compiler17.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        compiler24.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler24.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler23.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.rhino.head.ErrorReporter errorReporter32 = compiler23.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler23.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        compiler34.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap40 = compiler39.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange41 = compiler39.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups42 = compiler39.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig43 = compiler39.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList44 = compiler39.getInputsForTesting();
        com.google.javascript.rhino.Node node46 = compiler39.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder47 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int48 = codeBuilder47.getLength();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = null;
        compiler50.prepareAst(node51);
        com.google.javascript.jscomp.Scope scope53 = compiler50.getTopScope();
        compiler50.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention55 = compiler50.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode56 = compiler50.languageMode();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap58 = compiler57.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange59 = compiler57.recentChange;
        double double60 = compiler57.getProgress();
        com.google.javascript.rhino.Node node62 = compiler57.parseTestCode("Unversioned directory");
        compiler50.externAndJsRoot = node62;
        compiler39.toSource(codeBuilder47, (int) (byte) 0, node62);
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node67 = null;
        compiler66.prepareAst(node67);
        com.google.javascript.jscomp.Scope scope69 = compiler66.getTopScope();
        com.google.javascript.rhino.Node node70 = null;
        compiler66.prepareAst(node70);
        com.google.javascript.jscomp.VariableMap variableMap72 = compiler66.getVariableMap();
        com.google.javascript.rhino.Node node74 = compiler66.parseTestCode("[hi!]");
        compiler34.toSource(codeBuilder47, (int) (byte) 0, node74);
        java.lang.String str76 = compiler23.toSource(node74);
        java.lang.String str77 = compiler17.toSource(node74);
        java.lang.String str78 = compiler0.toSource(node74);
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.CompilerOptions compilerOptions80 = compiler0.newCompilerOptions();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNotNull(diagnosticGroups11);
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNull(compilerInputList13);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNull(region22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNotNull(errorReporter32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertNull(sourceMap40);
        org.junit.Assert.assertNotNull(recentChange41);
        org.junit.Assert.assertNotNull(diagnosticGroups42);
        org.junit.Assert.assertNotNull(defaultPassConfig43);
        org.junit.Assert.assertNull(compilerInputList44);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(scope53);
        org.junit.Assert.assertNotNull(codingConvention55);
        org.junit.Assert.assertTrue("'" + languageMode56 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode56.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap58);
        org.junit.Assert.assertNotNull(recentChange59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 0.0d + "'", double60 == 0.0d);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNull(scope69);
        org.junit.Assert.assertNull(variableMap72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(compilerOptions80);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        compiler0.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.rhino.Node node7 = null;
        compiler0.prepareAst(node7);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        double double21 = compiler0.getProgress();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap7 = compiler5.getGlobalVarReferences();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange8 = compiler5.recentChange;
        com.google.javascript.jscomp.Scope scope9 = compiler5.getTopScope();
        com.google.javascript.rhino.Node node11 = compiler5.parseTestCode("[]");
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler5.getState();
        int int13 = compiler5.getErrorCount();
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler5.getVariableMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange15 = compiler5.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange15);
        org.junit.Assert.assertNull(variableMap3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(globalVarReferenceMap7);
        org.junit.Assert.assertNotNull(recentChange8);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(recentChange15);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.ErrorManager errorManager15 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler(errorManager15);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(errorManager15);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        boolean boolean35 = compiler29.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray36 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray37 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        compiler38.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig41 = compiler38.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions42 = compiler38.newCompilerOptions();
        com.google.javascript.jscomp.Result result43 = compiler29.compile(jSSourceFileArray36, jSModuleArray37, compilerOptions42);
        com.google.javascript.jscomp.CompilerOptions compilerOptions44 = compiler29.getOptions();
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node46 = null;
        compiler45.prepareAst(node46);
        com.google.javascript.jscomp.Scope scope48 = compiler45.getTopScope();
        compiler45.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention50 = compiler45.defaultCodingConvention;
        compiler29.defaultCodingConvention = codingConvention50;
        compiler0.defaultCodingConvention = codingConvention50;
        java.lang.String str55 = compiler0.getSourceLine("[singleton]", (int) (byte) 10);
        com.google.javascript.rhino.Node node56 = compiler0.externsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange57 = compiler0.recentChange;
        java.lang.String str58 = compiler0.toSource();
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler60 = null;
        compiler59.removeChangeHandler(codeChangeHandler60);
        com.google.javascript.jscomp.Region region64 = compiler59.getSourceRegion("hi!", (int) (short) -1);
        compiler59.addToDebugLog("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler compiler67 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap68 = compiler67.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange69 = compiler67.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups70 = compiler67.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig71 = compiler67.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList72 = compiler67.getInputsForTesting();
        com.google.javascript.rhino.Node node74 = compiler67.parseTestCode("2569/09/27 15:58");
        compiler59.externsRoot = node74;
        compiler0.externsRoot = node74;
        java.lang.String str79 = compiler0.getSourceLine("[2569/09/27 15:58]", 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray36);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray36, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray37);
        org.junit.Assert.assertArrayEquals(jSModuleArray37, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig41);
        org.junit.Assert.assertNotNull(compilerOptions42);
        org.junit.Assert.assertNotNull(result43);
        org.junit.Assert.assertNotNull(compilerOptions44);
        org.junit.Assert.assertNull(scope48);
        org.junit.Assert.assertNotNull(codingConvention50);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNotNull(recentChange57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(region64);
        org.junit.Assert.assertNull(sourceMap68);
        org.junit.Assert.assertNotNull(recentChange69);
        org.junit.Assert.assertNotNull(diagnosticGroups70);
        org.junit.Assert.assertNotNull(defaultPassConfig71);
        org.junit.Assert.assertNull(compilerInputList72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNull(str79);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        boolean boolean39 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker40 = compiler0.tracker;
        com.google.javascript.jscomp.CodingConvention codingConvention41 = compiler0.defaultCodingConvention;
        boolean boolean42 = compiler0.isTypeCheckingEnabled();
        com.google.javascript.jscomp.JsAst jsAst43 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addIncrementalSourceAst(jsAst43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNull(performanceTracker40);
        org.junit.Assert.assertNotNull(codingConvention41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        java.lang.String str5 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.JSError jSError6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel7 = compiler0.getErrorLevel(jSError6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups10 = compiler7.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig11 = compiler7.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList12 = compiler7.getInputsForTesting();
        com.google.javascript.rhino.Node node14 = compiler7.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder15 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int16 = codeBuilder15.getLength();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node19 = null;
        compiler18.prepareAst(node19);
        com.google.javascript.jscomp.Scope scope21 = compiler18.getTopScope();
        compiler18.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention23 = compiler18.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode24 = compiler18.languageMode();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap26 = compiler25.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange27 = compiler25.recentChange;
        double double28 = compiler25.getProgress();
        com.google.javascript.rhino.Node node30 = compiler25.parseTestCode("Unversioned directory");
        compiler18.externAndJsRoot = node30;
        compiler7.toSource(codeBuilder15, (int) (byte) 0, node30);
        compiler0.externAndJsRoot = node30;
        compiler0.resetUniqueNameId();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result35 = compiler0.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(memoizedScopeCreator6);
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertNotNull(diagnosticGroups10);
        org.junit.Assert.assertNotNull(defaultPassConfig11);
        org.junit.Assert.assertNull(compilerInputList12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(scope21);
        org.junit.Assert.assertNotNull(codingConvention23);
        org.junit.Assert.assertTrue("'" + languageMode24 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode24.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap26);
        org.junit.Assert.assertNotNull(recentChange27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.PassConfig passConfig15 = compiler0.createPassConfigInternal();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler0.getErrorManager();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JSError[] jSErrorArray19 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node20 = compiler0.jsRoot;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph21 = compiler0.getModuleGraph();
        boolean boolean22 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap23 = compiler0.getCssRenamingMap();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(passConfig15);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(jSErrorArray19);
        org.junit.Assert.assertArrayEquals(jSErrorArray19, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(jSModuleGraph21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(cssRenamingMap23);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap16 = compiler15.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange17 = compiler15.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange17);
        com.google.javascript.jscomp.CodingConvention codingConvention19 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Region region22 = compiler0.getSourceRegion("[[2569/09/27 15:58]]", (int) (short) 1);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(sourceMap16);
        org.junit.Assert.assertNotNull(recentChange17);
        org.junit.Assert.assertNotNull(codingConvention19);
        org.junit.Assert.assertNull(region22);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        double double3 = compiler0.getProgress();
        compiler0.reportCodeChange();
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setCssRenamingMap(cssRenamingMap5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.rhino.head.ErrorReporter errorReporter3 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler5.options;
        compiler0.initOptions(compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler16 = null;
        compiler15.removeChangeHandler(codeChangeHandler16);
        com.google.javascript.jscomp.Region region20 = compiler15.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node21 = compiler15.externAndJsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig22 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler24 = null;
        compiler23.removeChangeHandler(codeChangeHandler24);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph26 = compiler23.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler23.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node29 = null;
        compiler28.prepareAst(node29);
        com.google.javascript.jscomp.Scope scope31 = compiler28.getTopScope();
        com.google.javascript.rhino.Node node32 = null;
        compiler28.prepareAst(node32);
        com.google.javascript.jscomp.VariableMap variableMap34 = compiler28.getVariableMap();
        com.google.javascript.jscomp.Scope scope35 = compiler28.getTopScope();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        compiler36.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler36.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap41 = compiler40.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler40.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.rhino.Node node51 = compiler43.parseTestCode("[hi!]");
        java.lang.String str52 = compiler40.toSource(node51);
        compiler36.jsRoot = node51;
        java.lang.String str54 = compiler28.toSource(node51);
        compiler23.externsRoot = node51;
        compiler15.jsRoot = node51;
        compiler0.externAndJsRoot = node51;
        com.google.javascript.jscomp.TypeValidator typeValidator58 = compiler0.getTypeValidator();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry59 = compiler0.getTypeRegistry();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput60 = compiler0.getSynthesizedExternsInput();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorReporter3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNull(region20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(defaultPassConfig22);
        org.junit.Assert.assertNull(jSModuleGraph26);
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNull(scope31);
        org.junit.Assert.assertNull(variableMap34);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertNull(variableMap41);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(typeValidator58);
        org.junit.Assert.assertNotNull(jSTypeRegistry59);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler5.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange7 = compiler5.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups8 = compiler5.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig9 = compiler5.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList10 = compiler5.getInputsForTesting();
        com.google.javascript.rhino.Node node12 = compiler5.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder13 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int14 = codeBuilder13.getLength();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode22 = compiler16.languageMode();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap24 = compiler23.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange25 = compiler23.recentChange;
        double double26 = compiler23.getProgress();
        com.google.javascript.rhino.Node node28 = compiler23.parseTestCode("Unversioned directory");
        compiler16.externAndJsRoot = node28;
        compiler5.toSource(codeBuilder13, (int) (byte) 0, node28);
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler32.getVariableMap();
        com.google.javascript.rhino.Node node40 = compiler32.parseTestCode("[hi!]");
        compiler0.toSource(codeBuilder13, (int) (byte) 0, node40);
        boolean boolean43 = codeBuilder13.endsWith("[2569/09/27 15:58]");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange7);
        org.junit.Assert.assertNotNull(diagnosticGroups8);
        org.junit.Assert.assertNotNull(defaultPassConfig9);
        org.junit.Assert.assertNull(compilerInputList10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertTrue("'" + languageMode22 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode22.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap24);
        org.junit.Assert.assertNotNull(recentChange25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler3.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler3.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange5);
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int1 = codeBuilder0.getLength();
        int int2 = codeBuilder0.getLineIndex();
        java.lang.String str3 = codeBuilder0.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler2 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node3 = null;
        compiler2.prepareAst(node3);
        com.google.javascript.jscomp.Scope scope5 = compiler2.getTopScope();
        compiler2.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention7 = compiler2.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention7;
        compiler0.disableThreads();
        com.google.javascript.jscomp.PassConfig passConfig10 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertNotNull(codingConvention7);
        org.junit.Assert.assertNotNull(passConfig10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        compiler0.addToDebugLog("[hi!]");
        double double10 = compiler0.getProgress();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        com.google.javascript.rhino.Node node15 = null;
        compiler11.prepareAst(node15);
        boolean boolean17 = compiler11.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray18 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray19 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        compiler20.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler20.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions24 = compiler20.newCompilerOptions();
        com.google.javascript.jscomp.Result result25 = compiler11.compile(jSSourceFileArray18, jSModuleArray19, compilerOptions24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        boolean boolean32 = compiler26.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray34 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        compiler35.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig38 = compiler35.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions39 = compiler35.newCompilerOptions();
        com.google.javascript.jscomp.Result result40 = compiler26.compile(jSSourceFileArray33, jSModuleArray34, compilerOptions39);
        com.google.javascript.jscomp.CompilerOptions compilerOptions41 = compiler26.getOptions();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node43 = null;
        compiler42.prepareAst(node43);
        com.google.javascript.jscomp.Scope scope45 = compiler42.getTopScope();
        compiler42.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention47 = compiler42.defaultCodingConvention;
        compiler26.defaultCodingConvention = codingConvention47;
        compiler11.defaultCodingConvention = codingConvention47;
        com.google.javascript.jscomp.VariableMap variableMap50 = compiler11.getPropertyMap();
        compiler11.rebuildInputsFromModules();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange52 = compiler11.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange52);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator54 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.SourceFile sourceFile55 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node56 = compiler0.parse(sourceFile55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray18);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray18, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray19);
        org.junit.Assert.assertArrayEquals(jSModuleArray19, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNotNull(compilerOptions24);
        org.junit.Assert.assertNotNull(result25);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray33, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray34);
        org.junit.Assert.assertArrayEquals(jSModuleArray34, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig38);
        org.junit.Assert.assertNotNull(compilerOptions39);
        org.junit.Assert.assertNotNull(result40);
        org.junit.Assert.assertNotNull(compilerOptions41);
        org.junit.Assert.assertNull(scope45);
        org.junit.Assert.assertNotNull(codingConvention47);
        org.junit.Assert.assertNull(variableMap50);
        org.junit.Assert.assertNotNull(recentChange52);
        org.junit.Assert.assertNull(memoizedScopeCreator54);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        java.lang.String str5 = compiler0.getAstDotGraph();
        compiler0.initCompilerOptionsIfTesting();
        double double7 = compiler0.getProgress();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node17 = null;
        compiler16.prepareAst(node17);
        com.google.javascript.jscomp.Scope scope19 = compiler16.getTopScope();
        compiler16.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention21 = compiler16.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention21;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap23 = compiler0.getGlobalVarReferences();
        compiler0.setHasRegExpGlobalReferences(true);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList26 = compiler0.getInputsInOrder();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.check();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNull(scope19);
        org.junit.Assert.assertNotNull(codingConvention21);
        org.junit.Assert.assertNull(globalVarReferenceMap23);
        org.junit.Assert.assertNotNull(compilerInputList26);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator4 = compiler0.getTypedScopeCreator();
        java.lang.String str5 = compiler0.getAstDotGraph();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(memoizedScopeCreator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        com.google.javascript.rhino.Node node23 = null;
        compiler19.prepareAst(node23);
        boolean boolean25 = compiler19.precheck();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig26 = compiler19.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap28 = compiler27.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange29 = compiler27.recentChange;
        compiler19.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange29);
        com.google.javascript.jscomp.PerformanceTracker performanceTracker32 = compiler0.tracker;
        boolean boolean33 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker34 = compiler0.tracker;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(defaultPassConfig26);
        org.junit.Assert.assertNull(sourceMap28);
        org.junit.Assert.assertNotNull(recentChange29);
        org.junit.Assert.assertNull(performanceTracker32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(performanceTracker34);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.VariableMap variableMap3 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap4 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.VariableMap variableMap5 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("");
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler0.getPassConfig();
        org.junit.Assert.assertNull(variableMap3);
        org.junit.Assert.assertNull(globalVarReferenceMap4);
        org.junit.Assert.assertNull(variableMap5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(passConfig8);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        com.google.javascript.jscomp.JsAst jsAst5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.addNewScript(jsAst5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        compiler0.addToDebugLog("{SyntheticVarsDeclar}");
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions8 = compiler0.options;
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        com.google.javascript.rhino.Node node13 = null;
        compiler9.prepareAst(node13);
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler9.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph16 = compiler9.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node18 = null;
        compiler17.prepareAst(node18);
        com.google.javascript.jscomp.Scope scope20 = compiler17.getTopScope();
        com.google.javascript.rhino.Node node21 = null;
        compiler17.prepareAst(node21);
        com.google.javascript.jscomp.VariableMap variableMap23 = compiler17.getVariableMap();
        com.google.javascript.rhino.Node node25 = compiler17.parseTestCode("[hi!]");
        java.lang.String str26 = compiler9.toSource(node25);
        compiler0.externsRoot = node25;
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState29 = compiler0.getState();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.JsAst jsAst31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = compiler0.addNewSourceAst(jsAst31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(compilerOptions8);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNull(jSModuleGraph16);
        org.junit.Assert.assertNull(scope20);
        org.junit.Assert.assertNull(variableMap23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(intermediateState29);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.rhino.Node node18 = compiler0.jsRoot;
        com.google.javascript.rhino.Node node20 = compiler0.parseTestCode("[singleton]");
        boolean boolean21 = compiler0.hasErrors();
        boolean boolean22 = compiler0.acceptConstKeyword();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        java.lang.String str4 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(errorReporter2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(diagnosticGroups5);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        boolean boolean28 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler0.tracker;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph30 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        com.google.javascript.rhino.Node node35 = null;
        compiler31.prepareAst(node35);
        com.google.javascript.jscomp.VariableMap variableMap37 = compiler31.getVariableMap();
        com.google.javascript.jscomp.Scope scope38 = compiler31.getTopScope();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        compiler39.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler39.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap44 = compiler43.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap45 = compiler43.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler46 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node47 = null;
        compiler46.prepareAst(node47);
        com.google.javascript.jscomp.Scope scope49 = compiler46.getTopScope();
        com.google.javascript.rhino.Node node50 = null;
        compiler46.prepareAst(node50);
        com.google.javascript.jscomp.VariableMap variableMap52 = compiler46.getVariableMap();
        com.google.javascript.rhino.Node node54 = compiler46.parseTestCode("[hi!]");
        java.lang.String str55 = compiler43.toSource(node54);
        compiler39.jsRoot = node54;
        java.lang.String str57 = compiler31.toSource(node54);
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups58 = compiler31.getDiagnosticGroups();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap59 = compiler31.getGlobalVarReferences();
        boolean boolean60 = compiler31.isInliningForbidden();
        boolean boolean61 = compiler31.isInliningForbidden();
        com.google.javascript.jscomp.Tracer tracer63 = compiler31.newTracer("[hi!]");
        compiler0.stopTracer(tracer63, "{SyntheticVarsDeclar}");
        compiler0.initCompilerOptionsIfTesting();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNull(jSModuleGraph30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNull(variableMap37);
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(variableMap44);
        org.junit.Assert.assertNull(globalVarReferenceMap45);
        org.junit.Assert.assertNull(scope49);
        org.junit.Assert.assertNull(variableMap52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(diagnosticGroups58);
        org.junit.Assert.assertNull(globalVarReferenceMap59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(tracer63);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange4 = compiler0.recentChange;
        com.google.javascript.jscomp.CompilerOptions compilerOptions5 = compiler0.options;
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        boolean boolean8 = compiler0.precheck();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNotNull(recentChange4);
        org.junit.Assert.assertNull(compilerOptions5);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.disableThreads();
        com.google.javascript.rhino.Node node4 = compiler0.getRoot();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        double double6 = compiler0.getProgress();
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler26.getVariableMap();
        com.google.javascript.jscomp.Scope scope33 = compiler26.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap37 = compiler34.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler38.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap40 = compiler38.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.prepareAst(node42);
        com.google.javascript.jscomp.Scope scope44 = compiler41.getTopScope();
        com.google.javascript.rhino.Node node45 = null;
        compiler41.prepareAst(node45);
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler41.getVariableMap();
        com.google.javascript.rhino.Node node49 = compiler41.parseTestCode("[hi!]");
        java.lang.String str50 = compiler38.toSource(node49);
        compiler34.jsRoot = node49;
        java.lang.String str52 = compiler26.toSource(node49);
        compiler0.externsRoot = node49;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler54.getPropertyMap();
        com.google.javascript.rhino.Node node56 = compiler54.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap57 = compiler54.getFunctionalInformationMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker58 = compiler54.tracker;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState59 = compiler54.getState();
        compiler0.setState(intermediateState59);
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(globalVarReferenceMap37);
        org.junit.Assert.assertNull(variableMap39);
        org.junit.Assert.assertNull(globalVarReferenceMap40);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNull(variableMap47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(variableMap55);
        org.junit.Assert.assertNull(node56);
        org.junit.Assert.assertNull(functionInformationMap57);
        org.junit.Assert.assertNull(performanceTracker58);
        org.junit.Assert.assertNotNull(intermediateState59);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler7.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler7.recentChange;
        double double10 = compiler7.getProgress();
        com.google.javascript.rhino.Node node12 = compiler7.parseTestCode("Unversioned directory");
        compiler0.externAndJsRoot = node12;
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState15 = compiler0.getState();
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState16 = compiler0.getState();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNotNull(recentChange9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(intermediateState15);
        org.junit.Assert.assertNotNull(intermediateState16);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.rhino.Node node2 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        compiler0.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap22 = compiler21.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler21.recentChange;
        compiler6.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        com.google.javascript.jscomp.CodingConvention codingConvention25 = compiler6.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap27 = compiler26.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap28 = compiler26.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node30 = null;
        compiler29.prepareAst(node30);
        com.google.javascript.jscomp.Scope scope32 = compiler29.getTopScope();
        com.google.javascript.rhino.Node node33 = null;
        compiler29.prepareAst(node33);
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler29.getVariableMap();
        com.google.javascript.rhino.Node node37 = compiler29.parseTestCode("[hi!]");
        java.lang.String str38 = compiler26.toSource(node37);
        boolean boolean39 = compiler26.hasErrors();
        java.lang.String str40 = compiler26.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.prepareAst(node42);
        com.google.javascript.jscomp.Scope scope44 = compiler41.getTopScope();
        com.google.javascript.rhino.Node node45 = null;
        compiler41.prepareAst(node45);
        boolean boolean47 = compiler41.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray48 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray49 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        compiler50.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig53 = compiler50.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler50.newCompilerOptions();
        com.google.javascript.jscomp.Result result55 = compiler41.compile(jSSourceFileArray48, jSModuleArray49, compilerOptions54);
        com.google.javascript.jscomp.CompilerOptions compilerOptions56 = compiler41.getOptions();
        com.google.javascript.jscomp.Compiler compiler57 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node58 = null;
        compiler57.prepareAst(node58);
        com.google.javascript.jscomp.Scope scope60 = compiler57.getTopScope();
        com.google.javascript.rhino.Node node61 = null;
        compiler57.prepareAst(node61);
        com.google.javascript.jscomp.VariableMap variableMap63 = compiler57.getVariableMap();
        com.google.javascript.rhino.Node node65 = compiler57.parseTestCode("[hi!]");
        compiler41.externAndJsRoot = node65;
        compiler26.jsRoot = node65;
        java.lang.String str68 = compiler6.toSource(node65);
        compiler0.externAndJsRoot = node65;
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(node2);
        org.junit.Assert.assertNull(functionInformationMap3);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(sourceMap22);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertNotNull(codingConvention25);
        org.junit.Assert.assertNull(variableMap27);
        org.junit.Assert.assertNull(globalVarReferenceMap28);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(variableMap35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray48);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray48, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray49);
        org.junit.Assert.assertArrayEquals(jSModuleArray49, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig53);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(result55);
        org.junit.Assert.assertNotNull(compilerOptions56);
        org.junit.Assert.assertNull(scope60);
        org.junit.Assert.assertNull(variableMap63);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups5 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler6 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node7 = null;
        compiler6.prepareAst(node7);
        com.google.javascript.jscomp.Scope scope9 = compiler6.getTopScope();
        com.google.javascript.rhino.Node node10 = null;
        compiler6.prepareAst(node10);
        boolean boolean12 = compiler6.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray14 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        compiler15.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig18 = compiler15.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler15.newCompilerOptions();
        com.google.javascript.jscomp.Result result20 = compiler6.compile(jSSourceFileArray13, jSModuleArray14, compilerOptions19);
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler23 = null;
        compiler22.removeChangeHandler(codeChangeHandler23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler22.getPropertyMap();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.CompilerOptions compilerOptions29 = null;
        compiler26.options = compilerOptions29;
        boolean boolean31 = compiler26.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray32 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node34 = null;
        compiler33.prepareAst(node34);
        com.google.javascript.jscomp.Scope scope36 = compiler33.getTopScope();
        com.google.javascript.rhino.Node node37 = null;
        compiler33.prepareAst(node37);
        boolean boolean39 = compiler33.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray40 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray41 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        compiler42.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig45 = compiler42.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions46 = compiler42.newCompilerOptions();
        com.google.javascript.jscomp.Result result47 = compiler33.compile(jSSourceFileArray40, jSModuleArray41, compilerOptions46);
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        compiler26.init(jSSourceFileArray32, jSModuleArray41, compilerOptions52);
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node55 = null;
        compiler54.prepareAst(node55);
        com.google.javascript.jscomp.Scope scope57 = compiler54.getTopScope();
        com.google.javascript.rhino.Node node58 = null;
        compiler54.prepareAst(node58);
        boolean boolean60 = compiler54.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray61 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray62 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        compiler63.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig66 = compiler63.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.newCompilerOptions();
        com.google.javascript.jscomp.Result result68 = compiler54.compile(jSSourceFileArray61, jSModuleArray62, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler69 = new com.google.javascript.jscomp.Compiler();
        compiler69.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig72 = compiler69.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions73 = compiler69.newCompilerOptions();
        compiler22.init(jSSourceFileArray32, jSSourceFileArray61, compilerOptions73);
        compiler0.options = compilerOptions73;
        com.google.javascript.jscomp.JSError[] jSErrorArray76 = compiler0.getMessages();
        int int77 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler78 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node79 = null;
        compiler78.prepareAst(node79);
        com.google.javascript.jscomp.Scope scope81 = compiler78.getTopScope();
        compiler78.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention83 = compiler78.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode84 = compiler78.languageMode();
        com.google.javascript.jscomp.Compiler compiler85 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap86 = compiler85.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange87 = compiler85.recentChange;
        double double88 = compiler85.getProgress();
        com.google.javascript.rhino.Node node90 = compiler85.parseTestCode("Unversioned directory");
        compiler78.externAndJsRoot = node90;
        com.google.javascript.jscomp.ErrorManager errorManager92 = compiler78.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler93 = new com.google.javascript.jscomp.Compiler(errorManager92);
        com.google.javascript.jscomp.Compiler compiler94 = new com.google.javascript.jscomp.Compiler(errorManager92);
        compiler0.setErrorManager(errorManager92);
        boolean boolean96 = compiler0.isInliningForbidden();
        org.junit.Assert.assertNotNull(diagnosticGroups5);
        org.junit.Assert.assertNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray14);
        org.junit.Assert.assertArrayEquals(jSModuleArray14, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(result20);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray32);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray32, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray40);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray40, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray41);
        org.junit.Assert.assertArrayEquals(jSModuleArray41, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig45);
        org.junit.Assert.assertNotNull(compilerOptions46);
        org.junit.Assert.assertNotNull(result47);
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNull(scope57);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray61);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray61, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray62);
        org.junit.Assert.assertArrayEquals(jSModuleArray62, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig66);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(result68);
        org.junit.Assert.assertNotNull(defaultPassConfig72);
        org.junit.Assert.assertNotNull(compilerOptions73);
        org.junit.Assert.assertNotNull(jSErrorArray76);
        org.junit.Assert.assertArrayEquals(jSErrorArray76, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNull(scope81);
        org.junit.Assert.assertNotNull(codingConvention83);
        org.junit.Assert.assertTrue("'" + languageMode84 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode84.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap86);
        org.junit.Assert.assertNotNull(recentChange87);
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 0.0d + "'", double88 == 0.0d);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertNotNull(errorManager92);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.Compiler compiler4 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node5 = null;
        compiler4.prepareAst(node5);
        com.google.javascript.jscomp.Scope scope7 = compiler4.getTopScope();
        com.google.javascript.rhino.Node node8 = null;
        compiler4.prepareAst(node8);
        boolean boolean10 = compiler4.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray11 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray12 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        compiler13.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig16 = compiler13.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler13.newCompilerOptions();
        com.google.javascript.jscomp.Result result18 = compiler4.compile(jSSourceFileArray11, jSModuleArray12, compilerOptions17);
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler4.getOptions();
        compiler0.initOptions(compilerOptions19);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap21 = compiler0.getGlobalVarReferences();
        com.google.javascript.rhino.InputId inputId22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput23 = compiler0.getInput(inputId22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray11);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray11, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray12);
        org.junit.Assert.assertArrayEquals(jSModuleArray12, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig16);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(result18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNull(globalVarReferenceMap21);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler8.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange10 = compiler8.recentChange;
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler11.getPropertyMap();
        com.google.javascript.rhino.Node node14 = compiler11.parseTestCode("2569/09/27 15:58");
        java.lang.String str15 = compiler8.toSource(node14);
        compiler0.externsRoot = node14;
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder17 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        com.google.javascript.rhino.Node node23 = null;
        compiler19.prepareAst(node23);
        boolean boolean25 = compiler19.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray26 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray27 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        compiler28.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig31 = compiler28.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions32 = compiler28.newCompilerOptions();
        com.google.javascript.jscomp.Result result33 = compiler19.compile(jSSourceFileArray26, jSModuleArray27, compilerOptions32);
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler19.getOptions();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.prepareAst(node36);
        com.google.javascript.jscomp.Scope scope38 = compiler35.getTopScope();
        compiler35.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler35.defaultCodingConvention;
        compiler19.defaultCodingConvention = codingConvention40;
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap42 = compiler19.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node44 = null;
        compiler43.prepareAst(node44);
        com.google.javascript.jscomp.Scope scope46 = compiler43.getTopScope();
        com.google.javascript.rhino.Node node47 = null;
        compiler43.prepareAst(node47);
        com.google.javascript.jscomp.VariableMap variableMap49 = compiler43.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph50 = compiler43.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.prepareAst(node52);
        com.google.javascript.jscomp.Scope scope54 = compiler51.getTopScope();
        com.google.javascript.rhino.Node node55 = null;
        compiler51.prepareAst(node55);
        com.google.javascript.jscomp.VariableMap variableMap57 = compiler51.getVariableMap();
        com.google.javascript.rhino.Node node59 = compiler51.parseTestCode("[hi!]");
        java.lang.String str60 = compiler43.toSource(node59);
        java.lang.String str61 = compiler19.toSource(node59);
        compiler0.toSource(codeBuilder17, 100, node59);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList63 = compiler0.getInputsForTesting();
        compiler0.addToDebugLog("");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNotNull(recentChange10);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray26);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray26, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray27);
        org.junit.Assert.assertArrayEquals(jSModuleArray27, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig31);
        org.junit.Assert.assertNotNull(compilerOptions32);
        org.junit.Assert.assertNotNull(result33);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertNull(globalVarReferenceMap42);
        org.junit.Assert.assertNull(scope46);
        org.junit.Assert.assertNull(variableMap49);
        org.junit.Assert.assertNull(jSModuleGraph50);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNull(variableMap57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(compilerInputList63);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        com.google.javascript.jscomp.PassConfig passConfig28 = compiler0.createPassConfigInternal();
        int int29 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap31 = compiler30.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange32 = compiler30.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups33 = compiler30.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig34 = compiler30.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList35 = compiler30.getInputsForTesting();
        com.google.javascript.rhino.Node node37 = compiler30.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.CompilerOptions compilerOptions38 = compiler30.options;
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.prepareAst(node40);
        com.google.javascript.jscomp.Scope scope42 = compiler39.getTopScope();
        com.google.javascript.rhino.Node node43 = null;
        compiler39.prepareAst(node43);
        com.google.javascript.jscomp.VariableMap variableMap45 = compiler39.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph46 = compiler39.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node48 = null;
        compiler47.prepareAst(node48);
        com.google.javascript.jscomp.Scope scope50 = compiler47.getTopScope();
        com.google.javascript.rhino.Node node51 = null;
        compiler47.prepareAst(node51);
        com.google.javascript.jscomp.VariableMap variableMap53 = compiler47.getVariableMap();
        com.google.javascript.rhino.Node node55 = compiler47.parseTestCode("[hi!]");
        java.lang.String str56 = compiler39.toSource(node55);
        compiler30.externsRoot = node55;
        compiler0.externsRoot = node55;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(passConfig28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNull(sourceMap31);
        org.junit.Assert.assertNotNull(recentChange32);
        org.junit.Assert.assertNotNull(diagnosticGroups33);
        org.junit.Assert.assertNotNull(defaultPassConfig34);
        org.junit.Assert.assertNull(compilerInputList35);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(compilerOptions38);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertNull(variableMap45);
        org.junit.Assert.assertNull(jSModuleGraph46);
        org.junit.Assert.assertNull(scope50);
        org.junit.Assert.assertNull(variableMap53);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler0.getModuleGraph();
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("[[[singleton]]]", (int) (short) 0);
        java.lang.Exception exception11 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.throwInternalError("[[singleton]]", exception11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?[[singleton]]");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNull(region9);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.CompilerOptions compilerOptions3 = null;
        compiler0.options = compilerOptions3;
        boolean boolean5 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray6 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.Scope scope10 = compiler7.getTopScope();
        com.google.javascript.rhino.Node node11 = null;
        compiler7.prepareAst(node11);
        boolean boolean13 = compiler7.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray14 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray15 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        compiler16.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig19 = compiler16.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.newCompilerOptions();
        com.google.javascript.jscomp.Result result21 = compiler7.compile(jSSourceFileArray14, jSModuleArray15, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        compiler22.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig25 = compiler22.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.newCompilerOptions();
        compiler0.init(jSSourceFileArray6, jSModuleArray15, compilerOptions26);
        boolean boolean28 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker29 = compiler0.tracker;
        com.google.javascript.rhino.Node node31 = compiler0.parseSyntheticCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node33 = null;
        compiler32.prepareAst(node33);
        com.google.javascript.jscomp.Scope scope35 = compiler32.getTopScope();
        com.google.javascript.rhino.Node node36 = null;
        compiler32.prepareAst(node36);
        boolean boolean38 = compiler32.precheck();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList39 = compiler32.getExternsForTesting();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph40 = compiler32.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig41 = compiler32.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node43 = compiler32.parseTestCode("[2569/09/27 15:58]");
        java.lang.String str44 = compiler0.toSource(node43);
        com.google.javascript.jscomp.JSError[] jSErrorArray45 = compiler0.getWarnings();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray6);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray6, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray14);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray14, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray15);
        org.junit.Assert.assertArrayEquals(jSModuleArray15, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(result21);
        org.junit.Assert.assertNotNull(defaultPassConfig25);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(performanceTracker29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertNull(scope35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNull(compilerInputList39);
        org.junit.Assert.assertNull(jSModuleGraph40);
        org.junit.Assert.assertNotNull(defaultPassConfig41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(jSErrorArray45);
        org.junit.Assert.assertArrayEquals(jSErrorArray45, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.rhino.head.ErrorReporter errorReporter2 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.PassConfig passConfig4 = compiler0.createPassConfigInternal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = compiler0.parseSyntheticCode("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a source must have a name");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(errorReporter2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(passConfig4);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig2 = compiler0.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = compiler0.parseSyntheticCode("[Unversioned directory]", "Unversioned directory");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(passConfig2);
        org.junit.Assert.assertNull(functionInformationMap3);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.SourceMap sourceMap39 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.prepareAst(node41);
        com.google.javascript.jscomp.Scope scope43 = compiler40.getTopScope();
        compiler40.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention45 = compiler40.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode46 = compiler40.languageMode();
        com.google.javascript.jscomp.Compiler compiler47 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap48 = compiler47.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange49 = compiler47.recentChange;
        double double50 = compiler47.getProgress();
        com.google.javascript.rhino.Node node52 = compiler47.parseTestCode("Unversioned directory");
        compiler40.externAndJsRoot = node52;
        compiler0.jsRoot = node52;
        boolean boolean55 = compiler0.isTypeCheckingEnabled();
        compiler0.resetUniqueNameId();
        compiler0.setProgress(1.0d);
        com.google.javascript.jscomp.CssRenamingMap cssRenamingMap59 = compiler0.getCssRenamingMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier60 = compiler0.getUniqueNameIdSupplier();
        java.util.Map<com.google.javascript.jscomp.Scope.Var, com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection> varMap61 = null;
        com.google.javascript.jscomp.Compiler compiler62 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap63 = compiler62.getPropertyMap();
        com.google.javascript.rhino.Node node64 = compiler62.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap65 = compiler62.getFunctionalInformationMap();
        compiler62.addToDebugLog("[[[singleton]]]");
        com.google.javascript.jscomp.Compiler compiler68 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap69 = compiler68.getPropertyMap();
        com.google.javascript.rhino.Node node70 = compiler68.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap71 = compiler68.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange72 = compiler68.recentChange;
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        compiler73.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap76 = compiler73.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler77 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap78 = compiler77.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap79 = compiler77.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node81 = null;
        compiler80.prepareAst(node81);
        com.google.javascript.jscomp.Scope scope83 = compiler80.getTopScope();
        com.google.javascript.rhino.Node node84 = null;
        compiler80.prepareAst(node84);
        com.google.javascript.jscomp.VariableMap variableMap86 = compiler80.getVariableMap();
        com.google.javascript.rhino.Node node88 = compiler80.parseTestCode("[hi!]");
        java.lang.String str89 = compiler77.toSource(node88);
        compiler73.jsRoot = node88;
        compiler68.externsRoot = node88;
        compiler62.externsRoot = node88;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.updateGlobalVarReferences(varMap61, node88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(sourceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNotNull(codingConvention45);
        org.junit.Assert.assertTrue("'" + languageMode46 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode46.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap48);
        org.junit.Assert.assertNotNull(recentChange49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(cssRenamingMap59);
        org.junit.Assert.assertNotNull(strSupplier60);
        org.junit.Assert.assertNull(variableMap63);
        org.junit.Assert.assertNull(node64);
        org.junit.Assert.assertNull(functionInformationMap65);
        org.junit.Assert.assertNull(variableMap69);
        org.junit.Assert.assertNull(node70);
        org.junit.Assert.assertNull(functionInformationMap71);
        org.junit.Assert.assertNotNull(recentChange72);
        org.junit.Assert.assertNull(globalVarReferenceMap76);
        org.junit.Assert.assertNull(variableMap78);
        org.junit.Assert.assertNull(globalVarReferenceMap79);
        org.junit.Assert.assertNull(scope83);
        org.junit.Assert.assertNull(variableMap86);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
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
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder14 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int15 = codeBuilder14.getLineIndex();
        int int16 = codeBuilder14.getLineIndex();
        int int17 = codeBuilder14.getColumnIndex();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap20 = compiler19.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange21 = compiler19.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups22 = compiler19.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig23 = compiler19.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList24 = compiler19.getInputsForTesting();
        com.google.javascript.rhino.Node node26 = compiler19.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder27 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int28 = codeBuilder27.getLength();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node31 = null;
        compiler30.prepareAst(node31);
        com.google.javascript.jscomp.Scope scope33 = compiler30.getTopScope();
        compiler30.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention35 = compiler30.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode36 = compiler30.languageMode();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap38 = compiler37.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange39 = compiler37.recentChange;
        double double40 = compiler37.getProgress();
        com.google.javascript.rhino.Node node42 = compiler37.parseTestCode("Unversioned directory");
        compiler30.externAndJsRoot = node42;
        compiler19.toSource(codeBuilder27, (int) (byte) 0, node42);
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap46 = compiler45.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange47 = compiler45.recentChange;
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap49 = compiler48.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange50 = compiler48.recentChange;
        double double51 = compiler48.getProgress();
        com.google.javascript.rhino.Node node53 = compiler48.parseTestCode("Unversioned directory");
        compiler45.externsRoot = node53;
        compiler19.externsRoot = node53;
        compiler0.toSource(codeBuilder14, 0, node53);
        com.google.javascript.jscomp.CodingConvention codingConvention57 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState58 = compiler0.getState();
        com.google.javascript.jscomp.JSError[] jSErrorArray59 = compiler0.getWarnings();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNull(sourceMap7);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNotNull(recentChange11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(sourceMap20);
        org.junit.Assert.assertNotNull(recentChange21);
        org.junit.Assert.assertNotNull(diagnosticGroups22);
        org.junit.Assert.assertNotNull(defaultPassConfig23);
        org.junit.Assert.assertNull(compilerInputList24);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNotNull(codingConvention35);
        org.junit.Assert.assertTrue("'" + languageMode36 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode36.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap38);
        org.junit.Assert.assertNotNull(recentChange39);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(sourceMap46);
        org.junit.Assert.assertNotNull(recentChange47);
        org.junit.Assert.assertNull(sourceMap49);
        org.junit.Assert.assertNotNull(recentChange50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertNotNull(codingConvention57);
        org.junit.Assert.assertNotNull(intermediateState58);
        org.junit.Assert.assertNotNull(jSErrorArray59);
        org.junit.Assert.assertArrayEquals(jSErrorArray59, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap8 = compiler0.getSourceMap();
        com.google.javascript.rhino.Node node9 = compiler0.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.rhino.head.ErrorReporter errorReporter11 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node13 = null;
        compiler12.prepareAst(node13);
        com.google.javascript.jscomp.Scope scope15 = compiler12.getTopScope();
        com.google.javascript.rhino.Node node16 = null;
        compiler12.prepareAst(node16);
        boolean boolean18 = compiler12.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray19 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray20 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        compiler21.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler21.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler21.newCompilerOptions();
        com.google.javascript.jscomp.Result result26 = compiler12.compile(jSSourceFileArray19, jSModuleArray20, compilerOptions25);
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler12.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap28 = compiler12.getVariableMap();
        java.lang.String str29 = compiler12.getAstDotGraph();
        boolean boolean30 = compiler12.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node32 = compiler12.parseTestCode("[]");
        com.google.javascript.jscomp.parsing.Config config33 = compiler12.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap35 = compiler34.getPropertyMap();
        com.google.javascript.rhino.Node node36 = compiler34.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap37 = compiler34.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange38 = compiler34.recentChange;
        compiler12.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange38);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange38);
        // The following exception was thrown during execution in test generation
        try {
            compiler0.removeTryCatchFinally();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(strSupplier10);
        org.junit.Assert.assertNotNull(errorReporter11);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray19);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray19, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray20);
        org.junit.Assert.assertArrayEquals(jSModuleArray20, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig24);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNotNull(result26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNull(variableMap28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(config33);
        org.junit.Assert.assertNull(variableMap35);
        org.junit.Assert.assertNull(node36);
        org.junit.Assert.assertNull(functionInformationMap37);
        org.junit.Assert.assertNotNull(recentChange38);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
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
        com.google.javascript.jscomp.ErrorManager errorManager10 = compiler0.getErrorManager();
        boolean boolean11 = compiler0.precheck();
        java.lang.String str12 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig13 = compiler0.ensureDefaultPassConfig();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config15 = compiler0.getParserConfig();
        org.junit.Assert.assertNull(sourceMap2);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertNotNull(errorReporter9);
        org.junit.Assert.assertNotNull(errorManager10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(defaultPassConfig13);
        org.junit.Assert.assertNotNull(config15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler3.getPropertyMap();
        com.google.javascript.rhino.Node node6 = compiler3.parseTestCode("2569/09/27 15:58");
        java.lang.String str7 = compiler0.toSource(node6);
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        boolean boolean14 = compiler8.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray15 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        compiler17.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig20 = compiler17.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions21 = compiler17.newCompilerOptions();
        com.google.javascript.jscomp.Result result22 = compiler8.compile(jSSourceFileArray15, jSModuleArray16, compilerOptions21);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.prepareAst(node24);
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator26 = compiler23.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = null;
        compiler27.options = compilerOptions30;
        boolean boolean32 = compiler27.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray33 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node35 = null;
        compiler34.prepareAst(node35);
        com.google.javascript.jscomp.Scope scope37 = compiler34.getTopScope();
        com.google.javascript.rhino.Node node38 = null;
        compiler34.prepareAst(node38);
        boolean boolean40 = compiler34.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray41 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray42 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        compiler43.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig46 = compiler43.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.newCompilerOptions();
        com.google.javascript.jscomp.Result result48 = compiler34.compile(jSSourceFileArray41, jSModuleArray42, compilerOptions47);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        compiler49.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig52 = compiler49.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions53 = compiler49.newCompilerOptions();
        compiler27.init(jSSourceFileArray33, jSModuleArray42, compilerOptions53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray55 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler56 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node57 = null;
        compiler56.prepareAst(node57);
        compiler56.addToDebugLog("[]");
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node62 = null;
        compiler61.prepareAst(node62);
        com.google.javascript.rhino.head.ErrorReporter errorReporter64 = compiler61.getDefaultErrorReporter();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap65 = compiler61.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler66 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap67 = compiler66.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange68 = compiler66.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups69 = compiler66.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig70 = compiler66.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList71 = compiler66.getInputsForTesting();
        com.google.javascript.rhino.Node node73 = compiler66.parseTestCode("2569/09/27 15:58");
        compiler66.addToDebugLog("[hi!]");
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler66.newCompilerOptions();
        compiler61.initOptions(compilerOptions76);
        compiler56.initOptions(compilerOptions76);
        compiler23.init(jSSourceFileArray33, jSModuleArray55, compilerOptions76);
        com.google.javascript.jscomp.Compiler compiler80 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap81 = compiler80.getSourceMap();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups82 = compiler80.getDiagnosticGroups();
        com.google.javascript.jscomp.CompilerOptions compilerOptions83 = compiler80.newCompilerOptions();
        compiler0.init(jSSourceFileArray15, jSModuleArray55, compilerOptions83);
        com.google.javascript.rhino.Node node85 = compiler0.jsRoot;
        com.google.javascript.jscomp.CodingConvention codingConvention86 = compiler0.defaultCodingConvention;
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNull(variableMap4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray15);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray15, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig20);
        org.junit.Assert.assertNotNull(compilerOptions21);
        org.junit.Assert.assertNotNull(result22);
        org.junit.Assert.assertNull(memoizedScopeCreator26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray33);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray33, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope37);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray41);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray41, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray42);
        org.junit.Assert.assertArrayEquals(jSModuleArray42, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig46);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(result48);
        org.junit.Assert.assertNotNull(defaultPassConfig52);
        org.junit.Assert.assertNotNull(compilerOptions53);
        org.junit.Assert.assertNotNull(jSModuleArray55);
        org.junit.Assert.assertArrayEquals(jSModuleArray55, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(errorReporter64);
        org.junit.Assert.assertNull(globalVarReferenceMap65);
        org.junit.Assert.assertNull(sourceMap67);
        org.junit.Assert.assertNotNull(recentChange68);
        org.junit.Assert.assertNotNull(diagnosticGroups69);
        org.junit.Assert.assertNotNull(defaultPassConfig70);
        org.junit.Assert.assertNull(compilerInputList71);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertNotNull(compilerOptions76);
        org.junit.Assert.assertNull(sourceMap81);
        org.junit.Assert.assertNotNull(diagnosticGroups82);
        org.junit.Assert.assertNotNull(compilerOptions83);
        org.junit.Assert.assertNull(node85);
        org.junit.Assert.assertNotNull(codingConvention86);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode6 = compiler0.languageMode();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap10 = compiler9.getSourceMap();
        compiler9.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap13 = compiler12.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler12.recentChange;
        compiler9.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange14);
        com.google.javascript.rhino.head.ErrorReporter errorReporter17 = compiler8.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler8.getErrorManager();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        compiler19.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap25 = compiler24.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange26 = compiler24.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups27 = compiler24.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig28 = compiler24.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList29 = compiler24.getInputsForTesting();
        com.google.javascript.rhino.Node node31 = compiler24.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder32 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int33 = codeBuilder32.getLength();
        com.google.javascript.jscomp.Compiler compiler35 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node36 = null;
        compiler35.prepareAst(node36);
        com.google.javascript.jscomp.Scope scope38 = compiler35.getTopScope();
        compiler35.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention40 = compiler35.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode41 = compiler35.languageMode();
        com.google.javascript.jscomp.Compiler compiler42 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap43 = compiler42.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler42.recentChange;
        double double45 = compiler42.getProgress();
        com.google.javascript.rhino.Node node47 = compiler42.parseTestCode("Unversioned directory");
        compiler35.externAndJsRoot = node47;
        compiler24.toSource(codeBuilder32, (int) (byte) 0, node47);
        com.google.javascript.jscomp.Compiler compiler51 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node52 = null;
        compiler51.prepareAst(node52);
        com.google.javascript.jscomp.Scope scope54 = compiler51.getTopScope();
        com.google.javascript.rhino.Node node55 = null;
        compiler51.prepareAst(node55);
        com.google.javascript.jscomp.VariableMap variableMap57 = compiler51.getVariableMap();
        com.google.javascript.rhino.Node node59 = compiler51.parseTestCode("[hi!]");
        compiler19.toSource(codeBuilder32, (int) (byte) 0, node59);
        java.lang.String str61 = compiler8.toSource(node59);
        compiler0.jsRoot = node59;
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node64 = null;
        compiler63.prepareAst(node64);
        com.google.javascript.jscomp.Scope scope66 = compiler63.getTopScope();
        compiler63.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention68 = compiler63.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention68;
        compiler0.processDefines();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertTrue("'" + languageMode6 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode6.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(sourceMap10);
        org.junit.Assert.assertNull(sourceMap13);
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertNotNull(errorReporter17);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(sourceMap25);
        org.junit.Assert.assertNotNull(recentChange26);
        org.junit.Assert.assertNotNull(diagnosticGroups27);
        org.junit.Assert.assertNotNull(defaultPassConfig28);
        org.junit.Assert.assertNull(compilerInputList29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(scope38);
        org.junit.Assert.assertNotNull(codingConvention40);
        org.junit.Assert.assertTrue("'" + languageMode41 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode41.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap43);
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNull(scope54);
        org.junit.Assert.assertNull(variableMap57);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNull(scope66);
        org.junit.Assert.assertNotNull(codingConvention68);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap1 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap2 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler3 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node4 = null;
        compiler3.prepareAst(node4);
        com.google.javascript.jscomp.Scope scope6 = compiler3.getTopScope();
        com.google.javascript.rhino.Node node7 = null;
        compiler3.prepareAst(node7);
        com.google.javascript.jscomp.VariableMap variableMap9 = compiler3.getVariableMap();
        com.google.javascript.rhino.Node node11 = compiler3.parseTestCode("[hi!]");
        java.lang.String str12 = compiler0.toSource(node11);
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList13 = compiler0.getExternsForTesting();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(variableMap1);
        org.junit.Assert.assertNull(globalVarReferenceMap2);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(variableMap9);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(compilerInputList13);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph7 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node9 = null;
        compiler8.prepareAst(node9);
        com.google.javascript.jscomp.Scope scope11 = compiler8.getTopScope();
        com.google.javascript.rhino.Node node12 = null;
        compiler8.prepareAst(node12);
        com.google.javascript.jscomp.VariableMap variableMap14 = compiler8.getVariableMap();
        com.google.javascript.rhino.Node node16 = compiler8.parseTestCode("[hi!]");
        java.lang.String str17 = compiler0.toSource(node16);
        com.google.javascript.jscomp.PassConfig passConfig18 = compiler0.getPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions19 = compiler0.newCompilerOptions();
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler0.getOptions();
        compiler0.setProgress((double) '#');
        java.lang.String str23 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.parsing.Config config24 = compiler0.getParserConfig();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(jSModuleGraph7);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNull(variableMap14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(passConfig18);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(config24);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        compiler0.addToDebugLog("[hi!]");
        com.google.common.base.Supplier<java.lang.String> strSupplier10 = compiler0.getUniqueNameIdSupplier();
        compiler0.addToDebugLog("Unversioned directory");
        com.google.javascript.jscomp.JsAst jsAst13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = compiler0.addNewSourceAst(jsAst13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(strSupplier10);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.MemoizedScopeCreator memoizedScopeCreator6 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        com.google.javascript.rhino.head.ErrorReporter errorReporter8 = compiler0.getDefaultErrorReporter();
        com.google.javascript.jscomp.JSError jSError9 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNull(memoizedScopeCreator6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNotNull(errorReporter8);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.Compiler compiler15 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node16 = null;
        compiler15.prepareAst(node16);
        com.google.javascript.jscomp.Scope scope18 = compiler15.getTopScope();
        com.google.javascript.rhino.Node node19 = null;
        compiler15.prepareAst(node19);
        boolean boolean21 = compiler15.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray22 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray23 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler24 = new com.google.javascript.jscomp.Compiler();
        compiler24.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig27 = compiler24.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler24.newCompilerOptions();
        com.google.javascript.jscomp.Result result29 = compiler15.compile(jSSourceFileArray22, jSModuleArray23, compilerOptions28);
        com.google.javascript.jscomp.CompilerOptions compilerOptions30 = compiler15.getOptions();
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = null;
        compiler31.prepareAst(node32);
        com.google.javascript.jscomp.Scope scope34 = compiler31.getTopScope();
        compiler31.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention36 = compiler31.defaultCodingConvention;
        compiler15.defaultCodingConvention = codingConvention36;
        compiler0.defaultCodingConvention = codingConvention36;
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler0.getPropertyMap();
        compiler0.initCompilerOptionsIfTesting();
        java.lang.String str41 = compiler0.toSource();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray22);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray22, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray23);
        org.junit.Assert.assertArrayEquals(jSModuleArray23, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(compilerOptions30);
        org.junit.Assert.assertNull(scope34);
        org.junit.Assert.assertNotNull(codingConvention36);
        org.junit.Assert.assertNull(variableMap39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        double double7 = compiler0.getProgress();
        com.google.javascript.jscomp.PassConfig passConfig8 = compiler0.getPassConfig();
        com.google.javascript.rhino.Node node9 = compiler0.externsRoot;
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(passConfig8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.jscomp.Scope scope7 = compiler0.getTopScope();
        boolean boolean8 = compiler0.precheck();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node10 = null;
        compiler9.prepareAst(node10);
        com.google.javascript.jscomp.Scope scope12 = compiler9.getTopScope();
        compiler9.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention14 = compiler9.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode15 = compiler9.languageMode();
        compiler9.resetUniqueNameId();
        com.google.javascript.jscomp.SourceMap sourceMap17 = compiler9.getSourceMap();
        com.google.javascript.rhino.Node node18 = compiler9.getRoot();
        com.google.common.base.Supplier<java.lang.String> strSupplier19 = compiler9.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap21 = compiler20.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap22 = compiler20.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node24 = null;
        compiler23.prepareAst(node24);
        com.google.javascript.jscomp.Scope scope26 = compiler23.getTopScope();
        com.google.javascript.rhino.Node node27 = null;
        compiler23.prepareAst(node27);
        com.google.javascript.jscomp.VariableMap variableMap29 = compiler23.getVariableMap();
        com.google.javascript.rhino.Node node31 = compiler23.parseTestCode("[hi!]");
        java.lang.String str32 = compiler20.toSource(node31);
        compiler9.jsRoot = node31;
        compiler0.externsRoot = node31;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.processDefines();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNotNull(codingConvention14);
        org.junit.Assert.assertTrue("'" + languageMode15 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode15.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(strSupplier19);
        org.junit.Assert.assertNull(variableMap21);
        org.junit.Assert.assertNull(globalVarReferenceMap22);
        org.junit.Assert.assertNull(scope26);
        org.junit.Assert.assertNull(variableMap29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList5 = compiler0.getInputsForTesting();
        com.google.javascript.rhino.Node node7 = compiler0.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder8 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        int int9 = codeBuilder8.getLength();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node12 = null;
        compiler11.prepareAst(node12);
        com.google.javascript.jscomp.Scope scope14 = compiler11.getTopScope();
        compiler11.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention16 = compiler11.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode17 = compiler11.languageMode();
        com.google.javascript.jscomp.Compiler compiler18 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap19 = compiler18.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange20 = compiler18.recentChange;
        double double21 = compiler18.getProgress();
        com.google.javascript.rhino.Node node23 = compiler18.parseTestCode("Unversioned directory");
        compiler11.externAndJsRoot = node23;
        compiler0.toSource(codeBuilder8, (int) (byte) 0, node23);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler26.getVariableMap();
        com.google.javascript.jscomp.Scope scope33 = compiler26.getTopScope();
        com.google.javascript.jscomp.Compiler compiler34 = new com.google.javascript.jscomp.Compiler();
        compiler34.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap37 = compiler34.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler38 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap39 = compiler38.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap40 = compiler38.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node42 = null;
        compiler41.prepareAst(node42);
        com.google.javascript.jscomp.Scope scope44 = compiler41.getTopScope();
        com.google.javascript.rhino.Node node45 = null;
        compiler41.prepareAst(node45);
        com.google.javascript.jscomp.VariableMap variableMap47 = compiler41.getVariableMap();
        com.google.javascript.rhino.Node node49 = compiler41.parseTestCode("[hi!]");
        java.lang.String str50 = compiler38.toSource(node49);
        compiler34.jsRoot = node49;
        java.lang.String str52 = compiler26.toSource(node49);
        compiler0.externsRoot = node49;
        com.google.javascript.jscomp.JSError[] jSErrorArray54 = compiler0.getWarnings();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.JSModuleGraph jSModuleGraph55 = compiler0.getDegenerateModuleGraph();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNull(compilerInputList5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(scope14);
        org.junit.Assert.assertNotNull(codingConvention16);
        org.junit.Assert.assertTrue("'" + languageMode17 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode17.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(sourceMap19);
        org.junit.Assert.assertNotNull(recentChange20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNull(scope33);
        org.junit.Assert.assertNull(globalVarReferenceMap37);
        org.junit.Assert.assertNull(variableMap39);
        org.junit.Assert.assertNull(globalVarReferenceMap40);
        org.junit.Assert.assertNull(scope44);
        org.junit.Assert.assertNull(variableMap47);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(jSErrorArray54);
        org.junit.Assert.assertArrayEquals(jSErrorArray54, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.addToDebugLog("[]");
        com.google.javascript.rhino.Node node5 = compiler0.externsRoot;
        compiler0.reportCodeChange();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = compiler0.getSourceLine("[[]]", 25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap1 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange2 = compiler0.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups3 = compiler0.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig4 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.rhino.Node node6 = compiler0.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node8 = null;
        compiler7.prepareAst(node8);
        com.google.javascript.jscomp.CompilerOptions compilerOptions10 = null;
        compiler7.options = compilerOptions10;
        boolean boolean12 = compiler7.hasRegExpGlobalReferences();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node15 = null;
        compiler14.prepareAst(node15);
        com.google.javascript.jscomp.Scope scope17 = compiler14.getTopScope();
        com.google.javascript.rhino.Node node18 = null;
        compiler14.prepareAst(node18);
        boolean boolean20 = compiler14.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray21 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray22 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        compiler23.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig26 = compiler23.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler23.newCompilerOptions();
        com.google.javascript.jscomp.Result result28 = compiler14.compile(jSSourceFileArray21, jSModuleArray22, compilerOptions27);
        com.google.javascript.jscomp.Compiler compiler29 = new com.google.javascript.jscomp.Compiler();
        compiler29.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig32 = compiler29.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions33 = compiler29.newCompilerOptions();
        compiler7.init(jSSourceFileArray13, jSModuleArray22, compilerOptions33);
        com.google.javascript.jscomp.PassConfig passConfig35 = compiler7.createPassConfigInternal();
        com.google.javascript.jscomp.Compiler compiler36 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node37 = null;
        compiler36.prepareAst(node37);
        com.google.javascript.jscomp.Scope scope39 = compiler36.getTopScope();
        com.google.javascript.rhino.Node node40 = null;
        compiler36.prepareAst(node40);
        boolean boolean42 = compiler36.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray44 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler45 = new com.google.javascript.jscomp.Compiler();
        compiler45.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig48 = compiler45.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions49 = compiler45.newCompilerOptions();
        com.google.javascript.jscomp.Result result50 = compiler36.compile(jSSourceFileArray43, jSModuleArray44, compilerOptions49);
        com.google.javascript.jscomp.CompilerOptions compilerOptions51 = compiler36.getOptions();
        com.google.javascript.jscomp.Compiler compiler52 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node53 = null;
        compiler52.prepareAst(node53);
        com.google.javascript.jscomp.Scope scope55 = compiler52.getTopScope();
        compiler52.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodingConvention codingConvention57 = compiler52.defaultCodingConvention;
        compiler36.defaultCodingConvention = codingConvention57;
        compiler7.defaultCodingConvention = codingConvention57;
        java.lang.String str62 = compiler7.getSourceLine("[singleton]", (int) (byte) 10);
        com.google.javascript.rhino.Node node63 = compiler7.externsRoot;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange64 = compiler7.recentChange;
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange64);
        com.google.javascript.jscomp.TypeValidator typeValidator66 = compiler0.getTypeValidator();
        org.junit.Assert.assertNull(sourceMap1);
        org.junit.Assert.assertNotNull(recentChange2);
        org.junit.Assert.assertNotNull(diagnosticGroups3);
        org.junit.Assert.assertNotNull(defaultPassConfig4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNull(scope17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray21);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray21, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray22);
        org.junit.Assert.assertArrayEquals(jSModuleArray22, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig26);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNotNull(result28);
        org.junit.Assert.assertNotNull(defaultPassConfig32);
        org.junit.Assert.assertNotNull(compilerOptions33);
        org.junit.Assert.assertNotNull(passConfig35);
        org.junit.Assert.assertNull(scope39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray43);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray43, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray44);
        org.junit.Assert.assertArrayEquals(jSModuleArray44, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig48);
        org.junit.Assert.assertNotNull(compilerOptions49);
        org.junit.Assert.assertNotNull(result50);
        org.junit.Assert.assertNotNull(compilerOptions51);
        org.junit.Assert.assertNull(scope55);
        org.junit.Assert.assertNotNull(codingConvention57);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNotNull(recentChange64);
        org.junit.Assert.assertNotNull(typeValidator66);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        com.google.javascript.jscomp.VariableMap variableMap6 = compiler0.getVariableMap();
        com.google.javascript.rhino.Node node8 = compiler0.parseTestCode("[hi!]");
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap11 = compiler10.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange12 = compiler10.recentChange;
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups13 = compiler10.getDiagnosticGroups();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig14 = compiler10.ensureDefaultPassConfig();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList15 = compiler10.getInputsForTesting();
        com.google.javascript.rhino.Node node17 = compiler10.parseTestCode("2569/09/27 15:58");
        com.google.javascript.jscomp.PerformanceTracker performanceTracker18 = null;
        compiler10.tracker = performanceTracker18;
        com.google.javascript.jscomp.Compiler compiler20 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler21 = null;
        compiler20.removeChangeHandler(codeChangeHandler21);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph23 = compiler20.getModuleGraph();
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig24 = compiler20.ensureDefaultPassConfig();
        com.google.javascript.jscomp.Compiler compiler25 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node26 = null;
        compiler25.prepareAst(node26);
        com.google.javascript.jscomp.Scope scope28 = compiler25.getTopScope();
        com.google.javascript.rhino.Node node29 = null;
        compiler25.prepareAst(node29);
        com.google.javascript.jscomp.VariableMap variableMap31 = compiler25.getVariableMap();
        com.google.javascript.jscomp.Scope scope32 = compiler25.getTopScope();
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        compiler33.setProgress((double) 0L);
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap36 = compiler33.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler37 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap38 = compiler37.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap39 = compiler37.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler40 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node41 = null;
        compiler40.prepareAst(node41);
        com.google.javascript.jscomp.Scope scope43 = compiler40.getTopScope();
        com.google.javascript.rhino.Node node44 = null;
        compiler40.prepareAst(node44);
        com.google.javascript.jscomp.VariableMap variableMap46 = compiler40.getVariableMap();
        com.google.javascript.rhino.Node node48 = compiler40.parseTestCode("[hi!]");
        java.lang.String str49 = compiler37.toSource(node48);
        compiler33.jsRoot = node48;
        java.lang.String str51 = compiler25.toSource(node48);
        compiler20.externsRoot = node48;
        compiler10.externsRoot = node48;
        com.google.javascript.jscomp.Compiler compiler54 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler55 = null;
        compiler54.removeChangeHandler(codeChangeHandler55);
        com.google.javascript.jscomp.Region region59 = compiler54.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.jscomp.Compiler compiler60 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node61 = null;
        compiler60.prepareAst(node61);
        com.google.javascript.jscomp.CompilerOptions compilerOptions63 = null;
        compiler60.options = compilerOptions63;
        com.google.javascript.jscomp.Compiler compiler65 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap66 = compiler65.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange67 = compiler65.recentChange;
        double double68 = compiler65.getProgress();
        com.google.javascript.rhino.Node node70 = compiler65.parseTestCode("Unversioned directory");
        com.google.javascript.jscomp.Compiler compiler71 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap72 = compiler71.getSourceMap();
        compiler71.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler74 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap75 = compiler74.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange76 = compiler74.recentChange;
        compiler71.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler65.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler60.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler54.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler10.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange76);
        com.google.javascript.jscomp.Compiler compiler83 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap84 = compiler83.getSourceMap();
        com.google.javascript.jscomp.PassConfig passConfig85 = compiler83.getPassConfig();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap86 = compiler83.getFunctionalInformationMap();
        com.google.javascript.jscomp.VariableMap variableMap87 = compiler83.getPropertyMap();
        com.google.javascript.rhino.Node node88 = compiler83.externAndJsRoot;
        com.google.javascript.jscomp.PassConfig passConfig89 = compiler83.getPassConfig();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.setPassConfig(passConfig89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: this.passes has already been assigned");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(variableMap6);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertNull(sourceMap11);
        org.junit.Assert.assertNotNull(recentChange12);
        org.junit.Assert.assertNotNull(diagnosticGroups13);
        org.junit.Assert.assertNotNull(defaultPassConfig14);
        org.junit.Assert.assertNull(compilerInputList15);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNull(jSModuleGraph23);
        org.junit.Assert.assertNotNull(defaultPassConfig24);
        org.junit.Assert.assertNull(scope28);
        org.junit.Assert.assertNull(variableMap31);
        org.junit.Assert.assertNull(scope32);
        org.junit.Assert.assertNull(globalVarReferenceMap36);
        org.junit.Assert.assertNull(variableMap38);
        org.junit.Assert.assertNull(globalVarReferenceMap39);
        org.junit.Assert.assertNull(scope43);
        org.junit.Assert.assertNull(variableMap46);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(region59);
        org.junit.Assert.assertNull(sourceMap66);
        org.junit.Assert.assertNotNull(recentChange67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(sourceMap72);
        org.junit.Assert.assertNull(sourceMap75);
        org.junit.Assert.assertNotNull(recentChange76);
        org.junit.Assert.assertNull(sourceMap84);
        org.junit.Assert.assertNotNull(passConfig85);
        org.junit.Assert.assertNull(functionInformationMap86);
        org.junit.Assert.assertNull(variableMap87);
        org.junit.Assert.assertNull(node88);
        org.junit.Assert.assertNotNull(passConfig89);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder0 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        java.lang.String str1 = codeBuilder0.toString();
        codeBuilder0.reset();
        int int3 = codeBuilder0.getLength();
        int int4 = codeBuilder0.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder6 = codeBuilder0.append("Unversioned directory");
        java.lang.String str7 = codeBuilder0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(codeBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unversioned directory" + "'", str7, "Unversioned directory");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.Region region5 = compiler0.getSourceRegion("hi!", (int) (short) -1);
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig7 = compiler0.ensureDefaultPassConfig();
        com.google.javascript.jscomp.JsAst jsAst8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = compiler0.addNewSourceAst(jsAst8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(region5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(defaultPassConfig7);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.jscomp.CompilerPass compilerPass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.process(compilerPass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.rhino.head.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        int int6 = compiler0.getErrorCount();
        com.google.javascript.jscomp.Compiler compiler7 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap8 = compiler7.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap9 = compiler7.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap12 = compiler11.getSourceMap();
        compiler11.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler14 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.SourceMap sourceMap15 = compiler14.getSourceMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler14.recentChange;
        compiler11.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange16);
        com.google.javascript.rhino.head.ErrorReporter errorReporter19 = compiler10.getDefaultErrorReporter();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler10.getErrorManager();
        compiler7.setErrorManager(errorManager20);
        compiler0.setErrorManager(errorManager20);
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap24 = compiler23.getPropertyMap();
        com.google.javascript.jscomp.GlobalVarReferenceMap globalVarReferenceMap25 = compiler23.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node27 = null;
        compiler26.prepareAst(node27);
        com.google.javascript.jscomp.Scope scope29 = compiler26.getTopScope();
        com.google.javascript.rhino.Node node30 = null;
        compiler26.prepareAst(node30);
        com.google.javascript.jscomp.VariableMap variableMap32 = compiler26.getVariableMap();
        com.google.javascript.rhino.Node node34 = compiler26.parseTestCode("[hi!]");
        java.lang.String str35 = compiler23.toSource(node34);
        compiler0.externsRoot = node34;
        com.google.javascript.jscomp.JSError jSError37 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.report(jSError37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(variableMap8);
        org.junit.Assert.assertNull(globalVarReferenceMap9);
        org.junit.Assert.assertNull(sourceMap12);
        org.junit.Assert.assertNull(sourceMap15);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(errorReporter19);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNull(variableMap24);
        org.junit.Assert.assertNull(globalVarReferenceMap25);
        org.junit.Assert.assertNull(scope29);
        org.junit.Assert.assertNull(variableMap32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        boolean boolean7 = compiler0.hasRegExpGlobalReferences();
        com.google.common.base.Supplier<java.lang.String> strSupplier8 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strSupplier8);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker1 = null;
        compiler0.tracker = performanceTracker1;
        compiler0.disableThreads();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph4 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.ErrorManager errorManager5 = compiler0.getErrorManager();
        int int6 = compiler0.getWarningCount();
        boolean boolean7 = compiler0.isTypeCheckingEnabled();
        // The following exception was thrown during execution in test generation
        try {
            compiler0.optimize();
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: INTERNAL COMPILER ERROR.?Please report this problem.?null");
        } catch (java.lang.RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSModuleGraph4);
        org.junit.Assert.assertNotNull(errorManager5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = null;
        compiler0.prepareAst(node1);
        com.google.javascript.jscomp.Scope scope3 = compiler0.getTopScope();
        com.google.javascript.rhino.Node node4 = null;
        compiler0.prepareAst(node4);
        boolean boolean6 = compiler0.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray7 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray8 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        compiler9.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig12 = compiler9.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions13 = compiler9.newCompilerOptions();
        com.google.javascript.jscomp.Result result14 = compiler0.compile(jSSourceFileArray7, jSModuleArray8, compilerOptions13);
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler0.getOptions();
        compiler0.addToDebugLog("hi!");
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode18 = compiler0.languageMode();
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node20 = null;
        compiler19.prepareAst(node20);
        com.google.javascript.jscomp.Scope scope22 = compiler19.getTopScope();
        com.google.javascript.rhino.Node node23 = null;
        compiler19.prepareAst(node23);
        com.google.javascript.jscomp.VariableMap variableMap25 = compiler19.getVariableMap();
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph26 = compiler19.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler27 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node28 = null;
        compiler27.prepareAst(node28);
        com.google.javascript.jscomp.Scope scope30 = compiler27.getTopScope();
        com.google.javascript.rhino.Node node31 = null;
        compiler27.prepareAst(node31);
        com.google.javascript.jscomp.VariableMap variableMap33 = compiler27.getVariableMap();
        com.google.javascript.rhino.Node node35 = compiler27.parseTestCode("[hi!]");
        java.lang.String str36 = compiler19.toSource(node35);
        compiler19.initCompilerOptionsIfTesting();
        boolean boolean38 = compiler19.hasHaltingErrors();
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node40 = null;
        compiler39.prepareAst(node40);
        com.google.javascript.jscomp.Scope scope42 = compiler39.getTopScope();
        com.google.javascript.rhino.Node node43 = null;
        compiler39.prepareAst(node43);
        boolean boolean45 = compiler39.precheck();
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray46 = new com.google.javascript.jscomp.JSSourceFile[] {};
        com.google.javascript.jscomp.JSModule[] jSModuleArray47 = new com.google.javascript.jscomp.JSModule[] {};
        com.google.javascript.jscomp.Compiler compiler48 = new com.google.javascript.jscomp.Compiler();
        compiler48.setProgress((double) 0L);
        com.google.javascript.jscomp.DefaultPassConfig defaultPassConfig51 = compiler48.ensureDefaultPassConfig();
        com.google.javascript.jscomp.CompilerOptions compilerOptions52 = compiler48.newCompilerOptions();
        com.google.javascript.jscomp.Result result53 = compiler39.compile(jSSourceFileArray46, jSModuleArray47, compilerOptions52);
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler39.getOptions();
        com.google.javascript.jscomp.VariableMap variableMap55 = compiler39.getVariableMap();
        java.lang.String str56 = compiler39.getAstDotGraph();
        boolean boolean57 = compiler39.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node59 = compiler39.parseTestCode("[]");
        com.google.javascript.jscomp.parsing.Config config60 = compiler39.getParserConfig();
        com.google.javascript.jscomp.Compiler compiler61 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.VariableMap variableMap62 = compiler61.getPropertyMap();
        com.google.javascript.rhino.Node node63 = compiler61.externAndJsRoot;
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap64 = compiler61.getFunctionalInformationMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange65 = compiler61.recentChange;
        compiler39.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange65);
        compiler19.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange65);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange65);
        com.google.javascript.jscomp.Tracer tracer70 = compiler0.newTracer("[singleton]");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray7);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray7, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray8);
        org.junit.Assert.assertArrayEquals(jSModuleArray8, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig12);
        org.junit.Assert.assertNotNull(compilerOptions13);
        org.junit.Assert.assertNotNull(result14);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertTrue("'" + languageMode18 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode18.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(scope22);
        org.junit.Assert.assertNull(variableMap25);
        org.junit.Assert.assertNull(jSModuleGraph26);
        org.junit.Assert.assertNull(scope30);
        org.junit.Assert.assertNull(variableMap33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(scope42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jSSourceFileArray46);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray46, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertNotNull(jSModuleArray47);
        org.junit.Assert.assertArrayEquals(jSModuleArray47, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertNotNull(defaultPassConfig51);
        org.junit.Assert.assertNotNull(compilerOptions52);
        org.junit.Assert.assertNotNull(result53);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNull(variableMap55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(config60);
        org.junit.Assert.assertNull(variableMap62);
        org.junit.Assert.assertNull(node63);
        org.junit.Assert.assertNull(functionInformationMap64);
        org.junit.Assert.assertNotNull(recentChange65);
        org.junit.Assert.assertNotNull(tracer70);
    }
}

