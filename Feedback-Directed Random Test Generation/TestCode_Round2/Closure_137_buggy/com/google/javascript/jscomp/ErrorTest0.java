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
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isStatementBlock(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isName(node0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node0);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        com.google.javascript.rhino.Node node0 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean1 = com.google.javascript.jscomp.NodeUtil.isNew(node0);
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node0);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node0);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isGetProp(node0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = com.google.javascript.jscomp.NodeUtil.getPrototypePropertyName(node0);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        com.google.javascript.rhino.Node node3 = com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode("hi!", 100, (int) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.isLabelName(node3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        com.google.javascript.rhino.Node node1 = com.google.javascript.jscomp.NodeUtil.newUndefinedNode();
        boolean boolean2 = com.google.javascript.jscomp.NodeUtil.isNew(node1);
        boolean boolean3 = com.google.javascript.jscomp.NodeUtil.isExprAssign(node1);
        boolean boolean4 = com.google.javascript.jscomp.NodeUtil.containsFunctionDeclaration(node1);
        com.google.javascript.rhino.JSDocInfo jSDocInfo5 = com.google.javascript.jscomp.NodeUtil.getInfoForNameNode(node1);
        boolean boolean6 = com.google.javascript.jscomp.NodeUtil.referencesThis(node1);
        com.google.javascript.rhino.Node node7 = com.google.javascript.jscomp.NodeUtil.newName("instanceof", node1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = com.google.javascript.jscomp.NodeUtil.isLabelName(node7);
    }
}

