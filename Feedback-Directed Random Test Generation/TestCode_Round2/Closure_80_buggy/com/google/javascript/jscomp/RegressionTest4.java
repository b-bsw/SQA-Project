package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsType(node2, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "%=");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16, abstractCompiler17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isConstantName(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node16, node21);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node16);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler29);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler27);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue31 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(ternaryValue31);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        boolean boolean8 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9, false);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isCall(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node8);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = com.google.javascript.jscomp.NodeUtil.precedence(6);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unknown precedence for ifeq (type 6)");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node3);
        boolean boolean6 = booleanResultPredicate0.apply(node3);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node10);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node10, "JSCompiler_renameProperty");
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node18);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement20 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate21 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.has(node19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        com.google.javascript.rhino.jstype.JSType jSType24 = null;
        com.google.javascript.rhino.jstype.JSType jSType25 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node19, jSType24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node19, "JSCompiler_renameProperty");
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node29);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(jSType25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newExpr(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node18);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node12);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node22);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement29 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate30 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.has(node28, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node28);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node28);
        boolean boolean35 = mayBeStringResultPredicate25.apply(node28);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement36 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int37 = com.google.javascript.jscomp.NodeUtil.getCount(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement36);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newExpr(node43);
        java.lang.String str46 = com.google.javascript.jscomp.NodeUtil.getSourceName(node45);
        boolean boolean47 = matchNodeType40.apply(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node22, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        int int49 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node12, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType40);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue51 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(ternaryValue51);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement28 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate29 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement28, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isUndefined(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGet(node27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node27);
        boolean boolean35 = mayBeStringResultPredicate11.apply(node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node27);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node27);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node27);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.mayBeString(node27, true);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node27, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        java.lang.Double double7 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node3);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node8);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate17 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isUndefined(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node20, "hi!");
        boolean boolean24 = booleanResultPredicate17.apply(node20);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node28);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node33);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement35 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.has(node34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node28, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node20, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node42);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newExpr(node42);
        boolean boolean45 = matchShallowStatement35.apply(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node13, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node8, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newExpr(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node50, "hi!");
        java.lang.String str56 = com.google.javascript.jscomp.NodeUtil.getStringValue(node50);
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node50);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node8, node50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: EXPR_RESULT is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(double7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate17);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        java.lang.String[] strArray4 = new java.lang.String[] { "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node2, (java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node10);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement17 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate18 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.has(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node16);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node16);
        boolean boolean23 = mayBeStringResultPredicate13.apply(node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int25 = com.google.javascript.jscomp.NodeUtil.getCount(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node10);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node10, abstractCompiler28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isGetProp(node10);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node10);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isConstantName(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.has(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node15, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate31 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.has(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isAssign(node29);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection37 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node29);
        boolean boolean38 = booleanResultPredicate22.apply(node29);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement42 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate43 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.has(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement42, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsFunction(node41);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.referencesThis(node49);
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node41, node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isGetProp(node51);
        boolean boolean55 = booleanResultPredicate22.apply(node51);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node57);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement59 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate60 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.has(node58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement59, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isUndefined(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isThis(node58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node58);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isGetProp(node58);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        boolean boolean67 = booleanResultPredicate22.apply(node66);
        java.lang.Class<?> wildcardClass68 = booleanResultPredicate22.getClass();
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(nodeCollection37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStr(9);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "|" + "'", str1, "|");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node13, "instanceof");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGet(node21);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node27);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate30 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement34 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate35 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.has(node33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node33);
        boolean boolean40 = mayBeStringResultPredicate30.apply(node33);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement41 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int42 = com.google.javascript.jscomp.NodeUtil.getCount(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement41);
        int int43 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node21, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30);
        int int44 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate30);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isUndefined(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isGet(node47);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node53);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate56 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node58);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement60 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate61 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.has(node59, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement60, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isExprCall(node59);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node59);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node59);
        boolean boolean66 = mayBeStringResultPredicate56.apply(node59);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement67 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int68 = com.google.javascript.jscomp.NodeUtil.getCount(node53, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement67);
        int int69 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node47, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate56);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement70 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.referencesThis(node77);
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newExpr(node77);
        java.lang.String str80 = com.google.javascript.jscomp.NodeUtil.getSourceName(node79);
        boolean boolean81 = matchNodeType74.apply(node79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isVar(node79);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node79, "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isStatement(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2 + "'", int68 == 2);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement4 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNull(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLabelName(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node17);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.arrayToString(node17);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement25 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate26 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.has(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement31 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.has(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isUndefined(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isThis(node30);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.referencesThis(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node38);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue42 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node38);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node30, node38, "JSCompiler_renameProperty");
        boolean boolean45 = matchShallowStatement25.apply(node38);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node47);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement49 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate50 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.has(node48, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate50);
        int int52 = com.google.javascript.jscomp.NodeUtil.getCount(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate50);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node54);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement56 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate57 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.has(node55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.referencesThis(node62);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isFunction(node62);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node62);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node62);
        boolean boolean69 = matchShallowStatement56.apply(node62);
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("||", node62);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node62, "|");
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(ternaryValue42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isLatin("|");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isSimpleOperatorType(13);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node10);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration13 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isUndefined(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node16);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate20 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int21 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate20);
        int int22 = com.google.javascript.jscomp.NodeUtil.getCount(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate20);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isUndefined(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGet(node25);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node31);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate34 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node36);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement38 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate39 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.has(node37, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprCall(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node37);
        boolean boolean44 = mayBeStringResultPredicate34.apply(node37);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement45 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int46 = com.google.javascript.jscomp.NodeUtil.getCount(node31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement45);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node25, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate34);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate34);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node2);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.has(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node15);
        boolean boolean22 = mayBeStringResultPredicate12.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9, (java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node9);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node9);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node9);
        com.google.javascript.rhino.jstype.JSType jSType37 = null;
        com.google.javascript.rhino.jstype.JSType jSType38 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node9, jSType37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node9);
        java.lang.Double double40 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node9);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node9);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(jSType38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(double40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8, abstractCompiler9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement14 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsFunction(node13);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGetProp(node23);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node23);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.referencesThis(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate38 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isUndefined(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node41, "hi!");
        boolean boolean45 = booleanResultPredicate38.apply(node41);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.referencesThis(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node49);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node54);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement56 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate57 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.has(node55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node49, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node41, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.referencesThis(node63);
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newExpr(node63);
        boolean boolean66 = matchShallowStatement56.apply(node63);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node34, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node69);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement71 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate72 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.has(node70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement71, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isExprCall(node70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.containsFunction(node70);
        boolean boolean76 = matchShallowStatement56.apply(node70);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node8, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement56);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate38);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node9);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.has(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node15);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node15);
        boolean boolean22 = mayBeStringResultPredicate12.apply(node15);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23);
        java.lang.String[] strArray30 = new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9, (java.util.Set<java.lang.String>) strSet31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node9);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node9);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node9);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node9);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node9);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node42);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement44 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate45 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.has(node43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node51);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node43, node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isGetProp(node53);
        java.lang.String str57 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node53);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node53);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node53);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node63);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate66 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node68);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement70 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate71 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.has(node69, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate71);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isExprCall(node69);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node69);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node69);
        boolean boolean76 = mayBeStringResultPredicate66.apply(node69);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement77 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int78 = com.google.javascript.jscomp.NodeUtil.getCount(node63, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate66, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement77);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType81 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.referencesThis(node84);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newExpr(node84);
        java.lang.String str87 = com.google.javascript.jscomp.NodeUtil.getSourceName(node86);
        boolean boolean88 = matchNodeType81.apply(node86);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node63, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        int int90 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node53, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        int int91 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node9, 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType81);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler92 = null;
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node9, abstractCompiler92);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" });
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2 + "'", int78 == 2);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node11, abstractCompiler20);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node22);
        java.lang.Double double24 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node22);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor25 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate26 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isUndefined(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node29, "hi!");
        boolean boolean33 = booleanResultPredicate26.apply(node29);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node22, visitor25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(double24);
        org.junit.Assert.assertNotNull(booleanResultPredicate26);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node4, abstractCompiler9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got EXPR_RESULT");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate0 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node3, "hi!");
        boolean boolean7 = booleanResultPredicate0.apply(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isForIn(node3);
        org.junit.Assert.assertNotNull(booleanResultPredicate0);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement4 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetProp(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isForIn(node13);
        boolean boolean19 = matchNotFunction0.apply(node13);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.has(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node22, abstractCompiler27);
        boolean boolean29 = matchNotFunction0.apply(node22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate30 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isUndefined(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node33, "hi!");
        boolean boolean37 = booleanResultPredicate30.apply(node33);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.referencesThis(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node41);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node46);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement48 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate49 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.has(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement48, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node41, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node33, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement48);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node57);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node55, node57);
        boolean boolean60 = matchShallowStatement48.apply(node55);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node55);
        boolean boolean62 = matchNotFunction0.apply(node55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler63 = null;
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node55, abstractCompiler63);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean65 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(booleanResultPredicate30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node2);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "||");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(node2, abstractCompiler12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected NEW node, got VAR");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node4);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node10);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue14 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node10);
        com.google.javascript.rhino.JSDocInfo jSDocInfo15 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node10);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node16, abstractCompiler17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate23 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.has(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node21);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsFunction(node21);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node29);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newExpr(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node21, node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isGetProp(node31);
        java.lang.String str35 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node31);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node31);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node16, node31);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node31);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node31);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.mayBeString(node31, true);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isUndefined(node31);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node31);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.referencesThis(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node46);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate50 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isUndefined(node53);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node53, "hi!");
        boolean boolean57 = booleanResultPredicate50.apply(node53);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.referencesThis(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node61);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node66);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement68 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate69 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.has(node67, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node61, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node53, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.referencesThis(node75);
        com.google.javascript.rhino.Node node77 = com.google.javascript.jscomp.NodeUtil.newExpr(node75);
        boolean boolean78 = matchShallowStatement68.apply(node75);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node46, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isUndefined(node82);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isGet(node82);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate86 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        int int87 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node82, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate86);
        int int88 = com.google.javascript.jscomp.NodeUtil.getCount(node31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate86);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement68);
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler92 = null;
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4, abstractCompiler92);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(ternaryValue14);
        org.junit.Assert.assertNull(jSDocInfo15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(node43);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate50);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(node77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.jstype.JSType jSType7 = null;
        com.google.javascript.rhino.jstype.JSType jSType8 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node2, jSType7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isUndefined(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node11, "hi!");
        java.lang.Double double15 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isUndefined(node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue18 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node11);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(jSType8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(double15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(ternaryValue18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration8 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration8);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isUndefined(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node19);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate22 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node24);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement26 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate27 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.has(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node25);
        boolean boolean32 = mayBeStringResultPredicate22.apply(node25);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement33 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement33);
        int int35 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node13, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate22);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node37);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement39 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate40 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.has(node38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isUndefined(node38);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node38);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isGet(node38);
        com.google.javascript.rhino.JSDocInfo jSDocInfo45 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node38);
        boolean boolean46 = mayBeStringResultPredicate22.apply(node38);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate22);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(jSDocInfo45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node14);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isUndefined(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsFunction(node14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection20 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node23);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement25 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate26 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.has(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node24);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration30 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration30);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node14, 6, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration30);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate34 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isUndefined(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node37, "hi!");
        boolean boolean41 = booleanResultPredicate34.apply(node37);
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node37);
        java.lang.String str43 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node37);
        boolean boolean44 = matchDeclaration30.apply(node37);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.containsType(node2, 3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration30);
        com.google.javascript.rhino.Node node46 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.mayBeString(node46);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(nodeCollection20);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(booleanResultPredicate34);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        java.lang.Double double5 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(double5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        boolean boolean8 = matchNodeType1.apply(node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        boolean boolean19 = matchNodeType1.apply(node11);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        java.lang.String[] strArray16 = new java.lang.String[] { "||", "%=", "instanceof", "||", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node2, (java.util.Set<java.lang.String>) strSet17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "||", "%=", "instanceof", "||", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node4);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node8);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement10 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.has(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsFunction(node9);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node9, node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGetProp(node19);
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node19);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node19);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newExpr(node19);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node4, node25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isLabelName(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprCall(node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayBeString(node19, true);
        boolean boolean24 = matchShallowStatement12.apply(node19);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected expression nodeEXPR_RESULT? parent:null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isString(node4);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement11 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate12 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.has(node10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node10);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssign(node10);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node4, node10, "hi!");
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNull(node10);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        int int24 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement28 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate29 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.has(node27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement28, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isUndefined(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGet(node27);
        com.google.javascript.rhino.JSDocInfo jSDocInfo34 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node27);
        boolean boolean35 = mayBeStringResultPredicate11.apply(node27);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node27);
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.getRootOfQualifiedName(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(jSDocInfo34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        boolean boolean8 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node9, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsFunction(node14);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newExpr(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetProp(node24);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node24);
        com.google.javascript.rhino.jstype.JSType jSType30 = null;
        com.google.javascript.rhino.jstype.JSType jSType31 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node24, jSType30);
        com.google.javascript.rhino.JSDocInfo jSDocInfo32 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node24);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node24, true);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node24);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNew(node24);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node24);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNew(node24);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(jSType31);
        org.junit.Assert.assertNull(jSDocInfo32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node11);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        java.lang.String[] strArray27 = new java.lang.String[] { "||", "hi!", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node21, (java.util.Set<java.lang.String>) strSet28);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] { node21 };
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newCallNode(node11, nodeArray31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node32);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node2, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "||", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStr(2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        java.lang.Double double6 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration8 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node12, "hi!");
        java.lang.Double double16 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node12);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node12);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node12);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(double16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration8 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration8);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node12, "hi!");
        java.lang.Double double16 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node12);
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node12);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node12);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node22);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(double16);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement5 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate6 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.has(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        com.google.javascript.rhino.jstype.JSType jSType9 = null;
        com.google.javascript.rhino.jstype.JSType jSType10 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node4, jSType9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isUndefined(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node13, "hi!");
        java.lang.Double double17 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node13);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isUndefined(node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node4, node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue22 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node13);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node13);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "", node13, "<=");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(jSType10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(double17);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertNotNull(ternaryValue22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node12);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.has(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunction(node23);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGetProp(node33);
        java.lang.String str37 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node33);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node33);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isString(node33);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isUndefined(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isConstantName(node42);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node42);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node42);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isUndefined(node49);
        java.lang.String[] strArray55 = new java.lang.String[] { "||", "hi!", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node49, (java.util.Set<java.lang.String>) strSet56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node42, (java.util.Set<java.lang.String>) strSet56);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node33, (java.util.Set<java.lang.String>) strSet56);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node12, (java.util.Set<java.lang.String>) strSet56);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "||", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate19 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.has(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.containsFunction(node17);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newExpr(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node17, node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isGetProp(node27);
        java.lang.String str31 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue32 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node12, node27);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isUndefined(node12);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsCall(node12);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate37 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node12, "JSCompiler_renameProperty", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement42 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate43 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.has(node41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement42, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprCall(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node41);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node41);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node41, abstractCompiler48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node41);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node41);
        boolean boolean52 = mayBeStringResultPredicate37.apply(node41);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(ternaryValue32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.referencesThis(node8);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newExpr(node8);
        int int12 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node10, "||");
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node10);
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(node14);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        com.google.javascript.rhino.jstype.JSType jSType18 = null;
        com.google.javascript.rhino.jstype.JSType jSType19 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node12, jSType18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo20 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node12);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayBeString(node12);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(jSType19);
        org.junit.Assert.assertNull(jSDocInfo20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsType(node2, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isArrayLiteral(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isNull(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLabelName(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node16);
        java.lang.String str20 = com.google.javascript.jscomp.NodeUtil.arrayToString(node16);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.has(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate31 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.has(node29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isUndefined(node29);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isThis(node29);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.referencesThis(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue41 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node37);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node29, node37, "JSCompiler_renameProperty");
        boolean boolean44 = matchShallowStatement24.apply(node37);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node46);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement48 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate49 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.has(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement48, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate49);
        int int51 = com.google.javascript.jscomp.NodeUtil.getCount(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate49);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node53);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement55 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate56 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node54, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement55);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.referencesThis(node61);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue63 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node61);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isFunction(node61);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node61);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node61);
        boolean boolean68 = matchShallowStatement55.apply(node61);
        com.google.javascript.rhino.Node node69 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean70 = matchShallowStatement55.apply(node69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(ternaryValue41);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(ternaryValue63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate1 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isUndefined(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node4, "hi!");
        boolean boolean8 = booleanResultPredicate1.apply(node4);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node4);
        java.lang.String str10 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node4);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isName(node4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(3);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isUndefined(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isUndefined(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGet(node21);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isUndefined(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isConstantName(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isUndefined(node26);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node33);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement35 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.has(node34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node34);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.containsFunction(node34);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate41 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int42 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node34, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node26, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate44 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int45 = com.google.javascript.jscomp.NodeUtil.getCount(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate44);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.referencesThis(node48);
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newExpr(node48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node50);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isString(node50);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isForIn(node50);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getStringValue(node50);
        boolean boolean56 = booleanResultPredicate41.apply(node50);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.valueCheck(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        int int58 = com.google.javascript.jscomp.NodeUtil.getCount(node4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate41);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isNull(node4);
        org.junit.Assert.assertNotNull(booleanResultPredicate1);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection9 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node3);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isCall(node3);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(nodeCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isUndefined(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node11, "hi!");
        java.lang.Double double15 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node11);
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node11);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node22);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType28 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newExpr(node31);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getSourceName(node33);
        boolean boolean35 = matchNodeType28.apply(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "instanceof", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType28);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(double15);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        java.lang.Double double6 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node7);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection8 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2, abstractCompiler14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(nodeCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate7 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isUndefined(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node10, "hi!");
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node16);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate19 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.has(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node22);
        boolean boolean29 = mayBeStringResultPredicate19.apply(node22);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement30 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int31 = com.google.javascript.jscomp.NodeUtil.getCount(node16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node16);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node10, node16);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        boolean boolean35 = numbericResultPredicate7.apply(node10);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node38);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement45 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.has(node44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node44);
        boolean boolean51 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement52 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement52);
        java.lang.String[] strArray59 = new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node38, (java.util.Set<java.lang.String>) strSet60);
        boolean boolean63 = numbericResultPredicate7.apply(node38);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(node38);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node38);
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newVarNode("%=", node38);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node69);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement71 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate72 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.has(node70, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement71, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate72);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node38, (int) (short) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate72);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node38);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertArrayEquals(strArray59, new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" });
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("%=", node1);
        org.junit.Assert.assertNotNull(node2);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        boolean boolean8 = matchNodeType1.apply(node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isUndefined(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node11);
        boolean boolean18 = matchNodeType1.apply(node11);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getSourceName(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "");
        boolean boolean27 = matchNodeType1.apply(node23);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLabelName(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node32);
        boolean boolean35 = matchNodeType1.apply(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node32);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue37 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node32);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(ternaryValue37);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node12, abstractCompiler20);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected expression nodeEXPR_RESULT? parent:null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node8);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getStringValue(node8);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement31 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.has(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node35);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement37 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate38 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.has(node36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement37, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isUndefined(node36);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isThis(node36);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node44);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue48 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node44);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node36, node44, "JSCompiler_renameProperty");
        boolean boolean51 = matchShallowStatement31.apply(node44);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node53);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement55 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate56 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.has(node54, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isUndefined(node54);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isThis(node54);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node54);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isGetProp(node54);
        boolean boolean62 = matchShallowStatement31.apply(node54);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.referencesThis(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node65);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node65);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue69 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node65);
        com.google.javascript.rhino.JSDocInfo jSDocInfo70 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node65);
        com.google.javascript.rhino.Node node71 = com.google.javascript.jscomp.NodeUtil.newExpr(node65);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node71, abstractCompiler72);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node75);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement77 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate78 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.has(node76, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement77, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node76);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.containsFunction(node76);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.referencesThis(node84);
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newExpr(node84);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node86);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node76, node86);
        boolean boolean89 = com.google.javascript.jscomp.NodeUtil.isGetProp(node86);
        java.lang.String str90 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node86);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node86);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node71, node86);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node86);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node86);
        boolean boolean95 = matchShallowStatement31.apply(node86);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean96 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Unexpected expression nodeVAR? parent:null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(ternaryValue48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(node65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(ternaryValue69);
        org.junit.Assert.assertNull(jSDocInfo70);
        org.junit.Assert.assertNotNull(node71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement4 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node11);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue15 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node11);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node3, node11, "JSCompiler_renameProperty");
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node11);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node11);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node19);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(ternaryValue15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isUndefined(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node3);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node0, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getSourceName(node6);
        boolean boolean8 = matchNodeType1.apply(node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        boolean boolean19 = matchNodeType1.apply(node11);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.has(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsFunction(node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node22);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node22);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNull(node22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node11, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement14 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsFunction(node13);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGetProp(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunction(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node2, node23, "instanceof");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        java.lang.Double double6 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node2);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue9 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVar(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node13);
        com.google.javascript.rhino.JSDocInfo jSDocInfo18 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate20 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isUndefined(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node23, "hi!");
        boolean boolean27 = booleanResultPredicate20.apply(node23);
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node13, node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node28, "");
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node28);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node28);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(double6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(ternaryValue9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNull(jSDocInfo18);
        org.junit.Assert.assertNotNull(booleanResultPredicate20);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        java.lang.String[] strArray4 = new java.lang.String[] { "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node2, (java.util.Set<java.lang.String>) strSet5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "||");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate0 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement4 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetProp(node13);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node13);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newExpr(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isCall(node19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node22);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement24 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate25 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.has(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.containsFunction(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isConstantName(node23);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node33);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate36 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node38);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement40 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.has(node39, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node39);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node39);
        boolean boolean46 = mayBeStringResultPredicate36.apply(node39);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement47 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int48 = com.google.javascript.jscomp.NodeUtil.getCount(node33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement47);
        java.lang.String[] strArray54 = new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node33, (java.util.Set<java.lang.String>) strSet55);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node23, (java.util.Set<java.lang.String>) strSet55);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node19, (java.util.Set<java.lang.String>) strSet55);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node19);
        boolean boolean61 = numbericResultPredicate0.apply(node19);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement62 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node65);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement67 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate68 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.has(node66, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement67, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isUndefined(node66);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isThis(node66);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.rhino.Node node74 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node73);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.referencesThis(node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node74);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node74);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue78 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node74);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node66, node74, "JSCompiler_renameProperty");
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node74);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newVarNode("instanceof", node74);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.containsCall(node82);
        boolean boolean84 = matchShallowStatement62.apply(node82);
        boolean boolean85 = numbericResultPredicate0.apply(node82);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.containsType(node82, (int) 'a');
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] { "", "%=", "JSCompiler_renameProperty", "%=", "" });
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(node74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(ternaryValue78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "", (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node2);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.rhino.jstype.JSType jSType14 = null;
        com.google.javascript.rhino.jstype.JSType jSType15 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node13, jSType14);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection16 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(jSType15);
        org.junit.Assert.assertNotNull(nodeCollection16);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node2);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isGetProp(node2);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement4 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate5 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsFunction(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGetProp(node13);
        com.google.javascript.rhino.jstype.JSType jSType17 = null;
        com.google.javascript.rhino.jstype.JSType jSType18 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node13, jSType17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newVarNode("typeof", node13);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayBeString(node13);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(jSType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        com.google.javascript.rhino.jstype.JSType jSType16 = null;
        com.google.javascript.rhino.jstype.JSType jSType17 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node12, jSType16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue19 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node12);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(jSType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(ternaryValue19);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2, abstractCompiler27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getConditionExpression(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: VAR does not have a condition.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isConstantName(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isUndefined(node7);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.has(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node15);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node15);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate22 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node15, (int) (byte) 0, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "%=", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate25 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isUndefined(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isGet(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isConstantName(node29);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate34 = com.google.javascript.jscomp.NodeUtil.NUMBERIC_RESULT_PREDICATE;
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node29, 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate34);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node29, "%=");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node29, abstractCompiler38);
        boolean boolean40 = booleanResultPredicate25.apply(node29);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(numbericResultPredicate34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node41);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node12);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newCallNode(node12, nodeArray19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayBeString(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node20);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "^");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.mayBeString(node8);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo27 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node2, "hi!");
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate11 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node13);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement15 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate16 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node14);
        boolean boolean21 = mayBeStringResultPredicate11.apply(node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement22 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int23 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node8);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node2, node8);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement31 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate32 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.has(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node30);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsFunction(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node30);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node39);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement41 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate42 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.has(node40, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node30, node40);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node30);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isUndefined(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node49, "hi!");
        java.lang.Double double53 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node49);
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newExpr(node49);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isUndefined(node49);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue56 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node49);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isVar(node49);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.referencesThis(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node60);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node60);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue64 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node60);
        com.google.javascript.rhino.JSDocInfo jSDocInfo65 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node60);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate67 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isUndefined(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node70, "hi!");
        boolean boolean74 = booleanResultPredicate67.apply(node70);
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newVarNode("JSCompiler_renameProperty", node70);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node60, node75);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node75, "");
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node75);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node75);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node30, node75);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean82 = com.google.javascript.jscomp.NodeUtil.callHasLocalResult(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(double53);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(ternaryValue56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(ternaryValue64);
        org.junit.Assert.assertNull(jSDocInfo65);
        org.junit.Assert.assertNotNull(booleanResultPredicate67);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration8 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(6);
        int int12 = matchNodeType11.type;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node14);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement16 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate17 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.has(node15, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isExprCall(node23);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.mayBeString(node23, true);
        boolean boolean28 = matchShallowStatement16.apply(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement16);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isCall(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate2 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node5, "hi!");
        boolean boolean9 = booleanResultPredicate2.apply(node5);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node13);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node18);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement20 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate21 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.has(node19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node13, "hi!", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node5, "||", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement20);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node27, node29);
        boolean boolean32 = matchShallowStatement20.apply(node27);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node27);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(codingConvention0, "^", node27, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanResultPredicate2);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue5 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement14 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node13);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration19 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsType(node13, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration19);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node3, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: VAR is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(ternaryValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler7);
        int int10 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node2, "JSCompiler_renameProperty");
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) (byte) 0);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement12 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate13 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.has(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node11);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsFunction(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node11);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isConstantName(node11);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node2, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node11, abstractCompiler20);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newExpr(node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node11, abstractCompiler23);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isGet(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isForIn(node12);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor18 = null;
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction19 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node21);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement23 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate24 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.has(node22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsFunction(node22);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node30);
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newExpr(node30);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node22, node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGetProp(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGet(node32);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isForIn(node32);
        boolean boolean38 = matchNotFunction19.apply(node32);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.referencesThis(node41);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node41);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node41);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node41, "JSCompiler_renameProperty");
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node41);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node49);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement51 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate52 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.has(node50, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement51, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isUndefined(node50);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node50);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isGet(node50);
        com.google.javascript.rhino.JSDocInfo jSDocInfo57 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node50);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLhs(node41, node50);
        boolean boolean59 = matchNotFunction19.apply(node50);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isUndefined(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isConstantName(node62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node62);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isUndefined(node62);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.containsFunction(node62);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection68 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node62);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isLabelName(node62);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isAssign(node62);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node62);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node62);
        boolean boolean73 = matchNotFunction19.apply(node62);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node12, visitor18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jSDocInfo57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(nodeCollection68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isConstantName(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node2);
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCall(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node18);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node22);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(9);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node4);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node12);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newExpr(node12);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isCall(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isThis(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isBooleanResult(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node2);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement14 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node13);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node13);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssign(node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node13, abstractCompiler21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node13, abstractCompiler23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node13);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node13);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isUndefined(node2);
        java.lang.String[] strArray8 = new java.lang.String[] { "||", "hi!", "", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node2, (java.util.Set<java.lang.String>) strSet9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node2);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.containsCall(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "||", "hi!", "", "hi!" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue6 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node2);
        com.google.javascript.rhino.JSDocInfo jSDocInfo7 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node2);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node8, abstractCompiler9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node12);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement14 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate15 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.has(node13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.containsFunction(node13);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newExpr(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node13, node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isGetProp(node23);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node23);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node8, node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node23);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node23);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.mayBeString(node23, true);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node23);
        com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate numbericResultPredicate35 = new com.google.javascript.jscomp.NodeUtil.NumbericResultPredicate();
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node38);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate41 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node43);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement45 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate46 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.has(node44, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node44);
        boolean boolean51 = mayBeStringResultPredicate41.apply(node44);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement52 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int53 = com.google.javascript.jscomp.NodeUtil.getCount(node38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate41, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node38);
        boolean boolean55 = numbericResultPredicate35.apply(node38);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node57);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement59 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate60 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.has(node58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement59, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isExprCall(node58);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node58);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node58);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isAssign(node58);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection66 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node58);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.referencesThis(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node69);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node58, node69, "instanceof");
        boolean boolean74 = numbericResultPredicate35.apply(node69);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.valueCheck(node23, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) numbericResultPredicate35);
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(ternaryValue6);
        org.junit.Assert.assertNull(jSDocInfo7);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(nodeCollection66);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(node76);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isAssign(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection10 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node2);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeCollection10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node4, node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node7);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement9 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate10 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.has(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isUndefined(node8);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isThis(node8);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.referencesThis(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node16);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue20 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node16);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node8, node16, "JSCompiler_renameProperty");
        boolean boolean23 = matchShallowStatement3.apply(node16);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node25);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement27 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate28 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.has(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isUndefined(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isThis(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isGetProp(node26);
        boolean boolean34 = matchShallowStatement3.apply(node26);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node36);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement38 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate39 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.has(node37, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement38, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.containsFunction(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node37);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node37);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isNull(node37);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node37);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node37);
        boolean boolean48 = matchShallowStatement3.apply(node37);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node37);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isStatement(node37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(ternaryValue20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newExpr(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node2, abstractCompiler5);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getArrayElementStringValue(node12);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue17 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node12);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection18 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node12);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newCallNode(node12, nodeArray19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isConstantName(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node20);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(ternaryValue17);
        org.junit.Assert.assertNotNull(nodeCollection18);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertArrayEquals(nodeArray19, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection7 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node11);
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate14 = new com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate();
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node16);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement18 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate19 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.has(node17, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node17);
        boolean boolean24 = mayBeStringResultPredicate14.apply(node17);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement25 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        int int26 = com.google.javascript.jscomp.NodeUtil.getCount(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.containsType(node2, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(nodeCollection7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement3 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate4 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.has(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) mayBeStringResultPredicate4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newVarNode("hi!", node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newExpr(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node2, node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isGetProp(node12);
        java.lang.String str16 = com.google.javascript.jscomp.NodeUtil.getStringValue(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node12);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

