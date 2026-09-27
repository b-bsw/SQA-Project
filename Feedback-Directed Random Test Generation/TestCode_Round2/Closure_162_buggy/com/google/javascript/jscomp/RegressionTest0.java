package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        com.google.javascript.jscomp.Scope scope0 = null;
        com.google.javascript.rhino.Node node1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(scope0, node1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = com.google.javascript.jscomp.ScopedAliases.SCOPING_METHOD_NAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "goog.scope" + "'", str0, "goog.scope");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler1 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, abstractCompiler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_REFERENCES_THIS;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USES_RETURN;
        org.junit.Assert.assertNotNull(diagnosticType0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable1 = null;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler2 = null;
        com.google.javascript.jscomp.ScopedAliases scopedAliases3 = new com.google.javascript.jscomp.ScopedAliases(abstractCompiler0, preprocessorSymbolTable1, aliasTransformationHandler2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scopedAliases3.hotSwapScript(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable1 = null;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler2 = null;
        com.google.javascript.jscomp.ScopedAliases scopedAliases3 = new com.google.javascript.jscomp.ScopedAliases(abstractCompiler0, preprocessorSymbolTable1, aliasTransformationHandler2);
        java.lang.Class<?> wildcardClass4 = scopedAliases3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_USES_THROW;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        com.google.javascript.jscomp.DiagnosticType diagnosticType0 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL;
        java.lang.Class<?> wildcardClass1 = diagnosticType0.getClass();
        org.junit.Assert.assertNotNull(diagnosticType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.PreprocessorSymbolTable preprocessorSymbolTable1 = null;
        com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler aliasTransformationHandler2 = null;
        com.google.javascript.jscomp.ScopedAliases scopedAliases3 = new com.google.javascript.jscomp.ScopedAliases(abstractCompiler0, preprocessorSymbolTable1, aliasTransformationHandler2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            scopedAliases3.process(node4, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile5 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass5 = varItor4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("", node6, jSType7, compilerInput8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass6 = scope2.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isConst();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node5 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = jSTypeStaticSlot8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.Class<?> wildcardClass7 = var6.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(scope2, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        boolean boolean18 = var17.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var17.resolveType(errorReporter19);
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        var17.resolveType(errorReporter21);
        // The following exception was thrown during execution in test generation
        try {
            scope12.undeclare(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node7 = var6.getNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = var6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        int int12 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope7.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node10 = scope7.getRootNode();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        boolean boolean16 = var15.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var17 = var15.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope7.getReferences(var15);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(varIterable18);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNotNull(varItor11);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        com.google.javascript.jscomp.DiagnosticType diagnosticType9 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL;
        boolean boolean10 = arguments6.equals((java.lang.Object) diagnosticType9);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(diagnosticType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isTypeInferred();
        java.lang.Class<?> wildcardClass8 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        boolean boolean19 = var17.isConst();
        boolean boolean20 = var17.isNoShadow();
        boolean boolean21 = var17.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope12.getReferences(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var9.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node7 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.Scope scope9 = var4.getScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        java.lang.String str8 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isDefine;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.getName();
        boolean boolean11 = var4.isExtern();
        com.google.javascript.rhino.Node node12 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getOwnSlot("hi!");
        boolean boolean13 = scope9.isGlobal();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        com.google.javascript.rhino.Node node19 = var18.getNode();
        boolean boolean20 = var18.isConst();
        boolean boolean21 = var18.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope9.getReferences(var18);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varIterable22);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var8 = scope2.declare("goog.scope", node5, jSType6, compilerInput7);
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(scope7, node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, false);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isNoShadow();
        boolean boolean14 = var10.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var10.getJSDocInfo();
        java.lang.String str16 = var10.getName();
        boolean boolean17 = var10.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        boolean boolean11 = scope10.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope10.getParentScope();
        com.google.javascript.rhino.Node node13 = scope10.getRootNode();
        boolean boolean14 = var4.equals((java.lang.Object) node13);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var6.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(compilerInput7);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        boolean boolean8 = scope7.isBottom();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        java.lang.Class<?> wildcardClass17 = var10.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope6.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = arguments13.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("", node6, jSType7, compilerInput8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        java.lang.Class<?> wildcardClass9 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node6 = var4.nameNode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getSlot("goog.scope");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput4 = var3.getInput();
        com.google.javascript.rhino.Node node5 = var3.getParentNode();
        org.junit.Assert.assertNotNull(var3);
        org.junit.Assert.assertNull(compilerInput4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        java.lang.String str9 = var4.name;
        boolean boolean10 = var4.isDefine;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.Scope scope9 = var4.getScope();
        java.lang.Class<?> wildcardClass10 = scope9.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = scope5.isBottom();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("Scope.Var arguments{null}", node9, jSType10, compilerInput11, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node7, jSType8, compilerInput9, true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        java.lang.String str9 = var4.name;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile7 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        java.lang.String str8 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        java.lang.String str8 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<non-file>" + "'", str8, "<non-file>");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = var11.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        int int10 = scope9.getVarCount();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope9.declare("", node12, jSType13, compilerInput14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.jscomp.Scope.Var var10 = var9.getSymbol();
        boolean boolean11 = var9.isExtern();
        com.google.javascript.jscomp.Scope.Var var12 = var9.getDeclaration();
        java.lang.String str13 = var9.name;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var9.setType(jSType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        boolean boolean8 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("", node18, jSType19, compilerInput20, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope7.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNull(objectType9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isDefine;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean6 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var13 = scope9.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var13);
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(var17);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(scope2, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scope3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = arguments6.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        int int9 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = arguments6.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        boolean boolean7 = var4.isTypeInferred();
        boolean boolean8 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("goog.scope");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable5 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(varIterable5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        boolean boolean16 = var10.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var10.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var9.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = null;
        com.google.javascript.jscomp.Scope.Var var8 = scope2.declare("goog.scope", node5, jSType6, compilerInput7);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.Node node7 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        int int7 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        java.lang.String str8 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var10.resolveType(errorReporter12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var10.getJSDocInfo();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var10.getJSDocInfo();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNull(jSDocInfo16);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        java.lang.Class<?> wildcardClass8 = scope7.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var10.resolveType(errorReporter12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var10);
        boolean boolean15 = var10.isLocal();
        boolean boolean16 = var10.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope.Var var9 = var6.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isDefine;
        com.google.javascript.rhino.Node node9 = var7.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var7.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.getInput();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(compilerInput8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isLocal();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        com.google.javascript.rhino.Node node15 = var13.getNode();
        com.google.javascript.rhino.jstype.JSType jSType16 = var13.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var13);
        boolean boolean18 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeStaticScope17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isDefine;
        boolean boolean14 = var10.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var10.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var10.resolveType(errorReporter12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var10.getJSDocInfo();
        int int16 = var10.index;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(objectType9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var9.isConst();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            arguments6.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        boolean boolean12 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        boolean boolean11 = var4.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        boolean boolean8 = var6.isExtern();
        com.google.javascript.rhino.Node node9 = var6.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var6.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = var5.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope6.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(objectType7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("hi!", node7, jSType8, compilerInput9);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNode();
        boolean boolean14 = var12.isDefine();
        com.google.javascript.rhino.jstype.JSType jSType15 = var12.getType();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSType15);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("<non-file>", node8, jSType9, compilerInput10);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("goog.scope", node7, jSType8, compilerInput9);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        boolean boolean7 = var4.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(scope2, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope2.getSlot("");
        int int13 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("goog.scope", node12, jSType13, compilerInput14, true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.jstype.JSType jSType14 = var10.getType();
        boolean boolean15 = var10.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        int int12 = scope2.getDepth();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("hi!", node14, jSType15, compilerInput16, false);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile19 = var18.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = var16.getJSDocInfo();
        boolean boolean18 = var16.isDefine();
        com.google.javascript.jscomp.Scope scope19 = var16.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput20 = var16.input;
        com.google.javascript.jscomp.Scope.Var var21 = var16.getSymbol();
        com.google.javascript.jscomp.Scope.Var var22 = var21.getSymbol();
        boolean boolean23 = var21.isExtern();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getReferences(var21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(jSDocInfo17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(scope19);
        org.junit.Assert.assertNull(compilerInput20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertNotNull(var22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNull(jSTypeStaticScope25);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        int int12 = var4.index;
        boolean boolean13 = var4.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.getInputName();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        com.google.javascript.rhino.jstype.JSType jSType12 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        com.google.javascript.jscomp.Scope scope10 = var4.scope;
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var10.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(scope2, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        java.lang.String str15 = arguments13.toString();
        boolean boolean16 = arguments13.isNoShadow();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Scope.Var arguments{null}" + "'", str15, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSDocInfo9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        int int17 = var10.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        com.google.javascript.jscomp.Scope.Var var16 = var10.getSymbol();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.jscomp.Scope scope20 = scope19.getGlobalScope();
        boolean boolean21 = var16.equals((java.lang.Object) scope20);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope20.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNotNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varItor22);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile8 = var7.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(scope8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var6.getInput();
        boolean boolean9 = var6.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass5 = scope3.getClass();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        boolean boolean11 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.jscomp.Scope.Var var10 = var9.getSymbol();
        boolean boolean11 = var9.isExtern();
        com.google.javascript.jscomp.Scope.Var var12 = var9.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = var12.isLocal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope6.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        com.google.javascript.jscomp.Scope.Var var15 = arguments13.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(var15);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType5 = var4.getType();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSType5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        com.google.javascript.jscomp.Scope.Var var16 = var10.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        boolean boolean16 = var10.isGlobal();
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        int int12 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        java.lang.Class<?> wildcardClass23 = jSTypeStaticScope22.getClass();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isLocal();
        java.lang.String str9 = var6.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("goog.scope");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        com.google.javascript.jscomp.Scope.Var var18 = var11.getSymbol();
        java.lang.Class<?> wildcardClass19 = var18.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.getName();
        boolean boolean11 = var4.isExtern();
        boolean boolean12 = var4.isDefine();
        java.lang.Class<?> wildcardClass13 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        boolean boolean8 = var6.isExtern();
        com.google.javascript.rhino.Node node9 = var6.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var6.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var7.getInput();
        com.google.javascript.rhino.Node node9 = var7.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope5.declare("arguments", node7, jSType8, compilerInput9);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        boolean boolean8 = scope2.isDeclared("<non-file>", true);
        boolean boolean9 = scope2.isBottom();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean9 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        java.lang.String str16 = var11.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNode();
        boolean boolean14 = var12.isConst();
        java.lang.String str15 = var12.getName();
        java.lang.String str16 = var12.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            scope7.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        boolean boolean15 = arguments13.isLocal();
        com.google.javascript.jscomp.Scope scope16 = arguments13.getScope();
        java.lang.String str17 = arguments13.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("goog.scope");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNull(objectType11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope2.getOwnSlot("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        boolean boolean7 = var6.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.Node node9 = var4.getParentNode();
        boolean boolean10 = var4.isDefine();
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        var4.resolveType(errorReporter11);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = jSTypeStaticSlot9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType10 = scope8.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(objectType10);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        arguments11.resolveType(errorReporter12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope16.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope16.getSlot("hi!");
        boolean boolean22 = scope16.isBottom();
        boolean boolean23 = arguments11.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(varItor18);
        org.junit.Assert.assertNotNull(varItor19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        java.lang.String str15 = arguments13.toString();
        boolean boolean16 = arguments13.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Scope.Var arguments{null}" + "'", str15, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        boolean boolean17 = var11.isConst();
        boolean boolean18 = var11.isDefine;
        com.google.javascript.rhino.Node node19 = var11.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.Node node9 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(objectType8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope5 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        boolean boolean17 = var11.isConst();
        boolean boolean18 = var11.isConst();
        boolean boolean19 = var11.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var10.resolveType(errorReporter12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var10.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSDocInfo15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.rhino.jstype.JSType jSType12 = var9.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        boolean boolean10 = scope2.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope10 = var4.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("goog.scope", node9, jSType10, compilerInput11, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var13.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        boolean boolean10 = var9.isTypeInferred();
        boolean boolean11 = var9.isNoShadow();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var9.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var5 = scope3.getVar("arguments");
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNull(var5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        boolean boolean9 = arguments6.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var10.getJSDocInfo();
        boolean boolean12 = var10.isDefine();
        com.google.javascript.jscomp.Scope scope13 = var10.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var10.input;
        com.google.javascript.jscomp.Scope.Var var15 = var10.getSymbol();
        boolean boolean16 = var15.isTypeInferred();
        boolean boolean17 = var15.isNoShadow();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(compilerInput14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varIterable9);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("", node8, jSType9, compilerInput10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNotNull(varIterable8);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("arguments", node8, jSType9, compilerInput10);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = var11.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("", node11, jSType12, compilerInput13, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = node11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.name;
        boolean boolean8 = var6.isConst();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = var6.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var7.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getSlot("arguments");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        boolean boolean17 = var11.isConst();
        boolean boolean18 = var11.isDefine;
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var11.resolveType(errorReporter19);
        java.lang.Object obj21 = null;
        boolean boolean22 = var11.equals(obj21);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        int int15 = scope2.getVarCount();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var22 = scope18.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput23 = var22.input;
        boolean boolean24 = var22.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(varItor20);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertNotNull(var22);
        org.junit.Assert.assertNull(compilerInput23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        com.google.javascript.jscomp.Scope scope23 = var16.scope;
        java.lang.String str24 = var16.toString();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(scope23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Scope.Var arguments{null}" + "'", str24, "Scope.Var arguments{null}");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getVar("goog.scope");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node15 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node11 = scope8.getRootNode();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        boolean boolean17 = var16.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var18 = var16.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope8.getReferences(var16);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        var16.resolveType(errorReporter20);
        com.google.javascript.jscomp.Scope.Var var22 = var16.getSymbol();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.jscomp.Scope scope26 = scope25.getGlobalScope();
        boolean boolean27 = var22.equals((java.lang.Object) scope26);
        com.google.javascript.jscomp.Scope.Var var28 = var22.getDeclaration();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope2.getReferences(var22);
        boolean boolean30 = var22.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNotNull(varIterable19);
        org.junit.Assert.assertNotNull(var22);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(var28);
        org.junit.Assert.assertNotNull(varIterable29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        int int9 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = var11.input;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = var11.input;
        java.lang.String str18 = var11.getName();
        java.lang.String str19 = var11.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNull(compilerInput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        boolean boolean7 = var4.isNoShadow();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope7.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        java.lang.String str7 = var4.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.getInput();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass7 = varItor6.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.getInputName();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        com.google.javascript.rhino.Node node7 = var4.getNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node8 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean12 = arguments11.isDefine();
        java.lang.String str13 = arguments11.getInputName();
        com.google.javascript.rhino.Node node14 = arguments11.getNameNode();
        boolean boolean15 = arguments11.isGlobal();
        com.google.javascript.jscomp.Scope.Var var16 = arguments11.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isGlobal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        java.lang.String str9 = arguments6.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        boolean boolean14 = scope12.isLocal();
        boolean boolean15 = scope12.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("<non-file>", node6, jSType7, compilerInput8, false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope7.declare("hi!", node9, jSType10, compilerInput11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = var12.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isDefine;
        com.google.javascript.rhino.Node node9 = var7.getNode();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var7.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node11 = scope8.getRootNode();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        boolean boolean17 = var16.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var18 = var16.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope8.getReferences(var16);
        com.google.javascript.rhino.ErrorReporter errorReporter20 = null;
        var16.resolveType(errorReporter20);
        com.google.javascript.jscomp.Scope.Var var22 = var16.getSymbol();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.jscomp.Scope scope26 = scope25.getGlobalScope();
        boolean boolean27 = var22.equals((java.lang.Object) scope26);
        com.google.javascript.jscomp.Scope.Var var28 = var22.getDeclaration();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable29 = scope2.getReferences(var22);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType31 = null;
        com.google.javascript.jscomp.Scope scope32 = new com.google.javascript.jscomp.Scope(node30, objectType31);
        com.google.javascript.rhino.Node node33 = scope32.getRootNode();
        com.google.javascript.jscomp.Scope.Var var34 = scope32.getArgumentsVar();
        com.google.javascript.rhino.Node node35 = var34.getNode();
        boolean boolean36 = var34.isConst();
        boolean boolean37 = var34.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter38 = null;
        var34.resolveType(errorReporter38);
        boolean boolean40 = var34.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput41 = var34.getInput();
        java.lang.String str42 = var34.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNotNull(varIterable19);
        org.junit.Assert.assertNotNull(var22);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(var28);
        org.junit.Assert.assertNotNull(varIterable29);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNotNull(var34);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(compilerInput41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "<non-file>" + "'", str42, "<non-file>");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = arguments6.getScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        boolean boolean11 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        com.google.javascript.rhino.Node node15 = var13.getNode();
        com.google.javascript.rhino.jstype.JSType jSType16 = var13.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var13);
        java.lang.String str18 = var13.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            var13.setType(jSType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeStaticScope17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<non-file>" + "'", str18, "<non-file>");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("arguments", node10, jSType11, compilerInput12);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean6 = scope2.isDeclared("", true);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var13 = scope9.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var13);
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        int int16 = scope15.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("arguments", node10, jSType11, compilerInput12, false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        boolean boolean6 = scope3.isDeclared("arguments", true);
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.nameNode;
        com.google.javascript.rhino.Node node10 = var4.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        java.lang.String str7 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getVarCount();
        boolean boolean9 = scope2.isDeclared("arguments", true);
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        java.lang.String str8 = var4.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("goog.scope", node11, jSType12, compilerInput13);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var6.getInput();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            var6.setType(jSType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        com.google.javascript.rhino.Node node7 = var4.getNode();
        boolean boolean8 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        boolean boolean10 = var4.isConst();
        boolean boolean11 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        int int6 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(varItor7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        int int8 = scope7.getDepth();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope7.declare("arguments", node10, jSType11, compilerInput12, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var7.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var7.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSDocInfo8);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope10 = var4.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var7.nameNode;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            var7.setType(jSType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        java.lang.String str10 = var4.toString();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Scope.Var arguments{null}" + "'", str10, "Scope.Var arguments{null}");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope7 = scope6.getParent();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = scope7.isGlobal();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        boolean boolean17 = var11.isConst();
        boolean boolean18 = var11.isDefine;
        boolean boolean19 = var11.isTypeInferred();
        boolean boolean20 = var11.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var5.getInput();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = var9.getNode();
        boolean boolean11 = var9.isConst();
        boolean boolean12 = var9.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var9.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        java.lang.String str9 = var4.name;
        boolean boolean10 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var11 = var4.getDeclaration();
        com.google.javascript.jscomp.Scope.Var var12 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        int int12 = var4.index;
        com.google.javascript.jscomp.Scope.Var var13 = var4.getDeclaration();
        com.google.javascript.jscomp.Scope scope14 = var4.scope;
        boolean boolean15 = var4.isNoShadow();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(scope4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var10.resolveType(errorReporter12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var10);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope7.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope7.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var11 = scope7.getArgumentsVar();
        boolean boolean12 = var11.isTypeInferred();
        boolean boolean13 = var11.isExtern();
        com.google.javascript.rhino.Node node14 = var11.getParentNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope(var11);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        var11.resolveType(errorReporter16);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(jSTypeStaticScope15);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(scope2, node7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isDefine;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        java.lang.String str8 = var4.name;
        com.google.javascript.rhino.jstype.JSType jSType9 = var4.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean12 = arguments11.isDefine();
        java.lang.String str13 = arguments11.getInputName();
        com.google.javascript.rhino.Node node14 = arguments11.getNameNode();
        boolean boolean15 = arguments11.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.jscomp.Scope.Var var10 = var9.getSymbol();
        boolean boolean11 = var9.isExtern();
        com.google.javascript.jscomp.Scope.Var var12 = var9.getDeclaration();
        java.lang.String str13 = var9.name;
        com.google.javascript.jscomp.Scope scope14 = var9.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        java.lang.String str18 = var11.toString();
        java.lang.String str19 = var11.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.rhino.Node node18 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        int int8 = scope7.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope7.getAllSymbols();
        boolean boolean10 = scope7.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node16 = var15.getNode();
        com.google.javascript.rhino.Node node17 = var15.getNode();
        boolean boolean18 = var15.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            scope7.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        java.lang.String str8 = var4.getName();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = var9.getScope();
        com.google.javascript.jscomp.Scope scope13 = var9.getScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope13.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        com.google.javascript.jscomp.Scope scope23 = var16.scope;
        java.lang.String str24 = var16.getInputName();
        com.google.javascript.jscomp.Scope scope25 = var16.getScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope25.getParentScope();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.rhino.Node node30 = scope29.getRootNode();
        com.google.javascript.jscomp.Scope.Var var31 = scope29.getArgumentsVar();
        com.google.javascript.rhino.Node node32 = var31.getNode();
        boolean boolean33 = var31.isConst();
        boolean boolean34 = var31.isDefine;
        boolean boolean35 = var31.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            scope25.undeclare(var31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(scope23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<non-file>" + "'", str24, "<non-file>");
        org.junit.Assert.assertNotNull(scope25);
        org.junit.Assert.assertNull(jSTypeStaticScope26);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(var31);
        org.junit.Assert.assertNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        java.lang.String str12 = var4.name;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var6 = null;
        // The following exception was thrown during execution in test generation
        try {
            scope5.undeclare(var6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(scope5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean12 = scope2.isDeclared("arguments", false);
        boolean boolean13 = scope2.isLocal();
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType10 = var9.getType();
        java.lang.String str11 = var9.getInputName();
        java.lang.String str12 = var9.toString();
        boolean boolean13 = var9.isNoShadow();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var5.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope scope9 = var6.getScope();
        com.google.javascript.jscomp.Scope scope10 = var6.getScope();
        boolean boolean11 = var6.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNotNull(varIterable16);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isDefine;
        boolean boolean14 = var10.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var10);
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope2.getTypeOfThis();
        int int17 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        int int12 = var4.index;
        com.google.javascript.jscomp.Scope.Var var13 = var4.getDeclaration();
        com.google.javascript.jscomp.Scope scope14 = var4.scope;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope14.declare("<non-file>", node16, jSType17, compilerInput18, false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        int int9 = scope8.getVarCount();
        boolean boolean10 = scope8.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.jscomp.Scope.Var var8 = arguments6.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope6 = new com.google.javascript.jscomp.Scope(scope2, node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        boolean boolean12 = scope8.isDeclared("hi!", true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = var11.getJSDocInfo();
        boolean boolean13 = var11.isExtern();
        boolean boolean14 = var11.isTypeInferred();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("Scope.Var arguments{null}", node17, jSType18, compilerInput19, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(jSDocInfo12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNotNull(var21);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope2.getOwnSlot("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.getNameNode();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope11.declare("arguments", node14, jSType15, compilerInput16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        java.lang.String str10 = var9.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope12 = var9.getScope();
        com.google.javascript.jscomp.Scope scope13 = var9.getScope();
        com.google.javascript.jscomp.Scope scope14 = var9.scope;
        int int15 = scope14.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        java.lang.String str9 = var4.name;
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        com.google.javascript.jscomp.CompilerInput compilerInput16 = var11.input;
        com.google.javascript.rhino.jstype.JSType jSType17 = var11.getType();
        com.google.javascript.rhino.Node node18 = var11.getParentNode();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var11.resolveType(errorReporter19);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(scope2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var5.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var5.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNull(compilerInput8);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        com.google.javascript.jscomp.Scope scope23 = var16.scope;
        java.lang.String str24 = var16.getInputName();
        com.google.javascript.jscomp.Scope scope25 = var16.getScope();
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(scope23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "<non-file>" + "'", str24, "<non-file>");
        org.junit.Assert.assertNotNull(scope25);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = var6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getVar("goog.scope");
        com.google.javascript.jscomp.Scope scope14 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = var19.getJSDocInfo();
        boolean boolean21 = var19.isDefine();
        com.google.javascript.jscomp.Scope scope22 = var19.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput23 = var19.input;
        com.google.javascript.jscomp.Scope.Var var24 = var19.getSymbol();
        com.google.javascript.jscomp.Scope.Var var25 = var24.getSymbol();
        boolean boolean26 = var24.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(scope22);
        org.junit.Assert.assertNull(compilerInput23);
        org.junit.Assert.assertNotNull(var24);
        org.junit.Assert.assertNotNull(var25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        boolean boolean9 = var4.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getSymbol();
        com.google.javascript.rhino.Node node12 = var4.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        java.lang.String str12 = var4.name;
        boolean boolean13 = var4.isExtern();
        java.lang.String str14 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        java.lang.String str17 = var16.getInputName();
        boolean boolean18 = var16.isDefine;
        com.google.javascript.jscomp.Scope.Var var19 = var16.getSymbol();
        boolean boolean20 = var19.isDefine;
        com.google.javascript.rhino.Node node21 = var19.getNode();
        com.google.javascript.jscomp.Scope.Var var22 = var19.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("goog.scope");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("<non-file>", node8, jSType9, compilerInput10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        java.lang.String str10 = var9.getName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType10 = var9.getType();
        java.lang.String str11 = var9.getInputName();
        com.google.javascript.jscomp.Scope.Var var12 = var9.getSymbol();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope9.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean10 = arguments9.isLocal();
        boolean boolean12 = arguments9.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        java.lang.String str6 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.Object obj8 = null;
        boolean boolean9 = var6.equals(obj8);
        java.lang.String str10 = var6.toString();
        java.lang.String str11 = var6.toString();
        java.lang.String str12 = var6.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Scope.Var arguments{null}" + "'", str10, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.getName();
        boolean boolean11 = var4.isExtern();
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        boolean boolean13 = var4.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope2.declare("goog.scope", node18, jSType19, compilerInput20, false);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(scope2, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        com.google.javascript.jscomp.Scope.Var var16 = var10.getSymbol();
        boolean boolean17 = var16.isDefine();
        com.google.javascript.rhino.Node node18 = var16.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.getInputName();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var4.resolveType(errorReporter12);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        java.lang.String str7 = var4.getName();
        java.lang.String str8 = var4.getInputName();
        int int9 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<non-file>" + "'", str8, "<non-file>");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        boolean boolean9 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.getNameNode();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        com.google.javascript.rhino.Node node13 = scope11.getRootNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope scope10 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(varItor11);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        boolean boolean9 = var4.isConst();
        int int10 = var4.index;
        com.google.javascript.rhino.Node node11 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isDefine;
        boolean boolean14 = var10.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var10);
        java.lang.Class<?> wildcardClass16 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        boolean boolean10 = var5.isTypeInferred();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        com.google.javascript.jscomp.Scope.Var var18 = var11.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope14.getOwnSlot("hi!");
        boolean boolean18 = scope14.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope14.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare((com.google.javascript.jscomp.Scope.Var) arguments21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("hi!", node8, jSType9, compilerInput10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope2, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var7.getJSDocInfo();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var7.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        boolean boolean9 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope11.getOwnSlot("hi!");
        boolean boolean15 = scope11.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope11.getTypeOfThis();
        boolean boolean17 = scope11.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope11.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope11);
        boolean boolean21 = arguments20.isDefine();
        java.lang.String str22 = arguments20.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare((com.google.javascript.jscomp.Scope.Var) arguments20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<non-file>" + "'", str22, "<non-file>");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        boolean boolean10 = var9.isTypeInferred();
        boolean boolean11 = var9.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var9.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        com.google.javascript.jscomp.Scope.Var var8 = var5.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var5.getInput();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        java.lang.String str18 = var11.toString();
        java.lang.String str19 = var11.getInputName();
        com.google.javascript.rhino.Node node20 = var11.getNode();
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = var9.getNode();
        boolean boolean11 = var9.isConst();
        boolean boolean12 = var9.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var9.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var9);
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(varIterable16);
        org.junit.Assert.assertNotNull(varItor17);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.rhino.Node node18 = scope2.getRootNode();
        int int19 = scope2.getDepth();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        java.lang.Class<?> wildcardClass9 = scope8.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        boolean boolean9 = var4.isLocal();
        java.lang.Class<?> wildcardClass10 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("<non-file>", node8, jSType9, compilerInput10, true);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var4.getParentNode();
        boolean boolean9 = var4.isConst();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.Node node10 = var4.getParentNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        com.google.javascript.jscomp.Scope scope23 = var16.scope;
        int int24 = scope23.getVarCount();
        com.google.javascript.jscomp.Scope.Var var26 = scope23.getVar("<non-file>");
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNotNull(scope23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(var26);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(varItor7);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        com.google.javascript.jscomp.Scope.Var var10 = var9.getDeclaration();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var9.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int9 = scope2.getDepth();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope7.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varItor9);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        boolean boolean9 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.Node node9 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        java.lang.Class<?> wildcardClass11 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        boolean boolean10 = var4.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        java.lang.String str12 = var4.getInputName();
        java.lang.String str13 = var4.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<non-file>" + "'", str12, "<non-file>");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertNull(compilerInput14);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.CompilerInput compilerInput12 = arguments11.input;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope15.getOwnSlot("hi!");
        boolean boolean19 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope15.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope15.getSlot("arguments");
        boolean boolean23 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType24 = scope15.getTypeOfThis();
        boolean boolean25 = scope15.isBottom();
        boolean boolean26 = arguments11.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertNull(jSTypeStaticScope16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(objectType20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(objectType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        arguments11.resolveType(errorReporter12);
        com.google.javascript.rhino.Node node14 = arguments11.nameNode;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = arguments11.getInput();
        java.lang.String str16 = arguments11.toString();
        boolean boolean17 = arguments11.isLocal();
        boolean boolean18 = arguments11.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(compilerInput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        int int12 = var4.index;
        java.lang.String str13 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("arguments");
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        boolean boolean8 = var7.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope5);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        boolean boolean8 = scope2.isDeclared("<non-file>", true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("arguments", node10, jSType11, compilerInput12, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean12 = scope2.isDeclared("arguments", false);
        com.google.javascript.jscomp.Scope scope13 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope13.getOwnSlot("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        boolean boolean7 = scope6.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope6.getAllSymbols();
        int int9 = scope6.getDepth();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var14.getJSDocInfo();
        boolean boolean16 = var14.isDefine();
        com.google.javascript.jscomp.Scope scope17 = var14.getScope();
        com.google.javascript.jscomp.Scope scope18 = var14.getScope();
        com.google.javascript.rhino.Node node19 = var14.getNode();
        com.google.javascript.jscomp.Scope.Var var20 = var14.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            scope6.undeclare(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        com.google.javascript.jscomp.Scope scope10 = var4.scope;
        boolean boolean11 = scope10.isGlobal();
        int int12 = scope10.getVarCount();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope10.declare("arguments", node14, jSType15, compilerInput16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.Node node6 = var4.getParentNode();
        java.lang.String str7 = var4.getName();
        java.lang.String str8 = var4.toString();
        boolean boolean9 = var4.isExtern();
        boolean boolean10 = var4.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.name;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var6.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.name;
        boolean boolean8 = var6.isConst();
        boolean boolean9 = var6.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.getNameNode();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        boolean boolean10 = var9.isTypeInferred();
        boolean boolean11 = var9.isNoShadow();
        java.lang.String str12 = var9.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var11);
        com.google.javascript.rhino.Node node16 = var11.getNameNode();
        java.lang.String str17 = var11.getInputName();
        boolean boolean18 = var11.isTypeInferred();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var7.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var7.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope6.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        java.lang.Class<?> wildcardClass15 = scope6.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        boolean boolean10 = var9.isGlobal();
        java.lang.Class<?> wildcardClass11 = var9.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope scope9 = var6.getScope();
        boolean boolean10 = var6.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean6 = scope2.isDeclared("", true);
        boolean boolean9 = scope2.isDeclared("arguments", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope scope9 = var4.getScope();
        boolean boolean10 = scope9.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var10.resolveType(errorReporter14);
        com.google.javascript.jscomp.Scope.Var var16 = var10.getSymbol();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.jscomp.Scope scope20 = scope19.getGlobalScope();
        boolean boolean21 = var16.equals((java.lang.Object) scope20);
        java.lang.String str22 = var16.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile23 = var16.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNotNull(scope20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<non-file>" + "'", str22, "<non-file>");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        boolean boolean13 = scope12.isBottom();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        java.lang.String str8 = var4.name;
        com.google.javascript.rhino.jstype.JSType jSType9 = var4.getType();
        int int10 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.Node node6 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        java.lang.String str18 = var11.toString();
        java.lang.String str19 = var11.getInputName();
        com.google.javascript.rhino.Node node20 = var11.getNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile21 = var11.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        java.lang.String str7 = var4.getName();
        java.lang.String str8 = var4.getInputName();
        boolean boolean9 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<non-file>" + "'", str8, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope3.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope7.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope7.getOwnSlot("hi!");
        boolean boolean11 = scope7.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        boolean boolean18 = var16.isConst();
        boolean boolean19 = var16.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope7.getReferences(var16);
        boolean boolean21 = var16.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope3.getScope(var16);
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = var16.getJSDocInfo();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertNull(jSDocInfo23);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isTypeInferred();
        java.lang.String str8 = var4.toString();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope scope10 = scope2.getGlobalScope();
        java.lang.Class<?> wildcardClass11 = scope10.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.JSType jSType7 = arguments6.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSType7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        com.google.javascript.jscomp.Scope.Var var10 = var4.getDeclaration();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var4.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNull(jSDocInfo7);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.Node node10 = var4.getNode();
        int int11 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isConst();
        java.lang.String str7 = var5.toString();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Scope.Var arguments{null}" + "'", str7, "Scope.Var arguments{null}");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        int int5 = scope2.getVarCount();
        boolean boolean6 = scope2.isBottom();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope scope9 = var6.getScope();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = var6.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        boolean boolean14 = scope2.isDeclared("arguments", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = var11.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(jSDocInfo12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        java.lang.String str9 = var4.toString();
        int int10 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = arguments6.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = node7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        int int13 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope scope9 = var6.getScope();
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope9.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(objectType11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getArgumentsVar();
        boolean boolean16 = var15.isConst();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var9 = arguments8.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.Node node8 = var4.nameNode;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        java.lang.String str10 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        int int6 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        java.lang.String str7 = var4.getName();
        java.lang.Class<?> wildcardClass8 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.Node node6 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = var8.input;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.String str8 = var6.toString();
        com.google.javascript.jscomp.Scope scope9 = var6.getScope();
        com.google.javascript.jscomp.Scope scope10 = var6.getScope();
        com.google.javascript.rhino.Node node11 = var6.getNameNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean6 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        java.lang.String str7 = var5.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        int int10 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope11 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("arguments");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput4 = var3.getInput();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            var3.setType(jSType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(var3);
        org.junit.Assert.assertNull(compilerInput4);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.Node node7 = var4.getNameNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        boolean boolean13 = var12.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var12.resolveType(errorReporter14);
        com.google.javascript.jscomp.Scope scope16 = var12.getScope();
        boolean boolean17 = var12.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNameNode();
        int int14 = var12.index;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(var4);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        int int10 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var11.resolveType(errorReporter12);
        boolean boolean14 = var11.isGlobal();
        com.google.javascript.rhino.Node node15 = var11.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean12 = scope2.isDeclared("arguments", false);
        com.google.javascript.jscomp.Scope scope13 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope8.getOwnSlot("hi!");
        int int12 = scope8.getVarCount();
        com.google.javascript.rhino.Node node13 = scope8.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope8.getVar("<non-file>");
        boolean boolean17 = scope8.isLocal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope8.declare("Scope.Var arguments{null}", node19, jSType20, compilerInput21);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean12 = arguments11.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var7.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope9 = var7.getScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.getNameNode();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var4.getInput();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var4.resolveType(errorReporter13);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(compilerInput12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var4.getJSDocInfo();
        java.lang.String str9 = var4.getName();
        boolean boolean10 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = var8.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.getName();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        boolean boolean7 = var4.isTypeInferred();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope14 = var13.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        com.google.javascript.jscomp.Scope.Var var20 = scope14.declare("<non-file>", node17, jSType18, compilerInput19);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(var20);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        boolean boolean15 = arguments13.isLocal();
        boolean boolean16 = arguments13.isNoShadow();
        java.lang.String str17 = arguments13.getName();
        com.google.javascript.rhino.Node node18 = arguments13.nameNode;
        java.lang.String str19 = arguments13.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        java.lang.String str13 = var4.name;
        boolean boolean14 = var4.isDefine();
        com.google.javascript.rhino.Node node15 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        boolean boolean8 = scope2.isBottom();
        boolean boolean11 = scope2.isDeclared("Scope.Var arguments{null}", false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        java.lang.String str7 = var4.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        java.lang.String str10 = var4.getInputName();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getSymbol();
        java.lang.String str12 = var4.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope6.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        boolean boolean18 = scope17.isBottom();
        com.google.javascript.jscomp.Scope.Var var20 = scope17.getVar("");
        boolean boolean21 = arguments13.equals((java.lang.Object) scope17);
        com.google.javascript.jscomp.Scope scope22 = scope17.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(scope22);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.getName();
        boolean boolean11 = var4.isExtern();
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        boolean boolean13 = var4.isGlobal();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var4.resolveType(errorReporter14);
        com.google.javascript.rhino.Node node16 = var4.getParentNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.nameNode;
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSDocInfo10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope7 = scope6.getParent();
        com.google.javascript.rhino.Node node8 = scope6.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope8.getParentScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope7.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean12 = scope2.isDeclared("arguments", false);
        boolean boolean13 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = scope2.getAllSymbols();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(varIterable6);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var4.getJSDocInfo();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNull(jSDocInfo7);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope9.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments13);
        boolean boolean15 = arguments13.isLocal();
        boolean boolean16 = arguments13.isNoShadow();
        boolean boolean17 = arguments13.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        int int8 = var4.index;
        boolean boolean9 = var4.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = var4.getNameNode();
        java.lang.String str10 = var4.getName();
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNotNull(var6);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        java.lang.String str17 = var11.getInputName();
        java.lang.String str18 = var11.toString();
        java.lang.String str19 = var11.getInputName();
        com.google.javascript.jscomp.Scope scope20 = var11.getScope();
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(scope20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
        org.junit.Assert.assertNotNull(scope20);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope2.getAllSymbols();
        boolean boolean14 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        com.google.javascript.rhino.Node node15 = var13.getNode();
        com.google.javascript.rhino.jstype.JSType jSType16 = var13.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var13);
        com.google.javascript.rhino.Node node18 = var13.getNameNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeStaticScope17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        arguments11.resolveType(errorReporter12);
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        arguments11.resolveType(errorReporter14);
        java.lang.String str16 = arguments11.getName();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope19.getOwnSlot("hi!");
        int int23 = scope19.getVarCount();
        com.google.javascript.rhino.Node node24 = scope19.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = scope19.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = scope19.getAllSymbols();
        com.google.javascript.rhino.Node node27 = scope19.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean29 = arguments11.equals((java.lang.Object) varItor28);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope20);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(objectType25);
        org.junit.Assert.assertNotNull(varIterable26);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(varItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var10.resolveType(errorReporter13);
        com.google.javascript.rhino.Node node15 = var10.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var10);
        boolean boolean17 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getSlot("<non-file>");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope2.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope2.getVars();
        int int22 = scope2.getVarCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
        org.junit.Assert.assertNotNull(varIterable20);
        org.junit.Assert.assertNotNull(varItor21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope10 = var4.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope10, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        java.lang.Object obj8 = null;
        boolean boolean9 = var6.equals(obj8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var6.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope4 = scope2.getParent();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(scope4);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        com.google.javascript.rhino.Node node10 = var4.getParentNode();
        java.lang.String str11 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        com.google.javascript.jscomp.Scope.Var var9 = var5.getSymbol();
        boolean boolean10 = var5.isNoShadow();
        java.lang.String str11 = var5.toString();
        boolean boolean12 = var5.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        boolean boolean17 = var11.isConst();
        boolean boolean18 = var11.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        boolean boolean11 = var10.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var10.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope2.getReferences(var10);
        com.google.javascript.rhino.jstype.JSType jSType14 = var10.getType();
        boolean boolean15 = var10.isDefine();
        com.google.javascript.jscomp.Scope scope16 = var10.scope;
        boolean boolean17 = scope16.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        int int8 = scope7.getVarCount();
        com.google.javascript.jscomp.Scope.Var var10 = scope7.getVar("arguments");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.Node node8 = var4.nameNode;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = var14.getInput();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNotNull(jSTypeStaticScope17);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(varIterable8);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean12 = arguments11.isDefine();
        java.lang.String str13 = arguments11.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = arguments11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        java.lang.String str9 = var4.getInputName();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.scope;
        com.google.javascript.jscomp.Scope.Var var12 = var4.getSymbol();
        boolean boolean13 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        com.google.javascript.rhino.Node node15 = var13.getNode();
        com.google.javascript.rhino.jstype.JSType jSType16 = var13.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var13);
        java.lang.String str18 = var13.getInputName();
        boolean boolean19 = var13.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertNotNull(jSTypeStaticScope17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<non-file>" + "'", str18, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isDefine;
        boolean boolean14 = var10.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope2.getReferences(var10);
        boolean boolean16 = var10.isLocal();
        com.google.javascript.jscomp.Scope scope17 = var10.getScope();
        com.google.javascript.rhino.Node node18 = var10.nameNode;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNotNull(varIterable7);
        org.junit.Assert.assertNotNull(varIterable8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope7 = scope6.getParent();
        boolean boolean10 = scope6.isDeclared("arguments", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        boolean boolean7 = var4.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

