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
        com.google.javascript.jscomp.FunctionInjector.CanInlineResult canInlineResult0 = com.google.javascript.jscomp.FunctionInjector.CanInlineResult.YES;
        java.lang.Class<?> wildcardClass1 = canInlineResult0.getClass();
        org.junit.Assert.assertTrue("'" + canInlineResult0 + "' != '" + com.google.javascript.jscomp.FunctionInjector.CanInlineResult.YES + "'", canInlineResult0.equals(com.google.javascript.jscomp.FunctionInjector.CanInlineResult.YES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        com.google.javascript.jscomp.FunctionInjector.InliningMode inliningMode0 = com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK;
        org.junit.Assert.assertTrue("'" + inliningMode0 + "' != '" + com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK + "'", inliningMode0.equals(com.google.javascript.jscomp.FunctionInjector.InliningMode.BLOCK));
    }
}

