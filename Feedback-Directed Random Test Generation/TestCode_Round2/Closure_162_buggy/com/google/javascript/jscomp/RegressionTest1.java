package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        var11.resolveType(errorReporter17);
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var11.resolveType(errorReporter19);
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
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope14 = var13.getScope();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        var9.resolveType(errorReporter11);
        int int13 = var9.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
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
        boolean boolean10 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var9.getJSDocInfo();
        boolean boolean11 = var9.isDefine();
        com.google.javascript.jscomp.Scope scope12 = var9.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var9.input;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile15 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var17 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var21 = var17.getDeclaration();
        boolean boolean22 = var17.isTypeInferred();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNull(var21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        com.google.javascript.jscomp.CompilerInput compilerInput15 = var13.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(compilerInput15);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        boolean boolean12 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isExtern();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node6 = var4.nameNode;
        com.google.javascript.rhino.Node node7 = var4.nameNode;
        com.google.javascript.rhino.Node node8 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var17 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var21 = var17.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType22 = var21.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertNull(jSType22);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("hi!", node7, jSType8, compilerInput9, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        java.lang.String str7 = var4.getInputName();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var4.resolveType(errorReporter8);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getVars();
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope2, node19);
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
        org.junit.Assert.assertNotNull(varItor18);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int9 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope6.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        java.lang.Class<?> wildcardClass16 = varIterable15.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isConst();
        boolean boolean9 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node16 = var15.getNode();
        boolean boolean17 = var15.isConst();
        boolean boolean18 = var15.isNoShadow();
        boolean boolean19 = var15.isDefine();
        java.lang.String str20 = var15.name;
        boolean boolean21 = var15.isDefine;
        boolean boolean22 = var15.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope2.getReferences(var15);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(var15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "arguments" + "'", str20, "arguments");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(varIterable23);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        int int6 = scope2.getVarCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        int int8 = var5.index;
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        var5.resolveType(errorReporter9);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var9.input;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            var9.setType(jSType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        boolean boolean9 = scope2.isDeclared("", true);
        java.lang.Class<?> wildcardClass10 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        com.google.javascript.jscomp.Scope.Var var10 = var9.getSymbol();
        boolean boolean11 = var9.isDefine;
        java.lang.String str12 = var9.toString();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean10 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        boolean boolean10 = scope2.isDeclared("arguments", false);
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
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
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var4.getJSDocInfo();
        java.lang.String str9 = var4.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
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
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        arguments11.resolveType(errorReporter17);
        java.lang.String str19 = arguments11.toString();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(compilerInput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Scope.Var arguments{null}" + "'", str19, "Scope.Var arguments{null}");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("Scope.Var arguments{null}", node12, jSType13, compilerInput14, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var5.resolveType(errorReporter7);
        boolean boolean9 = var5.isDefine;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("goog.scope");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        java.lang.String str14 = var13.getInputName();
        boolean boolean15 = var13.isDefine;
        com.google.javascript.jscomp.Scope.Var var16 = var13.getSymbol();
        boolean boolean17 = var13.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var13);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<non-file>" + "'", str14, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope18);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var4.getJSDocInfo();
        java.lang.String str9 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        boolean boolean20 = scope17.isDeclared("hi!", true);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        java.lang.String str7 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope2.getVar("goog.scope");
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getVar("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
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
        boolean boolean19 = var18.isLocal();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
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
        boolean boolean11 = var4.isLocal();
        java.lang.String str12 = var4.toString();
        boolean boolean13 = var4.isExtern();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType14);
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        com.google.javascript.rhino.Node node24 = scope23.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = scope23.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = scope23.getOwnSlot("");
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.jscomp.Scope scope30 = new com.google.javascript.jscomp.Scope(node28, objectType29);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = scope30.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot33 = scope30.getOwnSlot("hi!");
        int int34 = scope30.getVarCount();
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType36 = null;
        com.google.javascript.jscomp.Scope scope37 = new com.google.javascript.jscomp.Scope(node35, objectType36);
        com.google.javascript.rhino.Node node38 = scope37.getRootNode();
        com.google.javascript.jscomp.Scope.Var var39 = scope37.getArgumentsVar();
        com.google.javascript.rhino.Node node40 = var39.getNode();
        boolean boolean41 = var39.isConst();
        boolean boolean42 = var39.isNoShadow();
        boolean boolean43 = var39.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope44 = scope30.getScope(var39);
        boolean boolean45 = var39.isConst();
        // The following exception was thrown during execution in test generation
        try {
            scope23.undeclare(var39);
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
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNull(objectType25);
        org.junit.Assert.assertNull(jSTypeStaticSlot27);
        org.junit.Assert.assertNull(jSTypeStaticScope31);
        org.junit.Assert.assertNull(jSTypeStaticSlot33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(node38);
        org.junit.Assert.assertNotNull(var39);
        org.junit.Assert.assertNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        java.lang.String str8 = var4.name;
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        boolean boolean13 = var4.isLocal();
        int int14 = var4.index;
        boolean boolean15 = var4.isDefine();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("Scope.Var arguments{null}", node14, jSType15, compilerInput16);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.getInputName();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
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
        int int14 = var11.index;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var11.setType(jSType15);
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
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        com.google.javascript.jscomp.CompilerInput compilerInput19 = var11.input;
        com.google.javascript.rhino.Node node20 = var11.getParentNode();
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
        org.junit.Assert.assertNull(compilerInput19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var6.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        com.google.javascript.rhino.Node node19 = var18.getNode();
        boolean boolean20 = var18.isConst();
        boolean boolean21 = var18.isNoShadow();
        boolean boolean22 = var18.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = var18.getJSDocInfo();
        boolean boolean24 = var18.isDefine();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(objectType13);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(jSDocInfo23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        com.google.javascript.jscomp.Scope scope15 = arguments11.getScope();
        boolean boolean16 = arguments11.isDefine;
        boolean boolean17 = arguments11.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        com.google.javascript.rhino.Node node17 = var10.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        var9.resolveType(errorReporter11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile13 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        boolean boolean12 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope5 = new com.google.javascript.jscomp.Scope(scope2, node4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(varItor3);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        boolean boolean10 = scope7.isDeclared("Scope.Var arguments{null}", true);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope7.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType11);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node12 = var9.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        java.lang.String str9 = var4.toString();
        com.google.javascript.rhino.Node node10 = var4.getNameNode();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean8 = arguments6.equals((java.lang.Object) (short) -1);
        java.lang.Class<?> wildcardClass9 = arguments6.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean10 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        com.google.javascript.rhino.jstype.JSType jSType16 = var14.getType();
        boolean boolean17 = var14.isNoShadow();
        java.lang.String str18 = var14.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope2.getScope(var14);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(scope2, node20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
        org.junit.Assert.assertNotNull(jSTypeStaticScope19);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
        boolean boolean15 = arguments13.isExtern();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        arguments13.resolveType(errorReporter16);
        com.google.javascript.rhino.Node node18 = arguments13.nameNode;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node6 = arguments5.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(var4);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = var16.isBleedingFunction();
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
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean10 = arguments8.equals((java.lang.Object) 10L);
        java.lang.String str11 = arguments8.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        boolean boolean5 = scope4.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        com.google.javascript.rhino.Node node10 = var4.getParentNode();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope18 = var17.scope;
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        boolean boolean20 = var17.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput21 = var17.input;
        com.google.javascript.jscomp.Scope scope22 = var17.getScope();
        // The following exception was thrown during execution in test generation
        try {
            scope10.undeclare(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(compilerInput21);
        org.junit.Assert.assertNotNull(scope22);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope scope10 = scope2.getGlobalScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope10.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getVars();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        boolean boolean18 = var11.isNoShadow();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope6.getSlot("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.name;
        boolean boolean8 = var6.isConst();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var6.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        com.google.javascript.rhino.Node node13 = var4.getParentNode();
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
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        int int3 = scope2.getVarCount();
        int int4 = scope2.getDepth();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        boolean boolean6 = scope2.isLocal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNotNull(varItor9);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        java.lang.String str11 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node7 = var6.getNode();
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        com.google.javascript.rhino.Node node9 = var6.nameNode;
        com.google.javascript.rhino.Node node10 = var6.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isGlobal();
        boolean boolean9 = var6.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope13.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
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
        com.google.javascript.jscomp.Scope.Var var16 = arguments13.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Scope.Var arguments{null}" + "'", str15, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("", node7, jSType8, compilerInput9, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope9.getParentScope();
        boolean boolean14 = scope9.isDeclared("hi!", false);
        com.google.javascript.jscomp.Scope scope15 = scope9.getParent();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope13.getOwnSlot("hi!");
        int int17 = scope13.getVarCount();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.Node node21 = scope20.getRootNode();
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getArgumentsVar();
        com.google.javascript.rhino.Node node23 = var22.getNode();
        boolean boolean24 = var22.isConst();
        boolean boolean25 = var22.isNoShadow();
        boolean boolean26 = var22.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope13.getScope(var22);
        boolean boolean28 = var22.isConst();
        boolean boolean29 = var22.isConst();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(var22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope10.getParentScope();
        com.google.javascript.rhino.Node node13 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope scope14 = scope10.getGlobalScope();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope17.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope14.getScope((com.google.javascript.jscomp.Scope.Var) arguments21);
        boolean boolean23 = arguments21.isExtern();
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        arguments21.resolveType(errorReporter24);
        // The following exception was thrown during execution in test generation
        try {
            scope7.undeclare((com.google.javascript.jscomp.Scope.Var) arguments21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNull(jSTypeStaticSlot20);
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var7.nameNode;
        boolean boolean9 = var7.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean6 = scope2.isDeclared("", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNode();
        boolean boolean14 = var12.isConst();
        boolean boolean15 = var12.isNoShadow();
        boolean boolean16 = var12.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var17 = var12.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
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
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        boolean boolean10 = var4.isNoShadow();
        com.google.javascript.rhino.Node node11 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
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
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int6 = scope2.getDepth();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile6 = var4.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        com.google.javascript.jscomp.Scope.Var var11 = var6.getSymbol();
        java.lang.String str12 = var6.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getVar("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var14 = scope7.declare("", node11, jSType12, compilerInput13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        boolean boolean7 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        boolean boolean12 = var11.isLocal();
        java.lang.String str13 = var11.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        boolean boolean25 = var21.isTypeInferred();
        int int26 = var21.index;
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope9.getParentScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var16 = scope9.declare("", node13, jSType14, compilerInput15);
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
        org.junit.Assert.assertNull(jSTypeStaticScope11);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.getInput();
        com.google.javascript.rhino.Node node11 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
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
        boolean boolean15 = var10.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        boolean boolean7 = var4.isTypeInferred();
        boolean boolean8 = var4.isGlobal();
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        int int10 = scope9.getDepth();
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getVar("<non-file>");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean6 = arguments5.isDefine;
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node30 = var22.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var7 = var5.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var7.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getVar("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        com.google.javascript.rhino.Node node21 = var20.getNode();
        boolean boolean22 = var20.isConst();
        boolean boolean23 = var20.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var20.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope13.getScope(var20);
        com.google.javascript.jscomp.Scope scope26 = var20.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope2.getScope(var20);
        java.lang.String str28 = var20.name;
        java.lang.Class<?> wildcardClass29 = var20.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(jSTypeStaticScope25);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertNotNull(jSTypeStaticScope27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arguments" + "'", str28, "arguments");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        java.lang.String str13 = var9.getName();
        boolean boolean14 = var9.isDefine();
        com.google.javascript.jscomp.CompilerInput compilerInput15 = var9.input;
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(compilerInput15);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        java.lang.Class<?> wildcardClass5 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.Node node6 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var7.getJSDocInfo();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSDocInfo8);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        boolean boolean9 = var4.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node10 = var4.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope7.getAllSymbols();
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean10 = arguments9.isLocal();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile11 = arguments9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "arguments" + "'", str5, "arguments");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        boolean boolean11 = var9.isTypeInferred();
        com.google.javascript.rhino.Node node12 = var9.getNameNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var4.getJSDocInfo();
        boolean boolean9 = var4.isNoShadow();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("Scope.Var arguments{null}", node10, jSType11, compilerInput12);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        java.lang.String str17 = arguments11.toString();
        com.google.javascript.rhino.Node node18 = arguments11.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Scope.Var arguments{null}" + "'", str17, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
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
        com.google.javascript.jscomp.Scope scope17 = var11.getScope();
        com.google.javascript.rhino.Node node18 = var11.nameNode;
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
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
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
        boolean boolean15 = arguments13.isExtern();
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        arguments13.resolveType(errorReporter16);
        com.google.javascript.rhino.jstype.JSType jSType18 = arguments13.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = arguments13.isBleedingFunction();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        com.google.javascript.jscomp.Scope.Var var16 = scope2.getVar("arguments");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        com.google.javascript.rhino.Node node19 = var11.getParentNode();
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
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isExtern();
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
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
        com.google.javascript.jscomp.Scope.Var var22 = var16.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = var22.isGlobal();
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
        org.junit.Assert.assertNull(var22);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int7 = scope2.getVarCount();
        boolean boolean10 = scope2.isDeclared("hi!", true);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(varIterable6);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.CompilerInput compilerInput7 = arguments6.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(compilerInput7);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        boolean boolean13 = var4.isNoShadow();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
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
        int int14 = var11.index;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = var11.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(compilerInput15);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        com.google.javascript.jscomp.Scope scope15 = var9.scope;
        boolean boolean16 = scope15.isGlobal();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        var4.resolveType(errorReporter7);
        boolean boolean9 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        java.lang.String str18 = var13.getName();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        com.google.javascript.jscomp.Scope scope16 = var10.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNotNull(varItor17);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        boolean boolean15 = arguments13.isExtern();
        boolean boolean16 = arguments13.isDefine();
        com.google.javascript.rhino.Node node17 = arguments13.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        int int9 = scope2.getDepth();
        boolean boolean10 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        java.lang.String str16 = arguments13.toString();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope scope14 = scope13.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope18.getOwnSlot("hi!");
        boolean boolean22 = scope18.isGlobal();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.Node node26 = scope25.getRootNode();
        com.google.javascript.jscomp.Scope.Var var27 = scope25.getArgumentsVar();
        com.google.javascript.rhino.Node node28 = var27.getNode();
        boolean boolean29 = var27.isConst();
        boolean boolean30 = var27.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope18.getReferences(var27);
        boolean boolean32 = var27.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope14.getScope(var27);
        com.google.javascript.jscomp.Scope scope34 = var27.scope;
        java.lang.String str35 = var27.getInputName();
        com.google.javascript.jscomp.Scope scope36 = var27.getScope();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(var27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(varIterable31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jSTypeStaticScope33);
        org.junit.Assert.assertNotNull(scope34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<non-file>" + "'", str35, "<non-file>");
        org.junit.Assert.assertNotNull(scope36);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope9 = var4.getScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope9.declare("hi!", node12, jSType13, compilerInput14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        boolean boolean12 = scope9.isDeclared("goog.scope", false);
        com.google.javascript.jscomp.Scope.Var var14 = scope9.getVar("");
        com.google.javascript.jscomp.Scope scope15 = scope9.getGlobalScope();
        boolean boolean16 = scope9.isBottom();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node7 = var6.getNode();
        boolean boolean8 = var6.isDefine();
        boolean boolean9 = var6.isGlobal();
        com.google.javascript.jscomp.Scope scope10 = var6.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope10.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(objectType11);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope11.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(objectType13);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
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
        com.google.javascript.rhino.Node node19 = var11.getNode();
        com.google.javascript.rhino.Node node20 = var11.getParentNode();
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
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(varIterable9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        com.google.javascript.rhino.Node node12 = var11.getNameNode();
        boolean boolean13 = var11.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope2, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.lang.String str11 = var4.getInputName();
        boolean boolean13 = var4.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var4.isBleedingFunction();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot4 = scope2.getSlot("");
        boolean boolean5 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("Scope.Var arguments{null}", node7, jSType8, compilerInput9);
        org.junit.Assert.assertNull(jSTypeStaticSlot4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope5.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        java.lang.String str12 = var11.getInputName();
        boolean boolean13 = var11.isDefine;
        com.google.javascript.jscomp.Scope.Var var14 = var11.getSymbol();
        boolean boolean15 = var11.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getReferences(var11);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(scope2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<non-file>" + "'", str12, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(varIterable16);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("Scope.Var arguments{null}", node6, jSType7, compilerInput8);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope9 = var4.getScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope9.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("goog.scope");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.String str12 = var4.name;
        com.google.javascript.rhino.Node node13 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        boolean boolean9 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isTypeInferred();
        com.google.javascript.rhino.Node node9 = var7.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
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
        int int17 = scope2.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope2.getParentScope();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(varIterable18);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.rhino.Node node8 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.Node node6 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile9 = var7.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        boolean boolean19 = var11.isDefine();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        int int11 = scope9.getVarCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("goog.scope");
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getVar("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        java.lang.String str9 = var4.toString();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
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
            boolean boolean12 = scope11.isBottom();
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        boolean boolean10 = scope7.isDeclared("arguments", true);
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope14.getOwnSlot("hi!");
        int int18 = scope14.getVarCount();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.Node node22 = scope21.getRootNode();
        com.google.javascript.jscomp.Scope.Var var23 = scope21.getArgumentsVar();
        com.google.javascript.rhino.Node node24 = var23.getNode();
        boolean boolean25 = var23.isConst();
        boolean boolean26 = var23.isNoShadow();
        boolean boolean27 = var23.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope14.getScope(var23);
        boolean boolean29 = var23.isConst();
        boolean boolean30 = var23.isConst();
        com.google.javascript.rhino.Node node31 = var23.getNode();
        // The following exception was thrown during execution in test generation
        try {
            scope7.undeclare(var23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNotNull(var23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.getInput();
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope12 = var4.getScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope12.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(varIterable13);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("Scope.Var arguments{null}", node7, jSType8, compilerInput9);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
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
        boolean boolean10 = var6.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var6.getInitialValue();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope scope9 = scope2.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(scope9);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        boolean boolean13 = var12.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var12.resolveType(errorReporter14);
        boolean boolean16 = var12.isTypeInferred();
        java.lang.String str17 = var12.getName();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var13 = scope9.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope14 = var13.scope;
        boolean boolean15 = var13.isExtern();
        com.google.javascript.rhino.Node node16 = var13.getNameNode();
        boolean boolean17 = var13.isExtern();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        boolean boolean11 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var12 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        boolean boolean7 = var4.isGlobal();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean10 = var9.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.getInput();
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var4.resolveType(errorReporter12);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        com.google.javascript.jscomp.Scope.Var var12 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = var12.getParentNode();
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
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSDocInfo10);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = arguments11.getJSDocInfo();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo14);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSDocInfo11);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
        boolean boolean11 = var4.isLocal();
        com.google.javascript.rhino.jstype.JSType jSType12 = var4.getType();
        com.google.javascript.rhino.Node node13 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        int int10 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("goog.scope", node7, jSType8, compilerInput9, false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = var11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isGlobal();
        boolean boolean10 = scope2.isDeclared("goog.scope", false);
        com.google.javascript.rhino.jstype.ObjectType objectType11 = scope2.getTypeOfThis();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(objectType11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
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
        java.lang.String str19 = var11.name;
        java.lang.String str20 = var11.getInputName();
        java.lang.String str21 = var11.name;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arguments" + "'", str19, "arguments");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<non-file>" + "'", str20, "<non-file>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arguments" + "'", str21, "arguments");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        com.google.javascript.rhino.Node node10 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.String str14 = var9.name;
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var11.getJSDocInfo();
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
        org.junit.Assert.assertNull(jSDocInfo19);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node8 = scope5.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
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
        boolean boolean17 = var10.isTypeInferred();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arguments15.isBleedingFunction();
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        boolean boolean8 = var6.isExtern();
        com.google.javascript.rhino.Node node9 = var6.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(varIterable16);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
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
        boolean boolean13 = var4.isDefine();
        int int14 = var4.index;
        boolean boolean15 = var4.isExtern();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean9 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var9 = arguments8.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope6 = var4.getScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType14);
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
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
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
        int int11 = var9.index;
        com.google.javascript.rhino.jstype.JSType jSType12 = var9.getType();
        boolean boolean13 = var9.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        boolean boolean13 = var12.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var14 = var12.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        var12.resolveType(errorReporter15);
        boolean boolean17 = var12.isTypeInferred();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
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
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        int int13 = arguments11.index;
        com.google.javascript.rhino.jstype.JSType jSType14 = arguments11.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(scope2, node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable9 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        boolean boolean19 = var17.isConst();
        boolean boolean20 = var17.isNoShadow();
        boolean boolean21 = var17.isDefine();
        java.lang.String str22 = var17.name;
        boolean boolean23 = var17.isDefine;
        boolean boolean24 = var17.isLocal();
        boolean boolean25 = var17.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = scope12.getReferences(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "arguments" + "'", str22, "arguments");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        boolean boolean10 = var5.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str10 = var6.getName();
        boolean boolean11 = var6.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
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
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        var11.resolveType(errorReporter21);
        com.google.javascript.jscomp.Scope.Var var23 = var11.getDeclaration();
        com.google.javascript.rhino.Node node24 = var11.nameNode;
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
        org.junit.Assert.assertNull(var23);
        org.junit.Assert.assertNull(node24);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        com.google.javascript.jscomp.Scope scope16 = var10.getScope();
        com.google.javascript.jscomp.Scope.Var var17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope16.getScope(var17);
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
        org.junit.Assert.assertNull(jSType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(scope16);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
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
        com.google.javascript.jscomp.Scope scope15 = scope2.getParent();
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNull(var17);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var4.getInitialValue();
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
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope10 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
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
        com.google.javascript.rhino.Node node17 = var16.nameNode;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        com.google.javascript.rhino.Node node9 = scope7.getRootNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(scope10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.ErrorReporter errorReporter5 = null;
        var4.resolveType(errorReporter5);
        java.lang.String str7 = var4.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        int int8 = var4.index;
        int int9 = var4.index;
        int int10 = var4.index;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        com.google.javascript.rhino.jstype.JSType jSType16 = var14.getType();
        boolean boolean17 = var14.isNoShadow();
        java.lang.String str18 = var14.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope2.getScope(var14);
        java.lang.Class<?> wildcardClass20 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
        org.junit.Assert.assertNotNull(jSTypeStaticScope19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        boolean boolean18 = var11.isLocal();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        boolean boolean11 = scope2.isDeclared("goog.scope", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope16.getOwnSlot("hi!");
        int int20 = scope16.getVarCount();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.Node node24 = scope23.getRootNode();
        com.google.javascript.jscomp.Scope.Var var25 = scope23.getArgumentsVar();
        com.google.javascript.rhino.Node node26 = var25.getNode();
        boolean boolean27 = var25.isConst();
        boolean boolean28 = var25.isNoShadow();
        boolean boolean29 = var25.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope16.getScope(var25);
        com.google.javascript.rhino.ErrorReporter errorReporter31 = null;
        var25.resolveType(errorReporter31);
        boolean boolean33 = var25.isDefine;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNull(jSTypeStaticScope17);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertNotNull(var25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        com.google.javascript.rhino.Node node10 = var4.getNameNode();
        boolean boolean11 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        com.google.javascript.jscomp.Scope scope16 = var10.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope16.getTypeOfThis();
        boolean boolean18 = scope16.isGlobal();
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
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        boolean boolean25 = var21.isTypeInferred();
        boolean boolean26 = var21.isLocal();
        com.google.javascript.jscomp.Scope.Var var27 = var21.getSymbol();
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(var27);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        boolean boolean9 = var4.isGlobal();
        boolean boolean10 = var4.isDefine;
        java.lang.String str11 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        java.lang.String str14 = var9.getName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.rhino.Node node8 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        boolean boolean20 = var11.isTypeInferred();
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.jscomp.Scope.Var var6 = var4.getDeclaration();
        boolean boolean7 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int6 = scope2.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable7 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(varIterable7);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        boolean boolean17 = var16.isLocal();
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
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getVars();
        com.google.javascript.jscomp.Scope.Var var25 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope23.getScope(var25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(varItor24);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor3 = scope2.getVars();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        org.junit.Assert.assertNotNull(varItor3);
        org.junit.Assert.assertNotNull(varIterable4);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        int int9 = scope2.getVarCount();
        boolean boolean10 = scope2.isGlobal();
        java.lang.Class<?> wildcardClass11 = scope2.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        java.lang.String str11 = var4.name;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var4.input;
        boolean boolean13 = var4.isExtern();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(compilerInput14);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isDefine();
        boolean boolean9 = var4.isConst();
        java.lang.String str10 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        int int9 = scope7.getDepth();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope7.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getSlot("");
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = var9.getNameNode();
        int int11 = var9.index;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.Scope scope8 = var6.getScope();
        boolean boolean11 = scope8.isDeclared("", true);
        int int12 = scope8.getDepth();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
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
        java.lang.String str12 = var9.toString();
        com.google.javascript.rhino.Node node13 = var9.getParentNode();
        com.google.javascript.rhino.Node node14 = var9.getNameNode();
        java.lang.String str15 = var9.getName();
        java.lang.String str16 = var9.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
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
        java.lang.String str10 = var4.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.input;
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.String str17 = var4.getName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = var4.getJSDocInfo();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertNull(jSDocInfo18);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
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
        java.lang.String str17 = arguments13.getInputName();
        com.google.javascript.jscomp.Scope scope18 = arguments13.getScope();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertNotNull(scope18);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(objectType8);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = var9.getParentNode();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var9.input;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = var9.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(scope2, node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isExtern();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
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
        boolean boolean10 = var6.isTypeInferred();
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
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
        com.google.javascript.rhino.Node node10 = var4.getNameNode();
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.Scope scope8 = var6.getScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope8.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(varItor9);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean9 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        int int8 = var4.index;
        int int9 = var4.index;
        int int10 = var4.index;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType12 = scope11.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.input;
        java.lang.String str11 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        boolean boolean13 = var4.isDefine();
        com.google.javascript.jscomp.Scope.Var var14 = var4.getDeclaration();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var14);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        boolean boolean7 = scope6.isGlobal();
        boolean boolean8 = scope6.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        java.lang.String str9 = var4.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var6.getInput();
        com.google.javascript.jscomp.Scope.Var var9 = var6.getSymbol();
        com.google.javascript.rhino.Node node10 = var6.getParentNode();
        boolean boolean11 = var6.isDefine;
        boolean boolean12 = var6.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var4.input;
        com.google.javascript.jscomp.Scope.Var var8 = var4.getDeclaration();
        boolean boolean9 = var4.isLocal();
        java.lang.String str10 = var4.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        boolean boolean27 = scope25.isLocal();
        com.google.javascript.jscomp.Scope.Var var28 = scope25.getArgumentsVar();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(var28);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.Scope scope8 = var6.getScope();
        boolean boolean9 = scope8.isBottom();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        com.google.javascript.jscomp.Scope scope16 = var10.scope;
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(scope16);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope7 = var6.scope;
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        boolean boolean9 = var6.isNoShadow();
        com.google.javascript.rhino.Node node10 = var6.nameNode;
        java.lang.String str11 = var6.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        int int13 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        boolean boolean11 = var4.isLocal();
        com.google.javascript.jscomp.Scope.Var var12 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("hi!");
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("arguments");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var12.getJSDocInfo();
        boolean boolean14 = var12.isDefine();
        com.google.javascript.jscomp.Scope scope15 = var12.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput16 = var12.input;
        com.google.javascript.jscomp.Scope.Var var17 = var12.getSymbol();
        com.google.javascript.jscomp.Scope.Var var18 = var17.getSymbol();
        boolean boolean19 = var17.isExtern();
        com.google.javascript.jscomp.Scope.Var var20 = var17.getDeclaration();
        java.lang.String str21 = var17.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope2.getScope(var17);
        int int23 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(var20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "arguments" + "'", str21, "arguments");
        org.junit.Assert.assertNotNull(jSTypeStaticScope22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getVar("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        com.google.javascript.rhino.Node node21 = var20.getNode();
        boolean boolean22 = var20.isConst();
        boolean boolean23 = var20.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var20.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope13.getScope(var20);
        com.google.javascript.jscomp.Scope scope26 = var20.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope2.getScope(var20);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput31 = null;
        com.google.javascript.jscomp.Scope.Var var33 = scope2.declare("<non-file>", node29, jSType30, compilerInput31, false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(jSTypeStaticScope25);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertNotNull(jSTypeStaticScope27);
        org.junit.Assert.assertNotNull(var33);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        java.lang.String str20 = var11.toString();
        com.google.javascript.rhino.Node node21 = var11.nameNode;
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Scope.Var arguments{null}" + "'", str20, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        java.lang.String str30 = var22.toString();
        com.google.javascript.jscomp.CompilerInput compilerInput31 = var22.getInput();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Scope.Var arguments{null}" + "'", str30, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(compilerInput31);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        int int26 = scope25.getVarCount();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        boolean boolean13 = var9.isNoShadow();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
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
        java.lang.String str12 = var9.toString();
        com.google.javascript.jscomp.Scope.Var var13 = var9.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            var13.setType(jSType14);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        boolean boolean11 = var4.isExtern();
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
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(scope4);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        boolean boolean5 = scope2.isBottom();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isTypeInferred();
        java.lang.String str16 = var11.getInputName();
        com.google.javascript.rhino.Node node17 = var11.nameNode;
        com.google.javascript.jscomp.Scope scope18 = var11.scope;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varIterable6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<non-file>" + "'", str16, "<non-file>");
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(scope18);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var4.input;
        boolean boolean8 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        boolean boolean10 = scope2.isBottom();
        int int11 = scope2.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.jscomp.Scope scope7 = scope2.getParent();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var12 = scope7.declare("goog.scope", node9, jSType10, compilerInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(scope7);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        boolean boolean10 = scope2.isDeclared("arguments", false);
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var17 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var21 = var17.getSymbol();
        java.lang.String str22 = var21.toString();
        com.google.javascript.jscomp.Scope.Var var23 = var21.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Scope.Var arguments{null}" + "'", str22, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var23);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int11 = scope2.getVarCount();
        boolean boolean12 = scope2.isGlobal();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("", node14, jSType15, compilerInput16, false);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = arguments6.index;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isNoShadow();
        com.google.javascript.rhino.Node node10 = var4.getNameNode();
        java.lang.String str11 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        com.google.javascript.rhino.Node node6 = var4.nameNode;
        boolean boolean7 = var4.isGlobal();
        int int8 = var4.index;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertNull(jSType7);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        var11.resolveType(errorReporter15);
        boolean boolean17 = var11.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = var11.getInput();
        boolean boolean19 = var11.isDefine();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        boolean boolean19 = var17.isConst();
        boolean boolean20 = var17.isNoShadow();
        boolean boolean21 = var17.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = var17.getJSDocInfo();
        java.lang.String str23 = var17.getName();
        boolean boolean24 = var17.isExtern();
        com.google.javascript.jscomp.Scope scope25 = var17.getScope();
        boolean boolean26 = var17.isGlobal();
        com.google.javascript.rhino.ErrorReporter errorReporter27 = null;
        var17.resolveType(errorReporter27);
        java.lang.String str29 = var17.name;
        com.google.javascript.rhino.Node node30 = var17.nameNode;
        com.google.javascript.jscomp.Scope.Var var31 = var17.getSymbol();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(jSDocInfo22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arguments" + "'", str23, "arguments");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(scope25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "arguments" + "'", str29, "arguments");
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertNotNull(var31);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        boolean boolean8 = scope7.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var7.getInput();
        com.google.javascript.jscomp.Scope scope9 = var7.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        boolean boolean8 = scope2.isGlobal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.Node node20 = var19.getNode();
        boolean boolean21 = var19.isConst();
        boolean boolean22 = var19.isDefine;
        boolean boolean23 = var19.isLocal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope11.getReferences(var19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope2.getScope(var19);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(varIterable24);
        org.junit.Assert.assertNotNull(jSTypeStaticScope25);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        int int8 = scope2.getDepth();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        boolean boolean10 = scope2.isLocal();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getVar("");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        com.google.javascript.rhino.Node node21 = var20.getNode();
        boolean boolean22 = var20.isConst();
        boolean boolean23 = var20.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var20.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope25 = scope13.getScope(var20);
        com.google.javascript.jscomp.Scope scope26 = var20.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope2.getScope(var20);
        java.lang.String str28 = var20.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSDocInfo24);
        org.junit.Assert.assertNotNull(jSTypeStaticScope25);
        org.junit.Assert.assertNotNull(scope26);
        org.junit.Assert.assertNotNull(jSTypeStaticScope27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "arguments" + "'", str28, "arguments");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        com.google.javascript.jscomp.Scope.Var var13 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        boolean boolean12 = var4.isExtern();
        java.lang.String str13 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            var10.setType(jSType16);
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
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType8 = var4.getType();
        boolean boolean9 = var4.isExtern();
        com.google.javascript.rhino.Node node10 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        boolean boolean7 = scope4.isDeclared("arguments", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getParentNode();
        com.google.javascript.jscomp.Scope scope7 = var5.getScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("<non-file>");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope11.getParentScope();
        com.google.javascript.rhino.Node node14 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope scope15 = scope11.getGlobalScope();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope18.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope15.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        boolean boolean24 = arguments22.isExtern();
        com.google.javascript.jscomp.Scope scope25 = arguments22.getScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable26 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(var5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertNotNull(jSTypeStaticScope23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(scope25);
        org.junit.Assert.assertNotNull(varIterable26);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope4 = scope2.getGlobalScope();
        boolean boolean5 = scope2.isBottom();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable6 = scope2.getAllSymbols();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var12 = scope2.declare("goog.scope", node8, jSType9, compilerInput10, true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(scope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(varIterable6);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isGlobal();
        java.lang.String str9 = var6.getInputName();
        boolean boolean10 = var6.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getOwnSlot("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo4 = var3.getJSDocInfo();
        org.junit.Assert.assertNotNull(var3);
        org.junit.Assert.assertNull(jSDocInfo4);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = var4.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType9 = var4.getType();
        boolean boolean10 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        boolean boolean12 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
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
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        com.google.javascript.rhino.jstype.JSType jSType16 = var14.getType();
        boolean boolean17 = var14.isNoShadow();
        java.lang.String str18 = var14.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope2.getScope(var14);
        boolean boolean20 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot22 = scope2.getSlot("");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(jSType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
        org.junit.Assert.assertNotNull(jSTypeStaticScope19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot22);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isDefine;
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        int int10 = scope9.getDepth();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        int int9 = scope8.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope12 = scope2.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(scope12);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        boolean boolean15 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(objectType16);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        int int12 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
        com.google.javascript.rhino.Node node11 = var4.getParentNode();
        com.google.javascript.jscomp.Scope.Var var12 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getArgumentsVar();
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
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        boolean boolean15 = scope13.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        org.junit.Assert.assertNull(compilerInput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "arguments" + "'", str18, "arguments");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getSymbol();
        boolean boolean9 = var8.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var10 = var8.getSymbol();
        java.lang.String str11 = var10.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node19 = var18.getNode();
        com.google.javascript.jscomp.Scope.Var var20 = var18.getSymbol();
        com.google.javascript.jscomp.Scope.Var var21 = var18.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(varItor17);
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(var20);
        org.junit.Assert.assertNull(var21);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("arguments");
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
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
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var9.input;
        java.lang.String str15 = var9.name;
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
        org.junit.Assert.assertNull(compilerInput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        com.google.javascript.jscomp.Scope scope9 = var8.getScope();
        com.google.javascript.jscomp.Scope scope10 = scope9.getGlobalScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        com.google.javascript.jscomp.Scope.Var var16 = var11.getSymbol();
        boolean boolean17 = var11.isLocal();
        com.google.javascript.rhino.jstype.JSType jSType18 = var11.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSType18);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.String str12 = var4.name;
        com.google.javascript.jscomp.Scope.Var var13 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = var13.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNull(jSDocInfo14);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope9.getAllSymbols();
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(scope9, node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter8 = null;
        var7.resolveType(errorReporter8);
        boolean boolean10 = var7.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = var11.isBleedingFunction();
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
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        com.google.javascript.jscomp.Scope scope22 = var16.scope;
        com.google.javascript.jscomp.Scope.Var var23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope22.getReferences(var23);
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
        org.junit.Assert.assertNotNull(scope22);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
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
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            var6.setType(jSType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("goog.scope");
        boolean boolean11 = scope2.isDeclared("<non-file>", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        com.google.javascript.rhino.Node node12 = var4.getNameNode();
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
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        boolean boolean15 = arguments13.isExtern();
        com.google.javascript.jscomp.Scope scope16 = arguments13.getScope();
        java.lang.String str17 = arguments13.getInputName();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope6);
        java.lang.String str8 = arguments7.getName();
        java.lang.Class<?> wildcardClass9 = arguments7.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.rhino.Node node9 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        boolean boolean11 = var4.isDefine;
        boolean boolean12 = var4.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope2, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope2.getParentScope();
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
        org.junit.Assert.assertNull(jSTypeStaticScope21);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        boolean boolean11 = scope2.isDeclared("goog.scope", true);
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        int int13 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.String str18 = var11.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Scope.Var arguments{null}" + "'", str18, "Scope.Var arguments{null}");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNull(objectType16);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean11 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.nameNode;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var6.getInput();
        com.google.javascript.jscomp.Scope.Var var9 = var6.getSymbol();
        java.lang.Object obj10 = null;
        boolean boolean11 = var6.equals(obj10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        com.google.javascript.jscomp.Scope.Var var8 = var5.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var8.getInput();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
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
        java.lang.String str10 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.String str12 = var4.name;
        com.google.javascript.jscomp.Scope.Var var13 = var4.getSymbol();
        boolean boolean14 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope6.getParentScope();
        com.google.javascript.jscomp.Scope scope11 = scope6.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNotNull(scope11);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        boolean boolean11 = scope2.isBottom();
        boolean boolean14 = scope2.isDeclared("hi!", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var9.input;
        com.google.javascript.jscomp.Scope.Var var12 = var9.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        int int7 = var4.index;
        boolean boolean8 = var4.isNoShadow();
        com.google.javascript.rhino.Node node9 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        com.google.javascript.jscomp.Scope.Var var11 = scope6.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope6.getVars();
        com.google.javascript.jscomp.Scope.Var var13 = scope6.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(var11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        boolean boolean11 = scope2.isDeclared("goog.scope", true);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertNotNull(varItor14);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        com.google.javascript.rhino.Node node10 = var4.getParentNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("arguments");
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope15.getAllSymbols();
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
            java.lang.Class<?> wildcardClass8 = scope7.getClass();
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean9 = scope5.isDeclared("hi!", false);
        int int10 = scope5.getDepth();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable12 = scope2.getAllSymbols();
        com.google.javascript.jscomp.Scope scope13 = scope2.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(varIterable12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        com.google.javascript.rhino.Node node10 = var4.getNode();
        com.google.javascript.jscomp.Scope.Var var11 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getArgumentsVar();
        boolean boolean11 = var10.isDefine;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput11 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope2.declare("<non-file>", node9, jSType10, compilerInput11, true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.getInput();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = var4.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isExtern();
        boolean boolean8 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getVar("");
        boolean boolean15 = scope12.isBottom();
        com.google.javascript.jscomp.Scope scope16 = scope12.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(scope16);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        boolean boolean6 = scope5.isLocal();
        boolean boolean7 = scope5.isLocal();
        com.google.javascript.jscomp.Scope.Var var9 = scope5.getVar("Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        boolean boolean8 = var4.isConst();
        boolean boolean9 = var4.isNoShadow();
        java.lang.Class<?> wildcardClass10 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNotNull(varItor8);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        com.google.javascript.rhino.jstype.ObjectType objectType22 = scope20.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var24 = scope20.getVar("goog.scope");
        boolean boolean25 = scope20.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor26 = scope20.getDeclarativelyUnboundVarsWithoutTypes();
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
        org.junit.Assert.assertNull(objectType22);
        org.junit.Assert.assertNull(var24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(varItor26);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isDefine;
        java.lang.String str9 = var6.getInputName();
        java.lang.String str10 = var6.getInputName();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = var6.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        var21.resolveType(errorReporter25);
        com.google.javascript.rhino.jstype.JSType jSType27 = var21.getType();
        com.google.javascript.jscomp.Scope.Var var28 = var21.getSymbol();
        com.google.javascript.rhino.Node node29 = var21.getNode();
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
        org.junit.Assert.assertNull(jSType27);
        org.junit.Assert.assertNotNull(var28);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        com.google.javascript.jscomp.Scope.Var var14 = var4.getDeclaration();
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
        org.junit.Assert.assertNull(var14);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node14 = var10.getInitialValue();
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
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        java.lang.String str7 = var4.getName();
        java.lang.String str8 = var4.getInputName();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        java.lang.String str10 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<non-file>" + "'", str8, "<non-file>");
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        boolean boolean11 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope5 = scope2.getGlobalScope();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(scope5);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        java.lang.String str10 = var4.getName();
        com.google.javascript.rhino.Node node11 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        com.google.javascript.jscomp.Scope scope22 = var16.scope;
        com.google.javascript.jscomp.Scope.Var var23 = scope22.getArgumentsVar();
        int int24 = var23.index;
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
        org.junit.Assert.assertNotNull(scope22);
        org.junit.Assert.assertNotNull(var23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getVar("goog.scope");
        com.google.javascript.jscomp.Scope scope15 = scope12.getParent();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope12.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(scope15);
        org.junit.Assert.assertNotNull(varIterable16);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        com.google.javascript.rhino.jstype.JSType jSType12 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(jSType12);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        java.lang.String str17 = arguments13.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments13.input;
        boolean boolean19 = arguments13.isTypeInferred();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<non-file>" + "'", str17, "<non-file>");
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        java.lang.String str11 = var4.name;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var4.input;
        boolean boolean13 = var4.isExtern();
        com.google.javascript.jscomp.Scope scope14 = var4.getScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
        org.junit.Assert.assertNull(compilerInput12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        boolean boolean9 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope12 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = var17.getJSDocInfo();
        boolean boolean19 = var17.isDefine();
        com.google.javascript.jscomp.Scope scope20 = var17.getScope();
        com.google.javascript.jscomp.Scope scope21 = var17.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput22 = var17.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo23 = var17.getJSDocInfo();
        // The following exception was thrown during execution in test generation
        try {
            scope12.undeclare(var17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(scope20);
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertNull(compilerInput22);
        org.junit.Assert.assertNull(jSDocInfo23);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        boolean boolean8 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot10 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope13.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var17 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node18 = var17.getNode();
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var21 = var17.getSymbol();
        com.google.javascript.jscomp.Scope scope22 = var17.scope;
        java.lang.String str23 = var17.getName();
        com.google.javascript.rhino.jstype.JSType jSType24 = var17.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertNotNull(scope22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "arguments" + "'", str23, "arguments");
        org.junit.Assert.assertNull(jSType24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        boolean boolean11 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var4.getInput();
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
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(compilerInput12);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
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
        com.google.javascript.jscomp.Scope.Var var13 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(var13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        boolean boolean9 = scope8.isLocal();
        boolean boolean10 = scope8.isLocal();
        boolean boolean13 = scope8.isDeclared("arguments", true);
        com.google.javascript.jscomp.Scope.Arguments arguments14 = new com.google.javascript.jscomp.Scope.Arguments(scope8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = arguments14.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        boolean boolean11 = var10.isDefine();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        boolean boolean9 = scope2.isGlobal();
        int int10 = scope2.getVarCount();
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("arguments", node12, jSType13, compilerInput14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        com.google.javascript.jscomp.Scope.Var var10 = var4.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.JSType jSType11 = var10.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        java.lang.String str17 = var4.getName();
        com.google.javascript.jscomp.Scope.Var var18 = var4.getSymbol();
        java.lang.String str19 = var18.getInputName();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertNotNull(var18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<non-file>" + "'", str19, "<non-file>");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        var4.resolveType(errorReporter11);
        com.google.javascript.rhino.Node node13 = var4.getNameNode();
        boolean boolean14 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        boolean boolean17 = var10.equals((java.lang.Object) "goog.scope");
        com.google.javascript.rhino.Node node18 = var10.getNameNode();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        com.google.javascript.rhino.Node node11 = var4.getNode();
        java.lang.String str12 = var4.getInputName();
        boolean boolean13 = var4.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Scope.Var arguments{null}" + "'", str10, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<non-file>" + "'", str12, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        com.google.javascript.jscomp.Scope.Arguments arguments13 = new com.google.javascript.jscomp.Scope.Arguments(scope12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(scope12, node14);
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
        org.junit.Assert.assertNotNull(scope12);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        java.lang.String str11 = var6.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Scope.Var arguments{null}" + "'", str10, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var7.nameNode;
        com.google.javascript.jscomp.Scope.Var var9 = var7.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        int int10 = var4.index;
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var4.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(jSDocInfo11);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
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
        com.google.javascript.rhino.Node node16 = var10.getNode();
        com.google.javascript.jscomp.Scope scope17 = var10.getScope();
        com.google.javascript.jscomp.Scope scope18 = var10.scope;
        boolean boolean19 = var10.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isNoShadow();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        boolean boolean12 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("arguments");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        int int9 = scope2.getVarCount();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNull(var7);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        boolean boolean13 = scope9.isDeclared("arguments", false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope2.getParentScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(jSTypeStaticScope9);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        boolean boolean8 = arguments6.isLocal();
        boolean boolean9 = arguments6.isGlobal();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node15 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope16 = scope12.getGlobalScope();
        boolean boolean17 = arguments6.equals((java.lang.Object) scope16);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        boolean boolean12 = scope2.isBottom();
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope2.getOwnSlot("<non-file>");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSTypeStaticSlot15);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.jscomp.Scope scope8 = var4.getScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        boolean boolean10 = var4.isDefine();
        com.google.javascript.rhino.Node node11 = var4.nameNode;
        boolean boolean12 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var7 = var5.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType8 = var5.getType();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(jSType8);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        boolean boolean11 = var4.isLocal();
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(compilerInput12);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
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
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(jSDocInfo9);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
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
        int int11 = var9.index;
        com.google.javascript.rhino.jstype.JSType jSType12 = var9.getType();
        com.google.javascript.rhino.Node node13 = var9.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        java.lang.String str7 = var6.getInputName();
        boolean boolean8 = var6.isLocal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean14 = var6.equals((java.lang.Object) scope11);
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var6.setType(jSType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        org.junit.Assert.assertNull(compilerInput16);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean9 = scope2.isGlobal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getVars();
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(varItor10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        boolean boolean10 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var5.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope8 = var5.getScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(scope8);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        boolean boolean9 = var6.isNoShadow();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var6.getInput();
        com.google.javascript.jscomp.Scope scope11 = var6.scope;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope11.declare("arguments", node13, jSType14, compilerInput15);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var6.resolveType(errorReporter10);
        com.google.javascript.jscomp.Scope.Var var12 = var6.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var12);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass6 = varItor5.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        com.google.javascript.jscomp.Scope.Var var15 = scope2.getVar("arguments");
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope18.getOwnSlot("hi!");
        int int22 = scope18.getVarCount();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.Node node26 = scope25.getRootNode();
        com.google.javascript.jscomp.Scope.Var var27 = scope25.getArgumentsVar();
        com.google.javascript.rhino.Node node28 = var27.getNode();
        boolean boolean29 = var27.isConst();
        boolean boolean30 = var27.isNoShadow();
        boolean boolean31 = var27.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope18.getScope(var27);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNull(jSTypeStaticScope19);
        org.junit.Assert.assertNull(jSTypeStaticSlot21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNotNull(var27);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope32);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        com.google.javascript.jscomp.Scope scope13 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("<non-file>");
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope2.declare("arguments", node13, jSType14, compilerInput15);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        boolean boolean7 = scope2.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        boolean boolean17 = var11.isGlobal();
        com.google.javascript.rhino.Node node18 = var11.getNode();
        boolean boolean19 = var11.isGlobal();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        boolean boolean9 = var4.isGlobal();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var4.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
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
        com.google.javascript.rhino.Node node23 = var16.nameNode;
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
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        java.lang.String str16 = var10.getName();
        com.google.javascript.jscomp.Scope scope17 = var10.getScope();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getVar("");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNull(var19);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        int int17 = scope14.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        boolean boolean19 = scope14.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments20 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        // The following exception was thrown during execution in test generation
        try {
            scope9.undeclare((com.google.javascript.jscomp.Scope.Var) arguments20);
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
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope2.getAllSymbols();
        boolean boolean12 = scope2.isLocal();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("Scope.Var arguments{null}", node14, jSType15, compilerInput16, true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.getInput();
        boolean boolean10 = var4.isLocal();
        java.lang.String str11 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        boolean boolean8 = scope7.isBottom();
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(scope7, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
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
        boolean boolean16 = scope2.isBottom();
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(scope2, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        com.google.javascript.jscomp.Scope.Var var10 = var4.getSymbol();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int6 = scope2.getVarCount();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var11 = scope6.declare("arguments", node8, jSType9, compilerInput10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean9 = arguments8.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getSymbol();
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = var4.getJSDocInfo();
        boolean boolean10 = var4.isExtern();
        boolean boolean11 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var12 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isNoShadow();
        com.google.javascript.rhino.Node node10 = var4.nameNode;
        com.google.javascript.rhino.Node node11 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isDefine;
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        boolean boolean9 = var4.isGlobal();
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
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.getInput();
        java.lang.String str9 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        boolean boolean15 = arguments13.isConst();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = arguments13.isBleedingFunction();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        com.google.javascript.jscomp.Scope.Var var13 = scope12.getArgumentsVar();
        boolean boolean16 = scope12.isDeclared("", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isNoShadow();
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
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        com.google.javascript.jscomp.Scope.Var var18 = arguments13.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var19 = var18.getSymbol();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
        org.junit.Assert.assertNull(var18);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
            var7.setType(jSType8);
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        int int9 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("goog.scope");
        com.google.javascript.rhino.Node node9 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        com.google.javascript.rhino.ErrorReporter errorReporter11 = null;
        var9.resolveType(errorReporter11);
        boolean boolean13 = var9.isGlobal();
        com.google.javascript.jscomp.Scope scope14 = var9.scope;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.getNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = var9.equals((java.lang.Object) node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(varItor14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        boolean boolean9 = scope2.isLocal();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("<non-file>");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope2.getVars();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNotNull(varItor13);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        com.google.javascript.jscomp.Scope scope9 = var8.getScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope9.getOwnSlot("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var7 = var5.getSymbol();
        com.google.javascript.rhino.Node node8 = var5.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = var5.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var4.getInput();
        com.google.javascript.rhino.Node node11 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.Node node8 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope9 = var4.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        java.lang.String str16 = var4.name;
        boolean boolean17 = var4.isGlobal();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        boolean boolean9 = scope2.isLocal();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        com.google.javascript.jscomp.Scope scope15 = var9.scope;
        com.google.javascript.jscomp.Scope scope16 = var9.scope;
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(scope16);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile10 = var5.getSourceFile();
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        boolean boolean8 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
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
        com.google.javascript.rhino.jstype.ObjectType objectType16 = scope2.getTypeOfThis();
        int int17 = scope2.getVarCount();
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
        org.junit.Assert.assertNull(objectType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        boolean boolean12 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope13 = var4.scope;
        java.lang.String str14 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(compilerInput11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        int int16 = scope15.getVarCount();
        boolean boolean17 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope15.getOwnSlot("");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isExtern();
        com.google.javascript.jscomp.Scope.Var var8 = arguments6.getDeclaration();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.CompilerInput compilerInput9 = var8.input;
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        boolean boolean12 = scope9.isDeclared("goog.scope", false);
        com.google.javascript.jscomp.Scope.Var var14 = scope9.getVar("");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope9.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNotNull(varIterable15);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        java.lang.String str30 = var22.toString();
        com.google.javascript.jscomp.Scope.Var var31 = var22.getSymbol();
        boolean boolean32 = var22.isConst();
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Scope.Var arguments{null}" + "'", str30, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(var31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        boolean boolean9 = scope2.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isGlobal();
        boolean boolean9 = var4.isNoShadow();
        boolean boolean10 = var4.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        java.lang.String str12 = var9.toString();
        com.google.javascript.rhino.Node node13 = var9.getParentNode();
        java.lang.String str14 = var9.name;
        com.google.javascript.jscomp.Scope scope15 = var9.getScope();
        com.google.javascript.jscomp.Scope.Var var16 = scope15.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Scope.Var arguments{null}" + "'", str12, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        boolean boolean15 = arguments13.isExtern();
        com.google.javascript.jscomp.Scope.Var var16 = arguments13.getSymbol();
        boolean boolean17 = var16.isDefine();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.lang.String str6 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertNull(compilerInput7);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
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
        com.google.javascript.jscomp.Scope scope10 = scope9.getGlobalScope();
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope9, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        boolean boolean8 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

