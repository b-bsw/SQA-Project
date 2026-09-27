package com.google.javascript.jscomp;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator21.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator21.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator36.addList(node41, false, context43);
        codeGenerator21.addList(node33, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node57, false, context59);
        codeGenerator21.addList(node46, true, context59);
        codeGenerator1.addList(node18, true, context59);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer64 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator65 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator65.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator65.addList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator65.addList(node71, true, context73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator65.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator65.addList(node77, false);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator65.addList(node80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator65.addList(node82, true, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node63, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator16.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node36, true, context38);
        codeGenerator16.addList(node30, false, context38);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addArrayList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator44.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator44.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        java.nio.charset.Charset charset56 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator57 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55, charset56);
        com.google.javascript.rhino.Node node58 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator61.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator61.addAllSiblings(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator61.addList(node66, false);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator61.addList(node69, true, context71);
        codeGenerator57.addList(node58, false, context71);
        codeGenerator44.addList(node53, true, context71);
        codeGenerator16.addList(node41, false, context71);
        codeGenerator1.addList(node13, false, context71);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addAllSiblings(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator79.addAllSiblings(node82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator79.addList(node84, false);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator79.addList(node87, true, context89);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node77, context89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"'\\\\\\\"\\\\\\\"'\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\"\\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\"\\\\\\\"'\\\"\"");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node22, false, context24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (-1), context24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"" + "'", str1, "\"\"");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node48, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator5.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator5.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator5.addList(node13, true, context15);
        codeGenerator1.addList(node2, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator23.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator23.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator23.addList(node38, false, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node20, (int) (byte) 1, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator16.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator36.addList(node42, false, context44);
        codeGenerator16.addList(node33, true, context44);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, 10, context44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///\"/ 44 /\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///\\\"/ 44 /\\\"///\"" + "'", str1, "\"///\\\"/ 44 /\\\"///\"");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node37, false, context39);
        codeGenerator1.addList(node26, true, context39);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node54, true, context56);
        codeGenerator1.addList(node48, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node26, true, context28);
        codeGenerator14.addList(node15, false, context28);
        codeGenerator1.addList(node10, true, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'/" + "'", str1, "/'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'/");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\" \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" 44 \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" \\\"'\"" + "'", str1, "\"'\\\" \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" 44 \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" \\\"'\"");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\"\"'/", '4', "//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//", "4hi!4", "//'\"hi!\"'//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4" + "'", str6, "4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '4', "/hi!/", "", "\"a/ 44 /a\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44" + "'", str6, "44");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, (int) (byte) 10, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator12.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator12.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator12.addList(node20, true, context22);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node9, (int) (short) -1, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a///" + "'", str2, "///a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a///");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/  /", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//  //" + "'", str2, "//  //");
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"//" + "'", str1, "//\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"//");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//#/\\\"hi!\\\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"hi!a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"\\\"hi!\\\"/#//\"" + "'", str1, "\"//#/\\\"hi!\\\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"hi!a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"\\\"hi!\\\"/#//\"");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"///\\\"/ 44 /\\\"///\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"///\\\\\"/ 44 /\\\\\"///\"'" + "'", str2, "'\"///\\\\\"/ 44 /\\\\\"///\"'");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator15.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addList(node21, true);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator15.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator15.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator15.addList(node30, true, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/\\\"/ 44 /\\\"/\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"/\\\"/ 44 /\\\"/\"///" + "'", str2, "///\"/\\\"/ 44 /\\\"/\"///");
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node20, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"'\\\"\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"\\\"'\"/" + "'", str1, "/\"'\\\"\\\"'\"/");
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray9 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes11 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray9, variableMap10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        char[] charArray15 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray24 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray24, variableMap25);
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap28 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap29 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, true, charArray15, variableMap29);
        com.google.javascript.jscomp.VariableMap variableMap31 = renamePrototypes30.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = renamePrototypes30.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray9, variableMap32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes33.process(node34, node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(variableMap28);
        org.junit.Assert.assertNotNull(variableMap29);
        org.junit.Assert.assertNotNull(variableMap31);
        org.junit.Assert.assertNotNull(variableMap32);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator23.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator23.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator38.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator38.addList(node43, false, context45);
        codeGenerator23.addList(node35, true, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node20, (int) '#', context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator29.addList(node38, true, context56);
        codeGenerator1.addList(node26, false, context56);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addArrayList(node61);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/ 44 /\"", ' ', "#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#", "/ 44 /", "\"///'\\\"hi!\\\"'///\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# " + "'", str6, " #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# ");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//'\" 44 \"'//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\\'//\"\\\\\\\\\"hi!\\\\\\\\\"\"//\\''", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"" + "'", str2, "\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"/" + "'", str2, "/\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"/");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  " + "'", str1, "  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  ");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator21.addList(node27, false, context29);
        codeGenerator1.addList(node18, true, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray22 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap23 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray22, variableMap23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray11, variableMap25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        char[] charArray35 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, true, charArray35, variableMap36);
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap39 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray11, variableMap40);
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes41.getPropertyMap();
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.rhino.Node node45 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes41.process(node44, node45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(variableMap39);
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'///\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'hi!/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'//'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'///\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'hi!/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'//'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/a" + "'", str1, "a/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'///\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'hi!/\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"//\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/\"\\\"hi!\\\"\"/'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'//'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'/a");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'/\"/ 44 /\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'/\\\"/ 44 /\\\"/'\"" + "'", str2, "\"'/\\\"/ 44 /\\\"/'\"");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//  //", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray3 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray12 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray12, variableMap13);
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray3, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes18.getPropertyMap();
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes18.process(node21, node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4hi!4", ' ', "  //44/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/  44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ \"'\\\"hi!\\\"'\"\"'\\\"hi!\\\"'\" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /44//  ", "#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#", "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4hi!4 " + "'", str6, " 4hi!4 ");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///'\"hi!\"'///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////'\"hi!\"'////" + "'", str1, "////'\"hi!\"'////");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node17, false, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) (short) 1, context19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"///\\\\\"/ 44 /\\\\\"///\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"///\\\\\"/ 44 /\\\\\"///\"'" + "'", str1, "'\"///\\\\\"/ 44 /\\\\\"///\"'");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'" + "'", str2, "'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        char[] charArray6 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        char[] charArray15 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap16 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes17 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler7, true, charArray15, variableMap16);
        com.google.javascript.jscomp.VariableMap variableMap18 = renamePrototypes17.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes17.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes17.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes21 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler3, true, charArray6, variableMap20);
        com.google.javascript.jscomp.VariableMap variableMap22 = renamePrototypes21.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray2, variableMap22);
        java.lang.Class<?> wildcardClass24 = renamePrototypes23.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap18);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap22);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"/" + "'", str1, "/\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"/");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"44\"" + "'", str1, "\"44\"");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator5.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator5.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator5.addList(node13, true, context15);
        codeGenerator1.addList(node2, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node22, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray5 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray14 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray14, variableMap15);
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap18 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray5, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray25 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler26 = null;
        char[] charArray34 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap35 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler26, true, charArray34, variableMap35);
        com.google.javascript.jscomp.VariableMap variableMap37 = renamePrototypes36.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes36.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, false, charArray25, variableMap38);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        char[] charArray48 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap49 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes50 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler40, true, charArray48, variableMap49);
        com.google.javascript.jscomp.VariableMap variableMap51 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap53 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap54 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, false, charArray25, variableMap54);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes56 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray5, variableMap54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes56.process(node57, node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap18);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertArrayEquals(charArray25, new char[] {});
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertArrayEquals(charArray34, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap37);
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap51);
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(variableMap53);
        org.junit.Assert.assertNotNull(variableMap54);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'" + "'", str1, "'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'");
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"/ 44 /\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"/ 44 /\\\"\"//" + "'", str2, "//\"\\\"/ 44 /\\\"\"//");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"/" + "'", str2, "/\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"/");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        codeGenerator12.addList(node21, false, context32);
        codeGenerator1.addList(node9, true, context32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray13 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, false, charArray13, variableMap14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray24 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray24, variableMap25);
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray13, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray37 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap38 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray37, variableMap38);
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray13, variableMap42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        char[] charArray55 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap56 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, false, charArray55, variableMap56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        char[] charArray66 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap67 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, true, charArray66, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler46, true, charArray55, variableMap69);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        char[] charArray79 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap80 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler71, true, charArray79, variableMap80);
        com.google.javascript.jscomp.VariableMap variableMap82 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap83 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap84 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap85 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap86 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap87 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes88 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, false, charArray55, variableMap87);
        com.google.javascript.jscomp.VariableMap variableMap89 = renamePrototypes88.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes90 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray13, variableMap89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.rhino.Node node92 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes90.process(node91, node92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap41);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap82);
        org.junit.Assert.assertNotNull(variableMap83);
        org.junit.Assert.assertNotNull(variableMap84);
        org.junit.Assert.assertNotNull(variableMap85);
        org.junit.Assert.assertNotNull(variableMap86);
        org.junit.Assert.assertNotNull(variableMap87);
        org.junit.Assert.assertNotNull(variableMap89);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        java.lang.Class<?> wildcardClass8 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node17, false, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator13.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator13.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node39, false, context41);
        codeGenerator28.addList(node32, true, context41);
        codeGenerator13.addList(node25, true, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) (short) 0, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        java.lang.Class<?> wildcardClass17 = context15.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray15 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap16 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes17 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, false, charArray15, variableMap16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        char[] charArray26 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap27 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler18, true, charArray26, variableMap27);
        com.google.javascript.jscomp.VariableMap variableMap29 = renamePrototypes28.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray15, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray39 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap40 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray39, variableMap40);
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap44 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray15, variableMap44);
        com.google.javascript.jscomp.VariableMap variableMap46 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes47 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray15, variableMap46);
        com.google.javascript.jscomp.VariableMap variableMap48 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes49 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray15, variableMap48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes49.process(node50, node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap29);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(variableMap44);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'/\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\'/'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'/\"/ 44 /\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"/ 44 /\"/'/" + "'", str1, "/'/\"/ 44 /\"/'/");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray9 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes11 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray9, variableMap10);
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray9, variableMap12);
        java.lang.Class<?> wildcardClass14 = renamePrototypes13.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator5.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator5.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator5.addList(node13, true, context15);
        codeGenerator1.addList(node2, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"/ 44 /\"/'", ' ', "////\"/ 44 /\"////", "'\"\\\\\"hi!\\\\\"\"'", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " '\"\\\\\"hi!\\\\\"\"'/////\"/ 44 /\"///// 44 /////\"/ 44 /\"/////'\"\\\\\"hi!\\\\\"\"' " + "'", str6, " '\"\\\\\"hi!\\\\\"\"'/////\"/ 44 /\"///// 44 /////\"/ 44 /\"/////'\"\\\\\"hi!\\\\\"\"' ");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator34.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator34.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator34.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator54.addList(node60, false, context62);
        codeGenerator34.addList(node51, true, context62);
        codeGenerator25.addList(node31, false, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node22, 100, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"aa\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/  /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, true);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4hi!4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4hi!4/" + "'", str2, "/4hi!4/");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"44\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node44, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"/'/\\\"/ 44 /\\\"/'/\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node19, true, context21);
        codeGenerator1.addList(node10, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator28.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator28.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer39 = null;
        java.nio.charset.Charset charset40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer39, charset40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator45.addList(node53, true, context55);
        codeGenerator41.addList(node42, false, context55);
        codeGenerator28.addList(node37, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/  /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node16, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node37, false, context39);
        codeGenerator1.addList(node26, true, context39);
        java.lang.Class<?> wildcardClass42 = context39.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"aa\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"aa\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"aa\\\\\\\"\\\"\"");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node22, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"/", '4', "/hi!/", "//44//", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4" + "'", str6, "4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator28.addList(node34, false, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"'\\\" \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" 44 \\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\" \\\"'\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("ahi!a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"ahi!a\"" + "'", str2, "\"ahi!a\"");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\\'//\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"//\\\\''\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\\'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//\\\\\\\\''\\\"\"" + "'", str1, "\"\\\"'\\\\\\\\'//\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"//\\\\\\\\''\\\"\"");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"" + "'", str1, "\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node18, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("///a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"" + "'", str1, "\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#" + "'", str1, "#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#");
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray5 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray14 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap15 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes16 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray14, variableMap15);
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap18 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes16.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray5, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        char[] charArray29 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap30 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes31 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray29, variableMap30);
        com.google.javascript.jscomp.VariableMap variableMap32 = renamePrototypes31.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray5, variableMap32);
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes33.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes33.getPropertyMap();
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.rhino.Node node37 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes33.process(node36, node37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap18);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap32);
        org.junit.Assert.assertNotNull(variableMap34);
        org.junit.Assert.assertNotNull(variableMap35);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("  //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"// 44 //\"/ 44 /\"///'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/// 44 /'/ /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ /'//\"/ 44 /\"/////\"/ 44 /\"//  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"  //\\\"/ 44 /\\\"///'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/// 44 /'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/////\\\"/ 44 /\\\"// 44 //\\\"/ 44 /\\\"///'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/// 44 /'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/////\\\"/ 44 /\\\"//  \"" + "'", str1, "\"  //\\\"/ 44 /\\\"///'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/// 44 /'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/////\\\"/ 44 /\\\"// 44 //\\\"/ 44 /\\\"///'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/// 44 /'/ /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ /'//\\\"/ 44 /\\\"/////\\\"/ 44 /\\\"//  \"");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray12 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray12, variableMap13);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler15 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler17 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        char[] charArray26 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap27 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler19, false, charArray26, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray37 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap38 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray37, variableMap38);
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler17, true, charArray26, variableMap40);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler42 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        char[] charArray53 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap54 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler46, false, charArray53, variableMap54);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler56 = null;
        char[] charArray64 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap65 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes66 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler56, true, charArray64, variableMap65);
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes66.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, true, charArray53, variableMap67);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler69 = null;
        char[] charArray77 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap78 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes79 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler69, true, charArray77, variableMap78);
        com.google.javascript.jscomp.VariableMap variableMap80 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap81 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap82 = renamePrototypes79.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes83 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler42, false, charArray53, variableMap82);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes84 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler15, true, charArray26, variableMap82);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes85 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray12, variableMap82);
        com.google.javascript.jscomp.VariableMap variableMap86 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes87 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray12, variableMap86);
        java.lang.Class<?> wildcardClass88 = renamePrototypes87.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertArrayEquals(charArray53, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertArrayEquals(charArray64, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertArrayEquals(charArray77, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap80);
        org.junit.Assert.assertNotNull(variableMap81);
        org.junit.Assert.assertNotNull(variableMap82);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray4 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        char[] charArray13 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler5, true, charArray13, variableMap14);
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes15.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray4, variableMap17);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler19 = null;
        char[] charArray27 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap28 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes29 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler19, true, charArray27, variableMap28);
        com.google.javascript.jscomp.VariableMap variableMap30 = renamePrototypes29.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap31 = renamePrototypes29.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap32 = renamePrototypes29.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap33 = renamePrototypes29.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes34 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray4, variableMap33);
        java.lang.Class<?> wildcardClass35 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap30);
        org.junit.Assert.assertNotNull(variableMap31);
        org.junit.Assert.assertNotNull(variableMap32);
        org.junit.Assert.assertNotNull(variableMap33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# " + "'", str1, " #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# ");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray7 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray16 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap17 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, true, charArray16, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes22 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray7, variableMap21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray31 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap32 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray31, variableMap32);
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes33.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray7, variableMap34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        char[] charArray40 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray49 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray49, variableMap50);
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap53 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler38, false, charArray40, variableMap53);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        char[] charArray63 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap64 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes65 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler55, true, charArray63, variableMap64);
        com.google.javascript.jscomp.VariableMap variableMap66 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap68 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler36, false, charArray40, variableMap69);
        com.google.javascript.jscomp.VariableMap variableMap71 = renamePrototypes70.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap72 = renamePrototypes70.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes73 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap72);
        java.lang.Class<?> wildcardClass74 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(variableMap53);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap66);
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertNotNull(variableMap68);
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(variableMap71);
        org.junit.Assert.assertNotNull(variableMap72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"ahi!a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node8, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///" + "'", str1, "///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node16, false, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator12.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator12.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator12.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node36, false, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator32.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator32.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator47.addList(node52, false, context54);
        codeGenerator32.addList(node44, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator60.addList(node65, false);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator60.addList(node68, false, context70);
        codeGenerator32.addList(node57, true, context70);
        codeGenerator12.addList(node29, true, context70);
        codeGenerator1.addList(node9, false, context70);
        com.google.javascript.rhino.Node node75 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node35, true, context37);
        codeGenerator23.addList(node24, false, context37);
        codeGenerator1.addList(node20, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '/\"" + "'", str1, "\"/' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '/\"");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /" + "'", str1, "/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node54, true, context56);
        codeGenerator1.addList(node48, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node59, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"/ 44 /\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"/ 44 /\"//'" + "'", str2, "'//\"/ 44 /\"//'");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"#\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\" 44 \\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'hi!\\\\\\\\\\\" 44 \\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'#\\\"'/\"" + "'", str1, "\"/'\\\"#\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\" 44 \\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'hi!\\\\\\\\\\\" 44 \\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\'\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\\'#\\\"'/\"");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"/" + "'", str1, "/\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"/");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"/'\\\"hi!\\\"'/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/'\\\"hi!\\\"'/\"/" + "'", str1, "/\"/'\\\"hi!\\\"'/\"/");
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/hi!/\"" + "'", str1, "\"/hi!/\"");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"/hi!/\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        codeGenerator12.addList(node21, false, context32);
        codeGenerator1.addList(node9, true, context32);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node36, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//44//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//44//\"" + "'", str1, "\"//44//\"");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator6.addList(node14, true, context16);
        codeGenerator2.addList(node3, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator25.addList(node30, false, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/" + "'", str2, "/#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/aa/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//aa//" + "'", str2, "//aa//");
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//" + "'", str1, "//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"\\\"/ 44 /\\\"\"//", '#', "///44///", "//  //", "\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#" + "'", str6, "#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\\'\"/a /\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/hi!/\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ a/\"\\'/'" + "'", str2, "'/\\'\"/a /\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/hi!/\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ a/\"\\'/'");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/aa/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/aa/\"" + "'", str1, "\"/aa/\"");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        codeGenerator11.addList(node18, false, context31);
        codeGenerator1.addList(node8, true, context31);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"//" + "'", str1, "//\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"//");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addAllSiblings(node46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///\\\"/ 44 /\\\"///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//' \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" '//\\\"\"" + "'", str1, "\"\\\"//' \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" '//\\\"\"");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/ 44 /\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/ 44 /\\\\\"\"'" + "'", str2, "'\"\\\\\"/ 44 /\\\\\"\"'");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator12.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator12.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator12.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator12.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator37.addList(node38, false, context51);
        codeGenerator12.addList(node33, false, context51);
        codeGenerator1.addList(node9, false, context51);
        java.lang.Class<?> wildcardClass56 = context51.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node19, true, context21);
        codeGenerator1.addList(node10, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator12.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        codeGenerator12.addList(node21, false, context32);
        codeGenerator1.addList(node9, true, context32);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node38, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"'" + "'", str2, "'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"'");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"\\\"/ 44 /\\\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"\\\\\"/ 44 /\\\\\"\"//'" + "'", str2, "'//\"\\\\\"/ 44 /\\\\\"\"//'");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator18.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator18.addList(node30, true, context40);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16, context40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\\' \\\"/\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\"/\\\" \\\\'/'\"" + "'", str1, "\"'/\\\\' \\\"/\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\"/\\\" \\\\'/'\"");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'" + "'", str2, "'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator24.addList(node41, true, context52);
        codeGenerator1.addList(node21, true, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"/'/\\\"/ 44 /\\\"/'/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"/\\'/\\\\\"/ 44 /\\\\\"/\\'/\"/'" + "'", str2, "'/\"/\\'/\\\\\"/ 44 /\\\\\"/\\'/\"/'");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        codeGenerator2.addList(node8, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator24.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator37.addList(node38, false, context51);
        codeGenerator24.addList(node33, true, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node22, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("ahi!a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ahi!a/" + "'", str2, "/ahi!a/");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'/\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'\"" + "'", str1, "\"'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'\"");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\\\\\" \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\" \\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray3 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray9 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler10 = null;
        char[] charArray18 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap19 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler10, true, charArray18, variableMap19);
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes20.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap22 = renamePrototypes20.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap23 = renamePrototypes20.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray9, variableMap23);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        char[] charArray27 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler28 = null;
        char[] charArray36 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap37 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler28, true, charArray36, variableMap37);
        com.google.javascript.jscomp.VariableMap variableMap39 = renamePrototypes38.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes38.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler25, false, charArray27, variableMap40);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes42 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray9, variableMap40);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray3, variableMap40);
        java.lang.Class<?> wildcardClass44 = renamePrototypes43.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertArrayEquals(charArray18, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(variableMap22);
        org.junit.Assert.assertNotNull(variableMap23);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertArrayEquals(charArray27, new char[] {});
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertArrayEquals(charArray36, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap39);
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator31.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node37, true, context39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator31.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator31.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator31.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator51.addList(node57, false, context59);
        codeGenerator31.addList(node48, true, context59);
        codeGenerator22.addList(node28, false, context59);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node19, (int) (short) 100, context59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'/" + "'", str1, "/'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'/");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator19.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator19.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator19.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator19.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator19.addList(node34, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node16, (int) (byte) -1, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'/\\\"/ 44 /\\\"/'\"", '#', "\"\\\"aa\\\"\"", "/4hi!4/", "\"\\\"hi!\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"\\\"aa\\\"\"/4hi!4//\"\\\"hi!\\\"\"\"\\\"aa\\\"\"/ 44 /\"\\\"hi!\\\"\"\"\\\"aa\\\"\"//4hi!4/\"\\\"aa\\\"\"#" + "'", str6, "#\"\\\"aa\\\"\"/4hi!4//\"\\\"hi!\\\"\"\"\\\"aa\\\"\"/ 44 /\"\\\"hi!\\\"\"\"\\\"aa\\\"\"//4hi!4/\"\\\"aa\\\"\"#");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"//" + "'", str1, "//\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"//");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node48, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/4hi!4/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/4hi!4/\"" + "'", str2, "\"/4hi!4/\"");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/" + "'", str1, "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        java.lang.Class<?> wildcardClass21 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a/ 44 /a", '#', "/'/\"/ 44 /\"/'/", "4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4", "\"/' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#a/ 44 /a#" + "'", str6, "#a/ 44 /a#");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"/ 44 /\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/\\\"/ 44 /\\\"/\"/" + "'", str2, "/\"/\\\"/ 44 /\\\"/\"/");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"44\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node15, false, context17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator11.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator11.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator11.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator29.addList(node37, true, context39);
        codeGenerator11.addList(node26, false, context39);
        codeGenerator1.addList(node8, true, context39);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addList(node49, true);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addAllSiblings(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator55.addList(node60, false);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node52, false, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node43, context65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"" + "'", str1, "\" //44/'\\\"\\\"' 44 '\\\"\\\"'/44// \"");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"", 'a', "////\"/ 44 /\"////", " \"/\\\"/ 44 /\\\"/\" 44 \"/\\\"/ 44 /\\\"/\" ", "/\"'\\\"\\\"'\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a////\"/ 44 /\"///////\"'\\\"\\\"'\"/////\"/ 44 /\"/////\"'\\\"\\\"'\"//\"'\\\"\\\"'\"//\"'\\\"\\\"'\"/////\"/ 44 /\"////hi!/\"'\\\"\\\"'\"//\"'\\\"\\\"'\"//\"'\\\"\\\"'\"/////\"/ 44 /\"/////\"'\\\"\\\"'\"/////\"/ 44 /\"//////////\"/ 44 /\"////a" + "'", str6, "a////\"/ 44 /\"///////\"'\\\"\\\"'\"/////\"/ 44 /\"/////\"'\\\"\\\"'\"//\"'\\\"\\\"'\"//\"'\\\"\\\"'\"/////\"/ 44 /\"////hi!/\"'\\\"\\\"'\"//\"'\\\"\\\"'\"//\"'\\\"\\\"'\"/////\"/ 44 /\"/////\"'\\\"\\\"'\"/////\"/ 44 /\"//////////\"/ 44 /\"////a");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator6.addList(node14, true, context16);
        codeGenerator2.addList(node3, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\" \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" 44 \\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\" \"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addList(node8, false);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator14.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator14.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator27.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator27.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator27.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator27.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator48.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator48.addList(node54, false, context56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator48.addArrayList(node58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator48.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator48.addList(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator67 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator67.addArrayList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator67.addList(node70, true, context72);
        codeGenerator48.addList(node64, false, context72);
        codeGenerator27.addList(node45, true, context72);
        codeGenerator14.addList(node24, true, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, 0, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node25, true, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator19.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator19.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator19.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator19.addList(node39, false, context56);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node16, (int) (short) -1, context56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/4hi!4/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/4hi!4/\"'" + "'", str2, "'\"/4hi!4/\"'");
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '" + "'", str1, "' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"/ 44 /\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\\\\"/ 44 /\\\\\"\"'/" + "'", str2, "/'\"\\\\\"/ 44 /\\\\\"\"'/");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#/" + "'", str1, "/#//'\" 44 \"'////'\" 44 \"'/////'\" 44 \"'/// 44 ///'\" 44 \"'/////'\" 44 \"'////'\" 44 \"'//#/");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator29.addList(node38, true, context56);
        codeGenerator1.addList(node26, false, context56);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#/" + "'", str1, "/#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#/");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" #4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/ 44 /#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/aa/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/aa/" + "'", str1, "/aa/");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'/\\\\'\\\"\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\"\\\"\\\\'/'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'/\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\'/'\\\"\"" + "'", str1, "\"\\\"'/\\\\\\\\'\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\"\\\\\\\\'/'\\\"\"");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator1.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node26, true, context28);
        codeGenerator14.addList(node15, false, context28);
        codeGenerator1.addList(node10, true, context28);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator37.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator37.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node47, true, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node34, (int) (byte) 1, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//'/\"/ 44 /\"/'//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"44\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"44\"'" + "'", str2, "'\"44\"'");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator5.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator5.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator5.addList(node13, true, context15);
        codeGenerator1.addList(node2, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node33, false, context35);
        codeGenerator22.addList(node26, true, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node20, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///" + "'", str2, "///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator39.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator48.addList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator48.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator48.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator48.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator48.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator48.addList(node63, true, context65);
        codeGenerator39.addList(node45, true, context65);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node37, context65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34, false);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node37, false, context39);
        codeGenerator1.addList(node26, true, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator15.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node21, true, context23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator15.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator15.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator15.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator15.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator38.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node44, true, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator38.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator38.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator38.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator58 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator58.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator58.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator58.addList(node64, false, context66);
        codeGenerator38.addList(node55, true, context66);
        codeGenerator15.addList(node35, true, context66);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator12.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator12.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator12.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator12.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator12.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator12.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator41.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator41.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator41.addList(node49, true, context51);
        codeGenerator37.addList(node38, false, context51);
        codeGenerator12.addList(node33, false, context51);
        codeGenerator1.addList(node9, false, context51);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/'\\\"\\\"'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"\\\"'/\"" + "'", str1, "\"/'\\\"\\\"'/\"");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        java.lang.Class<?> wildcardClass16 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\" 44 \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\" 44 \\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\" 44 \\\\\\\"\\\"\"");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\\\\\"hi!\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''" + "'", str2, "'\\'\"\\\\\\\\\"hi!\\\\\\\\\"\"\\''");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///\"/\\\"/ 44 /\\\"/\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator29.addList(node38, true, context56);
        codeGenerator1.addList(node26, false, context56);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator1.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\" /\\\\\"\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"\\\\\"/hi!/\\\\\"\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"\\\\\"/ \"/'" + "'", str2, "'/\" /\\\\\"\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"\\\\\"/hi!/\\\\\"\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"\\\\\"/ \"/'");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'" + "'", str1, "'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'");
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator6.addList(node14, true, context16);
        codeGenerator2.addList(node3, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator34.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator34.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator34.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator54.addList(node60, false, context62);
        codeGenerator34.addList(node51, true, context62);
        codeGenerator25.addList(node31, false, context62);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23, context62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator18.addList(node26, true, context28);
        codeGenerator14.addList(node15, false, context28);
        codeGenerator1.addList(node10, true, context28);
        com.google.javascript.rhino.Node node32 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator9.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator9.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator9.addList(node15, false, context17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node7, context17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node21, 0, context23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"ahi!a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"ahi!a\"'" + "'", str2, "'\"ahi!a\"'");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//44//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///44///" + "'", str2, "///44///");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node19, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/hi!/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/hi!/\"/" + "'", str2, "/\"/hi!/\"/");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator23.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator23.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator23.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator23.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator23.addList(node38, true, context40);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node21, context40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/" + "'", str2, "/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"//" + "'", str2, "//\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"//");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////'\"hi!\"'////");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/////'\"hi!\"'/////" + "'", str1, "/////'\"hi!\"'/////");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#//" + "'", str1, "//#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#//");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node11, (int) (byte) -1, context13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/hi!/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/hi!/\\\"\"" + "'", str1, "\"\\\"/hi!/\\\"\"");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator13.addList(node19, true, context21);
        codeGenerator1.addList(node10, false, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator41.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node47, true, context49);
        codeGenerator32.addList(node38, false, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node28, 10, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "a\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"a", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context10 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node9, context10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context10 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context10.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/'/\\\"/ 44 /\\\"/'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/'/\\\\\\\"/ 44 /\\\\\\\"/'/\\\"\"" + "'", str1, "\"\\\"/'/\\\\\\\"/ 44 /\\\\\\\"/'/\\\"\"");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"\\\"//\\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\"//\\\"\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node35, true, context37);
        codeGenerator23.addList(node24, false, context37);
        codeGenerator1.addList(node20, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator16.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator16.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator16.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator39.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator39.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator39.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator39.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addArrayList(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addList(node62, false);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator59.addList(node65, false, context67);
        codeGenerator39.addList(node56, true, context67);
        codeGenerator16.addList(node36, true, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (int) ' ', context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        java.lang.Class<?> wildcardClass14 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray15 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap16 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes17 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, false, charArray15, variableMap16);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler18 = null;
        char[] charArray26 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap27 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler18, true, charArray26, variableMap27);
        com.google.javascript.jscomp.VariableMap variableMap29 = renamePrototypes28.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes30 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, true, charArray15, variableMap29);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler31 = null;
        char[] charArray39 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap40 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler31, true, charArray39, variableMap40);
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap44 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes45 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray15, variableMap44);
        com.google.javascript.jscomp.VariableMap variableMap46 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes47 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray15, variableMap46);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler50 = null;
        char[] charArray57 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap58 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes59 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler50, false, charArray57, variableMap58);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        char[] charArray68 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap69 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler60, true, charArray68, variableMap69);
        com.google.javascript.jscomp.VariableMap variableMap71 = renamePrototypes70.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes72 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, true, charArray57, variableMap71);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes73 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray15, variableMap71);
        java.lang.Class<?> wildcardClass74 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertArrayEquals(charArray26, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap29);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(variableMap44);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertArrayEquals(charArray57, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertArrayEquals(charArray68, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray7 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray16 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap17 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, true, charArray16, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes22 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray7, variableMap21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler25 = null;
        char[] charArray28 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray37 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap38 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray37, variableMap38);
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler25, true, charArray28, variableMap42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        char[] charArray52 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap53 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, true, charArray52, variableMap53);
        com.google.javascript.jscomp.VariableMap variableMap55 = renamePrototypes54.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes56 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, false, charArray28, variableMap55);
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray7, variableMap55);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler60 = null;
        char[] charArray67 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap68 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes69 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler60, false, charArray67, variableMap68);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler70 = null;
        char[] charArray73 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler74 = null;
        char[] charArray82 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap83 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes84 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler74, true, charArray82, variableMap83);
        com.google.javascript.jscomp.VariableMap variableMap85 = renamePrototypes84.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap86 = renamePrototypes84.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap87 = renamePrototypes84.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes88 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler70, true, charArray73, variableMap87);
        com.google.javascript.jscomp.VariableMap variableMap89 = renamePrototypes88.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap90 = renamePrototypes88.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes91 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, true, charArray67, variableMap90);
        com.google.javascript.jscomp.VariableMap variableMap92 = renamePrototypes91.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes93 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray7, variableMap92);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertArrayEquals(charArray28, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap41);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertArrayEquals(charArray52, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap55);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertArrayEquals(charArray67, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertArrayEquals(charArray73, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertArrayEquals(charArray82, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap85);
        org.junit.Assert.assertNotNull(variableMap86);
        org.junit.Assert.assertNotNull(variableMap87);
        org.junit.Assert.assertNotNull(variableMap89);
        org.junit.Assert.assertNotNull(variableMap90);
        org.junit.Assert.assertNotNull(variableMap92);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"\\\"hi!\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\\\\"hi!\\\\\"\"/'" + "'", str2, "'/\"\\\\\"hi!\\\\\"\"/'");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/ 44 /a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a/ 44 /a/" + "'", str1, "/a/ 44 /a/");
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator16.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator31.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator31.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator31.addList(node39, true, context41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator31.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node51, true, context53);
        codeGenerator31.addList(node45, false, context53);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addArrayList(node62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator59.addList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator59.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator76.addAllSiblings(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator76.addAllSiblings(node79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator76.addList(node81, false);
        com.google.javascript.rhino.Node node84 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context86 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator76.addList(node84, true, context86);
        codeGenerator72.addList(node73, false, context86);
        codeGenerator59.addList(node68, true, context86);
        codeGenerator31.addList(node56, false, context86);
        codeGenerator16.addList(node28, false, context86);
        codeGenerator1.addList(node13, false, context86);
        com.google.javascript.rhino.Node node93 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node93, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context86 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context86.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"/" + "'", str2, "/\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"/");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"/'\\\"\\\"'/\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        codeGenerator2.addList(node8, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"'\\\"\\\"'\"", 'a', "////\"/ 44 /\"////", "'\"/4hi!4/\"'", "'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a////\"/ 44 /\"////'\"/4hi!4/\"''\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'////\"/ 44 /\"////'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'////\"/ 44 /\"////'\"/4hi!4/\"'////\"/ 44 /\"////a" + "'", str6, "a////\"/ 44 /\"////'\"/4hi!4/\"''\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'////\"/ 44 /\"////'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'////\"/ 44 /\"////'\"/4hi!4/\"'////\"/ 44 /\"////a");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray3 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray12 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray12, variableMap13);
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray3, variableMap17);
        java.lang.Class<?> wildcardClass19 = renamePrototypes18.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"/" + "'", str2, "/\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"/");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"/" + "'", str2, "/\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"/");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node24, true, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator18.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator18.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator18.addAllSiblings(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator18.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        java.nio.charset.Charset charset42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41, charset42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator47.addList(node52, false);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator47.addList(node55, true, context57);
        codeGenerator43.addList(node44, false, context57);
        codeGenerator18.addList(node39, false, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator18.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator18.addArrayList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator68.addArrayList(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator68.addList(node71, true, context73);
        codeGenerator18.addList(node65, false, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node15, (int) (short) -1, context73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'/\\'\"/a /\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/hi!/\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ a/\"\\'/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'/\\'\"/a /\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/hi!/\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ a/\"\\'/'" + "'", str1, "'/\\'\"/a /\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/hi!/\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ 44 /\\\\\\\\\"hi!\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\"/ a/\"\\'/'");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\" 44 \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\" 44 \\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" 44 \\\"\"" + "'", str1, "\"\\\" 44 \\\"\"");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"", '4', " /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", "a\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"//' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//\"//\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"//\"a", "/'\"\"'/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /'\"\"'//'\"\"'//'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ hi!/'\"\"'//'\"\"'//'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ // /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ 4" + "'", str6, "4 /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /'\"\"'//'\"\"'//'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ hi!/'\"\"'//'\"\"'//'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ /'\"\"'/ /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ // /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ 4");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///\"/\\\"/ 44 /\\\"/\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"/\\\"/ 44 /\\\"/\"///" + "'", str1, "///\"/\\\"/ 44 /\\\"/\"///");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node12, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"\\\\\"/ 44 /\\\\\"\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"\\\\\"/ 44 /\\\\\"\"'" + "'", str1, "'\"\\\\\"/ 44 /\\\\\"\"'");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator33.addList(node41, true, context43);
        codeGenerator29.addList(node30, false, context43);
        codeGenerator16.addList(node25, true, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator5.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator5.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator5.addList(node13, true, context15);
        codeGenerator1.addList(node2, false, context15);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'///\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'///'" + "'", str2, "'///\\' \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" 44 \"/\\\\\\\\\"/ 44 /\\\\\\\\\"/\" \\'///'");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/'\\\"hi!\\\"'/\"", '4', " //44/'\"\"' 44 '\"\"'/44// ", "//\"/\\\"/ 44 /\\\"/\"//", "'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 //44/'\"\"' 44 '\"\"'/44// ///\"/\\\"/ 44 /\\\"/\"//'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// hi!'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// //\"/\\\"/ 44 /\\\"/\"/// //44/'\"\"' 44 '\"\"'/44// 4" + "'", str6, "4 //44/'\"\"' 44 '\"\"'/44// ///\"/\\\"/ 44 /\\\"/\"//'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// hi!'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// //\"/\\\"/ 44 /\\\"/\"/// //44/'\"\"' 44 '\"\"'/44// 4");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray10 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap11 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes12 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray10, variableMap11);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler13 = null;
        char[] charArray21 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap22 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler13, true, charArray21, variableMap22);
        com.google.javascript.jscomp.VariableMap variableMap24 = renamePrototypes23.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes23.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = renamePrototypes23.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes23.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray10, variableMap27);
        com.google.javascript.jscomp.VariableMap variableMap29 = renamePrototypes28.getPropertyMap();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertArrayEquals(charArray21, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap24);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(variableMap29);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"//\\\\\"//\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\"//\\\\\"//\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"//\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\"//\\\"'\"" + "'", str1, "\"'\\\"//\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\"//\\\"'\"");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator13.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator23.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator33.addList(node38, false);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator33.addList(node41, false, context43);
        codeGenerator23.addList(node30, false, context43);
        codeGenerator13.addList(node20, true, context43);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, (int) (short) 1, context43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"///" + "'", str1, "///\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"///");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'\" 44 \"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\" 44 \"'/" + "'", str1, "/'\" 44 \"'/");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addAllSiblings(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator24.addList(node41, true, context52);
        codeGenerator1.addList(node21, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node56, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"/\\\"/ 44 /\\\"/\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray22 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap23 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray22, variableMap23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray11, variableMap25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        char[] charArray35 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, true, charArray35, variableMap36);
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap39 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes41 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray11, variableMap40);
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes41.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes41.getPropertyMap();
        java.lang.Class<?> wildcardClass44 = variableMap43.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(variableMap39);
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//aa//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///aa///" + "'", str1, "///aa///");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"/ 44 /\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"/ 44 /\"/'/" + "'", str2, "/'/\"/ 44 /\"/'/");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addList(node29, false);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator28.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator28.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator43 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator43.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator43.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator43.addList(node48, false, context50);
        codeGenerator28.addList(node40, true, context50);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator56.addList(node64, false, context66);
        codeGenerator28.addList(node53, true, context66);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node26, context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator23.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node29, true, context31);
        codeGenerator11.addList(node20, false, context31);
        codeGenerator2.addList(node8, false, context31);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator16.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node21, false, context23);
        codeGenerator1.addList(node13, true, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator1.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"44\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"44\\\"\"" + "'", str1, "\"\\\"44\\\"\"");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        codeGenerator2.addList(node8, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'//\"\\\\\"hi!\\\\\"\"//'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "\"hi!\"", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/'/\\\"/ 44 /\\\"/'/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'/\\\"/ 44 /\\\"/'/\"" + "'", str1, "\"/'/\\\"/ 44 /\\\"/'/\"");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator30.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator30.addList(node38, true, context40);
        codeGenerator26.addList(node27, false, context40);
        codeGenerator1.addList(node22, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator51.addList(node54, true, context56);
        codeGenerator1.addList(node48, false, context56);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node59, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator29.addList(node38, true, context56);
        codeGenerator1.addList(node26, false, context56);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node70, false, context72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator66.addAllSiblings(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator66.addList(node76, false);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator66.addArrayList(node79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer83 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator84 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer83);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator84.addAllSiblings(node85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator84.addAllSiblings(node87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator84.addList(node89, false);
        com.google.javascript.rhino.Node node92 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context94 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator84.addList(node92, true, context94);
        codeGenerator66.addList(node81, false, context94);
        codeGenerator1.addList(node63, false, context94);
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context94 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context94.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray11 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray11, variableMap12);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler14 = null;
        char[] charArray22 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap23 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler14, true, charArray22, variableMap23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, true, charArray11, variableMap25);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler27 = null;
        char[] charArray35 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap36 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes37 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler27, true, charArray35, variableMap36);
        com.google.javascript.jscomp.VariableMap variableMap38 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap39 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap43 = renamePrototypes37.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes44 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray11, variableMap43);
        com.google.javascript.jscomp.VariableMap variableMap45 = renamePrototypes44.getPropertyMap();
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes44.process(node46, node47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertArrayEquals(charArray22, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertArrayEquals(charArray35, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap38);
        org.junit.Assert.assertNotNull(variableMap39);
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap41);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(variableMap43);
        org.junit.Assert.assertNotNull(variableMap45);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler3 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler5 = null;
        char[] charArray8 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler9 = null;
        char[] charArray17 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap18 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes19 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler9, true, charArray17, variableMap18);
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes19.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes19.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap22 = renamePrototypes19.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes23 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler5, true, charArray8, variableMap22);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler24 = null;
        char[] charArray32 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap33 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes34 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler24, true, charArray32, variableMap33);
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes34.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler3, false, charArray8, variableMap35);
        com.google.javascript.jscomp.VariableMap variableMap37 = renamePrototypes36.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes38 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray2, variableMap37);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray17);
        org.junit.Assert.assertArrayEquals(charArray17, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(variableMap22);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertArrayEquals(charArray32, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(variableMap37);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node29, true, context31);
        codeGenerator1.addList(node16, false, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//\"\\\"hi!\\\"\"//", ' ', "/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/", "\"#'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'hi!\\\" 44 \\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\\\"'\\\\\\\"hi!\\\\\\\"'\\\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'#\"", "/////'\"hi!\"'/////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " ///'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/hi!/////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/// " + "'", str6, " ///'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/hi!/////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/// ");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//" + "'", str2, "//");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator23.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node29, true, context31);
        codeGenerator11.addList(node20, false, context31);
        codeGenerator2.addList(node8, false, context31);
        com.google.javascript.rhino.Node node35 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node21, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator10.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator10.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator10.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator10.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator10.addAllSiblings(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator30.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator30.addList(node36, false, context38);
        codeGenerator10.addList(node27, true, context38);
        codeGenerator1.addList(node7, false, context38);
        java.lang.Class<?> wildcardClass42 = context38.getClass();
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator1.addAllSiblings(node41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node43, (int) (byte) 10, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a////" + "'", str1, "////a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a////");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//\\\"\\\\\\\"hi!\\\\\\\"\\\"//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"" + "'", str1, "\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/" + "'", str1, "/'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator13.addList(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addList(node19, true);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator13.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator13.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator13.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator13.addList(node28, true, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"/" + "'", str1, "/\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"/");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4 //44/'\"\"' 44 '\"\"'/44// ///\"/\\\"/ 44 /\\\"/\"//'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// hi!'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// //\"/\\\"/ 44 /\\\"/\"/// //44/'\"\"' 44 '\"\"'/44// 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4 //44/'\"\"' 44 '\"\"'/44// ///\"/\\\"/ 44 /\\\"/\"//'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// hi!'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// //\"/\\\"/ 44 /\\\"/\"/// //44/'\"\"' 44 '\"\"'/44// 4/" + "'", str2, "/4 //44/'\"\"' 44 '\"\"'/44// ///\"/\\\"/ 44 /\\\"/\"//'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// hi!'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"' //44/'\"\"' 44 '\"\"'/44// //\"/\\\"/ 44 /\\\"/\"/// //44/'\"\"' 44 '\"\"'/44// 4/");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator30 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator30.addList(node31, false);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator30.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator30.addList(node36, true, context38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator30.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator30.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator30.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator50.addList(node53, false);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator50.addList(node56, false, context58);
        codeGenerator30.addList(node47, true, context58);
        codeGenerator21.addList(node27, false, context58);
        codeGenerator1.addList(node18, true, context58);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addAllSiblings(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator66.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator66.addList(node71, false, context73);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node63, (-1), context73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator37.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator47 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator47.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator47.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addList(node57, false);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator56.addList(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator56.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator56.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator56.addList(node68, false);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator56.addAllSiblings(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator76.addArrayList(node77);
        com.google.javascript.rhino.Node node79 = null;
        codeGenerator76.addList(node79, false);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator76.addList(node82, false, context84);
        codeGenerator56.addList(node73, true, context84);
        codeGenerator47.addList(node53, false, context84);
        codeGenerator37.addList(node44, false, context84);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node35, context84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "#\"\\\"aa\\\"\"/4hi!4//\"\\\"hi!\\\"\"\"\\\"aa\\\"\"/ 44 /\"\\\"hi!\\\"\"\"\\\"aa\\\"\"//4hi!4/\"\\\"aa\\\"\"#", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"/" + "'", str1, "/\" \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" 44 \\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\" \"/");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'\"/a /\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/hi!/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ 44 /\\\\\"hi!\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/ a/\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator17.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node35, true, context37);
        codeGenerator17.addList(node26, false, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node14, 10, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/a/ 44 /a/", 'a', "\"\\\"//' \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" '//\\\"\"", "/\"//\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"//\"/", "///\"\\\"hi!\\\"\"///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/a/ 44 /a/a" + "'", str6, "a/a/ 44 /a/a");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator24.addList(node41, true, context52);
        codeGenerator1.addList(node21, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addAllSiblings(node58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("a/a/ 44 /a/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" ///'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/hi!/////'\"hi!\"'//////'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'//'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'/// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" ///'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'//////'\\\"hi!\\\"'//////'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'/hi!/////'\\\"hi!\\\"'//////'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'//'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'/// \"" + "'", str1, "\" ///'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'//////'\\\"hi!\\\"'//////'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'/hi!/////'\\\"hi!\\\"'//////'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'//'//\\\"//\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"//\\\"//'/// \"");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("////'\"hi!\"'////", 'a', "//'\"hi!\"'//", "/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/", "\"/'\\\"hi!\\\"'/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///'\"hi!\"'//hi!//'\"hi!\"'///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/////a" + "'", str6, "a/////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///'\"hi!\"'//hi!//'\"hi!\"'///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/////a");
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/////'\"hi!\"'/////", ' ', "", "\"\\\" 44 \\\"\"", "//\"\\\"hi!\\\"\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " /////\"\\\" 44 \\\"\"hi!\"\\\" 44 \\\"\"///// " + "'", str6, " /////\"\\\" 44 \\\"\"hi!\"\\\" 44 \\\"\"///// ");
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator17.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node23, false, context25);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addArrayList(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#//" + "'", str1, "//#4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4 44 4/'\"hi!\"'///\"\\\"/ 44 /\\\"\"// 44 //\"\\\"/ 44 /\\\"\"///'\"hi!\"'/4#//");
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        char[] charArray3 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray12 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap13 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes14 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray12, variableMap13);
        com.google.javascript.jscomp.VariableMap variableMap15 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap16 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap17 = renamePrototypes14.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray3, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes18.getPropertyMap();
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes18.process(node22, node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap15);
        org.junit.Assert.assertNotNull(variableMap16);
        org.junit.Assert.assertNotNull(variableMap17);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"hi!\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"hi!\\\"\"/" + "'", str1, "/\"\\\"hi!\\\"\"/");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"a/ 44 /a\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"a/ 44 /a\"'" + "'", str2, "'\"a/ 44 /a\"'");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer5 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator6 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator6.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator6.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator6.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator6.addList(node14, true, context16);
        codeGenerator2.addList(node3, false, context16);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator2.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addList(node19);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node21, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node22, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///" + "'", str1, "///#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#///");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"/ 44 /\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"/ 44 /\"///" + "'", str2, "///\"/ 44 /\"///");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray7 = new char[] { 'a' };
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler8 = null;
        char[] charArray16 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap17 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes18 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler8, true, charArray16, variableMap17);
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap20 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap21 = renamePrototypes18.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes22 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray7, variableMap21);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler23 = null;
        char[] charArray31 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap32 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes33 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler23, true, charArray31, variableMap32);
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes33.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes35 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray7, variableMap34);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler36 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler38 = null;
        char[] charArray40 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler41 = null;
        char[] charArray49 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap50 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes51 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler41, true, charArray49, variableMap50);
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap53 = renamePrototypes51.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes54 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler38, false, charArray40, variableMap53);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler55 = null;
        char[] charArray63 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap64 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes65 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler55, true, charArray63, variableMap64);
        com.google.javascript.jscomp.VariableMap variableMap66 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap67 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap68 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes65.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler36, false, charArray40, variableMap69);
        com.google.javascript.jscomp.VariableMap variableMap71 = renamePrototypes70.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap72 = renamePrototypes70.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes73 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray7, variableMap72);
        java.lang.Class<?> wildcardClass74 = renamePrototypes73.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a' });
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(variableMap20);
        org.junit.Assert.assertNotNull(variableMap21);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertArrayEquals(charArray31, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap34);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertArrayEquals(charArray40, new char[] {});
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertArrayEquals(charArray49, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(variableMap53);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertArrayEquals(charArray63, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap66);
        org.junit.Assert.assertNotNull(variableMap67);
        org.junit.Assert.assertNotNull(variableMap68);
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(variableMap71);
        org.junit.Assert.assertNotNull(variableMap72);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator13.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator13.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node28, false, context30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator24.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator24.addList(node38, true);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addList(node45, false);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator44.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator44.addArrayList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator59.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator59.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator59.addList(node64, false, context66);
        codeGenerator44.addList(node56, true, context66);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer71);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator72.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        codeGenerator72.addAllSiblings(node75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator72.addList(node77, false);
        com.google.javascript.rhino.Node node80 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context82 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator72.addList(node80, false, context82);
        codeGenerator44.addList(node69, true, context82);
        codeGenerator24.addList(node41, true, context82);
        codeGenerator13.addList(node21, false, context82);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11, context82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context82 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context82.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator31.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node35, false, context37);
        codeGenerator16.addList(node28, true, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (int) (byte) 100, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"/" + "'", str1, "/\"///a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a///\"/");
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"/\\\\\"/\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\"/\\\\\"/\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"/\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\"/\\\"'\"" + "'", str1, "\"'\\\"/\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\"/\\\"'\"");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node6, false, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator13 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator13.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node24, false, context26);
        codeGenerator13.addList(node17, true, context26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node10, 0, context26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/'\"#\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'hi!\\\\\" 44 \\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'\\\\\"\\'\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\'\\\\\"\\'\\\\\"\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\"\\\\\"\\'#\"'/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\"/4hi!4/\"'", 'a', "", "#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#", "\"4hi!4\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#/4hi!4/#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#a" + "'", str6, "a#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#/4hi!4/#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#a");
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"/" + "'", str2, "/\"\\\" \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\"/\\\\\\\" \\\"\"/");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a//" + "'", str1, "//a\"\\\" 44 \\\"\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ ahi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ aa /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"\\\" 44 \\\"\"a//");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\\\\\" \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\" \\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'\"\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\"\"\\''" + "'", str2, "'\\'\"\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\"\"\\''");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node18, false, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator14.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator14.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addAllSiblings(node32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator29.addList(node34, false, context36);
        codeGenerator14.addList(node26, true, context36);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node12, context36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/'\"\"'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/'\\\"\\\"'/\"" + "'", str1, "\"/'\\\"\\\"'/\"");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addAllSiblings(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        codeGenerator1.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32, false);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator27.addList(node35, true, context37);
        codeGenerator23.addList(node24, false, context37);
        codeGenerator1.addList(node20, true, context37);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator1.addList(node41, false, context52);
        com.google.javascript.rhino.Node node55 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node55, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        char[] charArray6 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler7 = null;
        char[] charArray15 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap16 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes17 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler7, true, charArray15, variableMap16);
        com.google.javascript.jscomp.VariableMap variableMap18 = renamePrototypes17.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap19 = renamePrototypes17.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes20 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, false, charArray6, variableMap19);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler21 = null;
        char[] charArray29 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap30 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes31 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler21, true, charArray29, variableMap30);
        com.google.javascript.jscomp.VariableMap variableMap32 = renamePrototypes31.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap33 = renamePrototypes31.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap34 = renamePrototypes31.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap35 = renamePrototypes31.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes36 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray6, variableMap35);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler37 = null;
        char[] charArray39 = new char[] {};
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler40 = null;
        char[] charArray48 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap49 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes50 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler40, true, charArray48, variableMap49);
        com.google.javascript.jscomp.VariableMap variableMap51 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap52 = renamePrototypes50.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes53 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler37, false, charArray39, variableMap52);
        com.google.javascript.jscomp.VariableMap variableMap54 = renamePrototypes53.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes55 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray6, variableMap54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.rhino.Node node57 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes55.process(node56, node57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap18);
        org.junit.Assert.assertNotNull(variableMap19);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertArrayEquals(charArray29, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap32);
        org.junit.Assert.assertNotNull(variableMap33);
        org.junit.Assert.assertNotNull(variableMap34);
        org.junit.Assert.assertNotNull(variableMap35);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertArrayEquals(charArray39, new char[] {});
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertArrayEquals(charArray48, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap51);
        org.junit.Assert.assertNotNull(variableMap52);
        org.junit.Assert.assertNotNull(variableMap54);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray13 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, false, charArray13, variableMap14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray24 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray24, variableMap25);
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray13, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray37 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap38 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray37, variableMap38);
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray13, variableMap42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        char[] charArray55 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap56 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, false, charArray55, variableMap56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        char[] charArray66 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap67 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, true, charArray66, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler46, true, charArray55, variableMap69);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        char[] charArray79 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap80 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler71, true, charArray79, variableMap80);
        com.google.javascript.jscomp.VariableMap variableMap82 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap83 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap84 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap85 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap86 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap87 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes88 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, false, charArray55, variableMap87);
        com.google.javascript.jscomp.VariableMap variableMap89 = renamePrototypes88.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes90 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray13, variableMap89);
        java.lang.Class<?> wildcardClass91 = charArray13.getClass();
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap41);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap82);
        org.junit.Assert.assertNotNull(variableMap83);
        org.junit.Assert.assertNotNull(variableMap84);
        org.junit.Assert.assertNotNull(variableMap85);
        org.junit.Assert.assertNotNull(variableMap86);
        org.junit.Assert.assertNotNull(variableMap87);
        org.junit.Assert.assertNotNull(variableMap89);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#//" + "'", str2, "//#/////44///\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//// 44 /\"\\\"'\\\\\\\"hi!\\\\\\\"'\\\"\"///44//////44/////#//");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\" 44 \"'", '#', "\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"", "//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//", "#a/ 44 /a#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\" 44 \"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//#" + "'", str6, "#//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//\"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\" 44 \"/\\\"//\\\\\\\"\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\"\\\\\\\"//\\\"/\"//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//#");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'//\"/ 44 /\"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'//\\\"/ 44 /\\\"//'\"" + "'", str2, "\"'//\\\"/ 44 /\\\"//'\"");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler4 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler6 = null;
        char[] charArray13 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap14 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes15 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler6, false, charArray13, variableMap14);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler16 = null;
        char[] charArray24 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap25 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes26 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler16, true, charArray24, variableMap25);
        com.google.javascript.jscomp.VariableMap variableMap27 = renamePrototypes26.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes28 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler4, true, charArray13, variableMap27);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler29 = null;
        char[] charArray37 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap38 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes39 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler29, true, charArray37, variableMap38);
        com.google.javascript.jscomp.VariableMap variableMap40 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap41 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap42 = renamePrototypes39.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes43 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray13, variableMap42);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler44 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler46 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler48 = null;
        char[] charArray55 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap56 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes57 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler48, false, charArray55, variableMap56);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler58 = null;
        char[] charArray66 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap67 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes68 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler58, true, charArray66, variableMap67);
        com.google.javascript.jscomp.VariableMap variableMap69 = renamePrototypes68.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes70 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler46, true, charArray55, variableMap69);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler71 = null;
        char[] charArray79 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap80 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes81 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler71, true, charArray79, variableMap80);
        com.google.javascript.jscomp.VariableMap variableMap82 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap83 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap84 = renamePrototypes81.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes85 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler44, false, charArray55, variableMap84);
        com.google.javascript.jscomp.VariableMap variableMap86 = renamePrototypes85.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes87 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray13, variableMap86);
        com.google.javascript.jscomp.VariableMap variableMap88 = renamePrototypes87.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap89 = renamePrototypes87.getPropertyMap();
        com.google.javascript.rhino.Node node90 = null;
        com.google.javascript.rhino.Node node91 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes87.process(node90, node91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertArrayEquals(charArray24, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap27);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertArrayEquals(charArray37, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap40);
        org.junit.Assert.assertNotNull(variableMap41);
        org.junit.Assert.assertNotNull(variableMap42);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertArrayEquals(charArray55, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertArrayEquals(charArray66, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap69);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertArrayEquals(charArray79, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap82);
        org.junit.Assert.assertNotNull(variableMap83);
        org.junit.Assert.assertNotNull(variableMap84);
        org.junit.Assert.assertNotNull(variableMap86);
        org.junit.Assert.assertNotNull(variableMap88);
        org.junit.Assert.assertNotNull(variableMap89);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        java.lang.Class<?> wildcardClass20 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4" + "'", str1, "4//hi!//hi!///44///hi!/hi!/hi!///44///hi!//hi!//4");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/#/\\\"hi!\\\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"hi!a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"\\\"hi!\\\"/#/\"" + "'", str1, "\"/#/\\\"hi!\\\"a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"hi!a /\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/hi!/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ 44 /\\\"hi!\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/ a\\\"hi!\\\"\\\"hi!\\\"/#/\"");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, false);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator27.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator39.addList(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node45, true, context47);
        codeGenerator27.addList(node36, false, context47);
        codeGenerator18.addList(node24, false, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node14, (int) '4', context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator15.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator15.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node35, true, context37);
        codeGenerator15.addList(node29, false, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator1.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\"//\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\"//\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"//\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\"//\\\"'\"" + "'", str1, "\"'\\\"//\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\"//\\\"'\"");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context6 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node4, true, context6);
        java.lang.Class<?> wildcardClass8 = context6.getClass();
        org.junit.Assert.assertTrue("'" + context6 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context6.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator24.addList(node41, true, context52);
        codeGenerator1.addList(node21, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator1.addAllSiblings(node58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addAllSiblings(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("'4/\\'\"hi!\"\\'///\"\\\\\"/ 44 /\\\\\"\"// 44 //\"\\\\\"/ 44 /\\\\\"\"///\\'\"hi!\"\\'/4'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"/'/\\\"\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\"\\\"/'/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray9 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes11 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray9, variableMap10);
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler12 = null;
        char[] charArray20 = new char[] { '#', '4', '4', 'a', '#', 'a' };
        com.google.javascript.jscomp.VariableMap variableMap21 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes22 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler12, true, charArray20, variableMap21);
        com.google.javascript.jscomp.VariableMap variableMap23 = renamePrototypes22.getPropertyMap();
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes24 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, true, charArray9, variableMap23);
        com.google.javascript.jscomp.VariableMap variableMap25 = renamePrototypes24.getPropertyMap();
        com.google.javascript.jscomp.VariableMap variableMap26 = renamePrototypes24.getPropertyMap();
        java.lang.Class<?> wildcardClass27 = renamePrototypes24.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertArrayEquals(charArray20, new char[] { '#', '4', '4', 'a', '#', 'a' });
        org.junit.Assert.assertNotNull(variableMap23);
        org.junit.Assert.assertNotNull(variableMap25);
        org.junit.Assert.assertNotNull(variableMap26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"'\\\"\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"'\\\"\\\"'\"/" + "'", str1, "/\"'\\\"\\\"'\"/");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''" + "'", str2, "'\\'\"\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\"\"\\''");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!a" + "'", str1, "ahi!a");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        codeGenerator11.addList(node18, false, context31);
        codeGenerator1.addList(node8, true, context31);
        java.lang.Class<?> wildcardClass35 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator42.addList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node48, true, context50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator42.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator42.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator42.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator42.addArrayList(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator42.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer65 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator66 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator66.addList(node67, false);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator66.addList(node70, false, context72);
        com.google.javascript.rhino.Node node74 = null;
        codeGenerator66.addArrayList(node74);
        com.google.javascript.rhino.Node node76 = null;
        codeGenerator66.addArrayList(node76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer80 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator81 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator81.addAllSiblings(node82);
        com.google.javascript.rhino.Node node84 = null;
        codeGenerator81.addAllSiblings(node84);
        com.google.javascript.rhino.Node node86 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context88 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator81.addList(node86, false, context88);
        codeGenerator66.addList(node78, true, context88);
        codeGenerator42.addList(node63, false, context88);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node40, context88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context88 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context88.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node18, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator25.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator25.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator25.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator35.addList(node39, true);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator45.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator45.addList(node50, false);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator45.addList(node53, false, context55);
        codeGenerator35.addList(node42, false, context55);
        codeGenerator25.addList(node32, true, context55);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node22, (int) (byte) 100, context55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator1.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator1.addList(node38);
        com.google.javascript.rhino.Node node40 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node40, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator5.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator5.addList(node9, false, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator5.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator5.addArrayList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator27.addList(node31, false, context33);
        codeGenerator20.addList(node24, true, context33);
        codeGenerator5.addList(node17, true, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node2, (int) (byte) 1, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//'\"hi!\"'//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//'\\\"hi!\\\"'//\"" + "'", str1, "\"//'\\\"hi!\\\"'//\"");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"//' \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" 44 \\\"/\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"/\\\" '//\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"//' \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" '//\\\"/\"" + "'", str1, "\"/\\\"//' \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" 44 \\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\" '//\\\"/\"");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/hi!/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"/hi!/\"//" + "'", str2, "//\"/hi!/\"//");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, true);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/44/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" /////\"\\\" 44 \\\"\"hi!\"\\\" 44 \\\"\"///// ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' /////\"\\\\\" 44 \\\\\"\"hi!\"\\\\\" 44 \\\\\"\"///// '" + "'", str2, "' /////\"\\\\\" 44 \\\\\"\"hi!\"\\\\\" 44 \\\\\"\"///// '");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator21.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator21.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addAllSiblings(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator36.addList(node41, false, context43);
        codeGenerator21.addList(node33, true, context43);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator49.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator49.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context59 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator49.addList(node57, false, context59);
        codeGenerator21.addList(node46, true, context59);
        codeGenerator1.addList(node18, true, context59);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator1.addAllSiblings(node63);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\" 44 \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context59 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context59.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"\\\\\\\"//\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\"//\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\\\\"\"'" + "'", str2, "'\"\\\\\"\\\\\\\\\\\\\"//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"//\\\\\\\\\\\\\"\\\\\"\"'");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/a/ 44 /a/", '#', "/'\"\\\\\"hi!\\\\\"\"'/", "\"'\\\"\\\"'\"", "///\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"///", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/a/ 44 /a/#" + "'", str6, "#/a/ 44 /a/#");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler0 = null;
        com.google.javascript.jscomp.AbstractCompiler abstractCompiler2 = null;
        char[] charArray9 = new char[] { '4', '#', 'a', '#', '4' };
        com.google.javascript.jscomp.VariableMap variableMap10 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes11 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler2, false, charArray9, variableMap10);
        com.google.javascript.jscomp.VariableMap variableMap12 = null;
        com.google.javascript.jscomp.RenamePrototypes renamePrototypes13 = new com.google.javascript.jscomp.RenamePrototypes(abstractCompiler0, false, charArray9, variableMap12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            renamePrototypes13.process(node14, node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', '#', 'a', '#', '4' });
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("////'\"hi!\"'////", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/////'\"hi!\"'/////" + "'", str2, "/////'\"hi!\"'/////");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addAllSiblings(node19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator18.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator18.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator18.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator35.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator35.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator35.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator35.addList(node43, true, context45);
        codeGenerator31.addList(node32, false, context45);
        codeGenerator18.addList(node27, true, context45);
        codeGenerator1.addList(node15, false, context45);
        com.google.javascript.rhino.Node node50 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\"/\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\"/\\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\"'\\\"\"");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "//a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a//", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator1.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator24.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator24.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator24.addList(node36, false);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator24.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, false);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator44.addList(node50, false, context52);
        codeGenerator24.addList(node41, true, context52);
        codeGenerator1.addList(node21, true, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addAllSiblings(node56);
        com.google.javascript.rhino.Node node58 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/#/\"hi!\"a /\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/hi!/\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/ a\"hi!\"hi!a /\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/hi!/\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/ a\"hi!\"\"hi!\"/#/'" + "'", str2, "'/#/\"hi!\"a /\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/hi!/\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/ a\"hi!\"hi!a /\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/hi!/\"/\\\\\"/ 44 /\\\\\"/\"\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"/ 44 /\"hi!\"\"/\\\\\"/ 44 /\\\\\"/\"\"/\\\\\"/ 44 /\\\\\"/\"/ a\"hi!\"\"hi!\"/#/'");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "/\" /\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/hi!/\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"/ \"/", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator1.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"\\\" //44/'\\\\\\\"\\\\\\\"' 44 '\\\\\\\"\\\\\\\"'/44// \\\"\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addList(node27, false);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator26.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator26.addList(node32, true);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator38.addList(node39, false);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator38.addList(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node44, true, context46);
        codeGenerator26.addList(node35, false, context46);
        codeGenerator17.addList(node23, false, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (int) 'a', context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4/" + "'", str1, "/4/4hi!4//#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#////#/\"hi!\"a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"hi!a /\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/hi!/\"/\\\"/ 44 /\\\"/\"\"hi!\"\"/\\\"/ 44 /\\\"/\"/ 44 /\"hi!\"\"/\\\"/ 44 /\\\"/\"\"/\\\"/ 44 /\\\"/\"/ a\"hi!\"\"hi!\"/#//4hi!4/4/");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ '" + "'", str2, "' /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ '");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("4hi!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4hi!4\"" + "'", str1, "\"4hi!4\"");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'/" + "'", str2, "/'/\"\\\\\"\\\\\\\\\\\\\" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" 44 \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/ 44 /\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" \\\\\\\\\\\\\"\\\\\"\"/'/");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node7, true, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator1.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator1.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addArrayList(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator27.addList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator27.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator44.addList(node49, false);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator44.addList(node52, true, context54);
        codeGenerator40.addList(node41, false, context54);
        codeGenerator27.addList(node36, true, context54);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node24, (int) (short) 0, context54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context7 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator1.addList(node5, false, context7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node27, false, context29);
        codeGenerator16.addList(node20, true, context29);
        codeGenerator1.addList(node13, true, context29);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addList(node33, true);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator1.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node38, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context7 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context7.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator1.addList(node15, true);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator1.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator1.addAllSiblings(node20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"'\\\"\\\"'\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"'\\\"\\\"'\"//" + "'", str1, "//\"'\\\"\\\"'\"//");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addList(node17, true);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator23.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator23.addList(node29, true, context31);
        codeGenerator11.addList(node20, false, context31);
        codeGenerator2.addList(node8, false, context31);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator2.addList(node35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addList(node4, false);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("44", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"44\"" + "'", str2, "\"44\"");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("' /\"\\\\\"/ 44 /\\\\\"\"/hi!/\"\\\\\"/ 44 /\\\\\"\"/ '");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"' /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ '\"" + "'", str1, "\"' /\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/hi!/\\\"\\\\\\\\\\\"/ 44 /\\\\\\\\\\\"\\\"/ '\"");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"//44//\"", 'a', "/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/", "//\"\"//", "//\"\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#///44///#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/a" + "'", str6, "a/#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#///44///#///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '/// 44  /\"\\\"/ 44 /\\\"\"/hi!/\"\\\"/ 44 /\\\"\"/ ///' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '//////' \"/\\\\\"/ 44 /\\\\\"/\" 44 \"/\\\\\"/ 44 /\\\\\"/\" '///#/a");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/ 44 /\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/ 44 /\\\\\\\"\\\"\"");
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"" + "'", str1, "\"/\\\"/\\\\\\\"/ 44 /\\\\\\\"/\\\"/\"");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"hi!\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"hi!\"/" + "'", str2, "/\"hi!\"/");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addList(node6, false);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context11 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator1.addList(node9, true, context11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addArrayList(node19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node21, true, context23);
        codeGenerator1.addList(node15, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator29.addArrayList(node32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addArrayList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer45 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator46 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator46.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator46.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator46.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context56 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator46.addList(node54, true, context56);
        codeGenerator42.addList(node43, false, context56);
        codeGenerator29.addList(node38, true, context56);
        codeGenerator1.addList(node26, false, context56);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator1.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node63, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context11 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context11.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context56 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context56.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        codeGenerator1.addList(node8, true, context19);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'//\"\\\\\"/ 44 /\\\\\"\"//'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'//\"\\\\\"/ 44 /\\\\\"\"//'/" + "'", str2, "/'//\"\\\\\"/ 44 /\\\\\"\"//'/");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"////" + "'", str1, "////\"'\\\"\\\\\\\\\\\"hi!\\\\\\\\\\\"\\\"'\"////");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addArrayList(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator1.addAllSiblings(node6);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator1.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator8.addList(node12, false, context14);
        codeGenerator1.addList(node5, true, context14);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addList(node21, false);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator20.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator29.addList(node30, false);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator29.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator29.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator41.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator41.addList(node47, true, context49);
        codeGenerator29.addList(node38, false, context49);
        codeGenerator20.addList(node26, false, context49);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node17, context49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot astRoot0 = null;
        com.google.javascript.jscomp.parsing.Config config2 = null;
        com.google.javascript.jscomp.mozilla.rhino.ErrorReporter errorReporter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.google.javascript.rhino.Node node4 = com.google.javascript.jscomp.parsing.IRFactory.transformTree(astRoot0, "'//\"//\\\\\"\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"\\\\\"//\"//'", config2, errorReporter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"///\\\\\"/ 44 /\\\\\"///\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'\"///\\\\\"/ 44 /\\\\\"///\"'/" + "'", str1, "/'\"///\\\\\"/ 44 /\\\\\"///\"'/");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addList(node3, false);
        com.google.javascript.rhino.Node node6 = null;
        codeGenerator2.addArrayList(node6);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node17, true, context19);
        codeGenerator2.addList(node8, false, context19);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator11.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator11.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node31, true, context33);
        codeGenerator11.addList(node25, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator39.addList(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator39.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer50 = null;
        java.nio.charset.Charset charset51 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator52 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer50, charset51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addAllSiblings(node59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator56.addList(node61, false);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator56.addList(node64, true, context66);
        codeGenerator52.addList(node53, false, context66);
        codeGenerator39.addList(node48, true, context66);
        codeGenerator11.addList(node36, false, context66);
        codeGenerator1.addList(node8, true, context66);
        java.lang.Class<?> wildcardClass72 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
        org.junit.Assert.assertNotNull(wildcardClass72);
    }
}

