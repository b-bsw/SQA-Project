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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = com.google.javascript.jscomp.NodeUtil.opToStrNoFail(3);
            org.junit.Assert.fail("Expected exception of type java.lang.Error; message: Unknown op 3: LEAVEWITH");
        } catch (java.lang.Error e) {
            // Expected exception.
        }
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node14);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunction(node17);
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node17);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node17);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node17, (java.util.Set<java.lang.String>) strSet29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node10, (java.util.Set<java.lang.String>) strSet29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node10, abstractCompiler33);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isString(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node6, node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isString(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isThis(node17);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node17, "");
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node23, abstractCompiler26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        java.lang.String str30 = com.google.javascript.jscomp.NodeUtil.getSourceName(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node29);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node29);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node17, node23);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node17);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node17);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node17);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node1, abstractCompiler39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.rhino.Node node0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        int int25 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node22, "");
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getStringValue(node22);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "undefined" + "'", str26, "undefined");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetProp(node18);
        java.lang.Double double28 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node18);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection29 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node18);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isForIn(node18);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node18);
        com.google.javascript.jscomp.NodeUtil.Visitor visitor32 = null;
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType34 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.visitPostOrder(node18, visitor32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(double28);
        org.junit.Assert.assertNotNull(nodeCollection29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] { node11, node15 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList20, node23, (int) (byte) 1, (int) (short) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isString(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isVar(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsCall(node23);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node23);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprCall(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node23, node33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node33, abstractCompiler37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node33);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isControlStructureCodeBlock(node1, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsCall(node17);
        java.util.Set<java.lang.String> strSet24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node17, strSet24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        int int4 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isString(node8);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration10 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration11 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int12 = com.google.javascript.jscomp.NodeUtil.getCount(node8, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType14 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isString(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isThis(node16);
        int int20 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node16, "");
        boolean boolean21 = matchNodeType14.apply(node16);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node8, node16, "");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLabelName(node25);
        int int28 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node25, "");
        java.lang.String str29 = com.google.javascript.jscomp.NodeUtil.getStringValue(node25);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node25);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isExprCall(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node33);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node33);
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node33, (java.util.Set<java.lang.String>) strSet45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node25, (java.util.Set<java.lang.String>) strSet45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node16, (java.util.Set<java.lang.String>) strSet45);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet45);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "undefined" + "'", str5, "undefined");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "undefined" + "'", str29, "undefined");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo6 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(jSDocInfo6);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        java.lang.Double double6 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue8 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node11, abstractCompiler14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType18 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsType(node11, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType18);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType21 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isExprCall(node25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isExprCall(node29);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node29);
        com.google.javascript.rhino.Node[] nodeArray33 = new com.google.javascript.rhino.Node[] { node25, node29 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList34 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList34, nodeArray33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.referencesThis(node37);
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList34, node37, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprCall(node43);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue46 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node43);
        com.google.javascript.rhino.Node[] nodeArray47 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newCallNode(node43, nodeArray47);
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newCallNode(node41, nodeArray47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node41);
        boolean boolean51 = matchNodeType21.apply(node41);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType21);
        java.lang.Class<?> wildcardClass53 = node1.getClass();
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(ternaryValue8);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(nodeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(ternaryValue46);
        org.junit.Assert.assertNotNull(nodeArray47);
        org.junit.Assert.assertArrayEquals(nodeArray47, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "");
        boolean boolean14 = matchNodeType7.apply(node9);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node9, "");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.referencesThis(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExprCall(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node26);
        com.google.javascript.rhino.Node[] nodeArray30 = new com.google.javascript.rhino.Node[] { node22, node26 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList31 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList31, nodeArray30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.referencesThis(node34);
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList31, node34, (int) (byte) 1, (int) (short) 1);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isString(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isVar(node34);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsCall(node34);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node34);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isExprCall(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node34, node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isString(node51);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration53 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration54 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int55 = com.google.javascript.jscomp.NodeUtil.getCount(node51, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration53, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node51);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node51);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node51);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node51);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node44, node51, "hi!");
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node63);
        java.lang.String str65 = com.google.javascript.jscomp.NodeUtil.getSourceName(node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node64);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node64, abstractCompiler67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isGet(node70);
        java.lang.String str72 = com.google.javascript.jscomp.NodeUtil.getSourceName(node70);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node70);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isGetProp(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.rhino.Node node76 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.referencesThis(node76);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isExprCall(node76);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue79 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node76);
        com.google.javascript.rhino.Node[] nodeArray80 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newCallNode(node76, nodeArray80);
        com.google.javascript.rhino.Node node82 = com.google.javascript.jscomp.NodeUtil.newCallNode(node73, nodeArray80);
        com.google.javascript.rhino.Node node83 = com.google.javascript.jscomp.NodeUtil.newCallNode(node64, nodeArray80);
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newCallNode(node51, nodeArray80);
        com.google.javascript.rhino.Node node85 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray80);
        boolean boolean86 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(nodeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(node76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(ternaryValue79);
        org.junit.Assert.assertNotNull(nodeArray80);
        org.junit.Assert.assertArrayEquals(nodeArray80, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertNotNull(node82);
        org.junit.Assert.assertNotNull(node83);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertNotNull(node85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node24, abstractCompiler28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isPrototypeProperty(node24);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node24);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "");
        boolean boolean14 = matchNodeType7.apply(node9);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node9, "");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "");
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node9, node18);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo8 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(jSDocInfo8);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node14);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue25 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node22);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newCallNode(node22, nodeArray26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue29 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node22);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isGet(node22);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node14, node22, "^");
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node14, "!=");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(ternaryValue25);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertArrayEquals(nodeArray26, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(ternaryValue29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node10, node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node22);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue26 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node22);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(ternaryValue26);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1, abstractCompiler4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isConstantName(node24);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node24);
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node24);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, true);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node9);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node9);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node9);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.referencesThis(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node26);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration28 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration29 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int30 = com.google.javascript.jscomp.NodeUtil.getCount(node26, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration28, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration29);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType32 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isString(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isThis(node34);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node34, "");
        boolean boolean39 = matchNodeType32.apply(node34);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node26, node34, "");
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isLabelName(node43);
        int int46 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node43, "");
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getStringValue(node43);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node43);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExprCall(node51);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node51);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node51);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node51, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node43, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node34, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node20, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node9, (java.util.Set<java.lang.String>) strSet63);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet63);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue72 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "undefined" + "'", str47, "undefined");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(ternaryValue72);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue28 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node14);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node14);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isName(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(ternaryValue28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType3 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node0, "|", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsFunction(node14);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isNew(node14);
        java.lang.String str24 = com.google.javascript.jscomp.NodeUtil.getStringValue(node14);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isForIn(node14);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node14);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node14);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "undefined" + "'", str24, "undefined");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node3, node7 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList12, node15, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean21 = matchDeclaration0.apply(node15);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node23);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node23);
        boolean boolean27 = matchDeclaration0.apply(node23);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node23);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection4 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isString(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node6);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getStringValue(node11);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node6, node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node6);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "^");
        java.lang.String str19 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(nodeCollection4);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "undefined" + "'", str13, "undefined");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "undefined" + "'", str19, "undefined");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node6);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node6, abstractCompiler12);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration5 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int6 = com.google.javascript.jscomp.NodeUtil.getCount(node2, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node2);
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newVarNode("!=", node2);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "||");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        int int4 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler5);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node9);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int14 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node9, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExprCall(node22);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node22);
        com.google.javascript.rhino.Node[] nodeArray26 = new com.google.javascript.rhino.Node[] { node18, node22 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList27 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList27, nodeArray26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node30);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList27, node30, (int) (byte) 1, (int) (short) 1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isString(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isVar(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsCall(node30);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node30);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isExprCall(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node30, node40);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection44 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node30);
        boolean boolean45 = matchNodeType13.apply(node30);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node30, "typeof");
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isGet(node30);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isNew(node30);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeCollection44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] { node10, node14 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList19 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList19, nodeArray18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList19, node22, (int) (byte) 1, (int) (short) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isVar(node22);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsFunction(node22);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node22);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node22);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node22);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node22);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isConstantName(node36);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node22, node36);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        java.lang.Double double43 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node22);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node2);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection5 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node2);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isString(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isThis(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node7);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.referencesThis(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getStringValue(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node7, node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node7);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node2, "||");
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node2);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newVarNode("", node2);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node2);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node2);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isString(node25);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration27 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration28 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int29 = com.google.javascript.jscomp.NodeUtil.getCount(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration27, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration28);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType31 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isString(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isThis(node33);
        int int37 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node33, "");
        boolean boolean38 = matchNodeType31.apply(node33);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node25, node33, "");
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node33);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node33);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newExpr(node33);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node43);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.jscomp.NodeUtil.removeChild(node2, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Invalid attempt to remove node: EXPR_RESULT of VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(nodeCollection5);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "undefined" + "'", str14, "undefined");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType8 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14, abstractCompiler20);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration20 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration21 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node28);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node24, node28 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node36, (int) (byte) 1, (int) (short) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isString(node36);
        boolean boolean42 = matchDeclaration21.apply(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration21);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node50, abstractCompiler53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node66, abstractCompiler70);
        boolean boolean72 = matchNodeType61.apply(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node14, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        java.lang.String str74 = com.google.javascript.jscomp.NodeUtil.getStringValue(node14);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isGet(node14);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "undefined" + "'", str74, "undefined");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        java.lang.String str21 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node27, abstractCompiler30);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.referencesThis(node34);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType38 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int39 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node34, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.containsType(node27, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType38);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isString(node43);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration45 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration46 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int47 = com.google.javascript.jscomp.NodeUtil.getCount(node43, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration45, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration46);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType49 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isString(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isThis(node51);
        int int55 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node51, "");
        boolean boolean56 = matchNodeType49.apply(node51);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node43, node51, "");
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isLabelName(node60);
        int int63 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node60, "");
        java.lang.String str64 = com.google.javascript.jscomp.NodeUtil.getStringValue(node60);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node60);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node60);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.rhino.Node node68 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.referencesThis(node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isExprCall(node68);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node68);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node68);
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node68, (java.util.Set<java.lang.String>) strSet80);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node60, (java.util.Set<java.lang.String>) strSet80);
        boolean boolean84 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node51, (java.util.Set<java.lang.String>) strSet80);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet80);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node24);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node24);
        boolean boolean88 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node24);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node24);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "undefined" + "'", str64, "undefined");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(node68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertArrayEquals(strArray79, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isString(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isThis(node23);
        int int27 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node23, "");
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isName(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isConstantName(node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node23, abstractCompiler31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isString(node34);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration36 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration37 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int38 = com.google.javascript.jscomp.NodeUtil.getCount(node34, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration36, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration37);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType40 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isString(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isThis(node42);
        int int46 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node42, "");
        boolean boolean47 = matchNodeType40.apply(node42);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node34, node42, "");
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLabelName(node51);
        int int54 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node51, "");
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getStringValue(node51);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node51);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node51);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.referencesThis(node59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isExprCall(node59);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node59);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node59);
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node59, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node51, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node42, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node23, (java.util.Set<java.lang.String>) strSet71);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isGetProp(node23);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node23, "%=");
        com.google.javascript.rhino.Node node80 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection81 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node23);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isConstantName(node23);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "undefined" + "'", str55, "undefined");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertArrayEquals(strArray70, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(node80);
        org.junit.Assert.assertNotNull(nodeCollection81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isForIn(node17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLabelName(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node10, node22);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprCall(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node31);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node27, node31 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList36 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList36, nodeArray35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList36, node39, (int) (byte) 1, (int) (short) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isString(node39);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isVar(node39);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.containsCall(node39);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node39);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.referencesThis(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isExprCall(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node39, node49);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node49, abstractCompiler53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isString(node56);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration58 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration59 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int60 = com.google.javascript.jscomp.NodeUtil.getCount(node56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration58, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node56);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node56);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node56);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node56);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node56);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node49, node56, "hi!");
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node68);
        java.lang.String str70 = com.google.javascript.jscomp.NodeUtil.getSourceName(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node69);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler72 = null;
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node69, abstractCompiler72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isGet(node75);
        java.lang.String str77 = com.google.javascript.jscomp.NodeUtil.getSourceName(node75);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node75);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGetProp(node78);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.rhino.Node node81 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node80);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.referencesThis(node81);
        boolean boolean83 = com.google.javascript.jscomp.NodeUtil.isExprCall(node81);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue84 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node81);
        com.google.javascript.rhino.Node[] nodeArray85 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node86 = com.google.javascript.jscomp.NodeUtil.newCallNode(node81, nodeArray85);
        com.google.javascript.rhino.Node node87 = com.google.javascript.jscomp.NodeUtil.newCallNode(node78, nodeArray85);
        com.google.javascript.rhino.Node node88 = com.google.javascript.jscomp.NodeUtil.newCallNode(node69, nodeArray85);
        com.google.javascript.rhino.Node node89 = com.google.javascript.jscomp.NodeUtil.newCallNode(node56, nodeArray85);
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newCallNode(node22, nodeArray85);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(node81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(ternaryValue84);
        org.junit.Assert.assertNotNull(nodeArray85);
        org.junit.Assert.assertArrayEquals(nodeArray85, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node86);
        org.junit.Assert.assertNotNull(node87);
        org.junit.Assert.assertNotNull(node88);
        org.junit.Assert.assertNotNull(node89);
        org.junit.Assert.assertNotNull(node90);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.referencesThis(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprCall(node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node5, abstractCompiler8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node11);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration13 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration14 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int15 = com.google.javascript.jscomp.NodeUtil.getCount(node11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration14);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType17 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isThis(node19);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node19, "");
        boolean boolean24 = matchNodeType17.apply(node19);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node11, node19, "");
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLabelName(node28);
        int int31 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node28, "");
        java.lang.String str32 = com.google.javascript.jscomp.NodeUtil.getStringValue(node28);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node28);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node28);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node36);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node36);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node36, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node19, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node5, (java.util.Set<java.lang.String>) strSet48);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet48);
        java.lang.String str55 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, false);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "undefined" + "'", str32, "undefined");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "undefined" + "'", str55, "undefined");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node14, abstractCompiler22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        java.lang.String str26 = com.google.javascript.jscomp.NodeUtil.getSourceName(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node25);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node25);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node25);
        java.lang.Double double30 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node25);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node14, node25);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isExprCall(node36);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isExprCall(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node40);
        com.google.javascript.rhino.Node[] nodeArray44 = new com.google.javascript.rhino.Node[] { node36, node40 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList45 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList45, nodeArray44);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.referencesThis(node48);
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList45, node48, (int) (byte) 1, (int) (short) 1);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isString(node48);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isString(node55);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration57 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration58 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int59 = com.google.javascript.jscomp.NodeUtil.getCount(node55, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration57, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration58);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node62);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isString(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isThis(node63);
        int int67 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node63, "");
        boolean boolean68 = matchNodeType61.apply(node63);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node55, node63, "");
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node48, node63);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType74 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (short) 1);
        int int75 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node48, 13, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        int int76 = matchNodeType74.type;
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node25, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType74);
        java.lang.Double double78 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node25);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node25, "");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(nodeArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        java.lang.Double double6 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node13);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] { node9, node13 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList18 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList18, nodeArray17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList18, node21, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue30 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node27);
        com.google.javascript.rhino.Node[] nodeArray31 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newCallNode(node27, nodeArray31);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newCallNode(node25, nodeArray31);
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray31);
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isExprCall(node39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprCall(node43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node43);
        com.google.javascript.rhino.Node[] nodeArray47 = new com.google.javascript.rhino.Node[] { node39, node43 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList48 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList48, nodeArray47);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node51);
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList48, node51, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.isExprCall(node57);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue60 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node57);
        com.google.javascript.rhino.Node[] nodeArray61 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.newCallNode(node57, nodeArray61);
        com.google.javascript.rhino.Node node63 = com.google.javascript.jscomp.NodeUtil.newCallNode(node55, nodeArray61);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newCallNode(node35, nodeArray61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isExprCall(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node66);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node66);
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66, (java.util.Set<java.lang.String>) strSet78);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node35, (java.util.Set<java.lang.String>) strSet78);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(ternaryValue30);
        org.junit.Assert.assertNotNull(nodeArray31);
        org.junit.Assert.assertArrayEquals(nodeArray31, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(nodeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(ternaryValue60);
        org.junit.Assert.assertNotNull(nodeArray61);
        org.junit.Assert.assertArrayEquals(nodeArray61, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node62);
        org.junit.Assert.assertNotNull(node63);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertArrayEquals(strArray77, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node3);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node3, abstractCompiler6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.referencesThis(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isExprCall(node9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue12 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node9);
        com.google.javascript.rhino.Node[] nodeArray13 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newCallNode(node9, nodeArray13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        java.lang.String str17 = com.google.javascript.jscomp.NodeUtil.getSourceName(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node16);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node24);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24, abstractCompiler27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType35 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int36 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node31, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.containsType(node24, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node21, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node40, abstractCompiler44);
        boolean boolean46 = matchNodeType35.apply(node40);
        int int47 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node16, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.referencesThis(node52);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node52);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node52, abstractCompiler55);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node58);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.referencesThis(node59);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType63 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int64 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node59, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.containsType(node52, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node49, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        int int67 = com.google.javascript.jscomp.NodeUtil.getCount(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType35, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '#');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.has(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType63, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isConstantByConvention(codingConvention0, node1, node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(ternaryValue12);
        org.junit.Assert.assertNotNull(nodeArray13);
        org.junit.Assert.assertArrayEquals(nodeArray13, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        java.lang.String str11 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node10);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node10);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node10);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isGet(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isNew(node17);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node10, node17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node17);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node17);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.containsCall(node17);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node17, false);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isConstantName(node17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node14, abstractCompiler22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node14, abstractCompiler24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isLabelName(node27);
        int int30 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node27, "");
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node27);
        int int34 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node27, "||");
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node14, node27, "||");
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.getCatchBlock(node27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCall(node1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.referencesThis(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isExprCall(node17);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isExprCall(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node21);
        com.google.javascript.rhino.Node[] nodeArray25 = new com.google.javascript.rhino.Node[] { node17, node21 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList26 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList26, nodeArray25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node29);
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList26, node29, (int) (byte) 1, (int) (short) 1);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isString(node29);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isVar(node29);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.containsCall(node29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node29, abstractCompiler37);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue39 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node29);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node29);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(nodeArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(ternaryValue39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "%=");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node28, abstractCompiler31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int40 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node35, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler48);
        boolean boolean50 = matchNodeType39.apply(node44);
        int int51 = matchNodeType39.type;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement9 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isThis(node11);
        boolean boolean14 = matchShallowStatement9.apply(node11);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node7, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement9);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isAssign(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node2, "");
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isName(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node2);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isExprCall(node11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isExprCall(node15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node15);
        com.google.javascript.rhino.Node[] nodeArray19 = new com.google.javascript.rhino.Node[] { node11, node15 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList20 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList20, nodeArray19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList20, node23, (int) (byte) 1, (int) (short) 1);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isString(node23);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isVar(node23);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsFunction(node23);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.referencesThis(node23);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node23);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node23);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isLhs(node2, node23);
        boolean boolean35 = matchNotFunction0.apply(node2);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.referencesThis(node37);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType41 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int42 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node37, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isThis(node37);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node37);
        boolean boolean45 = matchNotFunction0.apply(node37);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.referencesThis(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node47);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue50 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node47);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node52 = com.google.javascript.jscomp.NodeUtil.newCallNode(node47, nodeArray51);
        com.google.javascript.rhino.Node node53 = com.google.javascript.jscomp.NodeUtil.newExpr(node52);
        boolean boolean54 = matchNotFunction0.apply(node52);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue55 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node52);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node52);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.getFunctionBody(node52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(nodeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(ternaryValue50);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertArrayEquals(nodeArray51, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node52);
        org.junit.Assert.assertNotNull(node53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(ternaryValue55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isObjectCallMethod(node1, "!=");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node14);
        java.lang.Double double23 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node14);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "");
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node15, abstractCompiler18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getSourceName(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node21);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node21);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLhs(node15, node21);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node9, node15);
        java.util.Collection<com.google.javascript.rhino.Node> nodeCollection27 = com.google.javascript.jscomp.NodeUtil.getVarsDeclaredInBranch(node9);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isForIn(node9);
        com.google.javascript.rhino.Node[] nodeArray29 = new com.google.javascript.rhino.Node[] { node9 };
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray29);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node33);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node33, abstractCompiler37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.referencesThis(node41);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int46 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node41, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.containsType(node33, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(nodeCollection27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(nodeArray29);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertNotNull(node33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node7);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newCallNode(node7, nodeArray11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node14);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node22, abstractCompiler25);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node29);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType33 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int34 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node29, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.containsType(node22, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node19, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node37);
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.referencesThis(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node38);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node38, abstractCompiler42);
        boolean boolean44 = matchNodeType33.apply(node38);
        int int45 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node14, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node50, abstractCompiler53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        int int65 = com.google.javascript.jscomp.NodeUtil.getCount(node12, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType33, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '#');
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.has(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node1);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ternaryValue10);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertArrayEquals(nodeArray11, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(node38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isConstantName(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isString(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node2, "");
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunction(node2);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isThis(node2);
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node2);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.google.javascript.jscomp.NodeUtil.getOpFromAssignmentOp(node2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Not an assiment op");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node1);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.referencesThis(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isExprCall(node10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        com.google.javascript.rhino.Node[] nodeArray18 = new com.google.javascript.rhino.Node[] { node10, node14 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList19 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList19, nodeArray18);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList19, node22, (int) (byte) 1, (int) (short) 1);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isVar(node22);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.containsFunction(node22);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.referencesThis(node22);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node22);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node22);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node22);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isGetProp(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(node1, abstractCompiler37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Expected CALL node, got VOID");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(nodeArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetProp(node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node18);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newExpr(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: new child has existing parent");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isGetProp(node18);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCallOrApply(node18);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.getFnParameters(node18);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isGetProp(node29);
        com.google.javascript.rhino.JSDocInfo jSDocInfo31 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node29);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(jSDocInfo31);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isName(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node1, false);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "typeof");
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node3, node7 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList12, node15, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean21 = matchDeclaration0.apply(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node15, true);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.referencesThis(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node25, abstractCompiler28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node25);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node25, "hi!");
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "%=");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node28, abstractCompiler31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int40 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node35, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler48);
        boolean boolean50 = matchNodeType39.apply(node44);
        int int51 = matchNodeType39.type;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        int int53 = matchNodeType39.type;
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.CodingConvention codingConvention0 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration5 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration6 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int7 = com.google.javascript.jscomp.NodeUtil.getCount(node3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration5, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isAssign(node3);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newName(codingConvention0, "", node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node18);
        com.google.javascript.rhino.JSDocInfo jSDocInfo28 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node18);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(jSDocInfo28);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.referencesThis(node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node4, abstractCompiler7);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.referencesThis(node11);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType15 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int16 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node11, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.containsType(node4, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType15);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isString(node20);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration22 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration23 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int24 = com.google.javascript.jscomp.NodeUtil.getCount(node20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration22, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration23);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType26 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isString(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isThis(node28);
        int int32 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node28, "");
        boolean boolean33 = matchNodeType26.apply(node28);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node20, node28, "");
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node36);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isLabelName(node37);
        int int40 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node37, "");
        java.lang.String str41 = com.google.javascript.jscomp.NodeUtil.getStringValue(node37);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node37);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node37);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.referencesThis(node45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isExprCall(node45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node45);
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node45, (java.util.Set<java.lang.String>) strSet57);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node37, (java.util.Set<java.lang.String>) strSet57);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node28, (java.util.Set<java.lang.String>) strSet57);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node1, (java.util.Set<java.lang.String>) strSet57);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node63);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.referencesThis(node64);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node64);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler67 = null;
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node64, abstractCompiler67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.rhino.Node node70 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node69);
        java.lang.String str71 = com.google.javascript.jscomp.NodeUtil.getSourceName(node70);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node70);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node70);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.isLhs(node64, node70);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isCall(node64);
        boolean boolean76 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node64);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node64);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node64);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "undefined" + "'", str41, "undefined");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertArrayEquals(strArray56, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(node70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isCall(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = com.google.javascript.jscomp.NodeUtil.hasCatchHandler(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node7);
        com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node7);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.referencesThis(node16);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isExprCall(node16);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node16);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node16);
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node16, (java.util.Set<java.lang.String>) strSet28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node7, (java.util.Set<java.lang.String>) strSet28);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet28);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(jSDocInfo14);
        org.junit.Assert.assertNotNull(node16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isCall(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node1);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType10 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(100);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (short) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getStringValue(node13);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType22 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int23 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node18, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType22);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration24 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isExprCall(node27);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprCall(node31);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node31);
        com.google.javascript.rhino.Node[] nodeArray35 = new com.google.javascript.rhino.Node[] { node27, node31 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList36 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList36, nodeArray35);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.referencesThis(node39);
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList36, node39, (int) (byte) 1, (int) (short) 1);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isString(node39);
        boolean boolean45 = matchDeclaration24.apply(node39);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node50, abstractCompiler53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node66, abstractCompiler70);
        boolean boolean72 = matchNodeType61.apply(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.has(node18, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration24, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean74 = com.google.javascript.jscomp.NodeUtil.containsType(node13, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        int int76 = matchNodeType61.type;
        int int77 = matchNodeType61.type;
        com.google.javascript.rhino.Node node78 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean79 = matchNodeType61.apply(node78);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "undefined" + "'", str15, "undefined");
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(nodeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 10 + "'", int76 == 10);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration11 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration12 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int13 = com.google.javascript.jscomp.NodeUtil.getCount(node9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration11, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isThis(node15);
        int int19 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node15, "");
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.referencesThis(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node21, abstractCompiler24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node27);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node21, node27);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node15, node21);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node15);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node15);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGetProp(node15);
        boolean boolean36 = matchDeclaration11.apply(node15);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node1, node15);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isThis(node15);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction20 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node21);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isString(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isThis(node22);
        int int26 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node22, "");
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isName(node22);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node22);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.referencesThis(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.isExprCall(node31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isExprCall(node35);
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node35);
        com.google.javascript.rhino.Node[] nodeArray39 = new com.google.javascript.rhino.Node[] { node31, node35 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList40 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList40, nodeArray39);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList40, node43, (int) (byte) 1, (int) (short) 1);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isString(node43);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isVar(node43);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.containsFunction(node43);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node43);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node43);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLhs(node22, node43);
        boolean boolean55 = matchNotFunction20.apply(node22);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isThis(node57);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node57);
        boolean boolean65 = matchNotFunction20.apply(node57);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.rhino.Node node67 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.referencesThis(node67);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.isExprCall(node67);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue70 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node67);
        com.google.javascript.rhino.Node[] nodeArray71 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node72 = com.google.javascript.jscomp.NodeUtil.newCallNode(node67, nodeArray71);
        com.google.javascript.rhino.Node node73 = com.google.javascript.jscomp.NodeUtil.newExpr(node72);
        boolean boolean74 = matchNotFunction20.apply(node72);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType76 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType(10);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNotFunction20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.rhino.Node node79 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node78);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isString(node79);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isThis(node79);
        boolean boolean82 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node79);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.rhino.Node node84 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node83);
        boolean boolean85 = com.google.javascript.jscomp.NodeUtil.referencesThis(node84);
        java.lang.String str86 = com.google.javascript.jscomp.NodeUtil.getStringValue(node84);
        boolean boolean87 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node79, node84);
        boolean boolean88 = matchNotFunction20.apply(node79);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.rhino.Node node90 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node89);
        boolean boolean91 = com.google.javascript.jscomp.NodeUtil.isString(node90);
        boolean boolean92 = com.google.javascript.jscomp.NodeUtil.isThis(node90);
        boolean boolean93 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node90);
        boolean boolean94 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node90);
        boolean boolean95 = matchNotFunction20.apply(node90);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str96 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node90);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: NUMBER 0.0 is not a string node");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(nodeArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(node67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(ternaryValue70);
        org.junit.Assert.assertNotNull(nodeArray71);
        org.junit.Assert.assertArrayEquals(nodeArray71, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node72);
        org.junit.Assert.assertNotNull(node73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(node79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(node84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "undefined" + "'", str86, "undefined");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(node90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isGet(node2);
        java.lang.String str4 = com.google.javascript.jscomp.NodeUtil.getSourceName(node2);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node5);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newVarNode("undefined", node5);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node5);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGet(node10);
        java.lang.String str12 = com.google.javascript.jscomp.NodeUtil.getSourceName(node10);
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isFunction(node13);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node5, node13, "||");
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node14);
        com.google.javascript.rhino.Node node21 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node14);
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node14);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node14);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node14);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node14);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node6);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isCall(node6);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node6);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node6);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node1);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getStringValue(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node1, node6);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "undefined" + "'", str8, "undefined");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue10 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node7);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(ternaryValue10);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "");
        boolean boolean14 = matchNodeType7.apply(node9);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node9, "");
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node1);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isConstantName(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.NodeUtil.MatchNotFunction matchNotFunction0 = new com.google.javascript.jscomp.NodeUtil.MatchNotFunction();
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement1 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node3);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVar(node3);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node3);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node11);
        java.lang.String str13 = com.google.javascript.jscomp.NodeUtil.getSourceName(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node12);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node12);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node12);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node3, node12);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isGet(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isNew(node19);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node12, node19);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node12, node24);
        boolean boolean27 = matchShallowStatement1.apply(node12);
        boolean boolean28 = matchNotFunction0.apply(node12);
        com.google.javascript.rhino.Node node29 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.containsCall(node29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node29, abstractCompiler31);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(node12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(node29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node3, node7 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList12, node15, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean21 = matchDeclaration0.apply(node15);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node15, true);
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node15);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node24);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        int int4 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        int int11 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "undefined");
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.isGet(node13);
        java.lang.String str15 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isConstantName(node13);
        boolean boolean18 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node13);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsFunction(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue4 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node1);
        com.google.javascript.rhino.Node[] nodeArray5 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(ternaryValue4);
        org.junit.Assert.assertNotNull(nodeArray5);
        org.junit.Assert.assertArrayEquals(nodeArray5, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        java.lang.String str2 = com.google.javascript.jscomp.NodeUtil.getSourceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isGet(node7);
        java.lang.String str9 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isGetProp(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        boolean boolean14 = com.google.javascript.jscomp.NodeUtil.referencesThis(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isExprCall(node13);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue16 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node13);
        com.google.javascript.rhino.Node[] nodeArray17 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newCallNode(node13, nodeArray17);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newCallNode(node10, nodeArray17);
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray17);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isGet(node20);
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node20, abstractCompiler23);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(node10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(ternaryValue16);
        org.junit.Assert.assertNotNull(nodeArray17);
        org.junit.Assert.assertArrayEquals(nodeArray17, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isFunction(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isForIn(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo9 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node1);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node1);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue21 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node18);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isWithinLoop(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.referencesThis(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node27);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node27);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node27);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node27);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isString(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isThis(node34);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node34, "");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isFunction(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isThis(node34);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node41);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.referencesThis(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isExprCall(node42);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue45 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node42);
        com.google.javascript.rhino.Node[] nodeArray46 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newCallNode(node42, nodeArray46);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newCallNode(node34, nodeArray46);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExprCall(node50);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue53 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node50);
        com.google.javascript.rhino.Node[] nodeArray54 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newCallNode(node50, nodeArray54);
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newCallNode(node48, nodeArray54);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node27, nodeArray54);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newCallNode(node23, nodeArray54);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newCallNode(node15, nodeArray54);
        com.google.javascript.rhino.Node node60 = com.google.javascript.jscomp.NodeUtil.newCallNode(node1, nodeArray54);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(jSDocInfo9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(ternaryValue21);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertArrayEquals(nodeArray22, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(node27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(ternaryValue45);
        org.junit.Assert.assertNotNull(nodeArray46);
        org.junit.Assert.assertArrayEquals(nodeArray46, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(ternaryValue53);
        org.junit.Assert.assertNotNull(nodeArray54);
        org.junit.Assert.assertArrayEquals(nodeArray54, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertNotNull(node60);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        java.lang.String str8 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node7);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isLhs(node1, node7);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node7);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isString(node7);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node7);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration0 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExprCall(node3);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isExprCall(node7);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node7);
        com.google.javascript.rhino.Node[] nodeArray11 = new com.google.javascript.rhino.Node[] { node3, node7 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList12 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList12, nodeArray11);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.referencesThis(node15);
        com.google.javascript.rhino.Node node19 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList12, node15, (int) (byte) 1, (int) (short) 1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean21 = matchDeclaration0.apply(node15);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node22);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isLabelName(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isString(node26);
        boolean boolean28 = com.google.javascript.jscomp.NodeUtil.isThis(node26);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node26);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isCall(node26);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isLhs(node23, node26);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isString(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isThis(node34);
        int int38 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node34, "");
        boolean boolean39 = com.google.javascript.jscomp.NodeUtil.isName(node34);
        boolean boolean40 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node34);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node42);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.referencesThis(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isExprCall(node43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.referencesThis(node47);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isExprCall(node47);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node47);
        com.google.javascript.rhino.Node[] nodeArray51 = new com.google.javascript.rhino.Node[] { node43, node47 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList52 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList52, nodeArray51);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node54);
        boolean boolean56 = com.google.javascript.jscomp.NodeUtil.referencesThis(node55);
        com.google.javascript.rhino.Node node59 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList52, node55, (int) (byte) 1, (int) (short) 1);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isString(node55);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isVar(node55);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.containsFunction(node55);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.referencesThis(node55);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node55);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isEmptyFunctionExpression(node55);
        boolean boolean66 = com.google.javascript.jscomp.NodeUtil.isLhs(node34, node55);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType69 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '#');
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (int) '4', (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.containsType(node26, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType69);
        boolean boolean72 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node26);
        com.google.javascript.jscomp.NodeUtil.redeclareVarsInsideBranch(node26);
        com.google.javascript.rhino.JSDocInfo jSDocInfo74 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node26);
        boolean boolean75 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node26);
        boolean boolean76 = matchDeclaration0.apply(node26);
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(nodeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(node23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(node43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(nodeArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(node55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(node59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNull(jSDocInfo74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isCallOrNew(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue7 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(ternaryValue7);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1, abstractCompiler4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isString(node7);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration9 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration10 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int11 = com.google.javascript.jscomp.NodeUtil.getCount(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration10);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType13 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isString(node15);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isThis(node15);
        int int19 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node15, "");
        boolean boolean20 = matchNodeType13.apply(node15);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node7, node15, "");
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isLabelName(node24);
        int int27 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node24, "");
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getStringValue(node24);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node24);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node24);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node31);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.referencesThis(node32);
        boolean boolean34 = com.google.javascript.jscomp.NodeUtil.isExprCall(node32);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node32);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node32);
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node32, (java.util.Set<java.lang.String>) strSet44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node24, (java.util.Set<java.lang.String>) strSet44);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isValidDefineValue(node15, (java.util.Set<java.lang.String>) strSet44);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node1, (java.util.Set<java.lang.String>) strSet44);
        boolean boolean50 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isVarArgsFunction(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "undefined" + "'", str28, "undefined");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(node32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "hi!", "undefined", "JSCompiler_renameProperty", "hi!", "undefined", "JSCompiler_renameProperty" });
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType5 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int6 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node1, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionExpression(node1);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node1);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType1 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) -1);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isString(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isThis(node3);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node3);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node3);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean9 = matchNodeType1.apply(node3);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.isString(node11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.isThis(node11);
        int int15 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node11, "");
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isName(node11);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node11);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLiteralValue(node11, false);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node3, node11);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node22 = com.google.javascript.jscomp.NodeUtil.getArgumentForFunction(node3, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(node11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node1);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node1, abstractCompiler4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType8 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 10, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType8);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType11 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        boolean boolean12 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType11);
        boolean boolean13 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node1);
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.JSDocInfo jSDocInfo14 = com.google.javascript.jscomp.NodeUtil.getFunctionInfo(node1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isGet(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isForIn(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isString(node7);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration9 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration10 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int11 = com.google.javascript.jscomp.NodeUtil.getCount(node7, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration9, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExprCall(node14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.referencesThis(node18);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isExprCall(node18);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node18);
        com.google.javascript.rhino.Node[] nodeArray22 = new com.google.javascript.rhino.Node[] { node14, node18 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList23 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList23, nodeArray22);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node25);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.referencesThis(node26);
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList23, node26, (int) (byte) 1, (int) (short) 1);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isString(node26);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isVar(node26);
        boolean boolean33 = com.google.javascript.jscomp.NodeUtil.containsFunction(node26);
        java.lang.String str34 = com.google.javascript.jscomp.NodeUtil.getSourceName(node26);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isNew(node26);
        boolean boolean36 = matchDeclaration10.apply(node26);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration10);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node38);
        java.lang.String str40 = com.google.javascript.jscomp.NodeUtil.getSourceName(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node39);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node39, abstractCompiler42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isGet(node45);
        java.lang.String str47 = com.google.javascript.jscomp.NodeUtil.getSourceName(node45);
        com.google.javascript.rhino.Node node48 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node45);
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.isGetProp(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.referencesThis(node51);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExprCall(node51);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue54 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node51);
        com.google.javascript.rhino.Node[] nodeArray55 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newCallNode(node51, nodeArray55);
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newCallNode(node48, nodeArray55);
        com.google.javascript.rhino.Node node58 = com.google.javascript.jscomp.NodeUtil.newCallNode(node39, nodeArray55);
        boolean boolean59 = matchDeclaration10.apply(node39);
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node39);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(nodeArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(node39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(node45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(node48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(node51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(ternaryValue54);
        org.junit.Assert.assertNotNull(nodeArray55);
        org.junit.Assert.assertArrayEquals(nodeArray55, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertNotNull(node58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isConstantName(node14);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration20 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration21 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isExprCall(node28);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node28);
        com.google.javascript.rhino.Node[] nodeArray32 = new com.google.javascript.rhino.Node[] { node24, node28 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList33 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList33, nodeArray32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node35);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.referencesThis(node36);
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList33, node36, (int) (byte) 1, (int) (short) 1);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.isString(node36);
        boolean boolean42 = matchDeclaration21.apply(node36);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.has(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration20, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration21);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node14);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node46);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler53 = null;
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node50, abstractCompiler53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.referencesThis(node57);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType61 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int62 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node57, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.containsType(node50, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        boolean boolean64 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node47, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.rhino.Node node66 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node65);
        boolean boolean67 = com.google.javascript.jscomp.NodeUtil.referencesThis(node66);
        boolean boolean68 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node66);
        boolean boolean69 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node66);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node66, abstractCompiler70);
        boolean boolean72 = matchNodeType61.apply(node66);
        boolean boolean73 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node14, "", (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType61);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.rhino.Node node75 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node74);
        java.lang.String str76 = com.google.javascript.jscomp.NodeUtil.getSourceName(node75);
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node75);
        com.google.javascript.rhino.Node node78 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node75);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node75);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node75);
        java.lang.String str81 = com.google.javascript.jscomp.NodeUtil.getStringValue(node75);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(nodeArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(node36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(node47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(node66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(node75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(node78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "undefined" + "'", str81, "undefined");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node19);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.referencesThis(node20);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isExprCall(node20);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue23 = com.google.javascript.jscomp.NodeUtil.getExpressionBooleanValue(node20);
        com.google.javascript.rhino.Node[] nodeArray24 = new com.google.javascript.rhino.Node[] {};
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newCallNode(node20, nodeArray24);
        com.google.javascript.rhino.Node node26 = com.google.javascript.jscomp.NodeUtil.newCallNode(node18, nodeArray24);
        java.lang.Double double27 = com.google.javascript.jscomp.NodeUtil.getNumberValue(node26);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node29);
        boolean boolean31 = com.google.javascript.jscomp.NodeUtil.isString(node30);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration32 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration33 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int34 = com.google.javascript.jscomp.NodeUtil.getCount(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration32, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.isGet(node30);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node30);
        boolean boolean37 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node30);
        com.google.javascript.jscomp.NodeUtil.MatchShallowStatement matchShallowStatement38 = new com.google.javascript.jscomp.NodeUtil.MatchShallowStatement();
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.referencesThis(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.isExprCall(node40);
        boolean boolean43 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node40);
        boolean boolean44 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node40);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.isControlStructure(node40);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isVar(node40);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectApply(node40);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node48);
        java.lang.String str50 = com.google.javascript.jscomp.NodeUtil.getSourceName(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node49);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node49);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node49);
        boolean boolean54 = com.google.javascript.jscomp.NodeUtil.isLhs(node40, node49);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node55);
        boolean boolean57 = com.google.javascript.jscomp.NodeUtil.isGet(node56);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isNew(node56);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node49, node56);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isLabelName(node61);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isObjectLitKey(node49, node61);
        boolean boolean64 = matchShallowStatement38.apply(node49);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node30, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement38);
        int int66 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node26, (int) (byte) -1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchShallowStatement38);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertNotNull(node20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(ternaryValue23);
        org.junit.Assert.assertNotNull(nodeArray24);
        org.junit.Assert.assertArrayEquals(nodeArray24, new com.google.javascript.rhino.Node[] {});
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertNotNull(node26);
        org.junit.Assert.assertNull(double27);
        org.junit.Assert.assertNotNull(node30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(node40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(node49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(node56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isVar(node1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isHoistedFunctionDeclaration(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.rhino.Node node1 = null;
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.referencesThis(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprCall(node2);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node5);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.referencesThis(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isExprCall(node6);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node6);
        com.google.javascript.rhino.Node[] nodeArray10 = new com.google.javascript.rhino.Node[] { node2, node6 };
        java.util.ArrayList<com.google.javascript.rhino.Node> nodeList11 = new java.util.ArrayList<com.google.javascript.rhino.Node>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.google.javascript.rhino.Node>) nodeList11, nodeArray10);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.referencesThis(node14);
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newFunctionNode("hi!", (java.util.List<com.google.javascript.rhino.Node>) nodeList11, node14, (int) (byte) 1, (int) (short) 1);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isString(node14);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isVar(node14);
        boolean boolean21 = com.google.javascript.jscomp.NodeUtil.containsCall(node14);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node14);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node23);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.referencesThis(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isExprCall(node24);
        boolean boolean27 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node14, node24);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType29 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) '#');
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node30);
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node33);
        boolean boolean35 = com.google.javascript.jscomp.NodeUtil.referencesThis(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        boolean boolean38 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node34, abstractCompiler37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node40);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.referencesThis(node41);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType45 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int46 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node41, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.containsType(node34, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean48 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node31, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node49);
        boolean boolean51 = com.google.javascript.jscomp.NodeUtil.referencesThis(node50);
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node50);
        boolean boolean53 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node50);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler54 = null;
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node50, abstractCompiler54);
        boolean boolean56 = matchNodeType45.apply(node50);
        int int57 = com.google.javascript.jscomp.NodeUtil.getCount(node14, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType29, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType45);
        boolean boolean58 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler59 = null;
        boolean boolean60 = com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(node14, abstractCompiler59);
        boolean boolean61 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node14);
        com.google.javascript.rhino.Node node62 = com.google.javascript.jscomp.NodeUtil.getLoopCodeBlock(node14);
        boolean boolean63 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node14);
        com.google.javascript.rhino.Node node64 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node14);
        boolean boolean65 = com.google.javascript.jscomp.NodeUtil.isPrototypePropertyDeclaration(node64);
        org.junit.Assert.assertNotNull(node2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(node6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(nodeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(node14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(node31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(node41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(node50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(node62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(node64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isLabelName(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "%=");
        java.lang.String str23 = com.google.javascript.jscomp.NodeUtil.getStringValue(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "undefined" + "'", str23, "undefined");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprCall(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunctionObjectCall(node1);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node1);
        com.google.javascript.rhino.Node node8 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node1);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(node8);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration3 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration4 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int5 = com.google.javascript.jscomp.NodeUtil.getCount(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration3, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration4);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType7 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node8);
        boolean boolean10 = com.google.javascript.jscomp.NodeUtil.isString(node9);
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.isThis(node9);
        int int13 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node9, "");
        boolean boolean14 = matchNodeType7.apply(node9);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node1, node9, "");
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node17);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isLabelName(node18);
        int int21 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node18, "");
        java.lang.String str22 = com.google.javascript.jscomp.NodeUtil.getStringValue(node18);
        boolean boolean23 = com.google.javascript.jscomp.NodeUtil.isSwitchCase(node18);
        boolean boolean24 = com.google.javascript.jscomp.NodeUtil.isSimpleOperator(node18);
        boolean boolean25 = com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(node9, node18);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node9);
        com.google.javascript.rhino.jstype.TernaryValue ternaryValue27 = com.google.javascript.jscomp.NodeUtil.getBooleanValue(node9);
        java.lang.String str28 = com.google.javascript.jscomp.NodeUtil.getSourceName(node9);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(node18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "undefined" + "'", str22, "undefined");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(ternaryValue27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isString(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isThis(node1);
        int int5 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node1, "");
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node6);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.referencesThis(node7);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node7);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        boolean boolean11 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node7, abstractCompiler10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node12);
        java.lang.String str14 = com.google.javascript.jscomp.NodeUtil.getSourceName(node13);
        boolean boolean15 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node13);
        boolean boolean16 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node13);
        boolean boolean17 = com.google.javascript.jscomp.NodeUtil.isLhs(node7, node13);
        com.google.javascript.jscomp.NodeUtil.copyNameAnnotations(node1, node7);
        boolean boolean19 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean20 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        boolean boolean22 = com.google.javascript.jscomp.NodeUtil.isNameReferenced(node1, "%=");
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node24);
        boolean boolean26 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node27);
        boolean boolean29 = com.google.javascript.jscomp.NodeUtil.referencesThis(node28);
        boolean boolean30 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        boolean boolean32 = com.google.javascript.jscomp.NodeUtil.nodeTypeMayHaveSideEffects(node28, abstractCompiler31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node34);
        boolean boolean36 = com.google.javascript.jscomp.NodeUtil.referencesThis(node35);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType39 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        int int40 = com.google.javascript.jscomp.NodeUtil.getNodeTypeReferenceCount(node35, (int) (byte) 1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean41 = com.google.javascript.jscomp.NodeUtil.containsType(node28, (-1), (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        boolean boolean42 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node25, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node43);
        boolean boolean45 = com.google.javascript.jscomp.NodeUtil.referencesThis(node44);
        boolean boolean46 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node44);
        boolean boolean47 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node44);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        boolean boolean49 = com.google.javascript.jscomp.NodeUtil.mayEffectMutableState(node44, abstractCompiler48);
        boolean boolean50 = matchNodeType39.apply(node44);
        int int51 = matchNodeType39.type;
        boolean boolean52 = com.google.javascript.jscomp.NodeUtil.containsType(node1, (int) (byte) 100, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchNodeType39);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node53);
        boolean boolean55 = com.google.javascript.jscomp.NodeUtil.isString(node54);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration56 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration57 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int58 = com.google.javascript.jscomp.NodeUtil.getCount(node54, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration56, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration57);
        boolean boolean59 = com.google.javascript.jscomp.NodeUtil.evaluatesToLocalValue(node1, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration57);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node60);
        boolean boolean62 = com.google.javascript.jscomp.NodeUtil.isString(node61);
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration63 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        com.google.javascript.jscomp.NodeUtil.MatchDeclaration matchDeclaration64 = new com.google.javascript.jscomp.NodeUtil.MatchDeclaration();
        int int65 = com.google.javascript.jscomp.NodeUtil.getCount(node61, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration63, (com.google.common.base.Predicate<com.google.javascript.rhino.Node>) matchDeclaration64);
        com.google.javascript.jscomp.NodeUtil.MatchNodeType matchNodeType67 = new com.google.javascript.jscomp.NodeUtil.MatchNodeType((int) (byte) 10);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode(node68);
        boolean boolean70 = com.google.javascript.jscomp.NodeUtil.isString(node69);
        boolean boolean71 = com.google.javascript.jscomp.NodeUtil.isThis(node69);
        int int73 = com.google.javascript.jscomp.NodeUtil.getNameReferenceCount(node69, "");
        boolean boolean74 = matchNodeType67.apply(node69);
        com.google.javascript.jscomp.NodeUtil.setDebugInformation(node61, node69, "");
        boolean boolean77 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node69);
        boolean boolean78 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node69);
        boolean boolean79 = com.google.javascript.jscomp.NodeUtil.isGetOrSetKey(node69);
        boolean boolean80 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node69);
        boolean boolean81 = com.google.javascript.jscomp.NodeUtil.isForIn(node69);
        boolean boolean82 = matchDeclaration57.apply(node69);
        org.junit.Assert.assertNotNull(node1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(node13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(node25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(node28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(node35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(node44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(node54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(node61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(node69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }
}

