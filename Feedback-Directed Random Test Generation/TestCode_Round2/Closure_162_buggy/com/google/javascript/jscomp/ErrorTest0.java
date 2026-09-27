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
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.getNameNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getScope(var10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        java.lang.String str10 = var9.getInputName();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.jscomp.Scope scope10 = var9.scope;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.ErrorReporter errorReporter10 = null;
        var9.resolveType(errorReporter10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
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
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.Node node20 = scope19.getRootNode();
        com.google.javascript.jscomp.Scope.Var var21 = scope19.getArgumentsVar();
        java.lang.String str22 = var21.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope14.getScope(var21);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable24 = scope2.getReferences(var21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var21", var9.equals(var21) ? var9.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope10.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        java.lang.String str18 = var17.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope10.getScope(var17);
        boolean boolean20 = arguments6.equals((java.lang.Object) var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var17", arguments6.equals(var17) ? arguments6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        java.lang.String str20 = var19.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope12.getScope(var19);
        com.google.javascript.jscomp.Scope scope22 = scope12.getParent();
        boolean boolean23 = var4.equals((java.lang.Object) scope12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isNoShadow();
        boolean boolean8 = var4.isLocal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        boolean boolean15 = var13.isConst();
        boolean boolean16 = var13.isNoShadow();
        java.lang.String str17 = var13.name;
        boolean boolean18 = var4.equals((java.lang.Object) str17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.Node node20 = scope19.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var23 = scope19.getArgumentsVar();
        com.google.javascript.rhino.Node node24 = var23.getNode();
        boolean boolean25 = var23.isDefine();
        boolean boolean26 = var11.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var11 and var23", var11.equals(var23) ? var11.hashCode() == var23.hashCode() : true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        com.google.javascript.jscomp.Scope.Var var14 = arguments13.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = var17.getJSDocInfo();
        boolean boolean19 = var17.isNoShadow();
        com.google.javascript.jscomp.Scope scope20 = var17.getScope();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = var17.getJSDocInfo();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var17", var9.equals(var17) ? var9.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo11 = var10.getJSDocInfo();
        boolean boolean12 = var10.isDefine();
        com.google.javascript.jscomp.Scope scope13 = var10.getScope();
        com.google.javascript.jscomp.Scope scope14 = var10.getScope();
        com.google.javascript.jscomp.Scope scope15 = var10.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        boolean boolean17 = var4.equals((java.lang.Object) scope15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        boolean boolean6 = scope5.isLocal();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        java.lang.String str12 = var11.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable13 = scope5.getReferences(var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.getNode();
        boolean boolean16 = var14.isConst();
        boolean boolean17 = var14.isNoShadow();
        boolean boolean18 = var14.isTypeInferred();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope9.getReferences(var14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str7 = arguments6.getName();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        boolean boolean13 = var12.isExtern();
        boolean boolean14 = arguments6.equals((java.lang.Object) var12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var12", arguments6.equals(var12) ? arguments6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node14 = scope11.getRootNode();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        boolean boolean20 = var19.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var21 = var19.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope11.getReferences(var19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope7.getScope(var19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = arguments7.getJSDocInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = var19.getJSDocInfo();
        boolean boolean21 = var19.isDefine();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope2.getScope(var19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var19", var9.equals(var19) ? var9.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean8 = arguments7.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
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
        boolean boolean31 = var25.isConst();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope(var25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var13.", arguments6.equals(var13) == var13.equals(arguments6));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("<non-file>", node8, jSType9, compilerInput10);
        boolean boolean14 = scope5.isDeclared("<non-file>", false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot23 = scope20.getOwnSlot("hi!");
        int int24 = scope20.getVarCount();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        com.google.javascript.rhino.Node node28 = scope27.getRootNode();
        com.google.javascript.jscomp.Scope.Var var29 = scope27.getArgumentsVar();
        com.google.javascript.rhino.Node node30 = var29.getNode();
        boolean boolean31 = var29.isConst();
        boolean boolean32 = var29.isNoShadow();
        boolean boolean33 = var29.isTypeInferred();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope34 = scope20.getScope(var29);
        boolean boolean35 = var29.isConst();
        boolean boolean36 = var29.isConst();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope37 = scope2.getScope(var29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var13 and var29", var13.equals(var29) ? var13.hashCode() == var29.hashCode() : true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNode();
        boolean boolean14 = var12.isDefine();
        boolean boolean15 = var4.equals((java.lang.Object) var12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope2.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope12.getArgumentsVar();
        java.lang.Class<?> wildcardClass17 = var16.getClass();
        boolean boolean18 = var4.equals((java.lang.Object) var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        java.lang.String str14 = arguments13.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        boolean boolean23 = var22.isNoShadow();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var22.", var11.equals(var22) == var22.equals(var11));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope18.getParentScope();
        com.google.javascript.rhino.Node node21 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope scope22 = scope18.getGlobalScope();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope25.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot28 = scope25.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope22.getScope((com.google.javascript.jscomp.Scope.Var) arguments29);
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope15.getReferences((com.google.javascript.jscomp.Scope.Var) arguments29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var13 and arguments29", var13.equals(arguments29) ? var13.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot6 = scope2.getSlot("goog.scope");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        boolean boolean12 = var11.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var11.resolveType(errorReporter13);
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        var11.resolveType(errorReporter15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments18", var10.equals(arguments18) ? var10.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getDepth();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope8.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        arguments12.resolveType(errorReporter13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments12", var4.equals(arguments12) ? var4.hashCode() == arguments12.hashCode() : true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope2.getVars();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.Node node10 = scope2.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
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
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        java.lang.String str19 = var18.getInputName();
        boolean boolean20 = var18.isDefine;
        com.google.javascript.jscomp.Scope.Var var21 = var18.getSymbol();
        boolean boolean22 = var21.isDefine;
        com.google.javascript.rhino.Node node23 = var21.getNode();
        boolean boolean24 = arguments11.equals((java.lang.Object) node23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var18", arguments11.equals(var18) ? arguments11.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("<non-file>", node8, jSType9, compilerInput10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope19 = var18.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope5.getReferences(var18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var11.getJSDocInfo();
        com.google.javascript.jscomp.Scope scope17 = var11.scope;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope5.getReferences(var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
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
        com.google.javascript.jscomp.Scope.Var var22 = var21.getDeclaration();
        boolean boolean23 = var4.equals((java.lang.Object) var22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.getNode();
        boolean boolean16 = var14.isConst();
        boolean boolean17 = var14.isNoShadow();
        boolean boolean18 = var14.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var14.getJSDocInfo();
        java.lang.String str20 = var14.getName();
        java.lang.String str21 = var14.name;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope2.getScope(var14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        boolean boolean9 = scope2.isBottom();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope17 = var16.scope;
        boolean boolean18 = var16.isExtern();
        com.google.javascript.rhino.Node node19 = var16.getNameNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope2.getReferences(var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        com.google.javascript.rhino.Node node6 = var4.getNode();
        com.google.javascript.rhino.jstype.JSType jSType7 = var4.getType();
        java.lang.String str8 = var4.name;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        boolean boolean15 = var13.isConst();
        boolean boolean16 = var13.isNoShadow();
        boolean boolean17 = var13.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = var13.getJSDocInfo();
        java.lang.String str19 = var13.getName();
        java.lang.String str20 = var13.name;
        com.google.javascript.jscomp.CompilerInput compilerInput21 = var13.input;
        boolean boolean22 = var4.equals((java.lang.Object) var13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = var11.getJSDocInfo();
        boolean boolean13 = var11.isDefine();
        com.google.javascript.jscomp.Scope scope14 = var11.getScope();
        com.google.javascript.jscomp.Scope scope15 = var11.getScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope2.getScope(var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var11", arguments6.equals(var11) ? arguments6.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        boolean boolean15 = var14.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var16 = var14.getSymbol();
        java.lang.String str17 = var16.name;
        com.google.javascript.jscomp.CompilerInput compilerInput18 = var16.getInput();
        boolean boolean19 = var4.equals((java.lang.Object) var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope15.getOwnSlot("hi!");
        boolean boolean19 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope15.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        boolean boolean23 = arguments11.equals((java.lang.Object) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments22", arguments11.equals(arguments22) ? arguments11.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
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
        boolean boolean12 = var11.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType20 = null;
        com.google.javascript.jscomp.Scope scope21 = new com.google.javascript.jscomp.Scope(node19, objectType20);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope21.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope21.getParentScope();
        com.google.javascript.rhino.Node node24 = scope21.getRootNode();
        com.google.javascript.jscomp.Scope scope25 = scope21.getGlobalScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope28.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = scope28.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments32 = new com.google.javascript.jscomp.Scope.Arguments(scope28);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope25.getScope((com.google.javascript.jscomp.Scope.Var) arguments32);
        com.google.javascript.jscomp.Scope.Var var34 = arguments32.getDeclaration();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable35 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments18", var10.equals(arguments18) ? var10.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        com.google.javascript.jscomp.Scope.Var var11 = scope2.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var10.", var11.equals(var10) == var10.equals(var11));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope10.getOwnSlot("hi!");
        boolean boolean14 = scope10.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope10.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var17 = scope10.getArgumentsVar();
        boolean boolean20 = scope10.isDeclared("arguments", false);
        boolean boolean21 = arguments7.equals((java.lang.Object) false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot15 = scope12.getOwnSlot("hi!");
        boolean boolean16 = scope12.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType17 = scope12.getTypeOfThis();
        boolean boolean18 = scope12.isBottom();
        boolean boolean19 = scope12.isLocal();
        boolean boolean20 = arguments9.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments9", arguments6.equals(arguments9) ? arguments6.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
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
        int int23 = scope2.getDepth();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var22.", var11.equals(var22) == var22.equals(var11));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo17 = var16.getJSDocInfo();
        boolean boolean18 = var16.isExtern();
        com.google.javascript.rhino.Node node19 = var16.getNode();
        boolean boolean20 = var4.equals((java.lang.Object) var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var16", var4.equals(var16) ? var4.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType6 = null;
        com.google.javascript.jscomp.Scope scope7 = new com.google.javascript.jscomp.Scope(node5, objectType6);
        com.google.javascript.rhino.Node node8 = scope7.getRootNode();
        com.google.javascript.jscomp.Scope.Var var9 = scope7.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo10 = var9.getJSDocInfo();
        boolean boolean11 = var9.isDefine();
        com.google.javascript.jscomp.Scope scope12 = var9.getScope();
        com.google.javascript.jscomp.Scope scope13 = var9.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var9.getInput();
        java.lang.String str15 = var9.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getReferences(var9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope14 = var13.scope;
        java.lang.String str15 = var13.getInputName();
        boolean boolean16 = var13.isNoShadow();
        boolean boolean17 = arguments6.equals((java.lang.Object) var13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var13", arguments6.equals(var13) ? arguments6.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node8 = scope2.getRootNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        com.google.javascript.jscomp.CompilerInput compilerInput11 = var10.getInput();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        java.lang.String str16 = var14.getInputName();
        boolean boolean17 = var14.isNoShadow();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope7.getScope(var14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope15.getOwnSlot("hi!");
        boolean boolean19 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope15.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var22 = scope15.getArgumentsVar();
        boolean boolean23 = var4.equals((java.lang.Object) scope15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var22", var4.equals(var22) ? var4.hashCode() == var22.hashCode() : true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
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
        com.google.javascript.rhino.Node node14 = scope2.getRootNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope2.getSlot("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments15", var9.equals(arguments15) ? var9.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        boolean boolean15 = var13.isConst();
        boolean boolean16 = var13.isNoShadow();
        boolean boolean17 = var13.isDefine();
        com.google.javascript.rhino.Node node18 = var13.getParentNode();
        com.google.javascript.jscomp.Scope.Var var19 = var13.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope2.getScope(var19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput10 = null;
        com.google.javascript.jscomp.Scope.Var var11 = scope5.declare("<non-file>", node8, jSType9, compilerInput10);
        com.google.javascript.rhino.Node node12 = var11.nameNode;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.Node node20 = scope19.getRootNode();
        com.google.javascript.jscomp.Scope.Var var21 = scope19.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = var21.getJSDocInfo();
        boolean boolean23 = var21.isNoShadow();
        com.google.javascript.jscomp.Scope scope24 = var21.getScope();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.JSType jSType27 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = null;
        com.google.javascript.jscomp.Scope.Var var29 = scope24.declare("hi!", node26, jSType27, compilerInput28);
        boolean boolean30 = var11.equals((java.lang.Object) compilerInput28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var11 and var21", var11.equals(var21) ? var11.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getArgumentsVar();
        boolean boolean12 = scope2.isDeclared("arguments", false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope18 = var17.scope;
        com.google.javascript.rhino.jstype.JSType jSType19 = var17.getType();
        boolean boolean20 = var17.isTypeInferred();
        boolean boolean21 = var17.isConst();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope2.getReferences(var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var17", var9.equals(var17) ? var9.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        com.google.javascript.jscomp.Scope.Var var13 = scope7.getArgumentsVar();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var13 and var12.", var13.equals(var12) == var12.equals(var13));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
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
        com.google.javascript.rhino.Node node10 = var9.getNode();
        boolean boolean11 = var9.isConst();
        boolean boolean12 = var9.isNoShadow();
        boolean boolean13 = var9.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = var9.getJSDocInfo();
        com.google.javascript.jscomp.Scope.Var var15 = var9.getDeclaration();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable16 = scope2.getReferences(var9);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var9", var4.equals(var9) ? var4.hashCode() == var9.hashCode() : true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.Node node8 = var4.nameNode;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        boolean boolean15 = var13.isConst();
        boolean boolean16 = var13.isNoShadow();
        boolean boolean17 = var13.isTypeInferred();
        java.lang.String str18 = var13.getInputName();
        com.google.javascript.rhino.Node node19 = var13.nameNode;
        com.google.javascript.jscomp.Scope scope20 = var13.scope;
        boolean boolean21 = var4.equals((java.lang.Object) var13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope15.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope15.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var19 = scope15.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope20 = var19.scope;
        java.lang.String str21 = var19.toString();
        com.google.javascript.jscomp.Scope scope22 = var19.getScope();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope12.getReferences(var19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var19", var4.equals(var19) ? var4.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str10 = arguments9.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments9", arguments6.equals(arguments9) ? arguments6.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope10 = scope7.getParentScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments9", var4.equals(arguments9) ? var4.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        com.google.javascript.rhino.Node node13 = scope7.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var12.", var4.equals(var12) == var12.equals(var4));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = arguments6.isExtern();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getVar("");
        com.google.javascript.rhino.jstype.ObjectType objectType13 = scope10.getTypeOfThis();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope10.declare("goog.scope", node15, jSType16, compilerInput17);
        boolean boolean19 = arguments6.equals((java.lang.Object) node15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var18.", arguments6.equals(var18) == var18.equals(arguments6));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.Node node16 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Var var17 = scope15.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var17", arguments11.equals(var17) ? arguments11.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        com.google.javascript.rhino.Node node16 = arguments15.getNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments15", var9.equals(arguments15) ? var9.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
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
        com.google.javascript.rhino.Node node12 = scope2.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo21 = var20.getJSDocInfo();
        boolean boolean22 = var20.isDefine();
        com.google.javascript.jscomp.Scope scope23 = var20.getScope();
        com.google.javascript.jscomp.Scope scope24 = var20.getScope();
        com.google.javascript.jscomp.Scope scope25 = var20.getScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope15.getScope(var20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var13 and var20", var13.equals(var20) ? var13.hashCode() == var20.hashCode() : true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
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
        com.google.javascript.rhino.ErrorReporter errorReporter14 = null;
        var13.resolveType(errorReporter14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var13.", arguments6.equals(var13) == var13.equals(arguments6));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        com.google.javascript.rhino.Node node11 = var10.getNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope2.declare("<non-file>", node13, jSType14, compilerInput15, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        boolean boolean9 = var8.isExtern();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Var var9 = scope2.getVar("Scope.Var arguments{null}");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.Node node20 = scope19.getRootNode();
        com.google.javascript.jscomp.Scope.Var var21 = scope19.getArgumentsVar();
        int int22 = scope19.getVarCount();
        com.google.javascript.rhino.Node node23 = scope19.getRootNode();
        com.google.javascript.jscomp.Scope.Var var25 = scope19.getVar("hi!");
        boolean boolean26 = arguments13.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments13 and var21", arguments13.equals(var21) ? arguments13.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot7 = scope5.getSlot("arguments");
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        java.lang.String str13 = var12.getInputName();
        com.google.javascript.jscomp.CompilerInput compilerInput14 = var12.input;
        com.google.javascript.jscomp.Scope scope15 = var12.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope5.getScope(var12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var12", var4.equals(var12) ? var4.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = scope2.getParent();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var11 = scope8.getArgumentsVar();
        boolean boolean12 = var11.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        var11.resolveType(errorReporter13);
        com.google.javascript.jscomp.Scope.Var var15 = var11.getSymbol();
        com.google.javascript.jscomp.Scope.Var var16 = var15.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var15", var4.equals(var15) ? var4.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        java.lang.String str20 = var19.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope12.getScope(var19);
        com.google.javascript.jscomp.Scope scope22 = scope12.getGlobalScope();
        com.google.javascript.rhino.Node node23 = scope22.getRootNode();
        boolean boolean24 = scope22.isLocal();
        boolean boolean25 = var7.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var7 and var19", var7.equals(var19) ? var7.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
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
        com.google.javascript.rhino.Node node12 = var11.getNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.Node node21 = scope20.getRootNode();
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getArgumentsVar();
        com.google.javascript.rhino.Node node23 = var22.getNode();
        boolean boolean24 = var22.isConst();
        boolean boolean25 = var22.isNoShadow();
        boolean boolean26 = var22.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo27 = var22.getJSDocInfo();
        java.lang.String str28 = var22.getName();
        boolean boolean29 = var22.isExtern();
        com.google.javascript.rhino.Node node30 = var22.getNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = scope2.getScope(var22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var11 and var22", var11.equals(var22) ? var11.hashCode() == var22.hashCode() : true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType18 = null;
        com.google.javascript.jscomp.Scope scope19 = new com.google.javascript.jscomp.Scope(node17, objectType18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope19.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope19.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        com.google.javascript.rhino.Node node25 = scope24.getRootNode();
        com.google.javascript.jscomp.Scope.Var var26 = scope24.getArgumentsVar();
        java.lang.String str27 = var26.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope19.getScope(var26);
        com.google.javascript.jscomp.Scope scope29 = var26.getScope();
        boolean boolean30 = arguments11.equals((java.lang.Object) var26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var26", arguments11.equals(var26) ? arguments11.hashCode() == var26.hashCode() : true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = arguments6.getScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope10.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope10.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean14 = scope10.isBottom();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = var19.getJSDocInfo();
        boolean boolean21 = var19.isExtern();
        boolean boolean22 = var19.isTypeInferred();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope10.getReferences(var19);
        boolean boolean24 = arguments6.equals((java.lang.Object) scope10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var19", arguments6.equals(var19) ? arguments6.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node9 = var8.getParentNode();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot11 = scope2.getOwnSlot("");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope16 = var15.scope;
        java.lang.String str17 = var15.getInputName();
        boolean boolean18 = var15.isDefine;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope10.getScope(var15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var15", var4.equals(var15) ? var4.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        com.google.javascript.rhino.Node node10 = arguments9.nameNode;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments9", var4.equals(arguments9) ? var4.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
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
        boolean boolean14 = arguments13.isNoShadow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope21 = var20.scope;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput25 = null;
        com.google.javascript.jscomp.Scope.Var var26 = scope21.declare("hi!", node23, jSType24, compilerInput25);
        boolean boolean27 = arguments11.equals((java.lang.Object) jSType24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var20", arguments11.equals(var20) ? arguments11.hashCode() == var20.hashCode() : true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor9 = scope2.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
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
        boolean boolean22 = var21.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var21.", var11.equals(var21) == var21.equals(var11));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.getNode();
        boolean boolean16 = var14.isConst();
        boolean boolean17 = var14.isNoShadow();
        boolean boolean18 = var14.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var14.getJSDocInfo();
        java.lang.String str20 = var14.getName();
        boolean boolean21 = var14.isExtern();
        com.google.javascript.jscomp.Scope scope22 = var14.getScope();
        boolean boolean23 = var14.isTypeInferred();
        boolean boolean24 = var4.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var18.getJSDocInfo();
        boolean boolean20 = var18.isDefine();
        com.google.javascript.jscomp.Scope scope21 = var18.getScope();
        com.google.javascript.jscomp.Scope scope22 = var18.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput23 = var18.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var18.getJSDocInfo();
        com.google.javascript.rhino.Node node25 = var18.getNameNode();
        java.lang.String str26 = var18.name;
        boolean boolean27 = var18.isExtern();
        java.lang.String str28 = var18.getName();
        boolean boolean29 = arguments11.equals((java.lang.Object) str28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var18", arguments11.equals(var18) ? arguments11.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor5 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope13 = var12.scope;
        java.lang.String str14 = var12.getInputName();
        boolean boolean15 = var12.isTypeInferred();
        java.lang.String str16 = var12.toString();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var12", var6.equals(var12) ? var6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var16 = scope13.getArgumentsVar();
        boolean boolean17 = var16.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter18 = null;
        var16.resolveType(errorReporter18);
        com.google.javascript.jscomp.Scope.Var var20 = var16.getSymbol();
        com.google.javascript.rhino.jstype.JSType jSType21 = var20.getType();
        java.lang.String str22 = var20.getInputName();
        java.lang.String str23 = var20.toString();
        boolean boolean24 = var20.isNoShadow();
        boolean boolean25 = var4.equals((java.lang.Object) boolean24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var15", var4.equals(var15) ? var4.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isDefine();
        com.google.javascript.jscomp.Scope scope7 = var4.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType8 = scope7.getTypeOfThis();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getVar("");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        com.google.javascript.rhino.Node node19 = var18.getNode();
        boolean boolean20 = var18.isConst();
        boolean boolean21 = var18.isNoShadow();
        com.google.javascript.rhino.JSDocInfo jSDocInfo22 = var18.getJSDocInfo();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope11.getScope(var18);
        boolean boolean24 = var18.isConst();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable25 = scope7.getReferences(var18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var13.", var4.equals(var13) == var13.equals(var4));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope29.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot32 = scope29.getOwnSlot("hi!");
        boolean boolean33 = scope29.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType34 = scope29.getTypeOfThis();
        boolean boolean35 = scope29.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot37 = scope29.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments38 = new com.google.javascript.jscomp.Scope.Arguments(scope29);
        com.google.javascript.rhino.ErrorReporter errorReporter39 = null;
        arguments38.resolveType(errorReporter39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType42 = null;
        com.google.javascript.jscomp.Scope scope43 = new com.google.javascript.jscomp.Scope(node41, objectType42);
        com.google.javascript.rhino.Node node44 = scope43.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor45 = scope43.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor46 = scope43.getVars();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot48 = scope43.getSlot("hi!");
        boolean boolean49 = scope43.isBottom();
        boolean boolean50 = arguments38.equals((java.lang.Object) boolean49);
        boolean boolean51 = arguments26.equals((java.lang.Object) arguments38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var16 and arguments26", var16.equals(arguments26) ? var16.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.Node node9 = scope8.getRootNode();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope11 = var10.scope;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var16 = scope11.declare("hi!", node13, jSType14, compilerInput15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope(var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var10", var4.equals(var10) ? var4.hashCode() == var10.hashCode() : true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.Node node21 = scope20.getRootNode();
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getArgumentsVar();
        com.google.javascript.rhino.Node node23 = var22.getNode();
        boolean boolean24 = var22.isConst();
        boolean boolean25 = var22.isNoShadow();
        boolean boolean26 = var22.isDefine();
        com.google.javascript.rhino.Node node27 = var22.getParentNode();
        com.google.javascript.jscomp.Scope.Var var28 = var22.getSymbol();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope15.getScope(var28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var13 and var28", var13.equals(var28) ? var13.hashCode() == var28.hashCode() : true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str8 = arguments7.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope18.getOwnSlot("hi!");
        boolean boolean22 = scope18.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType23 = scope18.getTypeOfThis();
        boolean boolean24 = scope18.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot26 = scope18.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.rhino.Node node30 = scope29.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor31 = scope29.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor32 = scope29.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var33 = scope29.getArgumentsVar();
        com.google.javascript.rhino.Node node34 = var33.getNode();
        com.google.javascript.rhino.jstype.JSType jSType35 = var33.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope18.getScope(var33);
        com.google.javascript.jscomp.Scope.Var var37 = var33.getSymbol();
        com.google.javascript.jscomp.Scope scope38 = var33.scope;
        boolean boolean39 = arguments11.equals((java.lang.Object) scope38);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var33", arguments11.equals(var33) ? arguments11.hashCode() == var33.hashCode() : true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        boolean boolean10 = var9.isTypeInferred();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = var4.getJSDocInfo();
        boolean boolean6 = var4.isExtern();
        com.google.javascript.rhino.Node node7 = var4.getNode();
        boolean boolean8 = var4.isGlobal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.Node node12 = scope11.getRootNode();
        com.google.javascript.jscomp.Scope.Var var13 = scope11.getArgumentsVar();
        com.google.javascript.rhino.Node node14 = var13.getNode();
        boolean boolean15 = var13.isConst();
        boolean boolean16 = var13.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        var13.resolveType(errorReporter17);
        boolean boolean19 = var13.isDefine;
        com.google.javascript.jscomp.CompilerInput compilerInput20 = var13.getInput();
        java.lang.String str21 = var13.getInputName();
        java.lang.String str22 = var13.getName();
        boolean boolean23 = var4.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope17.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        java.lang.String str22 = arguments21.getName();
        boolean boolean23 = arguments21.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var13 and arguments21", var13.equals(arguments21) ? var13.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor13 = scope11.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node14 = scope11.getRootNode();
        boolean boolean15 = scope11.isLocal();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node21 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope18);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope11.getScope((com.google.javascript.jscomp.Scope.Var) arguments22);
        boolean boolean24 = arguments22.isLocal();
        com.google.javascript.jscomp.Scope scope25 = arguments22.getScope();
        java.lang.String str26 = arguments22.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable27 = scope2.getReferences((com.google.javascript.jscomp.Scope.Var) arguments22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments22", arguments6.equals(arguments22) ? arguments6.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope22.getOwnSlot("hi!");
        boolean boolean26 = scope22.isGlobal();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.rhino.Node node30 = scope29.getRootNode();
        com.google.javascript.jscomp.Scope.Var var31 = scope29.getArgumentsVar();
        com.google.javascript.rhino.Node node32 = var31.getNode();
        boolean boolean33 = var31.isConst();
        boolean boolean34 = var31.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable35 = scope22.getReferences(var31);
        com.google.javascript.jscomp.CompilerInput compilerInput36 = var31.input;
        com.google.javascript.rhino.jstype.JSType jSType37 = var31.getType();
        com.google.javascript.rhino.Node node38 = var31.getParentNode();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable39 = scope12.getReferences(var31);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var31", arguments6.equals(var31) ? arguments6.hashCode() == var31.hashCode() : true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        boolean boolean20 = scope2.isBottom();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments19", var10.equals(arguments19) ? var10.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot8 = scope2.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = var14.getJSDocInfo();
        boolean boolean16 = var14.isDefine();
        com.google.javascript.jscomp.Scope scope17 = var14.getScope();
        int int18 = scope17.getDepth();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.JSType jSType21 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput22 = null;
        com.google.javascript.jscomp.Scope.Var var24 = scope17.declare("arguments", node20, jSType21, compilerInput22, true);
        boolean boolean25 = arguments9.equals((java.lang.Object) "arguments");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments9 and var14", arguments9.equals(var14) ? arguments9.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        com.google.javascript.jscomp.CompilerInput compilerInput12 = var11.input;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        com.google.javascript.jscomp.Scope scope12 = var11.scope;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        boolean boolean6 = scope2.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getArgumentsVar();
        com.google.javascript.rhino.jstype.ObjectType objectType9 = scope2.getTypeOfThis();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor15 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var16 = scope12.getArgumentsVar();
        java.lang.String str17 = var16.name;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable18 = scope2.getReferences(var16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var8 and var16", var8.equals(var16) ? var8.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope5);
        boolean boolean10 = scope5.isDeclared("goog.scope", false);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope10 = arguments9.scope;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments9", arguments6.equals(arguments9) ? arguments6.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
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
        com.google.javascript.rhino.Node node18 = var17.getNameNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var17.", var4.equals(var17) == var17.equals(var4));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var15.getJSDocInfo();
        boolean boolean17 = var15.isDefine();
        java.lang.String str18 = var15.getInputName();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope2.getReferences(var15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var15", var6.equals(var15) ? var6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
        boolean boolean19 = scope2.isBottom();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var9 and var18.", var9.equals(var18) == var18.equals(var9));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
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
        boolean boolean11 = var10.isTypeInferred();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope16.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope16.getOwnSlot("hi!");
        boolean boolean20 = scope16.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType21 = scope16.getTypeOfThis();
        boolean boolean22 = scope16.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot24 = scope16.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments25 = new com.google.javascript.jscomp.Scope.Arguments(scope16);
        boolean boolean26 = arguments25.isDefine();
        java.lang.String str27 = arguments25.getInputName();
        com.google.javascript.rhino.Node node28 = arguments25.getNameNode();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope12.getScope((com.google.javascript.jscomp.Scope.Var) arguments25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments25", var9.equals(arguments25) ? var9.hashCode() == arguments25.hashCode() : true);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope17.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope17.getDeclarativelyUnboundVarsWithoutTypes();
        java.lang.Class<?> wildcardClass22 = varItor21.getClass();
        boolean boolean23 = arguments11.equals((java.lang.Object) varItor21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var19", arguments11.equals(var19) ? arguments11.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        com.google.javascript.rhino.jstype.JSType jSType13 = null;
        var12.setType(jSType13);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var12.", var4.equals(var12) == var12.equals(var4));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.Class<?> wildcardClass7 = scope2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments5 and arguments6", arguments5.equals(arguments6) ? arguments5.hashCode() == arguments6.hashCode() : true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope7 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope scope8 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Arguments arguments9 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean10 = arguments9.isDefine;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments9", arguments6.equals(arguments9) ? arguments6.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor18 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope16.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var20 = scope16.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope21 = var20.scope;
        java.lang.Object obj22 = null;
        boolean boolean23 = var20.equals(obj22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope12.getScope(var20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var20", var9.equals(var20) ? var9.hashCode() == var20.hashCode() : true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType7 = null;
        com.google.javascript.jscomp.Scope scope8 = new com.google.javascript.jscomp.Scope(node6, objectType7);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope9 = scope8.getParentScope();
        com.google.javascript.jscomp.Scope.Var var10 = scope8.getArgumentsVar();
        com.google.javascript.rhino.Node node11 = var10.nameNode;
        boolean boolean12 = var10.isGlobal();
        java.lang.String str13 = var10.toString();
        boolean boolean14 = arguments5.equals((java.lang.Object) var10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments5 and var10", arguments5.equals(var10) ? arguments5.hashCode() == var10.hashCode() : true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        boolean boolean11 = scope2.isGlobal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope9.getSlot("arguments");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var18.", var4.equals(var18) == var18.equals(var4));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        com.google.javascript.rhino.Node node19 = var18.getNode();
        com.google.javascript.rhino.jstype.JSType jSType20 = var18.getType();
        boolean boolean21 = var4.equals((java.lang.Object) jSType20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.jscomp.Scope.Var var24 = scope22.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var25 = scope22.getArgumentsVar();
        com.google.javascript.rhino.Node node26 = var25.getNameNode();
        com.google.javascript.rhino.Node node27 = var25.getNameNode();
        com.google.javascript.jscomp.Scope.Var var28 = var25.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput29 = var25.getInput();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope2.getScope(var25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var14 and var25", var14.equals(var25) ? var14.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput15 = null;
        com.google.javascript.jscomp.Scope.Var var17 = scope9.declare("arguments", node13, jSType14, compilerInput15, true);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var11", arguments6.equals(var11) ? arguments6.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node5 = var4.getNode();
        boolean boolean6 = var4.isConst();
        boolean boolean7 = var4.isDefine;
        boolean boolean8 = var4.isLocal();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope11.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments15 = new com.google.javascript.jscomp.Scope.Arguments(scope11);
        com.google.javascript.rhino.ErrorReporter errorReporter16 = null;
        arguments15.resolveType(errorReporter16);
        com.google.javascript.jscomp.DiagnosticType diagnosticType18 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL;
        boolean boolean19 = arguments15.equals((java.lang.Object) diagnosticType18);
        boolean boolean20 = var4.equals((java.lang.Object) arguments15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments15", var4.equals(arguments15) ? var4.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var15.getJSDocInfo();
        boolean boolean17 = var15.isDefine();
        com.google.javascript.jscomp.Scope scope18 = var15.getScope();
        com.google.javascript.jscomp.Scope scope19 = var15.getScope();
        com.google.javascript.jscomp.Scope scope20 = var15.scope;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope20.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments23 = new com.google.javascript.jscomp.Scope.Arguments(scope20);
        boolean boolean24 = var6.equals((java.lang.Object) scope20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var15", var6.equals(var15) ? var6.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments6 and var13.", arguments6.equals(var13) == var13.equals(arguments6));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getVar("");
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isDefine();
        java.lang.String str16 = var11.name;
        boolean boolean17 = var11.isDefine;
        boolean boolean18 = var11.isLocal();
        boolean boolean19 = var11.isGlobal();
        boolean boolean20 = arguments6.equals((java.lang.Object) var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments5 and arguments6", arguments5.equals(arguments6) ? arguments5.hashCode() == arguments6.hashCode() : true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
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
        boolean boolean14 = arguments13.isTypeInferred();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope13.getParentScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments14", var9.equals(arguments14) ? var9.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
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
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput26 = null;
        com.google.javascript.jscomp.Scope.Var var28 = scope2.declare("hi!", node24, jSType25, compilerInput26, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var22.", var11.equals(var22) == var22.equals(var11));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        boolean boolean3 = scope2.isBottom();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isGlobal();
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        int int13 = var12.index;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable14 = scope2.getReferences(var12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var12", arguments6.equals(var12) ? arguments6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope18.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope20 = scope18.getParentScope();
        com.google.javascript.rhino.Node node21 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope scope22 = scope18.getGlobalScope();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope26 = scope25.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot28 = scope25.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments29 = new com.google.javascript.jscomp.Scope.Arguments(scope25);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope30 = scope22.getScope((com.google.javascript.jscomp.Scope.Var) arguments29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType32 = null;
        com.google.javascript.jscomp.Scope scope33 = new com.google.javascript.jscomp.Scope(node31, objectType32);
        boolean boolean34 = scope33.isBottom();
        com.google.javascript.jscomp.Scope.Var var36 = scope33.getVar("");
        boolean boolean37 = arguments29.equals((java.lang.Object) scope33);
        boolean boolean38 = arguments13.equals((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments13 and arguments29", arguments13.equals(arguments29) ? arguments13.hashCode() == arguments29.hashCode() : true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        com.google.javascript.rhino.Node node13 = arguments12.nameNode;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments12", var4.equals(arguments12) ? var4.hashCode() == arguments12.hashCode() : true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var10 = scope2.declare("arguments", node6, jSType7, compilerInput8, true);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope16 = var15.scope;
        com.google.javascript.rhino.jstype.JSType jSType17 = var15.getType();
        boolean boolean18 = var15.isTypeInferred();
        com.google.javascript.rhino.JSDocInfo jSDocInfo19 = var15.getJSDocInfo();
        com.google.javascript.rhino.jstype.JSType jSType20 = var15.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope2.getScope(var15);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        com.google.javascript.jscomp.Scope.Arguments arguments12 = new com.google.javascript.jscomp.Scope.Arguments(scope8);
        com.google.javascript.rhino.ErrorReporter errorReporter13 = null;
        arguments12.resolveType(errorReporter13);
        com.google.javascript.jscomp.DiagnosticType diagnosticType15 = com.google.javascript.jscomp.ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL;
        boolean boolean16 = arguments12.equals((java.lang.Object) diagnosticType15);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope2.getScope((com.google.javascript.jscomp.Scope.Var) arguments12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments5 and arguments12", arguments5.equals(arguments12) ? arguments5.hashCode() == arguments12.hashCode() : true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
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
        com.google.javascript.jscomp.Scope scope13 = scope7.getParent();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments12", var4.equals(arguments12) ? var4.hashCode() == arguments12.hashCode() : true);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
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
        boolean boolean13 = var12.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var12.", var4.equals(var12) == var12.equals(var4));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope21 = scope20.getParentScope();
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var23 = scope20.getArgumentsVar();
        boolean boolean24 = var23.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        var23.resolveType(errorReporter25);
        com.google.javascript.jscomp.Scope.Var var27 = var23.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput28 = var23.getInput();
        boolean boolean29 = arguments13.equals((java.lang.Object) var23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments13 and var23", arguments13.equals(var23) ? arguments13.hashCode() == var23.hashCode() : true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope17.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot20 = scope17.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments21 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope22 = scope17.getParentScope();
        boolean boolean23 = scope17.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope17.getSlot("");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope17);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope9.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments21", var4.equals(arguments21) ? var4.hashCode() == arguments21.hashCode() : true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
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
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot13 = scope2.getSlot("<non-file>");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and jSTypeStaticSlot13.", var4.equals(jSTypeStaticSlot13) == jSTypeStaticSlot13.equals(var4));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope15.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node18 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments19 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.jscomp.Scope scope20 = scope15.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var21 = scope20.getArgumentsVar();
        boolean boolean22 = var4.equals((java.lang.Object) scope20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments19", var4.equals(arguments19) ? var4.hashCode() == arguments19.hashCode() : true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable15 = scope13.getAllSymbols();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments14", var9.equals(arguments14) ? var9.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope5.getParentScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var10.", var4.equals(var10) == var10.equals(var4));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope13.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot16 = scope13.getOwnSlot("hi!");
        boolean boolean17 = scope13.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType18 = scope13.getTypeOfThis();
        boolean boolean19 = scope13.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope13.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments22 = new com.google.javascript.jscomp.Scope.Arguments(scope13);
        com.google.javascript.jscomp.Scope.Var var24 = scope13.getVar("goog.scope");
        com.google.javascript.jscomp.Scope scope25 = scope13.getGlobalScope();
        boolean boolean26 = var7.equals((java.lang.Object) scope25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var7 and arguments22", var7.equals(arguments22) ? var7.hashCode() == arguments22.hashCode() : true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        java.lang.String str14 = arguments13.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        com.google.javascript.rhino.Node node6 = var4.getNameNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.Node node12 = var11.getNode();
        boolean boolean13 = var11.isConst();
        boolean boolean14 = var11.isNoShadow();
        boolean boolean15 = var11.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo16 = var11.getJSDocInfo();
        java.lang.String str17 = var11.getName();
        boolean boolean18 = var11.isExtern();
        com.google.javascript.jscomp.Scope scope19 = var11.getScope();
        boolean boolean20 = var11.isGlobal();
        com.google.javascript.rhino.ErrorReporter errorReporter21 = null;
        var11.resolveType(errorReporter21);
        java.lang.String str23 = var11.name;
        com.google.javascript.rhino.Node node24 = var11.nameNode;
        com.google.javascript.jscomp.Scope.Var var25 = var11.getSymbol();
        boolean boolean26 = var4.equals((java.lang.Object) var25);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var25", var4.equals(var25) ? var4.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        java.lang.String str5 = var4.getInputName();
        boolean boolean6 = var4.isDefine;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = var11.getJSDocInfo();
        boolean boolean13 = var11.isDefine();
        com.google.javascript.jscomp.Scope scope14 = var11.getScope();
        com.google.javascript.rhino.jstype.ObjectType objectType15 = scope14.getTypeOfThis();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean17 = var4.equals((java.lang.Object) varItor16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var11", var4.equals(var11) ? var4.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor22 = scope2.getVars();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var21.", var11.equals(var21) == var21.equals(var11));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope15 = scope14.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope14.getOwnSlot("hi!");
        boolean boolean18 = scope14.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType19 = scope14.getTypeOfThis();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope14.getSlot("arguments");
        boolean boolean22 = scope14.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot24 = scope14.getSlot("");
        com.google.javascript.rhino.jstype.ObjectType objectType25 = scope14.getTypeOfThis();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        com.google.javascript.rhino.Node node29 = scope28.getRootNode();
        com.google.javascript.jscomp.Scope.Var var30 = scope28.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = var30.getJSDocInfo();
        boolean boolean32 = var30.isExtern();
        boolean boolean33 = var30.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable34 = scope14.getReferences(var30);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope35 = scope2.getScope(var30);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments10 and var30", arguments10.equals(var30) ? arguments10.hashCode() == var30.hashCode() : true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
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
        com.google.javascript.rhino.jstype.ObjectType objectType19 = scope2.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments18", var10.equals(arguments18) ? var10.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        boolean boolean7 = var6.isDefine;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.Node node11 = scope10.getRootNode();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.rhino.Node node13 = var12.getNode();
        com.google.javascript.rhino.Node node14 = var12.getNode();
        com.google.javascript.jscomp.Scope.Var var15 = var12.getSymbol();
        com.google.javascript.rhino.Node node16 = var15.getNode();
        boolean boolean17 = var6.equals((java.lang.Object) node16);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var12", var6.equals(var12) ? var6.hashCode() == var12.hashCode() : true);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
        boolean boolean17 = var16.isLocal();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var6 and var16.", var6.equals(var16) == var16.equals(var6));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        boolean boolean19 = scope2.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments18", var10.equals(arguments18) ? var10.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope12.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        com.google.javascript.rhino.Node node31 = scope30.getRootNode();
        com.google.javascript.jscomp.Scope.Var var32 = scope30.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo33 = var32.getJSDocInfo();
        boolean boolean34 = var32.isDefine();
        com.google.javascript.jscomp.Scope scope35 = var32.getScope();
        com.google.javascript.jscomp.Scope scope36 = var32.getScope();
        com.google.javascript.jscomp.CompilerInput compilerInput37 = var32.getInput();
        com.google.javascript.rhino.JSDocInfo jSDocInfo38 = var32.getJSDocInfo();
        com.google.javascript.rhino.Node node39 = var32.getNameNode();
        com.google.javascript.jscomp.Scope scope40 = var32.getScope();
        java.lang.String str41 = var32.name;
        boolean boolean42 = var32.isDefine();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope43 = scope23.getScope(var32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var16 and var32", var16.equals(var32) ? var16.hashCode() == var32.hashCode() : true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node5 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope scope7 = scope2.getGlobalScope();
        com.google.javascript.jscomp.Scope.Var var8 = scope7.getArgumentsVar();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.JSType jSType11 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput12 = null;
        com.google.javascript.jscomp.Scope.Var var13 = scope7.declare("Scope.Var arguments{null}", node10, jSType11, compilerInput12);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var8", arguments6.equals(var8) ? arguments6.hashCode() == var8.hashCode() : true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope15 = var14.scope;
        com.google.javascript.rhino.jstype.JSType jSType16 = var14.getType();
        boolean boolean17 = var14.isTypeInferred();
        com.google.javascript.jscomp.CompilerInput compilerInput18 = var14.input;
        boolean boolean19 = var14.isTypeInferred();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope9.getReferences(var14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var14", var6.equals(var14) ? var6.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        boolean boolean12 = var11.isDefine();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var11.", var4.equals(var11) == var11.equals(var4));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Var var8 = scope2.getVar("<non-file>");
        int int9 = scope2.getVarCount();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.nameNode;
        boolean boolean16 = var14.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope2.getReferences(var14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope15.getParentScope();
        com.google.javascript.rhino.Node node18 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope scope19 = scope15.getGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope22.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope19.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        boolean boolean28 = var4.equals((java.lang.Object) arguments26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments26", var4.equals(arguments26) ? var4.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope19 = scope14.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot21 = scope14.getSlot("goog.scope");
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable22 = scope14.getAllSymbols();
        boolean boolean23 = arguments11.equals((java.lang.Object) varIterable22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var18", arguments11.equals(var18) ? arguments11.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        com.google.javascript.jscomp.Scope.Arguments arguments10 = new com.google.javascript.jscomp.Scope.Arguments(scope7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments9", var4.equals(arguments9) ? var4.hashCode() == arguments9.hashCode() : true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        int int5 = scope2.getVarCount();
        com.google.javascript.rhino.Node node6 = scope2.getRootNode();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor11 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor12 = scope9.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var13 = scope9.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope14 = var13.scope;
        java.lang.Object obj15 = null;
        boolean boolean16 = var13.equals(obj15);
        java.lang.String str17 = var13.toString();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope18 = scope2.getScope(var13);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var13", var4.equals(var13) ? var4.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor17 = scope14.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        boolean boolean19 = var18.isTypeInferred();
        boolean boolean20 = var7.equals((java.lang.Object) boolean19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var7 and var18", var7.equals(var18) ? var7.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
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
        int int27 = scope25.getVarCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var16 and arguments26", var16.equals(arguments26) ? var16.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope17 = scope15.getParentScope();
        com.google.javascript.rhino.Node node18 = scope15.getRootNode();
        com.google.javascript.jscomp.Scope scope19 = scope15.getGlobalScope();
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope23 = scope22.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot25 = scope22.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments26 = new com.google.javascript.jscomp.Scope.Arguments(scope22);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope27 = scope19.getScope((com.google.javascript.jscomp.Scope.Var) arguments26);
        boolean boolean28 = arguments26.isExtern();
        com.google.javascript.jscomp.Scope scope29 = arguments26.getScope();
        boolean boolean30 = arguments11.equals((java.lang.Object) scope29);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and arguments26", arguments11.equals(arguments26) ? arguments11.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope5);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope5.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        com.google.javascript.rhino.Node node19 = var18.nameNode;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var9 and var18.", var9.equals(var18) == var18.equals(var9));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.rhino.Node node15 = scope14.getRootNode();
        com.google.javascript.jscomp.Scope.Var var16 = scope14.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope17 = var16.scope;
        com.google.javascript.rhino.jstype.JSType jSType18 = var16.getType();
        boolean boolean19 = var16.isTypeInferred();
        int int20 = var16.index;
        int int21 = var16.index;
        int int22 = var16.index;
        com.google.javascript.jscomp.Scope scope23 = var16.getScope();
        boolean boolean24 = arguments11.equals((java.lang.Object) scope23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var16", arguments11.equals(var16) ? arguments11.hashCode() == var16.hashCode() : true);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
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
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor20 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor21 = scope18.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean22 = scope18.isBottom();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType24 = null;
        com.google.javascript.jscomp.Scope scope25 = new com.google.javascript.jscomp.Scope(node23, objectType24);
        com.google.javascript.rhino.Node node26 = scope25.getRootNode();
        com.google.javascript.jscomp.Scope.Var var27 = scope25.getArgumentsVar();
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = var27.getJSDocInfo();
        boolean boolean29 = var27.isExtern();
        boolean boolean30 = var27.isTypeInferred();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable31 = scope18.getReferences(var27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope32 = scope2.getScope(var27);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var27", var9.equals(var27) ? var9.hashCode() == var27.hashCode() : true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType12 = null;
        com.google.javascript.jscomp.Scope scope13 = new com.google.javascript.jscomp.Scope(node11, objectType12);
        com.google.javascript.rhino.Node node14 = scope13.getRootNode();
        com.google.javascript.jscomp.Scope.Var var15 = scope13.getArgumentsVar();
        com.google.javascript.rhino.Node node16 = var15.getNode();
        boolean boolean17 = var15.isConst();
        boolean boolean18 = var15.isNoShadow();
        com.google.javascript.rhino.ErrorReporter errorReporter19 = null;
        var15.resolveType(errorReporter19);
        boolean boolean21 = var15.isDefine;
        com.google.javascript.jscomp.Scope scope22 = var15.getScope();
        boolean boolean23 = var15.isLocal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope24 = scope9.getScope(var15);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var15", var4.equals(var15) ? var4.hashCode() == var15.hashCode() : true);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope2.getAllSymbols();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var9 and var18.", var9.equals(var18) == var18.equals(var9));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
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
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType15 = null;
        com.google.javascript.jscomp.Scope scope16 = new com.google.javascript.jscomp.Scope(node14, objectType15);
        com.google.javascript.rhino.Node node17 = scope16.getRootNode();
        com.google.javascript.jscomp.Scope.Var var18 = scope16.getArgumentsVar();
        java.lang.String str19 = var18.getInputName();
        boolean boolean20 = var18.isDefine;
        com.google.javascript.jscomp.Scope.Var var21 = var18.getSymbol();
        boolean boolean22 = var21.isDefine;
        com.google.javascript.rhino.Node node23 = var21.getNode();
        com.google.javascript.jscomp.CompilerInput compilerInput24 = var21.getInput();
        boolean boolean25 = arguments11.equals((java.lang.Object) var21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var21", arguments11.equals(var21) ? arguments11.hashCode() == var21.hashCode() : true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
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
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var16 and arguments26", var16.equals(arguments26) ? var16.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getParentScope();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var13", arguments6.equals(var13) ? arguments6.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
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
        java.lang.String str18 = arguments17.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments17", var10.equals(arguments17) ? var10.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType23 = null;
        com.google.javascript.jscomp.Scope scope24 = new com.google.javascript.jscomp.Scope(node22, objectType23);
        com.google.javascript.rhino.Node node25 = scope24.getRootNode();
        com.google.javascript.jscomp.Scope.Var var26 = scope24.getArgumentsVar();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor27 = scope24.getDeclarativelyUnboundVarsWithoutTypes();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor28 = scope24.getDeclarativelyUnboundVarsWithoutTypes();
        boolean boolean29 = var11.equals((java.lang.Object) varItor28);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var11 and var26", var11.equals(var26) ? var11.hashCode() == var26.hashCode() : true);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
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
        boolean boolean14 = scope2.isBottom();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput8 = null;
        com.google.javascript.jscomp.Scope.Var var9 = scope2.declare("<non-file>", node6, jSType7, compilerInput8);
        boolean boolean10 = var9.isExtern();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var9.", var4.equals(var9) == var9.equals(var4));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
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
        boolean boolean15 = arguments14.isDefine;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments14", var9.equals(arguments14) ? var9.hashCode() == arguments14.hashCode() : true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable17 = scope2.getAllSymbols();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var6 and var16.", var6.equals(var16) == var16.equals(var6));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
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
        int int22 = scope2.getDepth();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var21.", var11.equals(var21) == var21.equals(var11));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        boolean boolean16 = arguments15.isGlobal();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments15", var9.equals(arguments15) ? var9.hashCode() == arguments15.hashCode() : true);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
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
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope2.getVars();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and arguments18", var10.equals(arguments18) ? var10.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.jscomp.Scope scope3 = scope2.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getVars();
        boolean boolean5 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str8 = arguments7.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments7", arguments6.equals(arguments7) ? arguments6.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
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
        java.lang.String str12 = arguments11.getInputName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments11", arguments6.equals(arguments11) ? arguments6.hashCode() == arguments11.hashCode() : true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo12 = arguments11.getJSDocInfo();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments11", arguments6.equals(arguments11) ? arguments6.hashCode() == arguments11.hashCode() : true);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor14 = scope12.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node15 = scope12.getRootNode();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType17 = null;
        com.google.javascript.jscomp.Scope scope18 = new com.google.javascript.jscomp.Scope(node16, objectType17);
        com.google.javascript.rhino.Node node19 = scope18.getRootNode();
        com.google.javascript.jscomp.Scope.Var var20 = scope18.getArgumentsVar();
        boolean boolean21 = var20.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var22 = var20.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable23 = scope12.getReferences(var20);
        com.google.javascript.rhino.ErrorReporter errorReporter24 = null;
        var20.resolveType(errorReporter24);
        com.google.javascript.jscomp.Scope.Var var26 = var20.getSymbol();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType28 = null;
        com.google.javascript.jscomp.Scope scope29 = new com.google.javascript.jscomp.Scope(node27, objectType28);
        com.google.javascript.jscomp.Scope scope30 = scope29.getGlobalScope();
        boolean boolean31 = var26.equals((java.lang.Object) scope30);
        com.google.javascript.jscomp.Scope scope32 = var26.scope;
        com.google.javascript.jscomp.Scope.Var var33 = scope32.getArgumentsVar();
        boolean boolean34 = var4.equals((java.lang.Object) var33);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var33", var4.equals(var33) ? var4.hashCode() == var33.hashCode() : true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var15 = scope12.getArgumentsVar();
        boolean boolean16 = var15.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter17 = null;
        var15.resolveType(errorReporter17);
        com.google.javascript.jscomp.Scope.Var var19 = var15.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput20 = var15.getInput();
        boolean boolean21 = var9.equals((java.lang.Object) compilerInput20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and var14", var9.equals(var14) ? var9.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
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
        int int16 = scope2.getVarCount();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var15.", var4.equals(var15) == var15.equals(var4));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
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
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType27 = null;
        com.google.javascript.jscomp.Scope scope28 = new com.google.javascript.jscomp.Scope(node26, objectType27);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope28.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot31 = scope28.getOwnSlot("hi!");
        boolean boolean32 = scope28.isGlobal();
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.jscomp.Scope scope35 = new com.google.javascript.jscomp.Scope(node33, objectType34);
        com.google.javascript.rhino.Node node36 = scope35.getRootNode();
        com.google.javascript.jscomp.Scope.Var var37 = scope35.getArgumentsVar();
        com.google.javascript.rhino.Node node38 = var37.getNode();
        boolean boolean39 = var37.isConst();
        boolean boolean40 = var37.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable41 = scope28.getReferences(var37);
        boolean boolean42 = var37.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope43 = scope20.getScope(var37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and var37", var10.equals(var37) ? var10.hashCode() == var37.hashCode() : true);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
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
        boolean boolean19 = var18.isConst();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var9 and var18.", var9.equals(var18) == var18.equals(var9));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
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
        boolean boolean24 = scope2.isDeclared("<non-file>", false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var11 and var21.", var11.equals(var21) == var21.equals(var11));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        boolean boolean5 = var4.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var6 = var4.getSymbol();
        com.google.javascript.jscomp.CompilerInput compilerInput7 = var6.input;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType9 = null;
        com.google.javascript.jscomp.Scope scope10 = new com.google.javascript.jscomp.Scope(node8, objectType9);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope11 = scope10.getParentScope();
        com.google.javascript.jscomp.Scope.Var var12 = scope10.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var13 = scope10.getArgumentsVar();
        boolean boolean14 = var13.isTypeInferred();
        com.google.javascript.rhino.ErrorReporter errorReporter15 = null;
        var13.resolveType(errorReporter15);
        com.google.javascript.jscomp.Scope.Var var17 = var13.getSymbol();
        boolean boolean18 = var6.equals((java.lang.Object) var17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var6 and var17", var6.equals(var17) ? var6.hashCode() == var17.hashCode() : true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
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
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType34 = null;
        com.google.javascript.jscomp.Scope scope35 = new com.google.javascript.jscomp.Scope(node33, objectType34);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope36 = scope35.getParentScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor37 = scope35.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node38 = scope35.getRootNode();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType40 = null;
        com.google.javascript.jscomp.Scope scope41 = new com.google.javascript.jscomp.Scope(node39, objectType40);
        com.google.javascript.rhino.Node node42 = scope41.getRootNode();
        com.google.javascript.jscomp.Scope.Var var43 = scope41.getArgumentsVar();
        boolean boolean44 = var43.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var45 = var43.getSymbol();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable46 = scope35.getReferences(var43);
        com.google.javascript.rhino.jstype.JSType jSType47 = var43.getType();
        boolean boolean48 = var43.isDefine();
        boolean boolean49 = arguments11.equals((java.lang.Object) var43);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var43", arguments11.equals(var43) ? arguments11.hashCode() == var43.hashCode() : true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot5 = scope2.getOwnSlot("hi!");
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.ErrorReporter errorReporter7 = null;
        arguments6.resolveType(errorReporter7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot14 = scope11.getOwnSlot("hi!");
        boolean boolean15 = scope11.isGlobal();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot17 = scope11.getOwnSlot("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments18 = new com.google.javascript.jscomp.Scope.Arguments(scope11);
        boolean boolean19 = arguments6.equals((java.lang.Object) arguments18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments18", arguments6.equals(arguments18) ? arguments6.hashCode() == arguments18.hashCode() : true);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean8 = arguments7.isNoShadow();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        com.google.javascript.rhino.Node node19 = scope2.getRootNode();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var6 and var18.", var6.equals(var18) == var18.equals(var6));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        java.lang.Class<?> wildcardClass14 = scope2.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var13", arguments6.equals(var13) ? arguments6.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
        com.google.javascript.jscomp.Scope scope18 = scope10.getParent();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var17.", var4.equals(var17) == var17.equals(var4));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope12.getParentScope();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.nameNode;
        boolean boolean16 = var14.isGlobal();
        com.google.javascript.jscomp.Scope scope17 = var14.scope;
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot19 = scope17.getOwnSlot("Scope.Var arguments{null}");
        boolean boolean20 = var4.equals((java.lang.Object) jSTypeStaticSlot19);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        com.google.javascript.jscomp.Scope scope16 = scope9.getGlobalScope();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var15.", var4.equals(var15) == var15.equals(var4));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        com.google.javascript.jscomp.CompilerInput compilerInput23 = var18.input;
        boolean boolean24 = arguments6.equals((java.lang.Object) compilerInput23);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var18", arguments6.equals(var18) ? arguments6.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        boolean boolean14 = var13.isNoShadow();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var13.", var4.equals(var13) == var13.equals(var4));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
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
        int int18 = scope14.getVarCount();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments17", var9.equals(arguments17) ? var9.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
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
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        com.google.javascript.jscomp.Scope.Var var19 = scope17.getArgumentsVar();
        com.google.javascript.rhino.Node node20 = var19.getNode();
        boolean boolean21 = var19.isConst();
        boolean boolean22 = var19.isNoShadow();
        boolean boolean23 = var19.isDefine();
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var19.getJSDocInfo();
        boolean boolean25 = arguments13.equals((java.lang.Object) jSDocInfo24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments13 and var19", arguments13.equals(var19) ? arguments13.hashCode() == var19.hashCode() : true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
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
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType21 = null;
        com.google.javascript.jscomp.Scope scope22 = new com.google.javascript.jscomp.Scope(node20, objectType21);
        com.google.javascript.jscomp.Scope scope23 = scope22.getGlobalScope();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor24 = scope23.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType26 = null;
        com.google.javascript.jscomp.Scope scope27 = new com.google.javascript.jscomp.Scope(node25, objectType26);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope28 = scope27.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot30 = scope27.getOwnSlot("hi!");
        boolean boolean31 = scope27.isGlobal();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType33 = null;
        com.google.javascript.jscomp.Scope scope34 = new com.google.javascript.jscomp.Scope(node32, objectType33);
        com.google.javascript.rhino.Node node35 = scope34.getRootNode();
        com.google.javascript.jscomp.Scope.Var var36 = scope34.getArgumentsVar();
        com.google.javascript.rhino.Node node37 = var36.getNode();
        boolean boolean38 = var36.isConst();
        boolean boolean39 = var36.isNoShadow();
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable40 = scope27.getReferences(var36);
        boolean boolean41 = var36.isGlobal();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope42 = scope23.getScope(var36);
        com.google.javascript.jscomp.Scope scope43 = var36.scope;
        com.google.javascript.rhino.Node node44 = scope43.getRootNode();
        com.google.javascript.rhino.jstype.ObjectType objectType45 = scope43.getTypeOfThis();
        boolean boolean46 = arguments13.equals((java.lang.Object) objectType45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments13 and var36", arguments13.equals(var36) ? arguments13.hashCode() == var36.hashCode() : true);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
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
        boolean boolean17 = var16.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var6 and var16.", var6.equals(var16) == var16.equals(var6));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope scope5 = var4.scope;
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor6 = scope5.getDeclarativelyUnboundVarsWithoutTypes();
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope5);
        boolean boolean10 = scope5.isDeclared("Scope.Var arguments{null}", true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
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
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType19 = null;
        com.google.javascript.jscomp.Scope scope20 = new com.google.javascript.jscomp.Scope(node18, objectType19);
        com.google.javascript.rhino.Node node21 = scope20.getRootNode();
        com.google.javascript.jscomp.Scope.Var var22 = scope20.getArgumentsVar();
        com.google.javascript.rhino.Node node23 = var22.getNode();
        boolean boolean24 = var22.isConst();
        boolean boolean25 = var22.isNoShadow();
        boolean boolean26 = var22.isDefine();
        boolean boolean27 = var22.isConst();
        java.lang.String str28 = var22.getInputName();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope29 = scope16.getScope(var22);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var10 and var22", var10.equals(var22) ? var10.hashCode() == var22.hashCode() : true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        com.google.javascript.jscomp.Scope.Var var4 = scope2.getArgumentsVar();
        com.google.javascript.jscomp.Scope.Var var6 = scope2.getVar("<non-file>");
        com.google.javascript.jscomp.Scope.Arguments arguments7 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor8 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and arguments7", var4.equals(arguments7) ? var4.hashCode() == arguments7.hashCode() : true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
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
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType13 = null;
        com.google.javascript.jscomp.Scope scope14 = new com.google.javascript.jscomp.Scope(node12, objectType13);
        com.google.javascript.jscomp.Scope scope15 = scope14.getParent();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor16 = scope14.getVars();
        boolean boolean17 = scope14.isBottom();
        com.google.javascript.jscomp.Scope.Var var18 = scope14.getArgumentsVar();
        boolean boolean19 = var18.isDefine;
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable20 = scope9.getReferences(var18);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var18", var4.equals(var18) ? var4.hashCode() == var18.hashCode() : true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
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
        com.google.javascript.jscomp.Scope.Var var27 = arguments26.getDeclaration();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var16 and arguments26", var16.equals(arguments26) ? var16.hashCode() == arguments26.hashCode() : true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        java.lang.String str9 = arguments8.name;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments8", arguments6.equals(arguments8) ? arguments6.hashCode() == arguments8.hashCode() : true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        com.google.javascript.jscomp.Scope.Var var19 = scope10.getVar("arguments");
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var19.", var4.equals(var19) == var19.equals(var4));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
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
        boolean boolean25 = var24.isDefine;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var14 and var24.", var14.equals(var24) == var24.equals(var14));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.jscomp.CompilerInput compilerInput17 = null;
        com.google.javascript.jscomp.Scope.Var var18 = scope2.declare("Scope.Var arguments{null}", node15, jSType16, compilerInput17);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and var13", arguments6.equals(var13) ? arguments6.hashCode() == var13.hashCode() : true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
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
        com.google.javascript.jscomp.CompilerInput compilerInput18 = arguments17.getInput();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments17", var9.equals(arguments17) ? var9.hashCode() == arguments17.hashCode() : true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType11 = null;
        com.google.javascript.jscomp.Scope scope12 = new com.google.javascript.jscomp.Scope(node10, objectType11);
        com.google.javascript.rhino.Node node13 = scope12.getRootNode();
        com.google.javascript.jscomp.Scope.Var var14 = scope12.getArgumentsVar();
        com.google.javascript.rhino.Node node15 = var14.getNode();
        boolean boolean16 = var14.isConst();
        boolean boolean17 = var14.isNoShadow();
        boolean boolean18 = var14.isDefine();
        com.google.javascript.rhino.Node node19 = var14.getParentNode();
        boolean boolean20 = var14.isDefine();
        boolean boolean21 = var14.isDefine;
        boolean boolean22 = var4.equals((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var4 and var14", var4.equals(var14) ? var4.hashCode() == var14.hashCode() : true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
        java.lang.Iterable<com.google.javascript.jscomp.Scope.Var> varIterable19 = scope9.getAllSymbols();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var18.", var4.equals(var18) == var18.equals(var4));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
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
        com.google.javascript.rhino.jstype.ObjectType objectType14 = scope2.getTypeOfThis();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        java.lang.String str14 = arguments13.getName();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments13", var9.equals(arguments13) ? var9.hashCode() == arguments13.hashCode() : true);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
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
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType14 = null;
        com.google.javascript.jscomp.Scope scope15 = new com.google.javascript.jscomp.Scope(node13, objectType14);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope16 = scope15.getParentScope();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot18 = scope15.getOwnSlot("hi!");
        boolean boolean19 = scope15.isGlobal();
        com.google.javascript.rhino.jstype.ObjectType objectType20 = scope15.getTypeOfThis();
        boolean boolean21 = scope15.isBottom();
        com.google.javascript.rhino.jstype.StaticSlot<com.google.javascript.rhino.jstype.JSType> jSTypeStaticSlot23 = scope15.getOwnSlot("Scope.Var arguments{null}");
        com.google.javascript.jscomp.Scope.Arguments arguments24 = new com.google.javascript.jscomp.Scope.Arguments(scope15);
        com.google.javascript.rhino.ErrorReporter errorReporter25 = null;
        arguments24.resolveType(errorReporter25);
        com.google.javascript.rhino.Node node27 = arguments24.nameNode;
        com.google.javascript.jscomp.CompilerInput compilerInput28 = arguments24.getInput();
        java.lang.String str29 = arguments24.toString();
        boolean boolean30 = arguments24.isLocal();
        boolean boolean31 = arguments24.isExtern();
        boolean boolean32 = arguments24.isNoShadow();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope33 = scope12.getScope((com.google.javascript.jscomp.Scope.Var) arguments24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on var9 and arguments24", var9.equals(arguments24) ? var9.hashCode() == arguments24.hashCode() : true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
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
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType16 = null;
        com.google.javascript.jscomp.Scope scope17 = new com.google.javascript.jscomp.Scope(node15, objectType16);
        com.google.javascript.rhino.Node node18 = scope17.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor19 = scope17.getDeclarativelyUnboundVarsWithoutTypes();
        int int20 = scope17.getVarCount();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType22 = null;
        com.google.javascript.jscomp.Scope scope23 = new com.google.javascript.jscomp.Scope(node21, objectType22);
        com.google.javascript.rhino.Node node24 = scope23.getRootNode();
        com.google.javascript.jscomp.Scope.Var var25 = scope23.getArgumentsVar();
        boolean boolean26 = var25.isNoShadow();
        com.google.javascript.jscomp.Scope.Var var27 = var25.getSymbol();
        com.google.javascript.rhino.ErrorReporter errorReporter28 = null;
        var25.resolveType(errorReporter28);
        com.google.javascript.rhino.Node node30 = var25.nameNode;
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope31 = scope17.getScope(var25);
        java.lang.Class<?> wildcardClass32 = var25.getClass();
        boolean boolean33 = arguments11.equals((java.lang.Object) wildcardClass32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments11 and var25", arguments11.equals(var25) ? arguments11.hashCode() == var25.hashCode() : true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        com.google.javascript.rhino.JSDocInfo jSDocInfo24 = var23.getJSDocInfo();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arguments11 and var23.", arguments11.equals(var23) == var23.equals(arguments11));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.Node node3 = scope2.getRootNode();
        java.util.Iterator<com.google.javascript.jscomp.Scope.Var> varItor4 = scope2.getDeclarativelyUnboundVarsWithoutTypes();
        int int5 = scope2.getVarCount();
        com.google.javascript.jscomp.Scope.Arguments arguments6 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        boolean boolean7 = scope2.isBottom();
        com.google.javascript.jscomp.Scope.Arguments arguments8 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType10 = null;
        com.google.javascript.jscomp.Scope scope11 = new com.google.javascript.jscomp.Scope(node9, objectType10);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope12 = scope11.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope13 = scope11.getParentScope();
        com.google.javascript.jscomp.Scope scope14 = scope11.getGlobalScope();
        boolean boolean15 = arguments8.equals((java.lang.Object) scope14);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments6 and arguments8", arguments6.equals(arguments8) ? arguments6.hashCode() == arguments8.hashCode() : true);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
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
        boolean boolean14 = var13.isExtern();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var13.", var4.equals(var13) == var13.equals(var4));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType1 = null;
        com.google.javascript.jscomp.Scope scope2 = new com.google.javascript.jscomp.Scope(node0, objectType1);
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope3 = scope2.getParentScope();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope4 = scope2.getParentScope();
        com.google.javascript.jscomp.Scope.Arguments arguments5 = new com.google.javascript.jscomp.Scope.Arguments(scope2);
        int int6 = scope2.getVarCount();
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.jstype.ObjectType objectType8 = null;
        com.google.javascript.jscomp.Scope scope9 = new com.google.javascript.jscomp.Scope(node7, objectType8);
        com.google.javascript.rhino.Node node10 = scope9.getRootNode();
        com.google.javascript.jscomp.Scope.Var var11 = scope9.getArgumentsVar();
        boolean boolean12 = var11.isNoShadow();
        com.google.javascript.rhino.jstype.JSType jSType13 = var11.getType();
        com.google.javascript.rhino.jstype.StaticScope<com.google.javascript.rhino.jstype.JSType> jSTypeStaticScope14 = scope2.getScope(var11);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on arguments5 and var11", arguments5.equals(var11) ? arguments5.hashCode() == var11.hashCode() : true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
        boolean boolean21 = var20.isTypeInferred();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on var4 and var20.", var4.equals(var20) == var20.equals(var4));
    }
}

