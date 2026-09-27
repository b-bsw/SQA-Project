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
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = minimizeExitPoints1.shouldTraverse(nodeTraversal11, node12, node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node17, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertNull(abstractCompiler16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = minimizeExitPoints1.shouldTraverse(nodeTraversal11, node12, node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        minimizeExitPoints1.compiler = abstractCompiler16;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node23, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = minimizeExitPoints1.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = minimizeExitPoints1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        minimizeExitPoints1.compiler = abstractCompiler12;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        minimizeExitPoints1.compiler = abstractCompiler15;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        org.junit.Assert.assertNull(abstractCompiler2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(abstractCompiler7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        boolean boolean14 = minimizeExitPoints1.shouldTraverse(nodeTraversal11, node12, node13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        minimizeExitPoints1.compiler = abstractCompiler16;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        minimizeExitPoints1.compiler = abstractCompiler18;
        java.lang.Class<?> wildcardClass20 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        java.lang.Class<?> wildcardClass15 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        minimizeExitPoints1.compiler = abstractCompiler14;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        minimizeExitPoints1.compiler = abstractCompiler16;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        minimizeExitPoints1.compiler = abstractCompiler20;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = minimizeExitPoints1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node26, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        minimizeExitPoints1.compiler = abstractCompiler14;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        minimizeExitPoints1.compiler = abstractCompiler25;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        minimizeExitPoints1.compiler = abstractCompiler27;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        minimizeExitPoints1.compiler = abstractCompiler29;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertNull(abstractCompiler13);
        org.junit.Assert.assertNull(abstractCompiler16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(abstractCompiler23);
        org.junit.Assert.assertNull(abstractCompiler24);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        minimizeExitPoints1.compiler = abstractCompiler6;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        minimizeExitPoints1.compiler = abstractCompiler9;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        minimizeExitPoints1.compiler = abstractCompiler19;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal21, node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertNull(abstractCompiler18);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = minimizeExitPoints1.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = null;
        minimizeExitPoints1.compiler = abstractCompiler32;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal34 = null;
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = minimizeExitPoints1.shouldTraverse(nodeTraversal34, node35, node36);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal38 = null;
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = minimizeExitPoints1.shouldTraverse(nodeTraversal38, node39, node40);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = minimizeExitPoints1.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        minimizeExitPoints1.compiler = abstractCompiler19;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = minimizeExitPoints1.compiler;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(abstractCompiler16);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertNull(abstractCompiler21);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        minimizeExitPoints1.compiler = abstractCompiler8;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler7);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = minimizeExitPoints1.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        minimizeExitPoints1.compiler = abstractCompiler12;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node18, (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertNull(abstractCompiler16);
        org.junit.Assert.assertNull(abstractCompiler17);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = minimizeExitPoints1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        minimizeExitPoints1.compiler = abstractCompiler28;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = minimizeExitPoints1.compiler;
        java.lang.Class<?> wildcardClass31 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(abstractCompiler23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(abstractCompiler30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        minimizeExitPoints1.compiler = abstractCompiler8;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node13, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler7);
        org.junit.Assert.assertNull(abstractCompiler12);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertNull(abstractCompiler13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = minimizeExitPoints1.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = minimizeExitPoints1.shouldTraverse(nodeTraversal7, node8, node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        minimizeExitPoints1.compiler = abstractCompiler18;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.process(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(abstractCompiler2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        minimizeExitPoints1.compiler = abstractCompiler14;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = abstractCompiler17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler13);
        org.junit.Assert.assertNull(abstractCompiler16);
        org.junit.Assert.assertNull(abstractCompiler17);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        minimizeExitPoints1.compiler = abstractCompiler19;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node22, (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler21);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        minimizeExitPoints1.compiler = abstractCompiler19;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        minimizeExitPoints1.compiler = abstractCompiler21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        minimizeExitPoints1.compiler = abstractCompiler20;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = minimizeExitPoints1.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = minimizeExitPoints1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        minimizeExitPoints1.compiler = abstractCompiler30;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = minimizeExitPoints1.shouldTraverse(nodeTraversal32, node33, node34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        minimizeExitPoints1.compiler = abstractCompiler36;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        minimizeExitPoints1.compiler = abstractCompiler38;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal40 = null;
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = minimizeExitPoints1.shouldTraverse(nodeTraversal40, node41, node42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = minimizeExitPoints1.compiler;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(abstractCompiler44);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = minimizeExitPoints1.shouldTraverse(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        minimizeExitPoints1.compiler = abstractCompiler25;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractCompiler20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler13);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        minimizeExitPoints1.compiler = abstractCompiler14;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertNull(abstractCompiler13);
        org.junit.Assert.assertNull(abstractCompiler16);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertNull(abstractCompiler20);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = minimizeExitPoints1.shouldTraverse(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        minimizeExitPoints1.compiler = abstractCompiler25;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = minimizeExitPoints1.shouldTraverse(nodeTraversal32, node33, node34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractCompiler20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        minimizeExitPoints1.compiler = abstractCompiler6;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        minimizeExitPoints1.compiler = abstractCompiler9;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        minimizeExitPoints1.compiler = abstractCompiler16;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = minimizeExitPoints1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = minimizeExitPoints1.shouldTraverse(nodeTraversal22, node23, node24);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler8);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = minimizeExitPoints1.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node21, (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        minimizeExitPoints1.compiler = abstractCompiler21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertNull(abstractCompiler20);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        minimizeExitPoints1.compiler = abstractCompiler15;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = minimizeExitPoints1.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal22, node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(abstractCompiler21);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        minimizeExitPoints1.compiler = abstractCompiler19;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal23, node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler21);
        org.junit.Assert.assertNull(abstractCompiler22);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = minimizeExitPoints1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        minimizeExitPoints1.compiler = abstractCompiler24;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        minimizeExitPoints1.compiler = abstractCompiler15;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = minimizeExitPoints1.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = minimizeExitPoints1.shouldTraverse(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = minimizeExitPoints1.compiler;
        java.lang.Class<?> wildcardClass33 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(abstractCompiler25);
        org.junit.Assert.assertNull(abstractCompiler26);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(abstractCompiler32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = minimizeExitPoints1.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler32 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler33 = null;
        minimizeExitPoints1.compiler = abstractCompiler33;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(abstractCompiler32);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        minimizeExitPoints1.compiler = abstractCompiler20;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        minimizeExitPoints1.compiler = abstractCompiler22;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = minimizeExitPoints1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = minimizeExitPoints1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        minimizeExitPoints1.compiler = abstractCompiler24;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = minimizeExitPoints1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = minimizeExitPoints1.shouldTraverse(nodeTraversal30, node31, node32);
        java.lang.Class<?> wildcardClass34 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        minimizeExitPoints1.compiler = abstractCompiler20;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal22, node23, node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler19);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        boolean boolean24 = minimizeExitPoints1.shouldTraverse(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        minimizeExitPoints1.compiler = abstractCompiler25;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node32, (int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractCompiler20);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        minimizeExitPoints1.compiler = abstractCompiler21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        boolean boolean28 = minimizeExitPoints1.shouldTraverse(nodeTraversal25, node26, node27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler30 = null;
        minimizeExitPoints1.compiler = abstractCompiler30;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractCompiler20);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(abstractCompiler29);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = minimizeExitPoints1.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = minimizeExitPoints1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        minimizeExitPoints1.compiler = abstractCompiler26;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        minimizeExitPoints1.compiler = abstractCompiler28;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal30, node31, node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(abstractCompiler14);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(abstractCompiler24);
        org.junit.Assert.assertNull(abstractCompiler25);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = minimizeExitPoints1.shouldTraverse(nodeTraversal20, node21, node22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        minimizeExitPoints1.compiler = abstractCompiler24;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = minimizeExitPoints1.shouldTraverse(nodeTraversal26, node27, node28);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal30 = null;
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = minimizeExitPoints1.shouldTraverse(nodeTraversal30, node31, node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node34, (int) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        minimizeExitPoints1.compiler = abstractCompiler17;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = minimizeExitPoints1.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.process(node27, node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = minimizeExitPoints1.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        boolean boolean10 = minimizeExitPoints1.shouldTraverse(nodeTraversal7, node8, node9);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = null;
        minimizeExitPoints1.compiler = abstractCompiler11;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = minimizeExitPoints1.shouldTraverse(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        boolean boolean28 = minimizeExitPoints1.shouldTraverse(nodeTraversal25, node26, node27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        minimizeExitPoints1.compiler = abstractCompiler29;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = minimizeExitPoints1.shouldTraverse(nodeTraversal32, node33, node34);
        org.junit.Assert.assertNull(abstractCompiler2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(abstractCompiler22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(abstractCompiler31);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = null;
        minimizeExitPoints1.compiler = abstractCompiler20;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler22 = null;
        minimizeExitPoints1.compiler = abstractCompiler22;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = minimizeExitPoints1.shouldTraverse(nodeTraversal24, node25, node26);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = minimizeExitPoints1.compiler;
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node30, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(abstractCompiler17);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertNull(abstractCompiler19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(abstractCompiler28);
        org.junit.Assert.assertNull(abstractCompiler29);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = minimizeExitPoints1.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler11 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = minimizeExitPoints1.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = minimizeExitPoints1.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.visit(nodeTraversal21, node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(abstractCompiler10);
        org.junit.Assert.assertNull(abstractCompiler11);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = null;
        boolean boolean6 = minimizeExitPoints1.shouldTraverse(nodeTraversal3, node4, node5);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        boolean boolean18 = minimizeExitPoints1.shouldTraverse(nodeTraversal15, node16, node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            minimizeExitPoints1.tryMinimizeExits(node19, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(abstractCompiler2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(abstractCompiler7);
        org.junit.Assert.assertNull(abstractCompiler8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        minimizeExitPoints1.compiler = abstractCompiler10;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        minimizeExitPoints1.compiler = abstractCompiler16;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal19 = null;
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        boolean boolean22 = minimizeExitPoints1.shouldTraverse(nodeTraversal19, node20, node21);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal23 = null;
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        boolean boolean26 = minimizeExitPoints1.shouldTraverse(nodeTraversal23, node24, node25);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal27 = null;
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        boolean boolean30 = minimizeExitPoints1.shouldTraverse(nodeTraversal27, node28, node29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        minimizeExitPoints1.compiler = abstractCompiler31;
        java.lang.Class<?> wildcardClass33 = minimizeExitPoints1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertNull(abstractCompiler9);
        org.junit.Assert.assertNull(abstractCompiler12);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertNull(abstractCompiler18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.MinimizeExitPoints minimizeExitPoints1 = new com.google.javascript.jscomp.MinimizeExitPoints(abstractCompiler0);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal2 = null;
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = minimizeExitPoints1.shouldTraverse(nodeTraversal2, node3, node4);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        minimizeExitPoints1.compiler = abstractCompiler7;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = minimizeExitPoints1.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        minimizeExitPoints1.compiler = abstractCompiler13;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = minimizeExitPoints1.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler20 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        minimizeExitPoints1.compiler = abstractCompiler21;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        minimizeExitPoints1.compiler = abstractCompiler23;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        minimizeExitPoints1.compiler = abstractCompiler25;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = minimizeExitPoints1.compiler;
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = minimizeExitPoints1.shouldTraverse(nodeTraversal28, node29, node30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(abstractCompiler6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(abstractCompiler15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(abstractCompiler20);
        org.junit.Assert.assertNull(abstractCompiler27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }
}

