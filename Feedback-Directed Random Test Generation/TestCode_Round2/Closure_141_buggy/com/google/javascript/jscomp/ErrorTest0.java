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
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("$$constant", (int) '#', (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) (byte) 100, (int) (short) 100);
        com.google.javascript.rhino.Node node6 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("", node4, "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node6);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", (int) '#', 0);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isConstantName(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("typeof", (int) (byte) 100, 6);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isAssignmentOp(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("instanceof", 6, 10);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isExpressionNode(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        com.google.javascript.rhino.Node node5 = com.google.javascript.jscomp.NodeUtil.getAssignedValue(node3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("%=", (int) (short) 0, (int) (short) -1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.referencesThis(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("ions:\n\n", (int) (byte) 0, 6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isReferenceName(node3);
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("^", (int) (short) 0, (int) '4');
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGetProp(node3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test9() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test9");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("||", (int) (short) -1, (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isVarDeclaration(node3);
    }
}

