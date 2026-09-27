package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
            System.out.format("%n%s%n", "ErrorTest0.test1");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(false);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(node1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(false);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isLoopStructure(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(node1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(false);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExecutedExactlyOnce(node1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.booleanNode(false);
        com.google.javascript.rhino.Node node2 = com.google.javascript.jscomp.NodeUtil.newExpr(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.mayBeString(node2);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node2);
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.arrayToString(node2);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.getPrototypeClassName(node2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getRValueOfLValue(node2);
    }
}

