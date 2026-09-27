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
        java.lang.String str7 = compiler0.toSource();
        compiler0.disableThreads();
        com.google.javascript.jscomp.Compiler compiler9 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler10 = null;
        compiler9.removeChangeHandler(codeChangeHandler10);
        com.google.javascript.jscomp.PassConfig passConfig12 = compiler9.getPassConfig();
        compiler0.setPassConfig(passConfig12);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder14 = new com.google.javascript.jscomp.Compiler.CodeBuilder();
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        compiler16.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray21 = compiler16.getWarnings();
        com.google.javascript.rhino.Node node22 = null;
        compiler16.jsRoot = node22;
        com.google.javascript.jscomp.Region region26 = compiler16.getSourceRegion("", 0);
        int int27 = compiler16.getWarningCount();
        boolean boolean28 = compiler16.precheck();
        compiler16.disableThreads();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler30.getErrorManager();
        compiler30.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler30.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray35 = compiler30.getWarnings();
        com.google.javascript.rhino.Node node36 = null;
        compiler30.jsRoot = node36;
        java.lang.String str38 = compiler30.toSource();
        com.google.javascript.rhino.Node node40 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.Compiler compiler41 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager42 = compiler41.getErrorManager();
        compiler41.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions45 = compiler41.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray46 = compiler41.getWarnings();
        com.google.javascript.rhino.Node node47 = null;
        compiler41.jsRoot = node47;
        java.lang.String str49 = compiler41.toSource();
        com.google.javascript.jscomp.Compiler compiler50 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node51 = compiler50.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager52 = compiler50.getErrorManager();
        com.google.javascript.rhino.Node node54 = compiler50.parseTestCode("hi!");
        compiler41.externsRoot = node54;
        boolean boolean56 = compiler16.areNodesEqualForInlining(node40, node54);
        compiler0.toSource(codeBuilder14, 10, node54);
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder59 = codeBuilder14.append("");
        java.lang.String str60 = codeBuilder14.toString();
        codeBuilder14.reset();
        int int62 = codeBuilder14.getLength();
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder64 = codeBuilder14.append("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder66 = codeBuilder14.append("");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(passConfig12);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(jSErrorArray21);
        org.junit.Assert.assertArrayEquals(jSErrorArray21, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(jSErrorArray35);
        org.junit.Assert.assertArrayEquals(jSErrorArray35, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(errorManager42);
        org.junit.Assert.assertNotNull(compilerOptions45);
        org.junit.Assert.assertNotNull(jSErrorArray46);
        org.junit.Assert.assertArrayEquals(jSErrorArray46, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(node51);
        org.junit.Assert.assertNotNull(errorManager52);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(codeBuilder59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(codeBuilder64);
        org.junit.Assert.assertNotNull(codeBuilder66);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap3 = compiler0.getFunctionalInformationMap();
        com.google.javascript.jscomp.JSError jSError4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CheckLevel checkLevel5 = compiler0.getErrorLevel(jSError4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(functionInformationMap3);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier3 = compiler0.getUniqueNameIdSupplier();
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry5 = compiler0.getTypeRegistry();
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        compiler0.reportCodeChange();
        boolean boolean8 = compiler0.hasHaltingErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertNotNull(strSupplier3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(jSTypeRegistry5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        java.lang.String str8 = compiler0.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList9 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler11 = null;
        compiler10.removeChangeHandler(codeChangeHandler11);
        com.google.javascript.jscomp.CodingConvention codingConvention13 = compiler10.defaultCodingConvention;
        compiler0.defaultCodingConvention = codingConvention13;
        com.google.javascript.jscomp.VariableMap variableMap15 = compiler0.getVariableMap();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange16 = compiler0.recentChange;
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler17.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator19 = compiler17.getTypeValidator();
        compiler17.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler21 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager22 = compiler21.getErrorManager();
        compiler21.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions25 = compiler21.options;
        compiler17.options = compilerOptions25;
        com.google.javascript.jscomp.ScopeCreator scopeCreator27 = compiler17.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        java.lang.String str30 = compiler28.getAstDotGraph();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap31 = compiler28.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler32 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler32.getErrorManager();
        compiler32.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions36 = compiler32.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray37 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList38 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, jSSourceFileArray37);
        com.google.javascript.jscomp.JSModule[] jSModuleArray40 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList41 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList41, jSModuleArray40);
        com.google.javascript.jscomp.Compiler compiler43 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager44 = compiler43.getErrorManager();
        compiler43.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions47 = compiler43.options;
        compiler32.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList41, compilerOptions47);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler50 = null;
        compiler49.removeChangeHandler(codeChangeHandler50);
        com.google.javascript.jscomp.CodingConvention codingConvention52 = compiler49.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray53 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList54 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList54, jSSourceFileArray53);
        com.google.javascript.jscomp.JSModule[] jSModuleArray56 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList57 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList57, jSModuleArray56);
        com.google.javascript.jscomp.Compiler compiler59 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager60 = compiler59.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator61 = compiler59.getTypeValidator();
        compiler59.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler63 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager64 = compiler63.getErrorManager();
        compiler63.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.options;
        compiler59.options = compilerOptions67;
        compiler49.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList54, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList57, compilerOptions67);
        com.google.javascript.jscomp.Compiler compiler70 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node71 = compiler70.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager72 = compiler70.getErrorManager();
        com.google.javascript.rhino.Node node74 = compiler70.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention75 = compiler70.defaultCodingConvention;
        com.google.javascript.jscomp.CompilerOptions compilerOptions76 = compiler70.getOptions();
        compiler28.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList57, compilerOptions76);
        com.google.javascript.jscomp.JSModule[] jSModuleArray78 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList79 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList79, jSModuleArray78);
        com.google.javascript.jscomp.Compiler compiler81 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager82 = compiler81.getErrorManager();
        compiler81.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions85 = compiler81.options;
        com.google.javascript.jscomp.CodingConvention codingConvention86 = null;
        compiler81.defaultCodingConvention = codingConvention86;
        com.google.common.base.Supplier<java.lang.String> strSupplier88 = compiler81.getUniqueNameIdSupplier();
        compiler81.startPass("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions91 = compiler81.getOptions();
        compiler17.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList38, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList79, compilerOptions91);
        com.google.javascript.jscomp.CompilerOptions compilerOptions93 = compiler17.options;
        compiler0.options = compilerOptions93;
        com.google.javascript.jscomp.PassConfig passConfig95 = compiler0.getPassConfig();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(compilerInputList9);
        org.junit.Assert.assertNotNull(codingConvention13);
        org.junit.Assert.assertNull(variableMap15);
        org.junit.Assert.assertNotNull(recentChange16);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertNotNull(typeValidator19);
        org.junit.Assert.assertNotNull(errorManager22);
        org.junit.Assert.assertNotNull(compilerOptions25);
        org.junit.Assert.assertNull(scopeCreator27);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(functionInformationMap31);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(compilerOptions36);
        org.junit.Assert.assertNotNull(jSSourceFileArray37);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray37, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jSModuleArray40);
        org.junit.Assert.assertArrayEquals(jSModuleArray40, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(errorManager44);
        org.junit.Assert.assertNotNull(compilerOptions47);
        org.junit.Assert.assertNotNull(codingConvention52);
        org.junit.Assert.assertNotNull(jSSourceFileArray53);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray53, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jSModuleArray56);
        org.junit.Assert.assertArrayEquals(jSModuleArray56, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(errorManager60);
        org.junit.Assert.assertNotNull(typeValidator61);
        org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNull(node71);
        org.junit.Assert.assertNotNull(errorManager72);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertNotNull(codingConvention75);
        org.junit.Assert.assertNotNull(compilerOptions76);
        org.junit.Assert.assertNotNull(jSModuleArray78);
        org.junit.Assert.assertArrayEquals(jSModuleArray78, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(errorManager82);
        org.junit.Assert.assertNotNull(compilerOptions85);
        org.junit.Assert.assertNotNull(strSupplier88);
        org.junit.Assert.assertNotNull(compilerOptions91);
        org.junit.Assert.assertNotNull(compilerOptions93);
        org.junit.Assert.assertNotNull(passConfig95);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.parsing.Config config4 = compiler0.getParserConfig();
        boolean boolean5 = compiler0.acceptEcmaScript5();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getInputsForTesting();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker7 = compiler0.tracker;
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph8 = compiler0.getModuleGraph();
        compiler0.startPass("hi!");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNotNull(config4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(compilerInputList6);
        org.junit.Assert.assertNull(performanceTracker7);
        org.junit.Assert.assertNull(jSModuleGraph8);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.jscomp.JSError[] jSErrorArray3 = compiler0.getWarnings();
        int int4 = compiler0.getWarningCount();
        compiler0.disableThreads();
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(jSErrorArray3);
        org.junit.Assert.assertArrayEquals(jSErrorArray3, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
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
        int int17 = compiler0.getErrorCount();
        boolean boolean18 = compiler0.isIdeMode();
        com.google.javascript.jscomp.DiagnosticGroups diagnosticGroups19 = compiler0.getDiagnosticGroups();
        compiler0.resetUniqueNameId();
        com.google.javascript.jscomp.TypeValidator typeValidator21 = compiler0.getTypeValidator();
        com.google.javascript.jscomp.Tracer tracer23 = compiler0.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        com.google.javascript.jscomp.CompilerInput compilerInput25 = compiler0.getInput("");
        com.google.javascript.jscomp.JSSourceFile jSSourceFile26 = null;
        com.google.javascript.jscomp.JSSourceFile jSSourceFile27 = null;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray28 = new com.google.javascript.jscomp.JSSourceFile[] { jSSourceFile27 };
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
        com.google.javascript.jscomp.ErrorManager errorManager51 = compiler50.getErrorManager();
        compiler50.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions54 = compiler50.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray55 = compiler50.getWarnings();
        com.google.javascript.rhino.Node node56 = null;
        compiler50.jsRoot = node56;
        java.lang.String str58 = compiler50.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList59 = compiler50.getExternsForTesting();
        com.google.javascript.jscomp.CompilerOptions compilerOptions60 = compiler50.getOptions();
        compiler29.options = compilerOptions60;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Result result62 = compiler0.compile(jSSourceFile26, jSSourceFileArray28, compilerOptions60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(diagnosticGroups19);
        org.junit.Assert.assertNotNull(typeValidator21);
        org.junit.Assert.assertNotNull(tracer23);
        org.junit.Assert.assertNull(compilerInput25);
        org.junit.Assert.assertNotNull(jSSourceFileArray28);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray28, new com.google.javascript.jscomp.JSSourceFile[] { null });
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
        org.junit.Assert.assertNotNull(errorManager51);
        org.junit.Assert.assertNotNull(compilerOptions54);
        org.junit.Assert.assertNotNull(jSErrorArray55);
        org.junit.Assert.assertArrayEquals(jSErrorArray55, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(compilerInputList59);
        org.junit.Assert.assertNotNull(compilerOptions60);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler0.getFunctionalInformationMap();
        compiler0.setHasRegExpGlobalReferences(false);
        com.google.javascript.rhino.Node node20 = compiler0.parseTestCode("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        java.lang.String str2 = compiler0.getAstDotGraph();
        boolean boolean3 = compiler0.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap4 = compiler0.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        compiler5.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions9 = compiler5.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray10 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList11 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, jSSourceFileArray10);
        com.google.javascript.jscomp.JSModule[] jSModuleArray13 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList14, jSModuleArray13);
        com.google.javascript.jscomp.Compiler compiler16 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager17 = compiler16.getErrorManager();
        compiler16.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions20 = compiler16.options;
        compiler5.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList14, compilerOptions20);
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager23 = compiler22.getErrorManager();
        compiler22.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions26 = compiler22.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray27 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList28 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList28, jSSourceFileArray27);
        com.google.javascript.jscomp.JSModule[] jSModuleArray30 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList31 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList31, jSModuleArray30);
        com.google.javascript.jscomp.Compiler compiler33 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager34 = compiler33.getErrorManager();
        compiler33.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions37 = compiler33.options;
        compiler22.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList28, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList31, compilerOptions37);
        com.google.javascript.jscomp.Compiler compiler39 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler40 = null;
        compiler39.removeChangeHandler(codeChangeHandler40);
        com.google.javascript.jscomp.CodingConvention codingConvention42 = compiler39.defaultCodingConvention;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray43 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList44 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList44, jSSourceFileArray43);
        com.google.javascript.jscomp.JSModule[] jSModuleArray46 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList47 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList47, jSModuleArray46);
        com.google.javascript.jscomp.Compiler compiler49 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager50 = compiler49.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator51 = compiler49.getTypeValidator();
        compiler49.resetUniqueNameId();
        com.google.javascript.jscomp.Compiler compiler53 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager54 = compiler53.getErrorManager();
        compiler53.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions57 = compiler53.options;
        compiler49.options = compilerOptions57;
        compiler39.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList44, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList47, compilerOptions57);
        com.google.javascript.jscomp.Result result60 = compiler0.compile((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList11, (java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList28, compilerOptions57);
        com.google.javascript.jscomp.CompilerPass compilerPass61 = null;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.process(compilerPass61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(sourceMap4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNotNull(compilerOptions9);
        org.junit.Assert.assertNotNull(jSSourceFileArray10);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray10, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(jSModuleArray13);
        org.junit.Assert.assertArrayEquals(jSModuleArray13, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(errorManager17);
        org.junit.Assert.assertNotNull(compilerOptions20);
        org.junit.Assert.assertNotNull(errorManager23);
        org.junit.Assert.assertNotNull(compilerOptions26);
        org.junit.Assert.assertNotNull(jSSourceFileArray27);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray27, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSModuleArray30);
        org.junit.Assert.assertArrayEquals(jSModuleArray30, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(errorManager34);
        org.junit.Assert.assertNotNull(compilerOptions37);
        org.junit.Assert.assertNotNull(codingConvention42);
        org.junit.Assert.assertNotNull(jSSourceFileArray43);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray43, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jSModuleArray46);
        org.junit.Assert.assertArrayEquals(jSModuleArray46, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(errorManager50);
        org.junit.Assert.assertNotNull(typeValidator51);
        org.junit.Assert.assertNotNull(errorManager54);
        org.junit.Assert.assertNotNull(compilerOptions57);
        org.junit.Assert.assertNotNull(result60);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker4 = null;
        compiler0.tracker = performanceTracker4;
        boolean boolean6 = compiler0.hasRegExpGlobalReferences();
        compiler0.initCompilerOptionsIfTesting();
        boolean boolean8 = compiler0.acceptEcmaScript5();
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager6 = compiler5.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap7 = compiler5.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config8 = compiler5.getParserConfig();
        com.google.javascript.jscomp.TypeValidator typeValidator9 = compiler5.getTypeValidator();
        com.google.javascript.jscomp.Compiler compiler10 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager11 = compiler10.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap12 = compiler10.getPropertyMap();
        com.google.common.base.Supplier<java.lang.String> strSupplier13 = compiler10.getUniqueNameIdSupplier();
        boolean boolean14 = compiler10.isTypeCheckingEnabled();
        compiler10.reportCodeChange();
        com.google.javascript.jscomp.FunctionInformationMap functionInformationMap16 = compiler10.getFunctionalInformationMap();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler17.getErrorManager();
        compiler17.addToDebugLog("");
        boolean boolean21 = compiler17.isIdeMode();
        compiler17.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler17.recentChange;
        compiler10.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        compiler5.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        boolean boolean27 = compiler0.hasRegExpGlobalReferences();
        com.google.javascript.rhino.Node node30 = compiler0.parseSyntheticCode("hi!", "hi!");
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNotNull(errorManager6);
        org.junit.Assert.assertNull(variableMap7);
        org.junit.Assert.assertNotNull(config8);
        org.junit.Assert.assertNotNull(typeValidator9);
        org.junit.Assert.assertNotNull(errorManager11);
        org.junit.Assert.assertNull(variableMap12);
        org.junit.Assert.assertNotNull(strSupplier13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(functionInformationMap16);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(recentChange23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.Node node4 = compiler0.jsRoot;
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap5 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.SourceMap sourceMap6 = compiler0.getSourceMap();
        compiler0.addToDebugLog("hi!");
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange9 = compiler0.recentChange;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(referenceMap5);
        org.junit.Assert.assertNull(sourceMap6);
        org.junit.Assert.assertNotNull(recentChange9);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        boolean boolean4 = compiler0.isIdeMode();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange6 = compiler0.recentChange;
        java.lang.String str7 = compiler0.getAstDotGraph();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler9 = null;
        compiler8.removeChangeHandler(codeChangeHandler9);
        com.google.javascript.jscomp.PassConfig passConfig11 = compiler8.getPassConfig();
        com.google.javascript.jscomp.PerformanceTracker performanceTracker12 = null;
        compiler8.tracker = performanceTracker12;
        boolean boolean14 = compiler8.hasRegExpGlobalReferences();
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
        com.google.javascript.rhino.Node node28 = compiler27.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler27.getErrorManager();
        compiler15.setErrorManager(errorManager29);
        com.google.javascript.jscomp.Compiler compiler31 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node32 = compiler31.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager33 = compiler31.getErrorManager();
        com.google.javascript.rhino.Node node35 = compiler31.parseTestCode("hi!");
        compiler15.externAndJsRoot = node35;
        java.lang.String str37 = compiler8.toSource(node35);
        compiler0.externsRoot = node35;
        // The following exception was thrown during execution in test generation
        try {
            compiler0.rebuildInputsFromModules();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(recentChange6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(passConfig11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(errorManager16);
        org.junit.Assert.assertNotNull(compilerOptions19);
        org.junit.Assert.assertNotNull(jSErrorArray20);
        org.junit.Assert.assertArrayEquals(jSErrorArray20, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(region25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertNotNull(errorManager33);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
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
        java.lang.String str13 = compiler0.toSource();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange14 = compiler0.recentChange;
        boolean boolean15 = compiler0.precheck();
        com.google.common.base.Supplier<java.lang.String> strSupplier16 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler17 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager18 = compiler17.getErrorManager();
        java.lang.String str19 = compiler17.getAstDotGraph();
        boolean boolean20 = compiler17.acceptConstKeyword();
        com.google.javascript.jscomp.SourceMap sourceMap21 = compiler17.getSourceMap();
        com.google.javascript.jscomp.Compiler compiler22 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node23 = compiler22.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler22.getErrorManager();
        compiler17.setErrorManager(errorManager24);
        com.google.javascript.jscomp.Compiler compiler26 = new com.google.javascript.jscomp.Compiler(errorManager24);
        com.google.javascript.rhino.Node node27 = compiler26.getRoot();
        boolean boolean28 = compiler26.precheck();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler26.getErrorManager();
        compiler0.setErrorManager(errorManager29);
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
        org.junit.Assert.assertNotNull(recentChange14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSupplier16);
        org.junit.Assert.assertNotNull(errorManager18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sourceMap21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(errorManager29);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node4 = compiler0.parseTestCode("hi!");
        com.google.javascript.jscomp.CodingConvention codingConvention5 = compiler0.defaultCodingConvention;
        com.google.common.base.Supplier<java.lang.String> strSupplier6 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Region region9 = compiler0.getSourceRegion("hi!", (int) (short) 0);
        com.google.javascript.jscomp.JSModuleGraph jSModuleGraph10 = compiler0.getModuleGraph();
        com.google.javascript.jscomp.Compiler compiler11 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager12 = compiler11.getErrorManager();
        compiler11.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions15 = compiler11.options;
        com.google.javascript.jscomp.CodingConvention codingConvention16 = null;
        compiler11.defaultCodingConvention = codingConvention16;
        com.google.common.base.Supplier<java.lang.String> strSupplier18 = compiler11.getUniqueNameIdSupplier();
        compiler11.startPass("");
        com.google.javascript.jscomp.Compiler.CodeBuilder codeBuilder21 = null;
        com.google.javascript.jscomp.Compiler compiler23 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager24 = compiler23.getErrorManager();
        compiler23.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions27 = compiler23.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray28 = compiler23.getWarnings();
        com.google.javascript.rhino.Node node29 = null;
        compiler23.jsRoot = node29;
        java.lang.String str31 = compiler23.toSource();
        com.google.javascript.rhino.Node node33 = compiler23.parseTestCode("");
        compiler11.toSource(codeBuilder21, (int) (byte) 10, node33);
        compiler0.externAndJsRoot = node33;
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange36 = compiler0.recentChange;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(codingConvention5);
        org.junit.Assert.assertNotNull(strSupplier6);
        org.junit.Assert.assertNull(region9);
        org.junit.Assert.assertNull(jSModuleGraph10);
        org.junit.Assert.assertNotNull(errorManager12);
        org.junit.Assert.assertNotNull(compilerOptions15);
        org.junit.Assert.assertNotNull(strSupplier18);
        org.junit.Assert.assertNotNull(errorManager24);
        org.junit.Assert.assertNotNull(compilerOptions27);
        org.junit.Assert.assertNotNull(jSErrorArray28);
        org.junit.Assert.assertArrayEquals(jSErrorArray28, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(recentChange36);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler1 = null;
        compiler0.removeChangeHandler(codeChangeHandler1);
        com.google.javascript.jscomp.PassConfig passConfig3 = compiler0.getPassConfig();
        com.google.common.base.Supplier<java.lang.String> strSupplier4 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.Compiler compiler5 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node6 = compiler5.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager7 = compiler5.getErrorManager();
        com.google.javascript.rhino.Node node9 = compiler5.parseTestCode("hi!");
        compiler0.externAndJsRoot = node9;
        java.lang.String str11 = compiler0.getAstDotGraph();
        com.google.common.base.Supplier<java.lang.String> strSupplier12 = compiler0.getUniqueNameIdSupplier();
        com.google.javascript.jscomp.PassConfig passConfig13 = compiler0.createPassConfigInternal();
        com.google.javascript.rhino.Node node14 = compiler0.externAndJsRoot;
        org.junit.Assert.assertNotNull(passConfig3);
        org.junit.Assert.assertNotNull(strSupplier4);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(errorManager7);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strSupplier12);
        org.junit.Assert.assertNotNull(passConfig13);
        org.junit.Assert.assertNotNull(node14);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap2 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode3 = compiler0.languageMode();
        com.google.javascript.jscomp.VariableMap variableMap4 = compiler0.getPropertyMap();
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter5 = compiler0.getDefaultErrorReporter();
        com.google.javascript.rhino.Node node6 = compiler0.externAndJsRoot;
        com.google.common.base.Supplier<java.lang.String> strSupplier7 = compiler0.getUniqueNameIdSupplier();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNull(variableMap2);
        org.junit.Assert.assertTrue("'" + languageMode3 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode3.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNull(variableMap4);
        org.junit.Assert.assertNotNull(errorReporter5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(strSupplier7);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        com.google.javascript.rhino.Node node6 = null;
        compiler0.jsRoot = node6;
        boolean boolean8 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap9 = compiler0.getSourceMap();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap10 = compiler0.getGlobalVarReferences();
        compiler0.initCompilerOptionsIfTesting();
        com.google.javascript.jscomp.Compiler compiler12 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager13 = compiler12.getErrorManager();
        compiler12.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions16 = compiler12.options;
        com.google.javascript.jscomp.CodingConvention codingConvention17 = null;
        compiler12.defaultCodingConvention = codingConvention17;
        com.google.common.base.Supplier<java.lang.String> strSupplier19 = compiler12.getUniqueNameIdSupplier();
        compiler12.startPass("");
        boolean boolean22 = compiler12.hasHaltingErrors();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange23 = compiler12.recentChange;
        compiler0.removeChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange23);
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(sourceMap9);
        org.junit.Assert.assertNull(referenceMap10);
        org.junit.Assert.assertNotNull(errorManager13);
        org.junit.Assert.assertNotNull(compilerOptions16);
        org.junit.Assert.assertNotNull(strSupplier19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(recentChange23);
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
        java.lang.String str8 = compiler0.toSource();
        compiler0.disableThreads();
        boolean boolean10 = compiler0.isInliningForbidden();
        boolean boolean11 = compiler0.hasHaltingErrors();
        com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap referenceMap12 = compiler0.getGlobalVarReferences();
        com.google.javascript.jscomp.Compiler compiler13 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager14 = compiler13.getErrorManager();
        compiler13.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions17 = compiler13.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray18 = compiler13.getWarnings();
        com.google.javascript.rhino.Node node19 = null;
        compiler13.jsRoot = node19;
        java.lang.String str21 = compiler13.toSource();
        compiler13.disableThreads();
        boolean boolean23 = compiler13.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray24 = compiler13.getWarnings();
        com.google.javascript.jscomp.CompilerOptions.LanguageMode languageMode25 = compiler13.languageMode();
        com.google.javascript.jscomp.CodingConvention codingConvention26 = compiler13.getCodingConvention();
        compiler0.defaultCodingConvention = codingConvention26;
        com.google.javascript.jscomp.Compiler compiler28 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager29 = compiler28.getErrorManager();
        com.google.javascript.jscomp.VariableMap variableMap30 = compiler28.getPropertyMap();
        com.google.javascript.jscomp.parsing.Config config31 = compiler28.getParserConfig();
        com.google.javascript.jscomp.TypeValidator typeValidator32 = compiler28.getTypeValidator();
        com.google.javascript.rhino.Node node33 = null;
        compiler28.prepareAst(node33);
        com.google.javascript.jscomp.Tracer tracer36 = compiler28.newTracer("digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        compiler0.stopTracer(tracer36, "digraph AST {\n  node [color=lightblue2, style=filled];\n  node0 [label=\"BLOCK\"];\n  node0 -> RETURN [label=\"UNCOND\", fontcolor=\"red\", weight=0.01, color=\"red\"];\n}\n");
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(referenceMap12);
        org.junit.Assert.assertNotNull(errorManager14);
        org.junit.Assert.assertNotNull(compilerOptions17);
        org.junit.Assert.assertNotNull(jSErrorArray18);
        org.junit.Assert.assertArrayEquals(jSErrorArray18, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(jSErrorArray24);
        org.junit.Assert.assertArrayEquals(jSErrorArray24, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertTrue("'" + languageMode25 + "' != '" + com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3 + "'", languageMode25.equals(com.google.javascript.jscomp.CompilerOptions.LanguageMode.ECMASCRIPT3));
        org.junit.Assert.assertNotNull(codingConvention26);
        org.junit.Assert.assertNotNull(errorManager29);
        org.junit.Assert.assertNull(variableMap30);
        org.junit.Assert.assertNotNull(config31);
        org.junit.Assert.assertNotNull(typeValidator32);
        org.junit.Assert.assertNotNull(tracer36);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        compiler0.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions4 = compiler0.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray5 = compiler0.getWarnings();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList6 = compiler0.getExternsForTesting();
        com.google.javascript.jscomp.ScopeCreator scopeCreator7 = compiler0.getTypedScopeCreator();
        com.google.javascript.jscomp.Compiler compiler8 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager9 = compiler8.getErrorManager();
        compiler8.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions12 = compiler8.options;
        com.google.javascript.jscomp.JSSourceFile[] jSSourceFileArray13 = new com.google.javascript.jscomp.JSSourceFile[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile> jSSourceFileList14 = new java.util.ArrayList<com.google.javascript.jscomp.JSSourceFile>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, jSSourceFileArray13);
        com.google.javascript.jscomp.JSModule[] jSModuleArray16 = new com.google.javascript.jscomp.JSModule[] {};
        java.util.ArrayList<com.google.javascript.jscomp.JSModule> jSModuleList17 = new java.util.ArrayList<com.google.javascript.jscomp.JSModule>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.jscomp.JSModule>) jSModuleList17, jSModuleArray16);
        com.google.javascript.jscomp.Compiler compiler19 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager20 = compiler19.getErrorManager();
        compiler19.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions23 = compiler19.options;
        compiler8.initModules((java.util.List<com.google.javascript.jscomp.JSSourceFile>) jSSourceFileList14, (java.util.List<com.google.javascript.jscomp.JSModule>) jSModuleList17, compilerOptions23);
        boolean boolean25 = compiler8.acceptEcmaScript5();
        com.google.javascript.rhino.Node node26 = compiler8.externAndJsRoot;
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList27 = compiler8.getInputsInOrder();
        com.google.javascript.jscomp.CompilerOptions compilerOptions28 = compiler8.getOptions();
        com.google.javascript.jscomp.Result result29 = compiler8.getResult();
        com.google.javascript.jscomp.Compiler compiler30 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager31 = compiler30.getErrorManager();
        compiler30.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions34 = compiler30.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray35 = compiler30.getWarnings();
        com.google.javascript.rhino.Node node36 = null;
        compiler30.jsRoot = node36;
        java.lang.String str38 = compiler30.toSource();
        com.google.javascript.rhino.Node node40 = compiler30.parseTestCode("");
        com.google.javascript.jscomp.JSError[] jSErrorArray41 = compiler30.getErrors();
        com.google.common.base.Supplier<java.lang.String> strSupplier42 = compiler30.getUniqueNameIdSupplier();
        java.lang.String str43 = compiler30.toSource();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange44 = compiler30.recentChange;
        compiler8.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        compiler0.addChangeHandler((com.google.javascript.jscomp.CodeChangeHandler) recentChange44);
        int int47 = compiler0.getWarningCount();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(compilerOptions4);
        org.junit.Assert.assertNotNull(jSErrorArray5);
        org.junit.Assert.assertArrayEquals(jSErrorArray5, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNull(compilerInputList6);
        org.junit.Assert.assertNull(scopeCreator7);
        org.junit.Assert.assertNotNull(errorManager9);
        org.junit.Assert.assertNotNull(compilerOptions12);
        org.junit.Assert.assertNotNull(jSSourceFileArray13);
        org.junit.Assert.assertArrayEquals(jSSourceFileArray13, new com.google.javascript.jscomp.JSSourceFile[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSModuleArray16);
        org.junit.Assert.assertArrayEquals(jSModuleArray16, new com.google.javascript.jscomp.JSModule[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(errorManager20);
        org.junit.Assert.assertNotNull(compilerOptions23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(compilerInputList27);
        org.junit.Assert.assertNotNull(compilerOptions28);
        org.junit.Assert.assertNotNull(result29);
        org.junit.Assert.assertNotNull(errorManager31);
        org.junit.Assert.assertNotNull(compilerOptions34);
        org.junit.Assert.assertNotNull(jSErrorArray35);
        org.junit.Assert.assertArrayEquals(jSErrorArray35, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(jSErrorArray41);
        org.junit.Assert.assertArrayEquals(jSErrorArray41, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(strSupplier42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(recentChange44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.Result result2 = compiler0.getResult();
        compiler0.resetUniqueNameId();
        com.google.javascript.rhino.jstype.JSTypeRegistry jSTypeRegistry4 = compiler0.getTypeRegistry();
        com.google.javascript.jscomp.CodeChangeHandler.RecentChange recentChange5 = compiler0.recentChange;
        compiler0.reportCodeChange();
        boolean boolean7 = compiler0.isInliningForbidden();
        com.google.javascript.jscomp.JSError[] jSErrorArray8 = compiler0.getErrors();
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(result2);
        org.junit.Assert.assertNotNull(jSTypeRegistry4);
        org.junit.Assert.assertNotNull(recentChange5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(jSErrorArray8);
        org.junit.Assert.assertArrayEquals(jSErrorArray8, new com.google.javascript.jscomp.JSError[] {});
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        com.google.javascript.jscomp.Compiler.IntermediateState intermediateState12 = compiler0.getState();
        boolean boolean13 = compiler0.hasHaltingErrors();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(passConfig9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jSErrorArray11);
        org.junit.Assert.assertArrayEquals(jSErrorArray11, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertNotNull(intermediateState12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.rhino.Node node1 = compiler0.jsRoot;
        com.google.javascript.jscomp.ErrorManager errorManager2 = compiler0.getErrorManager();
        com.google.javascript.rhino.Node node3 = compiler0.jsRoot;
        boolean boolean4 = compiler0.isIdeMode();
        com.google.javascript.jscomp.SourceMap sourceMap5 = compiler0.getSourceMap();
        com.google.javascript.jscomp.CompilerOptions compilerOptions6 = compiler0.options;
        org.junit.Assert.assertNull(node1);
        org.junit.Assert.assertNotNull(errorManager2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(sourceMap5);
        org.junit.Assert.assertNotNull(compilerOptions6);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.jscomp.Compiler compiler0 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.ErrorManager errorManager1 = compiler0.getErrorManager();
        com.google.javascript.jscomp.TypeValidator typeValidator2 = compiler0.getTypeValidator();
        int int3 = compiler0.getWarningCount();
        com.google.javascript.rhino.Node node4 = compiler0.externsRoot;
        org.junit.Assert.assertNotNull(errorManager1);
        org.junit.Assert.assertNotNull(typeValidator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(node4);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        com.google.javascript.jscomp.ErrorManager errorManager64 = compiler63.getErrorManager();
        compiler63.addToDebugLog("");
        com.google.javascript.jscomp.CompilerOptions compilerOptions67 = compiler63.options;
        com.google.javascript.jscomp.JSError[] jSErrorArray68 = compiler63.getWarnings();
        com.google.javascript.rhino.Node node69 = null;
        compiler63.jsRoot = node69;
        java.lang.String str71 = compiler63.toSource();
        java.util.List<com.google.javascript.jscomp.CompilerInput> compilerInputList72 = compiler63.getExternsForTesting();
        com.google.javascript.jscomp.Compiler compiler73 = new com.google.javascript.jscomp.Compiler();
        com.google.javascript.jscomp.CodeChangeHandler codeChangeHandler74 = null;
        compiler73.removeChangeHandler(codeChangeHandler74);
        com.google.javascript.jscomp.CodingConvention codingConvention76 = compiler73.defaultCodingConvention;
        compiler63.defaultCodingConvention = codingConvention76;
        compiler0.defaultCodingConvention = codingConvention76;
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
        org.junit.Assert.assertNotNull(errorManager64);
        org.junit.Assert.assertNotNull(compilerOptions67);
        org.junit.Assert.assertNotNull(jSErrorArray68);
        org.junit.Assert.assertArrayEquals(jSErrorArray68, new com.google.javascript.jscomp.JSError[] {});
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(compilerInputList72);
        org.junit.Assert.assertNotNull(codingConvention76);
    }
}

