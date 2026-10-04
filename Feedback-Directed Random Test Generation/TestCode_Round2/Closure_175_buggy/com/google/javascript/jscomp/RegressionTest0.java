package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineResult0 = com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO;
        java.lang.Class<?> wildcardClass1 = canInlineResult0.getClass();
        org.junit.Assert.assertTrue("'" + canInlineResult0 + "' != '" + com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO + "'", canInlineResult0.equals(com.google.javascript.jscomp.FunctionInjector.CanInlineResult.NO));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode0 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        org.junit.Assert.assertTrue("'" + inliningMode0 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode0.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineResult0 = com.google.javascript.jscomp.FunctionInjector.CanInlineResult.AFTER_PREPARATION;
        org.junit.Assert.assertTrue("'" + canInlineResult0 + "' != '" + com.google.javascript.jscomp.FunctionInjector.CanInlineResult.AFTER_PREPARATION + "'", canInlineResult0.equals(com.google.javascript.jscomp.FunctionInjector.CanInlineResult.AFTER_PREPARATION));
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        com.google.javascript.rhino.Node node0 = null;
        com.google.javascript.jscomp.JSModule jSModule1 = null;
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode2 = com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT;
        com.google.javascript.jscomp.FunctionInjector.Reference reference3 = new com.google.javascript.jscomp.FunctionInjector.Reference(node0, jSModule1, inliningMode2);
        org.junit.Assert.assertTrue("'" + inliningMode2 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT + "'", inliningMode2.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.DIRECT));
    }
}

