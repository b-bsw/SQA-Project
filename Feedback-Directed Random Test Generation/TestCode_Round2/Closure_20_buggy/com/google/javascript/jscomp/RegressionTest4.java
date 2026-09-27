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
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = peepholeSubstituteAlternateSyntax1.isPure(node40);
        com.google.javascript.rhino.Node node42 = null;
        boolean boolean43 = peepholeSubstituteAlternateSyntax1.isPure(node42);
        com.google.javascript.rhino.Node node44 = null;
        boolean boolean45 = peepholeSubstituteAlternateSyntax1.isPure(node44);
        com.google.javascript.rhino.Node node46 = null;
        boolean boolean47 = peepholeSubstituteAlternateSyntax1.isPure(node46);
        java.lang.Class<?> wildcardClass48 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = node21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = node21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        java.lang.Class<?> wildcardClass38 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node8, node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        java.lang.Class<?> wildcardClass28 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        java.lang.Class<?> wildcardClass16 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = peepholeSubstituteAlternateSyntax1.isPure(node40);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node43 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = node19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        java.lang.Class<?> wildcardClass40 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = node29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        java.lang.Class<?> wildcardClass14 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = node9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node12, node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        java.lang.Class<?> wildcardClass24 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean37 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node18, node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        java.lang.Class<?> wildcardClass24 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node39 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node26, node27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node40, node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNull(node39);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = node13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        java.lang.Class<?> wildcardClass36 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        java.lang.Class<?> wildcardClass28 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        java.lang.Class<?> wildcardClass18 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node20, node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.rhino.Node node39 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node38);
        java.lang.Class<?> wildcardClass40 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertNull(node39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = node29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node30, node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        java.lang.Class<?> wildcardClass24 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        boolean boolean37 = peepholeSubstituteAlternateSyntax1.isPure(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node41 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node16, node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        com.google.javascript.rhino.Node node40 = null;
        boolean boolean41 = peepholeSubstituteAlternateSyntax1.isPure(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node42, node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node28, node29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node24, node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node32);
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = peepholeSubstituteAlternateSyntax1.isPure(node34);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNull(node33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        java.lang.Class<?> wildcardClass20 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        java.lang.Class<?> wildcardClass26 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = node17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        java.lang.Class<?> wildcardClass32 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(node29);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = node23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(node23);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        boolean boolean27 = peepholeSubstituteAlternateSyntax1.isPure(node26);
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = peepholeSubstituteAlternateSyntax1.isPure(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = peepholeSubstituteAlternateSyntax1.isPure(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = peepholeSubstituteAlternateSyntax1.areMatchingExits(node32, node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(node25);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.rhino.Node node29 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.rhino.Node node31 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node30);
        com.google.javascript.rhino.Node node32 = null;
        boolean boolean33 = peepholeSubstituteAlternateSyntax1.isPure(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node36);
        com.google.javascript.rhino.Node node38 = null;
        boolean boolean39 = peepholeSubstituteAlternateSyntax1.isPure(node38);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNull(node27);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(node31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(node35);
        org.junit.Assert.assertNull(node37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = peepholeSubstituteAlternateSyntax1.isPure(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node25 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        java.lang.Class<?> wildcardClass22 = peepholeSubstituteAlternateSyntax1.getClass();
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = peepholeSubstituteAlternateSyntax1.isPure(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        boolean boolean21 = peepholeSubstituteAlternateSyntax1.isPure(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.getExceptionHandler(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(false);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.rhino.Node node9 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.rhino.Node node3 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node2);
        com.google.javascript.rhino.Node node4 = null;
        boolean boolean5 = peepholeSubstituteAlternateSyntax1.isPure(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = peepholeSubstituteAlternateSyntax1.isPure(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        boolean boolean23 = peepholeSubstituteAlternateSyntax1.isPure(node22);
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = peepholeSubstituteAlternateSyntax1.isPure(node24);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node27 = peepholeSubstituteAlternateSyntax1.optimizeSubtree(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(node3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax peepholeSubstituteAlternateSyntax1 = new com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax(true);
        com.google.javascript.rhino.Node node2 = null;
        boolean boolean3 = peepholeSubstituteAlternateSyntax1.isPure(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.rhino.Node node5 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node4);
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = peepholeSubstituteAlternateSyntax1.isPure(node6);
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = peepholeSubstituteAlternateSyntax1.isPure(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.rhino.Node node13 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node12);
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = peepholeSubstituteAlternateSyntax1.isPure(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.rhino.Node node17 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node16);
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = peepholeSubstituteAlternateSyntax1.isPure(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.rhino.Node node21 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = peepholeSubstituteAlternateSyntax1.skipFinallyNodes(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = peepholeSubstituteAlternateSyntax1.isExceptionPossible(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(node5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertNull(node23);
    }
}

