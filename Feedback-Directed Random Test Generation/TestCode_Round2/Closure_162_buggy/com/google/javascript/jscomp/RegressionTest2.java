package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        boolean boolean10 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        boolean boolean11 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var7 = var5.getSymbol();
        com.google.javascript.jscomp.Scope.Var var8 = var5.getSymbol();
        java.lang.String str9 = var5.name;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isExtern();
        com.google.javascript.rhino.Node node8 = var4.getNameNode();
        boolean boolean9 = var4.isDefine();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        boolean boolean8 = scope2.isBottom();
        boolean boolean9 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node7 = var6.getNode();
        boolean boolean8 = var6.isDefine();
        com.google.javascript.rhino.ErrorReporter errorReporter9 = null;
        var6.resolveType(errorReporter9);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope6 = arguments5.scope;
        com.google.javascript.jscomp.Scope.Var var7 = scope6.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType5 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(objectType5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        boolean boolean9 = arguments6.isDefine;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope12.getParentScope();
        com.google.javascript.rhino.Node node15 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope scope16 = scope12.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope12.getSlot("goog.scope");
        boolean boolean19 = arguments6.equals((java.lang.Object) scope12);
        boolean boolean20 = arguments6.isNoShadow();
        com.google.javascript.jscomp.Scope scope21 = arguments6.getScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNull(jSTypeStaticSlot18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(scope21);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        int int16 = var4.index;
        java.lang.Class<?> wildcardClass17 = var4.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        com.google.javascript.jscomp.Scope.Var var17 = scope2.getVar("arguments");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        com.google.javascript.rhino.Node node17 = var4.nameNode;
        com.google.javascript.jscomp.Scope scope18 = var4.getScope();
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
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(scope18);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
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
        com.google.javascript.jscomp.Scope.Var var12 = scope9.getVar("");
        boolean boolean13 = scope9.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getSlot("hi!");
        boolean boolean17 = scope2.isLocal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        boolean boolean13 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope10.getOwnSlot("hi!");
        boolean boolean14 = scope10.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope10.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var17 = scope10.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope18 = var17.scope;
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var17.resolveType(errorReporter19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope2.getScope(var17);
        com.google.javascript.jscomp.Scope.Var var22 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticScope11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNotNull(scope18);
        org.junit.Assert.assertNotNull(jSTypeStaticScope21);
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = var11.getJSDocInfo();
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
        org.junit.Assert.assertNull(jSDocInfo21);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        com.google.javascript.rhino.Node node12 = var5.nameNode;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.Node node20 = var19.nameNode;
        java.lang.String str21 = var19.getInputName();
        boolean boolean22 = var19.isGlobal();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope2.getReferences(var19);
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<non-file>" + "'", str21, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(varIterable23);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var12 = scope2.getVar("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNull(var12);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        int int10 = scope6.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(varIterable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        com.google.javascript.rhino.Node node15 = scope12.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean10 = var9.isTypeInferred();
        boolean boolean11 = var9.isTypeInferred();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.lang.String str13 = var9.toString();
        com.google.javascript.jscomp.Scope.Var var14 = var9.getDeclaration();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var14);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        com.google.javascript.jscomp.Scope scope16 = scope15.getGlobalScope();
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
        org.junit.Assert.assertNotNull(scope16);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        boolean boolean7 = var4.isTypeInferred();
        boolean boolean8 = var4.isGlobal();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        int int10 = var4.index;
        boolean boolean11 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.lang.String str17 = var10.name;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        boolean boolean10 = var4.isDefine();
        com.google.javascript.rhino.Node node11 = var4.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
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
        boolean boolean10 = var4.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        com.google.javascript.jscomp.CompilerInput compilerInput18 = var11.getInput();
        java.lang.String str19 = var11.name;
        boolean boolean20 = var11.isConst();
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
        org.junit.Assert.assertNull(compilerInput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arguments" + "'", str19, "arguments");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope12 = var11.scope;
        java.lang.String str13 = var11.getInputName();
        boolean boolean14 = var11.isDefine;
        com.google.javascript.rhino.Node node15 = var11.getNameNode();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope6.getScope(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<non-file>" + "'", str13, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        com.google.javascript.rhino.Node node11 = var4.getNameNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<non-file>" + "'", str6, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        int int17 = arguments11.index;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot23 = scope20.getOwnSlot("hi!");
        boolean boolean24 = scope20.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType25 = scope20.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot27 = scope20.getSlot("arguments");
        boolean boolean28 = scope20.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType29 = scope20.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope30 = scope20.getGlobalScope();
        boolean boolean31 = scope30.isGlobal();
        boolean boolean32 = arguments11.equals((java.lang.Object) scope30);
        boolean boolean33 = scope30.isLocal();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(jSTypeStaticScope21);
        org.junit.Assert.assertNull(jSTypeStaticSlot23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(objectType25);
        org.junit.Assert.assertNull(jSTypeStaticSlot27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(objectType29);
        org.junit.Assert.assertNotNull(scope30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        com.google.javascript.rhino.jstype.ObjectType objectType4 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertNull(scope3);
        org.junit.Assert.assertNull(objectType4);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        int int20 = scope2.getVarCount();
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
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var4.resolveType(errorReporter13);
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
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        int int10 = scope9.getVarCount();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot12 = scope9.getSlot("<non-file>");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope9.declare("Scope.Var arguments{null}", node14, jSType15, compilerInput16, true);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope9, node19);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        boolean boolean6 = var5.isConst();
        boolean boolean7 = var5.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var18.getJSDocInfo();
        boolean boolean20 = var18.isExtern();
        boolean boolean21 = var18.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean24 = scope2.isBottom();
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
        org.junit.Assert.assertNull(jSDocInfo19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNotNull(varItor23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var4.getJSDocInfo();
        boolean boolean8 = var4.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope scope9 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        boolean boolean7 = scope6.isGlobal();
        int int8 = scope6.getDepth();
        com.google.javascript.jscomp.Scope.Var var9 = scope6.getArgumentsVar();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput4 = var3.getInput();
        com.google.javascript.rhino.Node node5 = var3.nameNode;
        boolean boolean6 = var3.isConst();
        org.junit.Assert.assertNotNull(var3);
        org.junit.Assert.assertNull(compilerInput4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        boolean boolean18 = arguments11.isExtern();
        com.google.javascript.rhino.Node node19 = arguments11.getParentNode();
        com.google.javascript.rhino.Node node20 = arguments11.nameNode;
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var3 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var4 = var3.getDeclaration();
        org.junit.Assert.assertNotNull(var3);
        org.junit.Assert.assertNull(var4);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.jscomp.Scope scope6 = var4.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(scope2, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getVar("hi!");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var9.getInput();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = var9.isBleedingFunction();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(jSType12);
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        com.google.javascript.jscomp.Scope scope21 = var11.getScope();
        boolean boolean22 = scope21.isGlobal();
        com.google.javascript.jscomp.Scope scope23 = scope21.getGlobalScope();
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
        org.junit.Assert.assertNotNull(scope21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(scope23);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        java.lang.String str7 = var4.toString();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = var4.input;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Scope.Var arguments{null}" + "'", str7, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNull(compilerInput9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertNull(jSTypeStaticScope14);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        com.google.javascript.rhino.Node node13 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        java.lang.Class<?> wildcardClass11 = scope9.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
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
        com.google.javascript.rhino.Node node12 = var4.nameNode;
        boolean boolean13 = var4.isDefine;
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope14.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope14.declare("Scope.Var arguments{null}", node19, jSType20, compilerInput21, false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        boolean boolean19 = arguments13.isGlobal();
        boolean boolean20 = arguments13.isLocal();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
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
        boolean boolean16 = var9.isDefine();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        boolean boolean10 = scope2.isDeclared("", false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput14 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope2.declare("hi!", node12, jSType13, compilerInput14);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node16 = var15.getInitialValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
            com.google.javascript.rhino.Node node15 = var9.getInitialValue();
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
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
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
        boolean boolean16 = var11.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var11.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("arguments");
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertNull(node10);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope2.getSlot("hi!");
        boolean boolean17 = scope2.isLocal();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("arguments", node19, jSType20, compilerInput21, false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(compilerInput13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
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
        java.lang.String str16 = arguments13.getName();
        com.google.javascript.rhino.Node node17 = arguments13.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
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
        boolean boolean10 = var4.isDefine();
        java.lang.String str11 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope8.getSlot("");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        java.lang.String str13 = var4.getName();
        com.google.javascript.jscomp.Scope scope14 = var4.getScope();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertNotNull(scope14);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        java.lang.String str11 = var4.name;
        com.google.javascript.jscomp.Scope.Var var12 = var4.getDeclaration();
        java.lang.String str13 = var4.toString();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var4.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Scope.Var arguments{null}" + "'", str13, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(compilerInput14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        com.google.javascript.rhino.Node node8 = var7.nameNode;
        com.google.javascript.jscomp.Scope scope9 = var7.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(scope9);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.lang.String str19 = var10.getName();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "arguments" + "'", str19, "arguments");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
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
        int int17 = var10.index;
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.lang.String str10 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean17 = var10.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var18.getJSDocInfo();
        boolean boolean20 = var18.isExtern();
        boolean boolean21 = var18.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var18);
        boolean boolean23 = var18.isLocal();
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
        org.junit.Assert.assertNull(jSDocInfo19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            var4.setType(jSType15);
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
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var18.getJSDocInfo();
        boolean boolean20 = var18.isExtern();
        boolean boolean21 = var18.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        com.google.javascript.rhino.Node node28 = scope27.getRootNode();
        com.google.javascript.jscomp.Scope.Var var29 = scope27.getArgumentsVar();
        com.google.javascript.rhino.Node node30 = var29.getNode();
        boolean boolean31 = var29.isConst();
        boolean boolean32 = var29.isNoShadow();
        boolean boolean33 = var29.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = var29.getJSDocInfo();
        java.lang.String str35 = var29.getName();
        java.lang.String str36 = var29.name;
        com.google.javascript.jscomp.CompilerInput compilerInput37 = var29.input;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var29);
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
        org.junit.Assert.assertNull(jSDocInfo19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNotNull(varItor23);
        org.junit.Assert.assertNull(node28);
        org.junit.Assert.assertNotNull(var29);
        org.junit.Assert.assertNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "arguments" + "'", str35, "arguments");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "arguments" + "'", str36, "arguments");
        org.junit.Assert.assertNull(compilerInput37);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        int int17 = scope15.getVarCount();
        java.lang.Class<?> wildcardClass18 = scope15.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        boolean boolean13 = scope2.isLocal();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var19 = scope2.declare("<non-file>", node15, jSType16, compilerInput17, false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(varIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(var19);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType29 = null;
        com.google.javascript.jscomp.Scope scope30 = new com.google.javascript.jscomp.Scope(node28, objectType29);
        com.google.javascript.rhino.Node node31 = scope30.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope30.getDeclarativelyUnboundVarsWithoutTypes();
        int int33 = scope30.getVarCount();
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType35 = null;
        com.google.javascript.jscomp.Scope scope36 = new com.google.javascript.jscomp.Scope(node34, objectType35);
        com.google.javascript.rhino.Node node37 = scope36.getRootNode();
        com.google.javascript.jscomp.Scope.Var var38 = scope36.getArgumentsVar();
        boolean boolean39 = var38.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var40 = var38.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter41 = null;
        var38.resolveType(errorReporter41);
        com.google.javascript.rhino.Node node43 = var38.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope44 = scope30.getScope(var38);
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(varItor32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNotNull(var38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(var40);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(jSTypeStaticScope44);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        int int10 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var13 = scope2.getVar("hi!");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNull(var13);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isExtern();
        com.google.javascript.rhino.Node node9 = var6.getParentNode();
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var6.resolveType(errorReporter10);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isNoShadow();
        java.lang.String str7 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNameNode();
        boolean boolean6 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
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
        com.google.javascript.rhino.Node node12 = var9.getParentNode();
        boolean boolean13 = var9.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable4 = scope2.getAllSymbols();
        int int5 = scope2.getDepth();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNotNull(varIterable4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var18.getJSDocInfo();
        boolean boolean20 = var18.isExtern();
        boolean boolean21 = var18.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var18);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor23 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope scope24 = scope2.getParent();
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
        org.junit.Assert.assertNull(jSDocInfo19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(varIterable22);
        org.junit.Assert.assertNotNull(varItor23);
        org.junit.Assert.assertNull(scope24);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var8 = var6.getSymbol();
        boolean boolean9 = var6.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        boolean boolean14 = scope11.isDeclared("arguments", true);
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope11);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        com.google.javascript.rhino.jstype.JSType jSType17 = var10.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertNull(jSType17);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        boolean boolean13 = scope2.isLocal();
        int int14 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(scope11);
        org.junit.Assert.assertNotNull(varIterable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        boolean boolean17 = var11.isConst();
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var6.input;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        com.google.javascript.jscomp.Scope.Var var18 = var10.getSymbol();
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
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.nameNode;
        boolean boolean6 = var4.isGlobal();
        com.google.javascript.jscomp.Scope scope7 = var4.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable8 = scope7.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(varIterable8);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean22 = scope17.isLocal();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
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
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope14.getAllSymbols();
        com.google.javascript.rhino.Node node16 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments17 = new com.google.javascript.jscomp.Scope.Arguments(scope14);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNotNull(scope13);
        org.junit.Assert.assertNotNull(scope14);
        org.junit.Assert.assertNotNull(varIterable15);
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
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
        com.google.javascript.jscomp.Scope.Arguments arguments11 = new com.google.javascript.jscomp.Scope.Arguments(scope10);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        boolean boolean12 = var11.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        boolean boolean10 = var9.isDefine;
        boolean boolean11 = var9.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var6.input;
        boolean boolean8 = var6.isExtern();
        com.google.javascript.rhino.jstype.JSType jSType9 = var6.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.rhino.Node node6 = var4.getNameNode();
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile12 = var11.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
            boolean boolean30 = var22.isBleedingFunction();
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean8 = scope2.isDeclared("<non-file>", false);
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            arguments11.setType(jSType16);
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
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        com.google.javascript.rhino.jstype.JSType jSType25 = var16.getType();
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
        org.junit.Assert.assertNull(jSType25);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        boolean boolean6 = scope2.isBottom();
        int int7 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        boolean boolean11 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(scope8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        java.lang.String str10 = var6.getName();
        com.google.javascript.rhino.Node node11 = var6.getNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        boolean boolean15 = var4.isGlobal();
        boolean boolean16 = var4.isTypeInferred();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
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
        int int26 = scope25.getDepth();
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope9.declare("Scope.Var arguments{null}", node14, jSType15, compilerInput16, true);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(scope9, node19);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
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
        boolean boolean12 = var9.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isLocal();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        boolean boolean10 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope scope11 = var4.getScope();
        java.lang.String str12 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "arguments" + "'", str12, "arguments");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope11.getOwnSlot("goog.scope");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<non-file>" + "'", str7, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNotNull(varItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(jSTypeStaticSlot16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            var9.setType(jSType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNotNull(var9);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        java.lang.String str8 = var6.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertNotNull(scope7);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
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
        java.lang.String str11 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "arguments" + "'", str11, "arguments");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        int int10 = scope9.getVarCount();
        boolean boolean11 = scope9.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var10 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
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
        int int17 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(jSTypeStaticScope16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(varItor18);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope8 = scope2.getParentScope();
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSTypeStaticScope8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = scope3.getRootNode();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(scope3);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.lang.String str12 = var9.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<non-file>" + "'", str12, "<non-file>");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        boolean boolean5 = scope2.isGlobal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        java.lang.Class<?> wildcardClass11 = var4.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var15 = scope9.declare("Scope.Var arguments{null}", node11, jSType12, compilerInput13, false);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(var15);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        com.google.javascript.rhino.Node node27 = var21.getNode();
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        com.google.javascript.jscomp.Scope scope16 = arguments13.getScope();
        com.google.javascript.rhino.Node node17 = arguments13.getParentNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNull(var15);
        org.junit.Assert.assertNotNull(scope16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput6 = var4.input;
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = var4.getJSDocInfo();
        boolean boolean8 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertNull(compilerInput6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNode();
        boolean boolean12 = var10.isConst();
        boolean boolean13 = var10.isNoShadow();
        boolean boolean14 = var10.isTypeInferred();
        java.lang.String str15 = var10.getInputName();
        com.google.javascript.rhino.Node node16 = var10.nameNode;
        com.google.javascript.jscomp.Scope scope17 = var10.scope;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = var10.input;
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<non-file>" + "'", str15, "<non-file>");
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNotNull(scope17);
        org.junit.Assert.assertNull(compilerInput18);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        com.google.javascript.rhino.Node node18 = arguments13.nameNode;
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
        org.junit.Assert.assertNull(node18);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        com.google.javascript.rhino.jstype.JSType jSType11 = var9.getType();
        boolean boolean12 = var9.isNoShadow();
        com.google.javascript.rhino.Node node13 = var9.getNameNode();
        com.google.javascript.jscomp.Scope.Var var14 = var9.getSymbol();
        java.lang.String str15 = var9.getName();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNull(jSType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(var14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "arguments" + "'", str15, "arguments");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = var9.getNameNode();
        com.google.javascript.rhino.Node node11 = var9.getNameNode();
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
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
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
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(scope10, node11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope6 = scope2.getParentScope();
        int int7 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticScope6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope15.getVars();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(varIterable17);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter6 = null;
        var4.resolveType(errorReporter6);
        java.lang.String str8 = var4.getInputName();
        com.google.javascript.rhino.jstype.JSType jSType9 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<non-file>" + "'", str8, "<non-file>");
        org.junit.Assert.assertNull(jSType9);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo13 = var4.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(var12);
        org.junit.Assert.assertNull(jSDocInfo13);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var6.input;
        com.google.javascript.jscomp.Scope.Var var8 = var6.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(compilerInput7);
        org.junit.Assert.assertNull(var8);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        int int14 = scope2.getDepth();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(var12);
        org.junit.Assert.assertNotNull(varIterable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope15 = scope2.getGlobalScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(objectType14);
        org.junit.Assert.assertNotNull(scope15);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        com.google.javascript.jscomp.Scope.Var var8 = var5.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType9 = var5.getType();
        boolean boolean10 = var5.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
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
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.JSType jSType22 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput23 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope2.declare("hi!", node21, jSType22, compilerInput23);
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
        org.junit.Assert.assertNotNull(var24);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int6 = scope2.getVarCount();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        com.google.javascript.rhino.jstype.JSType jSType11 = var6.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope11.getSlot("arguments");
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope11.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(objectType12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertNull(objectType15);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.JSType jSType12 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = null;
        com.google.javascript.jscomp.Scope.Var var14 = scope2.declare("hi!", node11, jSType12, compilerInput13);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var14);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isTypeInferred();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getSymbol();
        java.lang.String str10 = var4.getName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "arguments" + "'", str10, "arguments");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope20.getDeclarativelyUnboundVarsWithoutTypes();
        int int23 = scope20.getVarCount();
        boolean boolean26 = scope20.isDeclared("goog.scope", false);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope2.getAllSymbols();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope2.getVars();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput19 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var21 = scope2.declare("", node17, jSType18, compilerInput19, true);
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
        org.junit.Assert.assertNotNull(varIterable14);
        org.junit.Assert.assertNotNull(varItor15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        com.google.javascript.jscomp.Scope.Var var16 = var9.getDeclaration();
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
        org.junit.Assert.assertNull(var16);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("", node13, jSType14, compilerInput15, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNotNull(varIterable10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        boolean boolean10 = var8.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        int int19 = var11.index;
        java.lang.String str20 = var11.toString();
        java.lang.String str21 = var11.getInputName();
        boolean boolean22 = var11.isGlobal();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Scope.Var arguments{null}" + "'", str20, "Scope.Var arguments{null}");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "<non-file>" + "'", str21, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
            boolean boolean19 = var18.isExtern();
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
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
        com.google.javascript.rhino.Node node15 = arguments11.nameNode;
        boolean boolean16 = arguments11.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = var4.index;
        boolean boolean6 = var4.isDefine;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isLocal();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        boolean boolean12 = var11.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var11.resolveType(errorReporter13);
        boolean boolean15 = var11.isDefine;
        int int16 = var11.index;
        // The following exception was thrown during execution in test generation
        try {
            scope6.undeclare(var11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean19 = var4.isTypeInferred();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
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
        int int18 = scope16.getVarCount();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable12 = scope11.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNotNull(varIterable12);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
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
        boolean boolean11 = scope2.isLocal();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var23 = scope2.declare("hi!", node19, jSType20, compilerInput21, false);
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
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertNotNull(var23);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        com.google.javascript.rhino.Node node11 = var4.getParentNode();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.JSType jSType20 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = null;
        com.google.javascript.jscomp.Scope.Var var22 = scope17.declare("arguments", node19, jSType20, compilerInput21);
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
        org.junit.Assert.assertNotNull(var22);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("Scope.Var arguments{null}", node6, jSType7, compilerInput8, false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var10);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var4.getJSDocInfo();
        java.lang.String str11 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        boolean boolean10 = var6.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.Node node20 = var19.getNameNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable21 = scope12.getReferences(var19);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertNull(jSTypeStaticScope18);
        org.junit.Assert.assertNotNull(var19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(varIterable21);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isGlobal();
        com.google.javascript.rhino.Node node9 = var6.getNode();
        boolean boolean10 = var6.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
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
        java.lang.String str14 = arguments11.name;
        boolean boolean15 = arguments11.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "arguments" + "'", str14, "arguments");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
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
        boolean boolean17 = scope6.isDeclared("<non-file>", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = var16.isBleedingFunction();
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
        org.junit.Assert.assertNotNull(var16);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput9 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope2.declare("goog.scope", node7, jSType8, compilerInput9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node17 = var16.nameNode;
        boolean boolean18 = var16.isGlobal();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(jSTypeStaticScope15);
        org.junit.Assert.assertNotNull(var16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        com.google.javascript.jscomp.Scope scope16 = scope15.getGlobalScope();
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.jscomp.Scope.Var var8 = var4.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            var8.setType(jSType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertNotNull(var8);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor10 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varItor10);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
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
        com.google.javascript.jscomp.Scope scope21 = scope2.getGlobalScope();
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
        org.junit.Assert.assertNotNull(scope21);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        com.google.javascript.jscomp.Scope.Var var13 = var4.getSymbol();
        java.lang.Class<?> wildcardClass14 = var4.getClass();
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
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        com.google.javascript.rhino.Node node12 = arguments11.getNameNode();
        boolean boolean13 = arguments11.isDefine();
        boolean boolean14 = arguments11.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot10);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
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
        boolean boolean26 = scope2.isBottom();
        boolean boolean27 = scope2.isBottom();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(varItor28);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
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
        boolean boolean10 = var4.isExtern();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        com.google.javascript.rhino.Node node15 = var4.nameNode;
        java.lang.String str16 = var4.name;
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getVars();
        java.lang.Class<?> wildcardClass10 = scope2.getClass();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertNotNull(varItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope9.declare("Scope.Var arguments{null}", node14, jSType15, compilerInput16, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var23 = scope9.declare("", node20, jSType21, compilerInput22);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
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
        com.google.javascript.rhino.Node node16 = var4.getNameNode();
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope23.getSlot("goog.scope");
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
        org.junit.Assert.assertNull(jSTypeStaticSlot26);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        boolean boolean15 = var11.isExtern();
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.JSType jSType9 = var8.getType();
        com.google.javascript.jscomp.Scope scope10 = var8.scope;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertNull(jSType9);
        org.junit.Assert.assertNotNull(scope10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getOwnSlot("Scope.Var arguments{null}");
        int int7 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("hi!");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("goog.scope");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("<non-file>");
        boolean boolean16 = scope2.isDeclared("goog.scope", false);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getVar("");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.Node node20 = scope19.getRootNode();
        com.google.javascript.jscomp.Scope.Var var21 = scope19.getArgumentsVar();
        com.google.javascript.rhino.Node node22 = var21.getNode();
        boolean boolean23 = var21.isConst();
        boolean boolean24 = var21.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo25 = var21.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope14.getScope(var21);
        com.google.javascript.rhino.Node node27 = var21.getNode();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSTypeStaticSlot6);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(var16);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(jSDocInfo25);
        org.junit.Assert.assertNotNull(jSTypeStaticScope26);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isGlobal();
        java.lang.String str9 = var6.getName();
        com.google.javascript.rhino.Node node10 = var6.nameNode;
        boolean boolean11 = var6.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        java.lang.String str7 = var4.name;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = var5.getNameNode();
        com.google.javascript.rhino.Node node7 = var5.getNameNode();
        com.google.javascript.jscomp.Scope.Var var8 = var5.getSymbol();
        java.lang.String str9 = var5.toString();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = var5.isBleedingFunction();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Scope.Var arguments{null}" + "'", str9, "Scope.Var arguments{null}");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = var21.isBleedingFunction();
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
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNotNull(varItor15);
        org.junit.Assert.assertNotNull(varItor16);
        org.junit.Assert.assertNotNull(var17);
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNotNull(jSTypeStaticScope20);
        org.junit.Assert.assertNotNull(var21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Scope.Var arguments{null}" + "'", str22, "Scope.Var arguments{null}");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
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
        boolean boolean11 = var6.isDefine;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Scope.Var arguments{null}" + "'", str10, "Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        com.google.javascript.rhino.Node node27 = var21.getNameNode();
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
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        boolean boolean12 = scope9.isDeclared("goog.scope", false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput16 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope9.declare("arguments", node14, jSType15, compilerInput16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(var17);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope10.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope10.getParentScope();
        int int13 = scope10.getVarCount();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope10.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNotNull(scope10);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(varItor14);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        com.google.javascript.rhino.ErrorReporter errorReporter26 = null;
        var16.resolveType(errorReporter26);
        com.google.javascript.jscomp.Scope scope28 = var16.scope;
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
        org.junit.Assert.assertNotNull(scope28);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.jscomp.Scope.Var var7 = var4.getSymbol();
        boolean boolean8 = var7.isDefine();
        boolean boolean9 = var7.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        com.google.javascript.rhino.ErrorReporter errorReporter12 = null;
        var4.resolveType(errorReporter12);
        com.google.javascript.rhino.Node node14 = var4.nameNode;
        boolean boolean15 = var4.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(jSDocInfo10);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
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
        com.google.javascript.jscomp.Scope scope13 = scope12.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
        org.junit.Assert.assertNotNull(jSTypeStaticScope11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(scope13);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        java.lang.String str11 = var5.getInputName();
        boolean boolean12 = var5.isExtern();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "<non-file>" + "'", str11, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
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
        boolean boolean18 = arguments11.isExtern();
        boolean boolean19 = arguments11.isNoShadow();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        com.google.javascript.jscomp.Scope.Var var11 = var4.getSymbol();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(var10);
        org.junit.Assert.assertNotNull(var11);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        com.google.javascript.jscomp.Scope.Var var10 = var7.getSymbol();
        java.lang.String str11 = var7.toString();
        com.google.javascript.rhino.Node node12 = var7.nameNode;
        com.google.javascript.jscomp.CompilerInput compilerInput13 = var7.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<non-file>" + "'", str5, "<non-file>");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(compilerInput13);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        boolean boolean16 = var11.isTypeInferred();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.jstype.StaticSourceFile staticSourceFile17 = var11.getSourceFile();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput8 = var4.input;
        boolean boolean9 = var4.isGlobal();
        java.lang.String str10 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "<non-file>" + "'", str10, "<non-file>");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
            boolean boolean13 = var12.isBleedingFunction();
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
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
        boolean boolean15 = var10.isNoShadow();
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        com.google.javascript.jscomp.Scope scope15 = scope12.getParent();
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.Scope.Var var17 = scope15.getVar("<non-file>");
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
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(scope15);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        int int11 = var10.index;
        boolean boolean12 = var10.isConst();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int7 = scope2.getDepth();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope11.getOwnSlot("hi!");
        boolean boolean15 = scope11.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope11.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var18 = scope11.getArgumentsVar();
        // The following exception was thrown during execution in test generation
        try {
            scope2.undeclare(var18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
        org.junit.Assert.assertNull(jSTypeStaticSlot14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot17);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var4.getInput();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNull(compilerInput9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(compilerInput11);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        com.google.javascript.jscomp.Scope.Var var10 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(var7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable10 = scope9.getAllSymbols();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Scope.Var arguments{null}" + "'", str8, "Scope.Var arguments{null}");
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNotNull(varIterable10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        com.google.javascript.jscomp.Scope scope11 = var6.getScope();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(scope11);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getSlot("hi!");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable12 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertNull(jSTypeStaticSlot11);
        org.junit.Assert.assertNotNull(varIterable12);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        java.lang.String str17 = arguments11.toString();
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType23 = scope20.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope20.getOwnSlot("arguments");
        com.google.javascript.rhino.Node node26 = scope20.getRootNode();
        boolean boolean27 = arguments11.equals((java.lang.Object) scope20);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Scope.Var arguments{null}" + "'", str17, "Scope.Var arguments{null}");
        org.junit.Assert.assertNull(var22);
        org.junit.Assert.assertNull(objectType23);
        org.junit.Assert.assertNull(jSTypeStaticSlot25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType7 = scope2.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot9 = scope2.getSlot("arguments");
        boolean boolean10 = scope2.isGlobal();
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getArgumentsVar();
        boolean boolean12 = var11.isConst();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(var11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        boolean boolean6 = scope5.isLocal();
        boolean boolean7 = scope5.isLocal();
        boolean boolean8 = scope5.isLocal();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope5);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.JSType jSType6 = var4.getType();
        boolean boolean7 = var4.isNoShadow();
        java.lang.String str8 = var4.name;
        java.lang.String str9 = var4.getInputName();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "arguments" + "'", str8, "arguments");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<non-file>" + "'", str9, "<non-file>");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        com.google.javascript.jscomp.CompilerInput compilerInput17 = var10.input;
        java.lang.String str18 = var10.getInputName();
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
        org.junit.Assert.assertNull(compilerInput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "<non-file>" + "'", str18, "<non-file>");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        boolean boolean15 = var9.isConst();
        java.lang.String str16 = var9.getName();
        com.google.javascript.rhino.Node node17 = var9.getNameNode();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "arguments" + "'", str16, "arguments");
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope scope6 = scope2.getParent();
        boolean boolean7 = scope2.isLocal();
        boolean boolean8 = scope2.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        com.google.javascript.rhino.Node node15 = var4.nameNode;
        java.lang.String str16 = var4.toString();
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
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Scope.Var arguments{null}" + "'", str16, "Scope.Var arguments{null}");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        java.lang.String str7 = var6.name;
        com.google.javascript.jscomp.Scope scope8 = var6.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "arguments" + "'", str7, "arguments");
        org.junit.Assert.assertNotNull(scope8);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
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
        boolean boolean11 = scope9.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(scope8);
        org.junit.Assert.assertNotNull(scope9);
        org.junit.Assert.assertNull(jSTypeStaticScope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
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
        int int22 = scope17.getVarCount();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
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
            com.google.javascript.jscomp.Scope.Var var14 = var13.getSymbol();
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
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        boolean boolean13 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(varIterable11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(objectType14);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var7 = scope2.getVar("hi!");
        com.google.javascript.jscomp.Scope scope8 = scope2.getParent();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(var7);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        boolean boolean17 = scope2.isDeclared("", true);
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSTypeStaticSlot12);
        org.junit.Assert.assertNull(var14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope scope6 = scope2.getGlobalScope();
        boolean boolean7 = scope6.isGlobal();
        com.google.javascript.jscomp.Scope scope8 = scope6.getParent();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNotNull(scope6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(scope8);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        boolean boolean13 = scope2.isBottom();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(objectType7);
        org.junit.Assert.assertNull(jSTypeStaticSlot9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(objectType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable11 = scope2.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(objectType8);
        org.junit.Assert.assertNotNull(varIterable9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varIterable11);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        com.google.javascript.rhino.Node node16 = var9.getParentNode();
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
        org.junit.Assert.assertNull(node16);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var10.getJSDocInfo();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertNull(jSDocInfo11);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        boolean boolean10 = var4.isGlobal();
        com.google.javascript.rhino.jstype.JSType jSType11 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        com.google.javascript.rhino.Node node10 = var4.getParentNode();
        com.google.javascript.rhino.jstype.JSType jSType11 = var4.getType();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(jSDocInfo8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSType11);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
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
        java.lang.String str13 = var4.name;
        com.google.javascript.rhino.Node node14 = var4.getParentNode();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "arguments" + "'", str13, "arguments");
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        java.lang.String str11 = var9.toString();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(jSDocInfo5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNull(compilerInput8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNotNull(var10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Scope.Var arguments{null}" + "'", str11, "Scope.Var arguments{null}");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var5 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope6 = var5.scope;
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(var5);
        org.junit.Assert.assertNotNull(scope6);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = scope2.getRootNode();
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticSlot5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
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
        com.google.javascript.jscomp.Scope scope28 = var21.scope;
        boolean boolean29 = var21.isGlobal();
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
        org.junit.Assert.assertNotNull(scope28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isDefine;
        com.google.javascript.rhino.Node node9 = var6.getNode();
        boolean boolean10 = var6.isNoShadow();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope15.getAllSymbols();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(varItor11);
        org.junit.Assert.assertNotNull(varItor12);
        org.junit.Assert.assertNotNull(var13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertNotNull(scope15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(varIterable17);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        int int6 = scope2.getDepth();
        boolean boolean9 = scope2.isDeclared("", true);
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getVar("arguments");
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(var11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        boolean boolean8 = scope2.isGlobal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope2.getAllSymbols();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope2.getOwnSlot("arguments");
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
        org.junit.Assert.assertNotNull(varIterable17);
        org.junit.Assert.assertNull(jSTypeStaticSlot19);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        boolean boolean13 = var4.isDefine;
        com.google.javascript.rhino.Node node14 = var4.nameNode;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNotNull(scope12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node4 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        org.junit.Assert.assertNotNull(scope3);
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope.Var var18 = scope2.getArgumentsVar();
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
        org.junit.Assert.assertNull(objectType17);
        org.junit.Assert.assertNotNull(var18);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        com.google.javascript.jscomp.Scope scope25 = scope20.getParent();
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
        org.junit.Assert.assertNull(scope25);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
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
        boolean boolean15 = var9.isConst();
        boolean boolean16 = var9.isConst();
        java.lang.String str17 = var9.getName();
        org.junit.Assert.assertNull(var4);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(jSDocInfo13);
        org.junit.Assert.assertNotNull(jSTypeStaticScope14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "arguments" + "'", str17, "arguments");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        boolean boolean4 = scope2.isLocal();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getOwnSlot("");
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNull(node8);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
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
        com.google.javascript.jscomp.Scope.Var var10 = var9.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(scope5);
        org.junit.Assert.assertNull(jSType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNotNull(var9);
        org.junit.Assert.assertNull(var10);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        boolean boolean8 = var4.isLocal();
        com.google.javascript.jscomp.Scope.Var var9 = var4.getDeclaration();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(var9);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.rhino.jstype.ObjectType objectType6 = scope2.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor7 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("");
        int int10 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope scope11 = scope2.getGlobalScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        org.junit.Assert.assertNull(jSTypeStaticScope3);
        org.junit.Assert.assertNull(jSTypeStaticScope4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(objectType6);
        org.junit.Assert.assertNotNull(varItor7);
        org.junit.Assert.assertNull(var9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(scope11);
        org.junit.Assert.assertNull(jSTypeStaticScope12);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
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
        com.google.javascript.jscomp.Scope.Var var13 = var4.getDeclaration();
        com.google.javascript.rhino.jstype.JSType jSType14 = var4.getType();
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
        org.junit.Assert.assertNull(var13);
        org.junit.Assert.assertNull(jSType14);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope2.getSlot("hi!");
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getVars();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.jscomp.Scope scope10 = scope2.getParent();
        boolean boolean11 = scope2.isBottom();
        boolean boolean12 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope2.getTypeOfThis();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNull(jSTypeStaticSlot7);
        org.junit.Assert.assertNotNull(varItor8);
        org.junit.Assert.assertNull(objectType9);
        org.junit.Assert.assertNull(scope10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(objectType13);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("arguments");
        int int9 = scope2.getVarCount();
        boolean boolean10 = scope2.isLocal();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(varItor6);
        org.junit.Assert.assertNull(jSTypeStaticSlot8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        int int9 = scope2.getVarCount();
        int int10 = scope2.getVarCount();
        com.google.javascript.rhino.Node node11 = scope2.getRootNode();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getOwnSlot("arguments");
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(var4);
        org.junit.Assert.assertNull(var6);
        org.junit.Assert.assertNull(var8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSTypeStaticSlot13);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        com.google.javascript.jscomp.Scope scope11 = var6.scope;
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertNotNull(scope7);
        org.junit.Assert.assertNotNull(var8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(scope11);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        int int18 = scope16.getDepth();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        boolean boolean7 = var6.isTypeInferred();
        boolean boolean8 = var6.isGlobal();
        java.lang.String str9 = var6.getName();
        com.google.javascript.jscomp.CompilerInput compilerInput10 = var6.getInput();
        boolean boolean11 = var6.isTypeInferred();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNotNull(varItor4);
        org.junit.Assert.assertNotNull(varItor5);
        org.junit.Assert.assertNotNull(var6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "arguments" + "'", str9, "arguments");
        org.junit.Assert.assertNull(compilerInput10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

