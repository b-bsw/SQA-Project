package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode14);
        com.google.javascript.rhino.Node node19 = reference18.callNode;
        com.google.javascript.rhino.Node node20 = reference18.callNode;
        com.google.javascript.jscomp.JSModule jSModule21 = reference18.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode22 = reference18.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference23 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode25 = reference24.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode26 = reference24.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode27 = reference24.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference28 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode27);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(jSModule21);
        org.junit.Assert.assertTrue("'" + inliningMode22 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode22.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode25 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode25.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode26 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode26.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode27 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode27.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference13 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode12);
        com.google.javascript.rhino.Node node14 = reference13.callNode;
        com.google.javascript.jscomp.JSModule jSModule15 = reference13.module;
        com.google.javascript.jscomp.JSModule jSModule16 = reference13.module;
        com.google.javascript.rhino.Node node17 = reference13.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode18 = reference13.mode;
        com.google.javascript.rhino.Node node19 = reference13.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode20 = reference13.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference21 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode20);
        com.google.javascript.rhino.Node node22 = reference21.callNode;
        com.google.javascript.rhino.Node node23 = reference21.callNode;
        com.google.javascript.rhino.Node node24 = reference21.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode25 = reference21.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference26 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode25);
        com.google.javascript.jscomp.FunctionInjector.Reference reference27 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode25);
        com.google.javascript.jscomp.FunctionInjector.Reference reference28 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode25);
        com.google.javascript.jscomp.FunctionInjector.Reference reference29 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode25);
        java.lang.Class<?> wildcardClass30 = reference29.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(node17);
        org.junit.Assert.assertTrue("'" + inliningMode18 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode18.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + inliningMode20 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode20.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node22);
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertNull(node24);
        org.junit.Assert.assertTrue("'" + inliningMode25 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode25.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.rhino.Node node10 = reference9.callNode;
        com.google.javascript.jscomp.JSModule jSModule11 = reference9.module;
        com.google.javascript.jscomp.JSModule jSModule12 = reference9.module;
        com.google.javascript.rhino.Node node13 = reference9.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode18 = reference17.mode;
        com.google.javascript.rhino.Node node19 = reference17.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode18 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode18.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node19);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.jscomp.JSModule jSModule6 = reference5.module;
        com.google.javascript.rhino.Node node7 = reference5.callNode;
        com.google.javascript.rhino.Node node8 = reference5.callNode;
        com.google.javascript.rhino.Node node9 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference5.mode;
        com.google.javascript.rhino.Node node11 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule12 = reference5.module;
        com.google.javascript.rhino.Node node13 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule14 = reference5.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode15);
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode14);
        com.google.javascript.jscomp.JSModule jSModule18 = reference17.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode19 = reference17.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference20 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode19);
        com.google.javascript.jscomp.FunctionInjector.Reference reference21 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode19);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode22 = reference21.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference23 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode25 = reference24.mode;
        com.google.javascript.rhino.Node node26 = reference24.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode27 = reference24.mode;
        java.lang.Class<?> wildcardClass28 = reference24.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertTrue("'" + inliningMode19 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode19.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode22 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode22.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode25 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode25.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertTrue("'" + inliningMode27 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode27.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference7.mode;
        com.google.javascript.jscomp.JSModule jSModule9 = reference7.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference11 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode10);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode13);
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference10.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference10.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference13 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference14.mode;
        java.lang.Class<?> wildcardClass16 = inliningMode15.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode2 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference3 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode2);
        com.google.javascript.jscomp.JSModule jSModule4 = reference3.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode5 = reference3.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = reference3.mode;
        java.lang.Class<?> wildcardClass7 = inliningMode6.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode2 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode2.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertTrue("'" + inliningMode5 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode5.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode17 = reference16.mode;
        com.google.javascript.jscomp.JSModule jSModule18 = reference16.module;
        com.google.javascript.jscomp.JSModule jSModule19 = reference16.module;
        com.google.javascript.rhino.Node node20 = reference16.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode21 = reference16.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference22 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode21);
        com.google.javascript.jscomp.FunctionInjector.Reference reference23 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode21);
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode21);
        com.google.javascript.jscomp.FunctionInjector.Reference reference25 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode21);
        com.google.javascript.jscomp.FunctionInjector.Reference reference26 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode21);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode17 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode17.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertNull(jSModule19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertTrue("'" + inliningMode21 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode21.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference10.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference10.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference13 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference14.mode;
        com.google.javascript.jscomp.JSModule jSModule16 = reference14.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode17 = reference14.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode18 = reference14.mode;
        com.google.javascript.rhino.Node node19 = reference14.callNode;
        com.google.javascript.rhino.Node node20 = reference14.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + inliningMode17 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode17.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode18 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode18.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.Reference reference8 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode6);
        com.google.javascript.jscomp.JSModule jSModule9 = reference8.module;
        com.google.javascript.rhino.Node node10 = reference8.callNode;
        com.google.javascript.jscomp.JSModule jSModule11 = reference8.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference8.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference8.mode;
        com.google.javascript.rhino.Node node14 = reference8.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference8.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode15);
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.Reference reference8 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode9 = reference8.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode9);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference10.mode;
        com.google.javascript.rhino.Node node12 = reference10.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode9 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode9.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node12);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference11 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode8);
        com.google.javascript.jscomp.JSModule jSModule12 = reference11.module;
        com.google.javascript.jscomp.JSModule jSModule13 = reference11.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference11.mode;
        com.google.javascript.jscomp.JSModule jSModule15 = reference11.module;
        com.google.javascript.rhino.Node node16 = reference11.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode17 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode17);
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertTrue("'" + inliningMode17 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode17.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode9 = reference7.mode;
        com.google.javascript.jscomp.JSModule jSModule10 = reference7.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference12 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode11);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference12.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode13);
        java.lang.Class<?> wildcardClass15 = inliningMode13.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode9 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode9.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.jscomp.JSModule jSModule6 = reference5.module;
        com.google.javascript.rhino.Node node7 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode8);
        com.google.javascript.jscomp.JSModule jSModule10 = reference9.module;
        com.google.javascript.jscomp.JSModule jSModule11 = reference9.module;
        com.google.javascript.rhino.Node node12 = reference9.callNode;
        com.google.javascript.rhino.Node node13 = reference9.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference11 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode8);
        com.google.javascript.jscomp.JSModule jSModule12 = reference11.module;
        com.google.javascript.rhino.Node node13 = reference11.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode15);
        java.lang.Class<?> wildcardClass17 = inliningMode15.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode7 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference5.mode;
        com.google.javascript.jscomp.JSModule jSModule9 = reference5.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference12 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode11);
        com.google.javascript.jscomp.JSModule jSModule13 = reference12.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference12.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode15 = reference12.mode;
        com.google.javascript.jscomp.JSModule jSModule16 = reference12.module;
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode7 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode7.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode15 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode15.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule16);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode7 = reference5.mode;
        com.google.javascript.rhino.Node node8 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule9 = reference5.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference11 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode10);
        com.google.javascript.rhino.Node node12 = reference11.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference11.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference11.mode;
        java.lang.Class<?> wildcardClass15 = reference11.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode7 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode7.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode13);
        com.google.javascript.jscomp.JSModule jSModule15 = reference14.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference14.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode16);
        com.google.javascript.jscomp.JSModule jSModule18 = reference17.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode19 = reference17.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference20 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode19);
        java.lang.Class<?> wildcardClass21 = inliningMode19.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertTrue("'" + inliningMode19 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode19.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node14, jSModule15, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference19 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference20 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference21 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference22 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference23 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode16);
        com.google.javascript.jscomp.JSModule jSModule25 = reference24.module;
        com.google.javascript.rhino.Node node26 = reference24.callNode;
        com.google.javascript.jscomp.JSModule jSModule27 = reference24.module;
        com.google.javascript.jscomp.JSModule jSModule28 = reference24.module;
        com.google.javascript.rhino.Node node29 = reference24.callNode;
        com.google.javascript.jscomp.JSModule jSModule30 = reference24.module;
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule25);
        org.junit.Assert.assertNull(node26);
        org.junit.Assert.assertNull(jSModule27);
        org.junit.Assert.assertNull(jSModule28);
        org.junit.Assert.assertNull(node29);
        org.junit.Assert.assertNull(jSModule30);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.JSModule jSModule15 = null;
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.JSModule jSModule17 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode18 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference19 = new com.google.javascript.jscomp.FunctionInjector.Reference(node16, jSModule17, inliningMode18);
        com.google.javascript.jscomp.FunctionInjector.Reference reference20 = new com.google.javascript.jscomp.FunctionInjector.Reference(node14, jSModule15, inliningMode18);
        com.google.javascript.jscomp.FunctionInjector.Reference reference21 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode18);
        com.google.javascript.jscomp.JSModule jSModule22 = reference21.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode23 = reference21.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode23);
        com.google.javascript.jscomp.FunctionInjector.Reference reference25 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode23);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode26 = reference25.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference27 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode26);
        com.google.javascript.jscomp.FunctionInjector.Reference reference28 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode26);
        com.google.javascript.jscomp.FunctionInjector.Reference reference29 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode26);
        com.google.javascript.jscomp.FunctionInjector.Reference reference30 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode26);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode31 = reference30.mode;
        java.lang.Class<?> wildcardClass32 = inliningMode31.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode18 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode18.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule22);
        org.junit.Assert.assertTrue("'" + inliningMode23 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode23.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode26 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode26.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode31 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode31.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode11 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference9.mode;
        com.google.javascript.jscomp.JSModule jSModule13 = reference9.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference9.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode14);
        com.google.javascript.jscomp.JSModule jSModule17 = reference16.module;
        com.google.javascript.jscomp.JSModule jSModule18 = reference16.module;
        com.google.javascript.rhino.Node node19 = reference16.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode20 = reference16.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference21 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode20);
        com.google.javascript.rhino.Node node22 = reference21.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode11 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode11.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule17);
        org.junit.Assert.assertNull(jSModule18);
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertTrue("'" + inliningMode20 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode20.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node22);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode9 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference7.mode;
        com.google.javascript.jscomp.JSModule jSModule11 = reference7.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference15.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode16);
        java.lang.Class<?> wildcardClass18 = reference17.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode9 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode9.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.rhino.Node node6 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule7 = reference5.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode9 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode9);
        com.google.javascript.rhino.Node node11 = reference10.callNode;
        com.google.javascript.rhino.Node node12 = reference10.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference10.mode;
        com.google.javascript.jscomp.JSModule jSModule14 = reference10.module;
        com.google.javascript.jscomp.JSModule jSModule15 = reference10.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference10.mode;
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode9 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode9.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference11 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode10);
        com.google.javascript.jscomp.FunctionInjector.Reference reference12 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode10);
        com.google.javascript.jscomp.FunctionInjector.Reference reference13 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode10);
        com.google.javascript.jscomp.JSModule jSModule14 = reference13.module;
        com.google.javascript.rhino.Node node15 = reference13.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference13.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode19 = reference18.mode;
        com.google.javascript.rhino.Node node20 = reference18.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode19 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode19.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node20);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode2 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference3 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode2);
        com.google.javascript.rhino.Node node4 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule5 = reference3.module;
        com.google.javascript.jscomp.JSModule jSModule6 = reference3.module;
        com.google.javascript.rhino.Node node7 = reference3.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference3.mode;
        com.google.javascript.rhino.Node node9 = reference3.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference3.mode;
        com.google.javascript.rhino.Node node11 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule12 = reference3.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference3.mode;
        com.google.javascript.rhino.Node node14 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule15 = reference3.module;
        org.junit.Assert.assertTrue("'" + inliningMode2 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode2.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(jSModule6);
        org.junit.Assert.assertNull(node7);
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node14);
        org.junit.Assert.assertNull(jSModule15);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference7.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference9 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode8);
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode8);
        java.lang.Class<?> wildcardClass11 = reference10.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference13 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode12);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference15.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode16);
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode16);
        com.google.javascript.rhino.Node node19 = reference18.callNode;
        com.google.javascript.rhino.Node node20 = reference18.callNode;
        com.google.javascript.rhino.Node node21 = reference18.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode22 = reference18.mode;
        com.google.javascript.rhino.Node node23 = reference18.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode24 = reference18.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference25 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode24);
        java.lang.Class<?> wildcardClass26 = reference25.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(node21);
        org.junit.Assert.assertTrue("'" + inliningMode22 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode22.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node23);
        org.junit.Assert.assertTrue("'" + inliningMode24 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode24.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.rhino.Node node6 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule7 = reference5.module;
        com.google.javascript.jscomp.JSModule jSModule8 = reference5.module;
        com.google.javascript.rhino.Node node9 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference5.mode;
        com.google.javascript.rhino.Node node11 = reference5.callNode;
        com.google.javascript.rhino.Node node12 = reference5.callNode;
        com.google.javascript.rhino.Node node13 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule14 = reference5.module;
        com.google.javascript.rhino.Node node15 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode16);
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertNull(jSModule14);
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.rhino.Node node6 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule7 = reference5.module;
        com.google.javascript.jscomp.JSModule jSModule8 = reference5.module;
        com.google.javascript.rhino.Node node9 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode10 = reference5.mode;
        com.google.javascript.rhino.Node node11 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule12 = reference5.module;
        com.google.javascript.rhino.Node node13 = reference5.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode14);
        com.google.javascript.rhino.Node node16 = reference15.callNode;
        com.google.javascript.rhino.Node node17 = reference15.callNode;
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(jSModule8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertTrue("'" + inliningMode10 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode10.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(node13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node16);
        org.junit.Assert.assertNull(node17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.JSModule jSModule7 = null;
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.JSModule jSModule9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.JSModule jSModule11 = null;
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.JSModule jSModule13 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference15 = new com.google.javascript.jscomp.FunctionInjector.Reference(node12, jSModule13, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference16 = new com.google.javascript.jscomp.FunctionInjector.Reference(node10, jSModule11, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference17 = new com.google.javascript.jscomp.FunctionInjector.Reference(node8, jSModule9, inliningMode14);
        com.google.javascript.jscomp.FunctionInjector.Reference reference18 = new com.google.javascript.jscomp.FunctionInjector.Reference(node6, jSModule7, inliningMode14);
        com.google.javascript.rhino.Node node19 = reference18.callNode;
        com.google.javascript.rhino.Node node20 = reference18.callNode;
        com.google.javascript.jscomp.JSModule jSModule21 = reference18.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode22 = reference18.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference23 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.Reference reference24 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode22);
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode25 = reference24.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode26 = reference24.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference27 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode26);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(node19);
        org.junit.Assert.assertNull(node20);
        org.junit.Assert.assertNull(jSModule21);
        org.junit.Assert.assertTrue("'" + inliningMode22 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode22.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode25 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode25.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertTrue("'" + inliningMode26 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode26.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.JSModule jSModule5 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode6 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference7 = new com.google.javascript.jscomp.FunctionInjector.Reference(node4, jSModule5, inliningMode6);
        com.google.javascript.jscomp.FunctionInjector.Reference reference8 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode6);
        com.google.javascript.jscomp.JSModule jSModule9 = reference8.module;
        com.google.javascript.rhino.Node node10 = reference8.callNode;
        com.google.javascript.jscomp.JSModule jSModule11 = reference8.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode12 = reference8.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode13 = reference8.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference14 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode13);
        com.google.javascript.jscomp.JSModule jSModule15 = reference14.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode16 = reference14.mode;
        java.lang.Class<?> wildcardClass17 = inliningMode16.getClass();
        org.junit.Assert.assertTrue("'" + inliningMode6 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode6.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(jSModule9);
        org.junit.Assert.assertNull(node10);
        org.junit.Assert.assertNull(jSModule11);
        org.junit.Assert.assertTrue("'" + inliningMode12 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode12.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode13 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode13.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertTrue("'" + inliningMode16 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode16.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.JSModule jSModule3 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode4 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        com.google.javascript.jscomp.FunctionInjector.Reference reference5 = new com.google.javascript.jscomp.FunctionInjector.Reference(node2, jSModule3, inliningMode4);
        com.google.javascript.rhino.Node node6 = reference5.callNode;
        com.google.javascript.jscomp.JSModule jSModule7 = reference5.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode8 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode9 = reference5.mode;
        com.google.javascript.jscomp.FunctionInjector.Reference reference10 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode9);
        com.google.javascript.rhino.Node node11 = reference10.callNode;
        com.google.javascript.rhino.Node node12 = reference10.callNode;
        com.google.javascript.jscomp.JSModule jSModule13 = reference10.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference10.mode;
        com.google.javascript.rhino.Node node15 = reference10.callNode;
        com.google.javascript.jscomp.JSModule jSModule16 = reference10.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode17 = reference10.mode;
        com.google.javascript.rhino.Node node18 = reference10.callNode;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode19 = reference10.mode;
        org.junit.Assert.assertTrue("'" + inliningMode4 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode4.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertTrue("'" + inliningMode8 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode8.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertTrue("'" + inliningMode9 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode9.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(node12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertTrue("'" + inliningMode17 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode17.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
        org.junit.Assert.assertNull(node18);
        org.junit.Assert.assertTrue("'" + inliningMode19 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode19.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode2 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference3 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode2);
        com.google.javascript.jscomp.JSModule jSModule4 = reference3.module;
        com.google.javascript.jscomp.JSModule jSModule5 = reference3.module;
        com.google.javascript.rhino.Node node6 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule7 = reference3.module;
        com.google.javascript.rhino.Node node8 = reference3.callNode;
        com.google.javascript.rhino.Node node9 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule10 = reference3.module;
        com.google.javascript.rhino.Node node11 = reference3.callNode;
        com.google.javascript.jscomp.JSModule jSModule12 = reference3.module;
        com.google.javascript.jscomp.JSModule jSModule13 = reference3.module;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode14 = reference3.mode;
        com.google.javascript.jscomp.JSModule jSModule15 = reference3.module;
        com.google.javascript.jscomp.JSModule jSModule16 = reference3.module;
        com.google.javascript.jscomp.JSModule jSModule17 = reference3.module;
        org.junit.Assert.assertTrue("'" + inliningMode2 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode2.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule4);
        org.junit.Assert.assertNull(jSModule5);
        org.junit.Assert.assertNull(node6);
        org.junit.Assert.assertNull(jSModule7);
        org.junit.Assert.assertNull(node8);
        org.junit.Assert.assertNull(node9);
        org.junit.Assert.assertNull(jSModule10);
        org.junit.Assert.assertNull(node11);
        org.junit.Assert.assertNull(jSModule12);
        org.junit.Assert.assertNull(jSModule13);
        org.junit.Assert.assertTrue("'" + inliningMode14 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode14.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
        org.junit.Assert.assertNull(jSModule15);
        org.junit.Assert.assertNull(jSModule16);
        org.junit.Assert.assertNull(jSModule17);
    }
}

