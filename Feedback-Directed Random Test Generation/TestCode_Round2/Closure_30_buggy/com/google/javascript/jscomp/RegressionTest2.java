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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal22, node23, node24);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal36, node37, node38);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal25);
        boolean boolean27 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal34, node35, node36);
        java.lang.Class<?> wildcardClass38 = flowSensitiveInlineVariables4.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal44, node45, node46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        // The following exception was thrown during execution in test generation
        try {
            flowSensitiveInlineVariables1.enterScope(nodeTraversal36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables1 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        flowSensitiveInlineVariables1.exitScope(nodeTraversal48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = flowSensitiveInlineVariables1.shouldTraverse(nodeTraversal50, node51, node52);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = null;
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal54, node55, node56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = null;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal58, node59, node60);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal62 = null;
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.rhino.Node node64 = null;
        flowSensitiveInlineVariables1.visit(nodeTraversal62, node63, node64);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }
}

