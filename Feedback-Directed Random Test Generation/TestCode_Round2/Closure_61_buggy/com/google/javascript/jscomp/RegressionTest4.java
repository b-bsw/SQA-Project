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
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isString(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.containsCall(node13);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node1, node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler5);
        int int8 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "^");
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.mayBeString(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor12 = null;
        com.google.common.base.Predicate<com.google.javascript.rhino.Node> nodePredicate13 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPreOrder(node1, visitor12, nodePredicate13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node1, node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        java.lang.String[] strArray7 = new java.lang.String[] { "" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node3, (java.util.Set<java.lang.String>) strSet8);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newExpr(node3);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isString(node13);
        com.google.javascript.jscomp.NodeUtil.BooleanResultPredicate booleanResultPredicate16 = com.google.javascript.jscomp.NodeUtil.BOOLEAN_RESULT_PREDICATE;
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsType(node13, (int) '#', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) booleanResultPredicate16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.containsFunction(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node19);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node19);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node19);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node19, true);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node19);
        boolean boolean27 = booleanResultPredicate16.apply(node19);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node29, node31);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newCallNode(node29, nodeArray33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node34, "hi!");
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node38, node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node40, node43);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node34, node40);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node40);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node40);
        boolean boolean50 = booleanResultPredicate16.apply(node40);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node40, 35);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(booleanResultPredicate16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertArrayEquals(nodeArray33, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.containsCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLValue(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.jstype.JSType jSType6 = null;
        com.google.javascript.rhino.jstype.JSType jSType7 = com.google.javascript.jscomp.NodeUtil.getObjectLitKeyTypeFromValueType(node1, jSType6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isStatementParent(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node10, node12);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node10);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node10);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node10, "||");
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.arrayToString(node10);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node23, node25);
        com.google.javascript.rhino.Node[] nodeArray27 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newCallNode(node23, nodeArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node28, "hi!");
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node32, node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.containsFunction(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node37);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node34, node37);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node28, node34);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) (short) 1);
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isString(node10);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node10);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(nodeArray27);
        org.junit.Assert.assertArrayEquals(nodeArray27, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node3, node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node0, node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node5);
        java.lang.Double double10 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isNumericResult(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node5);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.NodeUtil.MayBeStringResultPredicate mayBeStringResultPredicate0 = com.google.javascript.jscomp.NodeUtil.MAY_BE_STRING_PREDICATE;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.containsFunction(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node2);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node2);
        boolean boolean6 = mayBeStringResultPredicate0.apply(node2);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node2);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsFunction(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node10);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection13 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node10);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getStringValue(node10);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunction(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isString(node20);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNullOrUndefined(node20);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isBooleanResultHelper(node20);
        boolean boolean25 = matchNodeType18.apply(node20);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.containsType(node10, (int) (short) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node28);
        boolean boolean31 = matchNodeType18.apply(node28);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node2, 8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        org.junit.Assert.assertNotNull(mayBeStringResultPredicate0);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(nodeCollection13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node3, node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node0, node5);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node5);
        java.lang.Double double10 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node5);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node5);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetProp(node5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVarOrSimpleAssignLhs(node1, node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node3, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(node3);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node3);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node3, "%=");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node3);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

