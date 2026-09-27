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
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (-1), (int) '4');
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (-1), (int) '4');
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isSimpleFunctionObjectCall(node4);
        boolean boolean7 = com.google.javascript.jscomp.NodeUtil.isImmutableValue(node4);
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(node4);
        boolean boolean9 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node10 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) (short) 10, 9);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isFunction(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getNearestFunctionName(node3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("|", (int) (byte) -1, (int) (short) 1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsCall(node3);
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.canBeSideEffected(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = com.google.javascript.jscomp.NodeUtil.getFunctionName(node3);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (-1), (int) '4');
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.isEmptyBlock(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node4);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (-1), (int) '4');
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.newName("", node4);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newExpr(node4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node6);
    }
}

