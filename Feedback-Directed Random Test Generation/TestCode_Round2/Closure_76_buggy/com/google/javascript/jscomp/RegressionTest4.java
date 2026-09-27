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
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        deadAssignmentsElimination1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        deadAssignmentsElimination1.visit(nodeTraversal44, node45, node46);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        deadAssignmentsElimination1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        deadAssignmentsElimination1.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node48, node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        deadAssignmentsElimination1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        deadAssignmentsElimination1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal34);
        java.lang.Class<?> wildcardClass36 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.enterScope(nodeTraversal26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node30, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.enterScope(nodeTraversal30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        deadAssignmentsElimination1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal46, node47, node48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal50, node51, node52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        deadAssignmentsElimination1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal40);
        java.lang.Class<?> wildcardClass42 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        deadAssignmentsElimination1.visit(nodeTraversal30, node31, node32);
        java.lang.Class<?> wildcardClass34 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        deadAssignmentsElimination1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        deadAssignmentsElimination1.visit(nodeTraversal44, node45, node46);
        java.lang.Class<?> wildcardClass48 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        deadAssignmentsElimination1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        deadAssignmentsElimination1.visit(nodeTraversal30, node31, node32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        deadAssignmentsElimination1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        deadAssignmentsElimination1.visit(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        deadAssignmentsElimination1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        deadAssignmentsElimination1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal42);
        java.lang.Class<?> wildcardClass44 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.enterScope(nodeTraversal28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        deadAssignmentsElimination1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        deadAssignmentsElimination1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal44);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        deadAssignmentsElimination1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal50, node51, node52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        deadAssignmentsElimination1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        deadAssignmentsElimination1.visit(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        deadAssignmentsElimination1.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal48);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        deadAssignmentsElimination1.visit(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        deadAssignmentsElimination1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        deadAssignmentsElimination1.visit(nodeTraversal44, node45, node46);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        deadAssignmentsElimination1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal28);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        deadAssignmentsElimination1.visit(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        deadAssignmentsElimination1.visit(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        boolean boolean49 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal46, node47, node48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.rhino.Node node52 = null;
        boolean boolean53 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal50, node51, node52);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal54 = null;
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.rhino.Node node56 = null;
        deadAssignmentsElimination1.visit(nodeTraversal54, node55, node56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = null;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = null;
        boolean boolean61 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal58, node59, node60);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        deadAssignmentsElimination1.visit(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        deadAssignmentsElimination1.visit(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        deadAssignmentsElimination1.visit(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal40);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        deadAssignmentsElimination1.visit(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal44);
        java.lang.Class<?> wildcardClass46 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        deadAssignmentsElimination1.visit(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        java.lang.Class<?> wildcardClass26 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal36, node37, node38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        deadAssignmentsElimination1.visit(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal48, node49, node50);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal52 = null;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = null;
        deadAssignmentsElimination1.visit(nodeTraversal52, node53, node54);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal56);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal58 = null;
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.rhino.Node node60 = null;
        deadAssignmentsElimination1.visit(nodeTraversal58, node59, node60);
        java.lang.Class<?> wildcardClass62 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        deadAssignmentsElimination1.visit(nodeTraversal4, node5, node6);
        java.lang.Class<?> wildcardClass8 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        deadAssignmentsElimination1.visit(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        deadAssignmentsElimination1.visit(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        deadAssignmentsElimination1.visit(nodeTraversal34, node35, node36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        deadAssignmentsElimination1.visit(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            deadAssignmentsElimination1.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        deadAssignmentsElimination1.visit(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        deadAssignmentsElimination1.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        java.lang.Class<?> wildcardClass32 = deadAssignmentsElimination1.getClass();
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal32);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        deadAssignmentsElimination1.visit(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        deadAssignmentsElimination1.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal38);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal42, node43, node44);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal46 = null;
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.rhino.Node node48 = null;
        deadAssignmentsElimination1.visit(nodeTraversal46, node47, node48);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal50 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal50);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal52 = null;
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.rhino.Node node54 = null;
        boolean boolean55 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal52, node53, node54);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal56 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal56);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.DeadAssignmentsElimination deadAssignmentsElimination1 = new com.google.javascript.jscomp.DeadAssignmentsElimination(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        deadAssignmentsElimination1.visit(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        deadAssignmentsElimination1.visit(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        deadAssignmentsElimination1.visit(nodeTraversal30, node31, node32);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal34);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal36 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal38, node39, node40);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal42 = null;
        deadAssignmentsElimination1.exitScope(nodeTraversal42);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal44 = null;
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.rhino.Node node46 = null;
        deadAssignmentsElimination1.visit(nodeTraversal44, node45, node46);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal48 = null;
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.rhino.Node node50 = null;
        boolean boolean51 = deadAssignmentsElimination1.shouldTraverse(nodeTraversal48, node49, node50);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }
}

