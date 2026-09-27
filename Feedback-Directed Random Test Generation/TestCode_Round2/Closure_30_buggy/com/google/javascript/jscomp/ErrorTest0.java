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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        boolean boolean9 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.rhino.Node node12 = null;
        boolean boolean13 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal10, node11, node12);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal14 = null;
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.rhino.Node node16 = null;
        boolean boolean17 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal14, node15, node16);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal18 = null;
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.rhino.Node node20 = null;
        flowSensitiveInlineVariables5.visit(nodeTraversal18, node19, node20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.rhino.Node node24 = null;
        boolean boolean25 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal22, node23, node24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.rhino.Node node28 = null;
        boolean boolean29 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal26, node27, node28);
        boolean boolean30 = mustDef0.equals((java.lang.Object) nodeTraversal26);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef4 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef2 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Object obj4 = null;
        boolean boolean5 = mustDef0.equals(obj4);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        boolean boolean5 = mustDef3.equals((java.lang.Object) true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef2 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef1);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass4 = mustDef0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef3 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables5 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler4);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal6 = null;
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.rhino.Node node8 = null;
        flowSensitiveInlineVariables5.visit(nodeTraversal6, node7, node8);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal10 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.rhino.Node node14 = null;
        boolean boolean15 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal12, node13, node14);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal16 = null;
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.rhino.Node node18 = null;
        boolean boolean19 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal16, node17, node18);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal20 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal20);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal22 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal22);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal24 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal24);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal26 = null;
        flowSensitiveInlineVariables5.exitScope(nodeTraversal26);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal28 = null;
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.rhino.Node node30 = null;
        boolean boolean31 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal28, node29, node30);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal32 = null;
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.rhino.Node node34 = null;
        boolean boolean35 = flowSensitiveInlineVariables5.shouldTraverse(nodeTraversal32, node33, node34);
        boolean boolean36 = mustDef0.equals((java.lang.Object) nodeTraversal32);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef3", mustDef0.equals(mustDef3) ? mustDef0.hashCode() == mustDef3.hashCode() : true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass2 = mustDef0.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef1 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables3 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler2);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal4 = null;
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.rhino.Node node6 = null;
        boolean boolean7 = flowSensitiveInlineVariables3.shouldTraverse(nodeTraversal4, node5, node6);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal8 = null;
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.rhino.Node node10 = null;
        boolean boolean11 = flowSensitiveInlineVariables3.shouldTraverse(nodeTraversal8, node9, node10);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal12 = null;
        flowSensitiveInlineVariables3.exitScope(nodeTraversal12);
        boolean boolean14 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables3);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef1", mustDef0.equals(mustDef1) ? mustDef0.hashCode() == mustDef1.hashCode() : true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal25);
        boolean boolean27 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef28 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables30 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal35, node36, node37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        boolean boolean42 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal43, node44, node45);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = null;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        boolean boolean50 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal47, node48, node49);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal51, node52, node53);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = null;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = null;
        boolean boolean58 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal55, node56, node57);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal59, node60, node61);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = null;
        flowSensitiveInlineVariables30.exitScope(nodeTraversal63);
        boolean boolean65 = mustDef28.equals((java.lang.Object) nodeTraversal63);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef28", mustDef0.equals(mustDef28) ? mustDef0.hashCode() == mustDef28.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal25);
        boolean boolean27 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef28 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables30 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal35, node36, node37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        boolean boolean42 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        flowSensitiveInlineVariables30.visit(nodeTraversal43, node44, node45);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = null;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        boolean boolean50 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal47, node48, node49);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        flowSensitiveInlineVariables30.exitScope(nodeTraversal51);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal53 = null;
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.rhino.Node node55 = null;
        boolean boolean56 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal53, node54, node55);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal57 = null;
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.rhino.Node node59 = null;
        flowSensitiveInlineVariables30.visit(nodeTraversal57, node58, node59);
        boolean boolean61 = mustDef28.equals((java.lang.Object) node59);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef28", mustDef0.equals(mustDef28) ? mustDef0.hashCode() == mustDef28.hashCode() : true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal25);
        boolean boolean27 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef28 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        java.lang.Class<?> wildcardClass29 = mustDef28.getClass();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef28", mustDef0.equals(mustDef28) ? mustDef0.hashCode() == mustDef28.hashCode() : true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef0 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef();
        boolean boolean2 = mustDef0.equals((java.lang.Object) 10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables4 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler3);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal5 = null;
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.rhino.Node node7 = null;
        boolean boolean8 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal5, node6, node7);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal9 = null;
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.rhino.Node node11 = null;
        boolean boolean12 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal9, node10, node11);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal13 = null;
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        boolean boolean16 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal13, node14, node15);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal17 = null;
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.rhino.Node node19 = null;
        boolean boolean20 = flowSensitiveInlineVariables4.shouldTraverse(nodeTraversal17, node18, node19);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal21 = null;
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        flowSensitiveInlineVariables4.visit(nodeTraversal21, node22, node23);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal25 = null;
        flowSensitiveInlineVariables4.exitScope(nodeTraversal25);
        boolean boolean27 = mustDef0.equals((java.lang.Object) flowSensitiveInlineVariables4);
        com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef mustDef28 = new com.google.javascript.jscomp.MustBeReachingVariableDef.MustDef(mustDef0);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        com.google.javascript.jscomp.FlowSensitiveInlineVariables flowSensitiveInlineVariables30 = new com.google.javascript.jscomp.FlowSensitiveInlineVariables(abstractCompiler29);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal31 = null;
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.rhino.Node node33 = null;
        boolean boolean34 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal31, node32, node33);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal35 = null;
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        boolean boolean38 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal35, node36, node37);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal39 = null;
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.rhino.Node node41 = null;
        boolean boolean42 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal39, node40, node41);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal43 = null;
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        boolean boolean46 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal43, node44, node45);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal47 = null;
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.rhino.Node node49 = null;
        boolean boolean50 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal47, node48, node49);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal51 = null;
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.rhino.Node node53 = null;
        boolean boolean54 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal51, node52, node53);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal55 = null;
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = null;
        boolean boolean58 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal55, node56, node57);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal59 = null;
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.rhino.Node node61 = null;
        boolean boolean62 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal59, node60, node61);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal63 = null;
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.rhino.Node node65 = null;
        boolean boolean66 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal63, node64, node65);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal67 = null;
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.rhino.Node node69 = null;
        flowSensitiveInlineVariables30.visit(nodeTraversal67, node68, node69);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal71 = null;
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.rhino.Node node73 = null;
        flowSensitiveInlineVariables30.visit(nodeTraversal71, node72, node73);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal75 = null;
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.rhino.Node node77 = null;
        boolean boolean78 = flowSensitiveInlineVariables30.shouldTraverse(nodeTraversal75, node76, node77);
        com.google.javascript.jscomp.NodeTraversal nodeTraversal79 = null;
        flowSensitiveInlineVariables30.exitScope(nodeTraversal79);
        boolean boolean81 = mustDef28.equals((java.lang.Object) nodeTraversal79);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on mustDef0 and mustDef28", mustDef0.equals(mustDef28) ? mustDef0.hashCode() == mustDef28.hashCode() : true);
    }
}

