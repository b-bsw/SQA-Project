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
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer27 = null;
        java.nio.charset.Charset charset28 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator29 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer27, charset28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator29.addList(node30, true, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator29.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator29.addList(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node43, true, context45);
        codeGenerator29.addList(node38, false, context45);
        codeGenerator19.addList(node25, false, context45);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node47, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer3 = null;
        java.nio.charset.Charset charset4 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator5 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer3, charset4);
        com.google.javascript.rhino.Node node6 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator5.addList(node6, true, context8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator5.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator5.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator5.addList(node16, false, context18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node2, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"4ahi!a4\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4ahi!a4\\\"\"" + "'", str1, "\"\\\"4ahi!a4\\\"\"");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("//hi!//", ' ', "'/\"hi!\"/'", " hi! ", "/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " //hi!// " + "'", str6, " //hi!// ");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node12, (int) '#', context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("// \"hi!\" hi! \"hi!\" //", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'// \"hi!\" hi! \"hi!\" //'" + "'", str2, "'// \"hi!\" hi! \"hi!\" //'");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
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
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("////");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("ahi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/'/\"4ahi!a4\"/'/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
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
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        java.lang.Class<?> wildcardClass56 = context52.getClass();
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" hi! \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" hi! \\\"\"" + "'", str1, "\"\\\" hi! \\\"\"");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("hi!", '#', "#/\"/hi!/\"4ahi!a4\"/hi!/\"/#", "/\"'\\\" hi! \\\"'\"/", "#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#hi!#" + "'", str6, "#hi!#");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, true, context27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addArrayList(node31);
        java.lang.Class<?> wildcardClass33 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/'/\\\"4ahi!a4\\\"/'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"'" + "'", str2, "'\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"'");
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 /", '#', "4ahi!a4", "'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'", "#\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\" /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#/\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/# /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/ 4//4ahi!a4hi!4ahi!a4/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/4ahi!a4hi!4ahi!a4//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//4ahi!a4hi!4ahi!a4/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/4ahi!a4hi!4ahi!a4//4 /#" + "'", str6, "#/ 4//4ahi!a4hi!4ahi!a4/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/4ahi!a4hi!4ahi!a4//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//4ahi!a4hi!4ahi!a4/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/4ahi!a4hi!4ahi!a4//4 /#");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node31, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"a /'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'hi!'/\\\"ahi!a\\\"/' hi! '/\\\"ahi!a\\\"/'/ a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        java.lang.Class<?> wildcardClass3 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("#\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\" /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#/\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/ hi! /\"'\\\" hi! \\\"'\"/# /hi!/ \"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"#");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"ahi!a\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 " + "'", str1, " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node47, true, context49);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"  \"" + "'", str1, "\"  \"");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"\\\"4ahi!a4\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\\\\"4ahi!a4\\\\\"\"/'" + "'", str2, "'/\"\\\\\"4ahi!a4\\\\\"\"/'");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", ' ', "////hi!////", "4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  " + "'", str6, "  ");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
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
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node20, (int) (short) 1, context22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator1.addAllSiblings(node47);
        com.google.javascript.rhino.Node node49 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addAllSiblings(node90);
        com.google.javascript.rhino.Node node92 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node92, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("//hi!//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"//hi!//\"" + "'", str2, "\"//hi!//\"");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" /'\" hi! \"'hi!'\" hi! \"'/ ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/'\\\" hi! \\\"'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"/'\\\" hi! \\\"'/\"/" + "'", str2, "/\"/'\\\" hi! \\\"'/\"/");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node31, false, context33);
        codeGenerator2.addList(node18, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\" hi! \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
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
        codeGenerator1.addList(node5, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("4ahi!a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        java.lang.Class<?> wildcardClass56 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        java.lang.Class<?> wildcardClass26 = context23.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator16.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addList(node28, false);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator27.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator37.addList(node45, false, context47);
        codeGenerator27.addList(node33, true, context47);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node55, true, context57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node59, false, context61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator54.addList(node63);
        com.google.javascript.rhino.Node node65 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context67 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator54.addList(node65, false, context67);
        codeGenerator27.addList(node50, true, context67);
        codeGenerator16.addList(node24, false, context67);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, (int) (short) 10, context67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context67 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context67.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node31, false, context33);
        codeGenerator2.addList(node18, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addList(node40, false);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator39.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator39.addList(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator50.addList(node51, false);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator50.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator60.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator60.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator60.addAllSiblings(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator60.addList(node68, false, context70);
        codeGenerator50.addList(node56, true, context70);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        java.nio.charset.Charset charset76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75, charset76);
        com.google.javascript.rhino.Node node78 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context80 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator77.addList(node78, true, context80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator77.addList(node82, false, context84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator77.addList(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator77.addList(node88, false, context90);
        codeGenerator50.addList(node73, true, context90);
        codeGenerator39.addList(node47, false, context90);
        codeGenerator2.addList(node36, false, context90);
        com.google.javascript.rhino.Node node95 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node95, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context80 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context80.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"ahi!a\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("ahi!a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ahi!a/" + "'", str1, "/ahi!a/");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"a////hi!////a\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"a////hi!////a\\\"\"" + "'", str1, "\"\\\"a////hi!////a\\\"\"");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'\\\" hi! \\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\" hi! \\\"'\"" + "'", str1, "\"'\\\" hi! \\\"'\"");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator14.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator14.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator24.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator24.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator37.addList(node38, true, context40);
        codeGenerator24.addList(node33, false, context40);
        codeGenerator14.addList(node20, true, context40);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (short) 10, context40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/ahi!a/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/ahi!a/\"" + "'", str2, "\"/ahi!a/\"");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context26 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node24, false, context26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator18.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator18.addList(node30, false, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context26 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context26.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\" hi! \"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\" hi! \\\"'\"" + "'", str2, "\"'\\\" hi! \\\"'\"");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("///hi!///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///hi!///" + "'", str1, "///hi!///");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/ \"hi!\" hi! \"hi!\" /");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/ \\\"hi!\\\" hi! \\\"hi!\\\" /\"" + "'", str1, "\"/ \\\"hi!\\\" hi! \\\"hi!\\\" /\"");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator17.addList(node18, true, context20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator17.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator17.addList(node24, false);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator17.addList(node27, false, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node13, 1, context38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator17.addList(node23, true, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator44.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node55, false, context57);
        codeGenerator17.addList(node40, true, context57);
        codeGenerator2.addList(node14, true, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("///hi!///");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node29, true, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, (int) (short) 1, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" 4 / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / hi! / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / 4 \"" + "'", str1, "\" 4 / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / hi! / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / 4 \"");
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# '" + "'", str2, "' #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# '");
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node27, false, context29);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) ' ', context29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(" \"hi!\" hi! \"hi!\" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"/" + "'", str2, "/\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"/");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        com.google.javascript.rhino.Node node4 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##'" + "'", str2, "'##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##'");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/    /");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"/'/\\\"4ahi!a4\\\"/'/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"/'/\\\"4ahi!a4\\\"/'/\"//" + "'", str1, "//\"/'/\\\"4ahi!a4\\\"/'/\"//");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'/\\\"hi!\\\"/'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"" + "'", str1, "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"");
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '#', "/\" hi! \"/", "4//4", "\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##" + "'", str6, "##");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("// \"hi!\" hi! \"hi!\" //");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"///hi!///\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"4/hi!/4\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"4/hi!/4\\\"\"/" + "'", str1, "/\"\\\"4/hi!/4\\\"\"/");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'\" hi! \"'", 'a', "4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4", "// \"hi!\" hi! \"hi!\" //", "////", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a// \"hi!\" hi! \"hi!\" //4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4 hi! 4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4// \"hi!\" hi! \"hi!\" //a" + "'", str6, "a// \"hi!\" hi! \"hi!\" //4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4 hi! 4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4// \"hi!\" hi! \"hi!\" //a");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a" + "'", str1, "a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"ahi!a\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"ahi!a\"/" + "'", str1, "/\"ahi!a\"/");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator2.addList(node92, true);
        java.lang.Class<?> wildcardClass95 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addList(node37, false);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator36.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator36.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator36.addAllSiblings(node46);
        com.google.javascript.rhino.Node node48 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context50 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator36.addList(node48, false, context50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer54 = null;
        java.nio.charset.Charset charset55 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator56 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer54, charset55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator56.addArrayList(node57);
        com.google.javascript.rhino.Node node59 = null;
        codeGenerator56.addList(node59, true);
        com.google.javascript.rhino.Node node62 = null;
        codeGenerator56.addAllSiblings(node62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator56.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator56.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer72 = null;
        java.nio.charset.Charset charset73 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator74 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer72, charset73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context77 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator74.addList(node75, true, context77);
        codeGenerator56.addList(node70, false, context77);
        codeGenerator36.addList(node52, true, context77);
        codeGenerator21.addList(node33, false, context77);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, 10, context77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context50 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context50.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context77 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context77.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/4/hi!/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4/hi!/4/" + "'", str1, "/4/hi!/4/");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", '#', " 4//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44//\"hi!\"/# ahi!a  hi!  ahi!a  hi!  ahi!a  hi!  ahi!a #/\"hi!\"//4 ", "\"a////hi!////a\"", "'\"/hi!/\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "##" + "'", str6, "##");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/ #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# /" + "'", str2, "/ #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# /");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4ahi!a4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"4ahi!a4\"/" + "'", str2, "/\"4ahi!a4\"/");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'" + "'", str2, "'\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"'");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"" + "'", str1, "\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node35, true, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node39, false, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node30, (int) (byte) 0, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
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
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" ///4ahi!a4/// ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90);
        com.google.javascript.rhino.Node node92 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context94 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node92, (int) '#', context94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context94 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context94.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/hi!/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/hi!/\"" + "'", str2, "\"/hi!/\"");
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"4 hi! 4\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node31, false, context33);
        codeGenerator2.addList(node18, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator39.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator39.addAllSiblings(node42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node49, true, context51);
        com.google.javascript.rhino.Node node53 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context55 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node53, false, context55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator48.addList(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator48.addList(node59, false, context61);
        codeGenerator39.addList(node44, true, context61);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36, context61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context55 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context55.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"/" + "'", str1, "/\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"/");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"'/\\\"4ahi!a4\\\"/'\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, true, context21);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15, context21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 " + "'", str1, " 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"4ahi!a4\\\\\"\"/'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"\\\\\"4ahi!a4\\\\\"\"/'/" + "'", str1, "/'/\"\\\\\"4ahi!a4\\\\\"\"/'/");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"\\\"4ahi!a4\\\"\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator1.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4 hi! 4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/4 hi! 4/" + "'", str2, "/4 hi! 4/");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\"4ahi!a4\"/'", '#', "\"\\\"\\\"\"", "/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/", "'\"///hi!///\"'", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\"\"4ahi!a4\"\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/#" + "'", str6, "#/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\"\"4ahi!a4\"\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/#");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\" 4 / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / hi! / \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" /hi!/ \\\"hi!\\\" hi! \\\"hi!\\\" /'/\\\"hi!\\\"/'4ahi!a4'/\\\"hi!\\\"/'/ \\\"hi!\\\" hi! \\\"hi!\\\" / 4 \"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\" 4 / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / hi! / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / 4 \"'" + "'", str2, "'\" 4 / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / hi! / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / 4 \"'");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/ahi!a/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator17.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator17.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator17.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addList(node40, true);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator37.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator37.addList(node45, false, context47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator37.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node56, true, context58);
        codeGenerator37.addList(node51, false, context58);
        codeGenerator17.addList(node33, true, context58);
        codeGenerator2.addList(node14, false, context58);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addList(node63, true);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer68 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator69 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator69.addList(node70, false);
        com.google.javascript.rhino.Node node73 = null;
        codeGenerator69.addAllSiblings(node73);
        com.google.javascript.rhino.Node node75 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer77 = null;
        java.nio.charset.Charset charset78 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator79 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer77, charset78);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator79.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        codeGenerator79.addList(node82, true);
        com.google.javascript.rhino.Node node85 = null;
        codeGenerator79.addAllSiblings(node85);
        com.google.javascript.rhino.Node node87 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context89 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator79.addList(node87, false, context89);
        codeGenerator69.addList(node75, true, context89);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node66, 0, context89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context89 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context89.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"'/\\\"4ahi!a4\\\"/'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'/\\\"4ahi!a4\\\"/'\"" + "'", str1, "\"'/\\\"4ahi!a4\\\"/'\"");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//" + "'", str1, "//aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa//");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/  /" + "'", str2, "/  /");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/ #4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4 hi! 4/\"ahi!a\"///#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/4ahi!a4/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#///\"ahi!a\"/4# /");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'\" 4 / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / hi! / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / 4 \"'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("  ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"  \"" + "'", str2, "\"  \"");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"\\\"/hi!/\\\"\"", 'a', "/\"ahi!a\"/", "#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#", "4/hi!/4", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/\"ahi!a\"/4/hi!/4/\"ahi!a\"//hi!/4/hi!/4/\"ahi!a\"//\"ahi!a\"/a" + "'", str6, "a/\"ahi!a\"/4/hi!/4/\"ahi!a\"//hi!/4/hi!/4/\"ahi!a\"//\"ahi!a\"/a");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("a////hi!////a", ' ', "'\" hi! \"'", "'\"/hi!/\"'", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " a////hi!////a " + "'", str6, " a////hi!////a ");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addList(node8);
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/" + "'", str1, "/'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'/");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"\"'" + "'", str2, "'\"\\\\\"/\\\\\\\\\\\\\"hi!\\\\\\\\\\\\\"/\\\\\"\"'");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        codeGenerator21.addList(node35, false, context42);
        codeGenerator1.addList(node17, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node48, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "' \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" '" + "'", str2, "' \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" '");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/ahi!a/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/ahi!a/\"'" + "'", str2, "'\"/ahi!a/\"'");
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
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addAllSiblings(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator26.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator26.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator26.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator26.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator26.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator41 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator41.addList(node42, false);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator41.addAllSiblings(node45);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer49 = null;
        java.nio.charset.Charset charset50 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator51 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer49, charset50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator51.addArrayList(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator51.addList(node54, true);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator51.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context61 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator51.addList(node59, false, context61);
        codeGenerator41.addList(node47, true, context61);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer66 = null;
        java.nio.charset.Charset charset67 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator68 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer66, charset67);
        com.google.javascript.rhino.Node node69 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context71 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator68.addList(node69, true, context71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator68.addList(node73, false, context75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator68.addList(node77);
        com.google.javascript.rhino.Node node79 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context81 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator68.addList(node79, false, context81);
        codeGenerator41.addList(node64, true, context81);
        codeGenerator26.addList(node38, true, context81);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node22, (int) '#', context81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context61 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context61.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context71 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context71.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context81 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context81.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" 4 / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / hi! / \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" /hi!/ \"hi!\" hi! \"hi!\" /'/\"hi!\"/'4ahi!a4'/\"hi!\"/'/ \"hi!\" hi! \"hi!\" / 4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, false, context27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node27, false, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator22.addList(node31, false, context33);
        codeGenerator2.addList(node18, false, context33);
        com.google.javascript.rhino.Node node36 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator9.addList(node18, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node5, (int) (byte) 100, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"4/hi!/4\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, true);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"'\\\" hi! \\\"'\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'\\\\\\\" hi! \\\\\\\"'\\\"\"" + "'", str1, "\"\\\"'\\\\\\\" hi! \\\\\\\"'\\\"\"");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"4ahi!a4\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/", '4', "\"/\\\"hi!\\\"/\"", "/\"4ahi!a4\"/", "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/#/\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"4ahi!a4\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"/#/4" + "'", str6, "4/#/\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"4ahi!a4\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"/#/4");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/" + "'", str1, "/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/");
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("    ", 'a', "/    /", "\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"", "a/\"ahi!a\"/4/hi!/4/\"ahi!a\"//hi!/4/hi!/4/\"ahi!a\"//\"ahi!a\"/a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a    a" + "'", str6, "a    a");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'// \"hi!\" hi! \"hi!\" //'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node16, (int) (byte) 10, context18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node14, true, context16);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/// \"hi!\" hi! \"hi!\" ///", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//// \"hi!\" hi! \"hi!\" ////" + "'", str2, "//// \"hi!\" hi! \"hi!\" ////");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator21.addList(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer38 = null;
        java.nio.charset.Charset charset39 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator40 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer38, charset39);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context43 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node41, true, context43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator40.addList(node45, false, context47);
        codeGenerator21.addList(node36, true, context47);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, (int) (short) 1, context47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context43 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context43.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context8 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context8.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/'/\"4ahi!a4\"/'/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'/\"4ahi!a4\"/'/" + "'", str1, "/'/\"4ahi!a4\"/'/");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("##", 'a', "a/\"hi!\"ahi!a\"hi!\"/a", "'/\"hi!\"/'", "\"/4/hi!/4/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a##a" + "'", str6, "a##a");
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\"4/hi!/4\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, true, context27);
        java.lang.Class<?> wildcardClass31 = context27.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addArrayList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator34.addList(node37, true);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addAllSiblings(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context44 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator34.addList(node42, false, context44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer48 = null;
        java.nio.charset.Charset charset49 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator50 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer48, charset49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context53 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator50.addList(node51, true, context53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator50.addList(node55, false, context57);
        codeGenerator34.addList(node46, true, context57);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node30, 1, context57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context44 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context44.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context53 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context53.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator16.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator16.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator16.addList(node22, false, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator16.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context30 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator16.addList(node28, false, context30);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addLeftExpr(node13, (int) '#', context30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context30 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context30.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator2.addArrayList(node38);
        java.lang.Class<?> wildcardClass40 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, false, context13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("aahi!aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"aahi!aa\"" + "'", str2, "\"aahi!aa\"");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a/" + "'", str1, "/a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a/");
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator17.addList(node23, true, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator44.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node55, false, context57);
        codeGenerator17.addList(node40, true, context57);
        codeGenerator2.addList(node14, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addAllSiblings(node63);
        com.google.javascript.rhino.Node node65 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//" + "'", str1, "//");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4//4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4//4/" + "'", str1, "/4//4/");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/" + "'", str1, "/\"/\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"/\"/");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"/ahi!a/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"/ahi!a/\\\"\"" + "'", str1, "\"\\\"/ahi!a/\\\"\"");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/ hi! /\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/ hi! /\"'" + "'", str2, "'\"/ hi! /\"'");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("////hi!////");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator9.addAllSiblings(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator9.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator9.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer23 = null;
        java.nio.charset.Charset charset24 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator25 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer23, charset24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator25.addList(node26, true, context28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator25.addList(node30, false, context32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator25.addList(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator25.addList(node36, false, context38);
        codeGenerator9.addList(node21, true, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node5, (int) '4', context38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node20, false, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator15.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node26, false, context28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node35, true, context37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node39, false, context41);
        codeGenerator15.addList(node30, true, context41);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node12, context41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\"/" + "'", str1, "/\"\"/");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"" + "'", str1, "\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"");
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" ///4ahi!a4/// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ///4ahi!a4/// " + "'", str1, " ///4ahi!a4/// ");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator21.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator21.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node31, true, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, false, context18);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addArrayList(node21);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator1.addAllSiblings(node13);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\" hi! \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator17.addList(node23, true, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node15, context37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"" + "'", str1, "\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, true, context18);
        codeGenerator2.addList(node11, false, context18);
        com.google.javascript.rhino.Node node21 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"/'/\\\"4ahi!a4\\\"/'/\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"/'" + "'", str2, "'/\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"/'");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"//" + "'", str2, "//\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"//");
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"///" + "'", str2, "///\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"///");
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'" + "'", str1, "'\"//\\\\\"4#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"#/\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\"/#4\\\\\"//\"'");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/'#\" hi! \" hi! \" hi! \"#'/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"///" + "'", str1, "///\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"///");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("//'\\'#\" hi! \" hi! \" hi! \"#\\''//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//'\\'#\" hi! \" hi! \" hi! \"#\\''//" + "'", str1, "//'\\'#\" hi! \" hi! \" hi! \"#\\''//");
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"hi!\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"hi!\"/'/" + "'", str2, "/'/\"hi!\"/'/");
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'#\" hi! \" hi! \" hi! \"#'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'#\" hi! \" hi! \" hi! \"#'/" + "'", str2, "/'#\" hi! \" hi! \" hi! \"#'/");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, true);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer15 = null;
        java.nio.charset.Charset charset16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer15, charset16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator24.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator24.addList(node27, true);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator24.addAllSiblings(node30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator24.addList(node32, false, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator24.addList(node36, true, context38);
        codeGenerator17.addList(node20, true, context38);
        codeGenerator2.addList(node13, true, context38);
        com.google.javascript.rhino.Node node42 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addAllSiblings(node90);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator2.addAllSiblings(node92);
        com.google.javascript.rhino.Node node94 = null;
        codeGenerator2.addList(node94);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
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
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator20.addArrayList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator20.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator20.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator20.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer32 = null;
        java.nio.charset.Charset charset33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer32, charset33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node35, true, context37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator34.addAllSiblings(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator34.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator34.addList(node44, true, context46);
        codeGenerator20.addList(node30, false, context46);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node16, (-1), context46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"/'\\\" hi! \\\"'/\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"/'\\\\\\\" hi! \\\\\\\"'/\\\"/\"" + "'", str1, "\"/\\\"/'\\\\\\\" hi! \\\\\\\"'/\\\"/\"");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4//4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"4//4\"/" + "'", str2, "/\"4//4\"/");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        java.nio.charset.Charset charset8 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator9 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7, charset8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node10, true, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator9.addList(node14, false, context16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator9.addList(node18, false, context20);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node5, (int) (byte) 100, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context20 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context20.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator22.addList(node23, true, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator22.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator22.addList(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        java.nio.charset.Charset charset34 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator35 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33, charset34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator35.addList(node36, true, context38);
        codeGenerator22.addList(node31, false, context38);
        codeGenerator12.addList(node18, true, context38);
        codeGenerator1.addList(node9, false, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\"\\\\\"4ahi!a4\\\\\"\"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\"\\\\\"4ahi!a4\\\\\"\"/'/" + "'", str2, "/'/\"\\\\\"4ahi!a4\\\\\"\"/'/");
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"//\"" + "'", str1, "\"//\"");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aahi!aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/aahi!aa/" + "'", str2, "/aahi!aa/");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4 hi! 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"\"//" + "'", str1, "//\"\"//");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("4 hi! 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/4 hi! 4/" + "'", str1, "/4 hi! 4/");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"///hi!///\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"///hi!///\\\"/\"" + "'", str1, "\"/\\\"///hi!///\\\"/\"");
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10, false);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("a    a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node33, true, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator32.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator32.addList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator32.addList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator32.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer47 = null;
        java.nio.charset.Charset charset48 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator49 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer47, charset48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator49.addList(node50, true, context52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator49.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator49.addList(node56, false);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator63.addList(node64, true, context66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context70 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator63.addList(node68, false, context70);
        codeGenerator49.addList(node59, false, context70);
        codeGenerator32.addList(node45, false, context70);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node28, (int) (short) -1, context70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context70 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context70.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node39, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        com.google.javascript.jscomp.CodeConsumer codeConsumer7 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator8 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator8.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator8.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator8.addList(node14, false, context16);
        codeGenerator1.addList(node5, true, context16);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node19, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("'/\" hi! \"/'", '#', "/'\\'#\" hi! \" hi! \" hi! \"#\\''/", "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"", "\"/'/\\\"4ahi!a4\\\"/'/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//'\\'#\" hi! \" hi! \" hi! \"#\\''/ hi! /'\\'#\" hi! \" hi! \" hi! \"#\\''//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"#" + "'", str6, "#\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//'\\'#\" hi! \" hi! \" hi! \"#\\''/ hi! /'\\'#\" hi! \" hi! \" hi! \"#\\''//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"#");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"hi!\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"hi!\"'" + "'", str2, "'\"hi!\"'");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node23, false, context25);
        codeGenerator2.addList(node14, true, context25);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator33.addArrayList(node34);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator33.addList(node36, true);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator33.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator33.addList(node41, true);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer46 = null;
        java.nio.charset.Charset charset47 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator48 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer46, charset47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator48.addArrayList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        com.google.javascript.rhino.Node node67 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context69 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator55.addList(node67, true, context69);
        codeGenerator48.addList(node51, true, context69);
        codeGenerator33.addList(node44, true, context69);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node30, context69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context69 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context69.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"/ahi!a/\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"/ahi!a/\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"/ahi!a/\\\\\\\"\\\"\"");
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node24, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"//\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"//\\\\\"\"'" + "'", str2, "'\"\\\\\"//\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"//\\\\\"\"'");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("'/\"hi!\"/'");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/'/\"\\\\\"4ahi!a4\\\\\"\"/'/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addList(node5, false);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        codeGenerator2.addList(node7, true, context14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node10, (int) (short) 10, context12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'" + "'", str2, "'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'");
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("", 'a', "'/\"/\\'/\\\\\"4ahi!a4\\\\\"/\\'/\"/'", "/\"\\\"///hi!///\\\"\"/", "\"/hi!/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aa" + "'", str6, "aa");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        java.lang.Class<?> wildcardClass21 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("##", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/##/" + "'", str2, "/##/");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/    /");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" ///4ahi!a4/// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ ///4ahi!a4/// /" + "'", str1, "/ ///4ahi!a4/// /");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("aa", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/aa/" + "'", str2, "/aa/");
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("4/#/\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"4ahi!a4\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"/#/4", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'4/#/\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"4ahi!a4\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"/#/4'" + "'", str2, "'4/#/\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"4ahi!a4\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"/#/4'");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator19.addList(node29, false, context40);
        codeGenerator2.addList(node15, false, context40);
        java.lang.Class<?> wildcardClass44 = context40.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addList(node17, false);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"a////hi!////a\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"a////hi!////a\\\\\"\"'" + "'", str2, "'\"\\\\\"a////hi!////a\\\\\"\"'");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"hi!\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"hi!\\\"'\"" + "'", str1, "\"'\\\"hi!\\\"'\"");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.IN_FOR_INIT_CLAUSE));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"" + "'", str1, "\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addArrayList(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/\\\"/'\\\\\\\" hi! \\\\\\\"'/\\\"/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\\\\"/\\'\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"\\'/\\\\\"/\"'" + "'", str2, "'\"/\\\\\"/\\'\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\"\\'/\\\\\"/\"'");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("///hi!///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "////hi!////" + "'", str1, "////hi!////");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator2.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator2.addAllSiblings(node36);
        java.lang.Class<?> wildcardClass38 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("'\"/ hi! /\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"'\\\"/ hi! /\\\"'\"" + "'", str2, "\"'\\\"/ hi! /\\\"'\"");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\" hi! \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator34.addList(node40, false, context42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator34.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator34.addList(node46, false, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        java.nio.charset.Charset charset53 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator54 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52, charset53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator54.addArrayList(node55);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator54.addList(node57, true);
        com.google.javascript.rhino.Node node60 = null;
        codeGenerator54.addAllSiblings(node60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator54.addList(node62, false, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator54.addList(node66);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        codeGenerator54.addList(node68, false, context75);
        codeGenerator34.addList(node50, true, context75);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node32, context75);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/'/\"\\\\\"4ahi!a4\\\\\"\"/'/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//'/\"\\\\\"4ahi!a4\\\\\"\"/'//" + "'", str2, "//'/\"\\\\\"4ahi!a4\\\\\"\"/'//");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"/" + "'", str2, "/\"\\\"//\\\\\\\"4#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\"/#4\\\\\\\"//\\\"\"/");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, false);
        com.google.javascript.rhino.Node node8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape(" ///4ahi!a4/// ", '4', "a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a", " hi! ", "//\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"//", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4 ///4ahi!a4/// 4" + "'", str6, "4 ///4ahi!a4/// 4");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'4#/\"/hi!/\"4ahi!a4\"/hi!/\"/#\"4ahi!a4\" hi! \"4ahi!a4\"#/\"/hi!/\"4ahi!a4\"/hi!/\"/#4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4'\"" + "'", str1, "\"'4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4'\"");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\" ahi!a \"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/  /" + "'", str1, "/  /");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"4/hi!/4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"4/hi!/4\"" + "'", str1, "\"4/hi!/4\"");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("a// \"hi!\" hi! \"hi!\" //4/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" /////#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#/4ahi!a4/#/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //4ahi!a4'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///hi!/'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///#///'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" //ahi!a'#\" hi! \" hi! \" hi! \"#'// \"hi!\" hi! \"hi!\" ///4// \"hi!\" hi! \"hi!\" //a");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add(node59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"\"//", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "///\"\"///" + "'", str2, "///\"\"///");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        java.nio.charset.Charset charset17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16, charset17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node19, true, context21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator18.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator18.addList(node29, false, context31);
        codeGenerator2.addList(node14, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node34, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/ ///4ahi!a4/// /", '#', "", "\"/ hi! /\"", "\"/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/\"", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#/ ///4ahi!a4/// /#" + "'", str6, "#/ ///4ahi!a4/// /#");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"aahi!aa\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/\\\"\\\"/\"" + "'", str1, "\"/\\\"\\\"/\"");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a    a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a    a/" + "'", str2, "/a    a/");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a/\"hi!\"ahi!a\"hi!\"/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a/\"hi!\"ahi!a\"hi!\"/a'" + "'", str2, "'a/\"hi!\"ahi!a\"hi!\"/a'");
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, true, context27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator1.addAllSiblings(node33);
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/'" + "'", str2, "'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/'");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        com.google.javascript.rhino.Node node4 = null;
        codeGenerator1.addAllSiblings(node4);
        com.google.javascript.rhino.Node node6 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node6, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        com.google.javascript.rhino.Node node18 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"/ahi!a/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"/ahi!a/\\\"\"/" + "'", str2, "/\"\\\"/ahi!a/\\\"\"/");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a    a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/a    a/" + "'", str1, "/a    a/");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"" + "'", str1, "\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node7, false, context9);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/#/\"/hi!/\"4ahi!a4\"/hi!/\"/#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"/" + "'", str2, "/\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"/");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        java.lang.Class<?> wildcardClass13 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"/" + "'", str2, "/\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"/");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("//\"//\\\"4#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#\\\\\\\"4ahi!a4\\\\\\\" hi! \\\\\\\"4ahi!a4\\\\\\\"#/\\\\\\\"/hi!/\\\\\\\"4ahi!a4\\\\\\\"/hi!/\\\\\\\"/#4\\\"//\"//");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node31, false, context33);
        codeGenerator19.addList(node22, false, context33);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'a/\"hi!\"ahi!a\"hi!\"/a'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'a/\\\"hi!\\\"ahi!a\\\"hi!\\\"/a'\"" + "'", str1, "\"'a/\\\"hi!\\\"ahi!a\\\"hi!\\\"/a'\"");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator23.addList(node35, true, context37);
        codeGenerator2.addList(node19, false, context37);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'/\\\"hi!\\\"/'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node10, context32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addArrayList(node26);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node28, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
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
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, false, context27);
        com.google.javascript.rhino.Node node31 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer24 = null;
        java.nio.charset.Charset charset25 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator26 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer24, charset25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context29 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node27, true, context29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator26.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context39 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator26.addList(node37, false, context39);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node22, (int) 'a', context39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context29 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context29.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context39 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context39.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\"///hi!///\"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\"///hi!///\\\"'\"" + "'", str1, "\"'\\\"///hi!///\\\"'\"");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator15.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator15.addList(node18, true);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator15.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context25 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator15.addList(node23, false, context25);
        com.google.javascript.rhino.Node node27 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer29 = null;
        java.nio.charset.Charset charset30 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator31 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer29, charset30);
        com.google.javascript.rhino.Node node32 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context34 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node32, true, context34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator31.addList(node36, false, context38);
        codeGenerator15.addList(node27, true, context38);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (byte) 10, context38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context25 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context25.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context34 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context34.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'/\"\\\\\"4ahi!a4\\\\\"\"/'/", 'a', "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"", "4 ///4ahi!a4/// 4", "a    a", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a" + "'", str6, "a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("4//4");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//" + "'", str2, "//\"\\\"\\\\\\\"/\\\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\\\"/\\\\\\\"\\\"\"//");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'// \"hi!\" hi! \"hi!\" //'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node52, false, context54);
        codeGenerator34.addList(node40, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator34.addList(node57, true, context74);
        codeGenerator19.addList(node31, true, context74);
        codeGenerator2.addList(node15, true, context74);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("'\"/ hi! /\"'");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4/#/\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"4ahi!a4\"/\\\"hi!\\\"/\"/hi!/\"/\\\"hi!\\\"/\"/#/4", ' ', "a////hi!////a", "/a    a/", "    ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 " + "'", str6, " 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 ");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a'" + "'", str2, "'a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a'");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node14, true, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\" hi! \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"/'\\\" hi! \\\"'/\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"/\\'\\\\\" hi! \\\\\"\\'/\"'" + "'", str2, "'\"/\\'\\\\\" hi! \\\\\"\\'/\"'");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"\\\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("\"\\\"/ahi!a/\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\"\\\\\"/ahi!a/\\\\\"\"'" + "'", str2, "'\"\\\\\"/ahi!a/\\\\\"\"'");
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape(" \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/ \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" /" + "'", str1, "/ \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" /");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'/\" hi! \"/'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'/\" hi! \"/'/" + "'", str2, "/'/\" hi! \"/'/");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("/'\" hi! \"'/", 'a', "\" ahi!a \"", "/\" hi! \"/", "", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a//\" hi! \"/\" ahi!a \" hi! \" ahi!a \"/\" hi! \"//a" + "'", str6, "a//\" hi! \"/\" ahi!a \" hi! \" ahi!a \"/\" hi! \"//a");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"a////hi!////a\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a////hi!////a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a////hi!////a/" + "'", str2, "/a////hi!////a/");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" ///4ahi!a4/// ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" ///4ahi!a4/// \"" + "'", str2, "\" ///4ahi!a4/// \"");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"" + "'", str1, "\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"4 /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ hi! /'/\\\"4ahi!a4\\\"/'/hi!/'/\\\"4ahi!a4\\\"/'/ 4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"4 /'/\\\\\\\"4ahi!a4\\\\\\\"/'/hi!/'/\\\\\\\"4ahi!a4\\\\\\\"/'/ hi! /'/\\\\\\\"4ahi!a4\\\\\\\"/'/hi!/'/\\\\\\\"4ahi!a4\\\\\\\"/'/ 4\\\"\"" + "'", str1, "\"\\\"4 /'/\\\\\\\"4ahi!a4\\\\\\\"/'/hi!/'/\\\\\\\"4ahi!a4\\\\\\\"/'/ hi! /'/\\\\\\\"4ahi!a4\\\\\\\"/'/hi!/'/\\\\\\\"4ahi!a4\\\\\\\"/'/ 4\\\"\"");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("///\"\"///");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node23, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape(" hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi! " + "'", str1, " hi! ");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addArrayList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node18, (int) (short) 10, context20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString(" 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 ", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\" 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 \"" + "'", str2, "\" 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 \"");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/\\\"///hi!///\\\"/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/\" /'\\\" hi! \\\"'hi!'\\\" hi! \\\"'/ \"/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator2.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addArrayList(node26);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'\\\"///hi!///\\\"'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addList(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addAllSiblings(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator2.addList(node25, false);
        com.google.javascript.rhino.Node node28 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node28, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13, context14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber(" //hi!// ");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addAllSiblings(node28);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"4//4\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("///\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"///");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context49 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node47, true, context49);
        com.google.javascript.rhino.Node node51 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context49 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context49.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addCaseBody(node9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context8 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator21.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node50, false, context52);
        codeGenerator32.addList(node38, true, context52);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, true, context62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator59.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node70, false, context72);
        codeGenerator32.addList(node55, true, context72);
        codeGenerator21.addList(node29, false, context72);
        codeGenerator2.addList(node18, true, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"/hi!/\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"'\\\"///hi!///\\\"'\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'\"\\\\\"//\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"//\\\\\"\"'", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/'\"\\\\\"//\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"//\\\\\"\"'/" + "'", str2, "/'\"\\\\\"//\\\\\\\\\\\\\"4#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" hi! \\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"#/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/hi!/\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"/#4\\\\\\\\\\\\\"//\\\\\"\"'/");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"\\\"\\\\\\\"/ahi!a/\\\\\\\"\\\"\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/aahi!aa/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        java.lang.Class<?> wildcardClass9 = codeGenerator2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("'\" 4 / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / hi! / \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /hi!/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" /\\'/\\\\\"hi!\\\\\"/\\'4ahi!a4\\'/\\\\\"hi!\\\\\"/\\'/ \\\\\"hi!\\\\\" hi! \\\\\"hi!\\\\\" / 4 \"'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"'\\\" 4 / \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /hi!/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" / hi! / \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /hi!/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" / 4 \\\"'\"" + "'", str1, "\"'\\\" 4 / \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /hi!/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" / hi! / \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /hi!/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" /\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'4ahi!a4\\\\'/\\\\\\\\\\\"hi!\\\\\\\\\\\"/\\\\'/ \\\\\\\\\\\"hi!\\\\\\\\\\\" hi! \\\\\\\\\\\"hi!\\\\\\\\\\\" / 4 \\\"'\"");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("4aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa4");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node26, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer34 = null;
        java.nio.charset.Charset charset35 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator36 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer34, charset35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator36.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        codeGenerator36.addArrayList(node39);
        com.google.javascript.rhino.Node node41 = null;
        codeGenerator36.addArrayList(node41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator36.addAllSiblings(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator36.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator36.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator36.addArrayList(node50);
        com.google.javascript.rhino.Node node52 = null;
        codeGenerator36.addAllSiblings(node52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator36.addAllSiblings(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer58 = null;
        java.nio.charset.Charset charset59 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator60 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer58, charset59);
        com.google.javascript.rhino.Node node61 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context63 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator60.addList(node61, true, context63);
        com.google.javascript.rhino.Node node65 = null;
        codeGenerator60.addArrayList(node65);
        com.google.javascript.rhino.Node node67 = null;
        codeGenerator60.addList(node67);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator60.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        codeGenerator60.addArrayList(node71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer75 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator76 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer75);
        com.google.javascript.rhino.Node node77 = null;
        codeGenerator76.addList(node77, false);
        com.google.javascript.rhino.Node node80 = null;
        codeGenerator76.addArrayList(node80);
        com.google.javascript.rhino.Node node82 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context84 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator76.addList(node82, false, context84);
        com.google.javascript.rhino.Node node86 = null;
        codeGenerator76.addAllSiblings(node86);
        com.google.javascript.rhino.Node node88 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context90 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator76.addList(node88, false, context90);
        codeGenerator60.addList(node73, true, context90);
        codeGenerator36.addList(node56, false, context90);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node33, context90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context63 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context63.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context84 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context84.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context90 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context90.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11, true);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context16 = com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT;
        codeGenerator2.addList(node14, false, context16);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context16 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT + "'", context16.equals(com.google.javascript.jscomp.CodeGenerator.Context.STATEMENT));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
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
        codeGenerator27.addArrayList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator27.addList(node33, false, context35);
        codeGenerator20.addList(node24, true, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node17, (int) (byte) 100, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addAllSiblings(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26, false);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        java.nio.charset.Charset charset32 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator33 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31, charset32);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context36 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node34, true, context36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context40 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator33.addList(node38, false, context40);
        codeGenerator19.addList(node29, false, context40);
        codeGenerator2.addList(node15, false, context40);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator2.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context36 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context36.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context40 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context40.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addArrayList(node18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator2.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator2.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"aahi!aa\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/" + "'", str2, "/\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"/");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber(" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"'a/\\\"hi!\\\"ahi!a\\\"hi!\\\"/a'\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/\"44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44\"/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        java.lang.Class<?> wildcardClass15 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node33, false, context35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator28.addList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node39, false, context41);
        codeGenerator1.addList(node24, true, context41);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator1.addList(node44, true);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator1.addArrayList(node47);
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"" + "'", str1, "\"\\\"\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\"\\\\\\\\\\\\\\\"\\\\\\\"\\\"\"");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        java.lang.Class<?> wildcardClass18 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node52, false, context54);
        codeGenerator34.addList(node40, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator34.addList(node57, true, context74);
        codeGenerator19.addList(node31, true, context74);
        codeGenerator2.addList(node15, true, context74);
        com.google.javascript.rhino.Node node79 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node79, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/a    a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//a    a//" + "'", str1, "//a    a//");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#/" + "'", str2, "/#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#/");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator1.addList(node12, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, false);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("' \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" '", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "'\\' \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" \\''" + "'", str2, "'\\' \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" \\''");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"4//4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4//4\"/" + "'", str1, "/\"4//4\"/");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/#/\"hi!\"/hi!/\"hi!\"//hi!/hi!/\"hi!\"//\"hi!\"/#/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.identifierEscape("/\"\\\"/ahi!a/\\\"\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"\\\"/ahi!a/\\\"\"/" + "'", str1, "/\"\\\"/ahi!a/\\\"\"/");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("\"/'/\\\"4ahi!a4\\\"/'/\"", '4', "/\"///hi!///\"/", "\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"", "hi!", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4" + "'", str6, "4/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"/hi!/\"///hi!///\"/4ahi!a4hi!/\"///hi!///\"//\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"//\"///hi!///\"/4");
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("a/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/4ahi!a4'/\"ahi!a\"/'/\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"//\"\\\"\\\\\\\"4ahi!a4\\\\\\\"\\\"\"/a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"a/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/'/\\\"ahi!a\\\"/'/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/4ahi!a4'/\\\"ahi!a\\\"/'/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/a\"" + "'", str1, "\"a/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/'/\\\"ahi!a\\\"/'/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/4ahi!a4'/\\\"ahi!a\\\"/'/\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"//\\\"\\\\\\\"\\\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\\\"\\\\\\\"\\\"/a\"");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("a/\"hi!\"ahi!a\"hi!\"/a");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.jsString("/a////hi!////a/", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\"/a////hi!////a/\"" + "'", str2, "\"/a////hi!////a/\"");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/a 4 /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"4ahi!a4\"'/\\\"4ahi!a4\\\"/'\"/  hi!  /\"'/\\\"4ahi!a4\\\"/'\"/   hi!   hi!   hi!   / 4 a/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/a 4 /   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   / 4 a/\"" + "'", str1, "\"/a 4 /   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   / hi! /   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   /hi!/   hi!   hi!   hi!   /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"4ahi!a4\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/  hi!  /\\\"'/\\\\\\\"4ahi!a4\\\\\\\"/'\\\"/   hi!   hi!   hi!   / 4 a/\"");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\"/\\\\\\\"hi!\\\\\\\"/\\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        codeGenerator21.addList(node35, false, context42);
        codeGenerator1.addList(node17, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator1.addAllSiblings(node48);
        java.lang.Class<?> wildcardClass50 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("a/\"hi!\"ahi!a\"hi!\"/a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'/a/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/4ahi!a4\\'/\"ahi!a\"/\\'/\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"//\"\\\\\"\\\\\\\\\\\\\"4ahi!a4\\\\\\\\\\\\\"\\\\\"\"/a/'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addAllSiblings(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addList(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addList(node20, false);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator19.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator19.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node50, false, context52);
        codeGenerator32.addList(node38, true, context52);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, true, context62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator59.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node70, false, context72);
        codeGenerator32.addList(node55, true, context72);
        codeGenerator19.addList(node29, false, context72);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node17, context72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.nio.charset.CharsetEncoder charsetEncoder5 = null;
        java.lang.String str6 = com.google.javascript.jscomp.CodeGenerator.strEscape("4ahi!a4", '4', "/hi!/", " ahi!a ", " 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 ", charsetEncoder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "44ahi!a44" + "'", str6, "44ahi!a44");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"/\\\"///hi!///\\\"/\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"/\\\"///hi!///\\\"/\"/" + "'", str1, "/\"/\\\"///hi!///\\\"/\"/");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator11.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        codeGenerator11.addList(node17, true, context31);
        com.google.javascript.rhino.Node node34 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer36 = null;
        java.nio.charset.Charset charset37 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator38 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer36, charset37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context41 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node39, true, context41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node43, false, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator38.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator38.addList(node49, false, context51);
        codeGenerator11.addList(node34, true, context51);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node9, context51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context41 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context41.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("/// \"hi!\" hi! \"hi!\" ///");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"/// \\\"hi!\\\" hi! \\\"hi!\\\" ///\"" + "'", str1, "\"/// \\\"hi!\\\" hi! \\\"hi!\\\" ///\"");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "///\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"///" + "'", str1, "///\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"///");
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4//" + "'", str1, "//4/'#\" hi! \" hi! \" hi! \"#'/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/'#\" hi! \" hi! \" hi! \"#'/4//");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addAllSiblings(node2);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        com.google.javascript.rhino.Node node20 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("////");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addCaseBody(node11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addAllSiblings(node12);
        com.google.javascript.rhino.Node node14 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer16 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator17 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator17.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator17.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer25 = null;
        java.nio.charset.Charset charset26 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator27 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer25, charset26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator27.addArrayList(node28);
        com.google.javascript.rhino.Node node30 = null;
        codeGenerator27.addList(node30, true);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator27.addAllSiblings(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context37 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator27.addList(node35, false, context37);
        codeGenerator17.addList(node23, true, context37);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context47 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node45, true, context47);
        com.google.javascript.rhino.Node node49 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context51 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node49, false, context51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator44.addList(node53);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context57 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator44.addList(node55, false, context57);
        codeGenerator17.addList(node40, true, context57);
        codeGenerator2.addList(node14, true, context57);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator2.addArrayList(node61);
        com.google.javascript.rhino.Node node63 = null;
        codeGenerator2.addArrayList(node63);
        org.junit.Assert.assertTrue("'" + context37 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context37.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context47 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context47.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context51 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context51.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context57 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context57.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("/aa/");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("//\"/'/\\\"4ahi!a4\\\"/'/\"//");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        java.lang.Class<?> wildcardClass11 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\" 4/#/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a4ahi!a4a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/hi!/a////hi!////a/    a////hi!////ahi!    a////hi!////a/a////hi!////a/#/4 \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator2.addAllSiblings(node15);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("\"'/\\\"hi!\\\"/'\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, false, context27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addList(node31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer35 = null;
        java.nio.charset.Charset charset36 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator37 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer35, charset36);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator37.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator37.addArrayList(node40);
        com.google.javascript.rhino.Node node42 = null;
        codeGenerator37.addArrayList(node42);
        com.google.javascript.rhino.Node node44 = null;
        codeGenerator37.addAllSiblings(node44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator37.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator37.addList(node48, true);
        com.google.javascript.rhino.Node node51 = null;
        codeGenerator37.addArrayList(node51);
        com.google.javascript.rhino.Node node53 = null;
        codeGenerator37.addAllSiblings(node53);
        com.google.javascript.rhino.Node node55 = null;
        codeGenerator37.addAllSiblings(node55);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator61.addArrayList(node66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator61.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addAllSiblings(node70);
        com.google.javascript.rhino.Node node72 = null;
        codeGenerator61.addArrayList(node72);
        com.google.javascript.rhino.Node node74 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer76 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator77 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer76);
        com.google.javascript.rhino.Node node78 = null;
        codeGenerator77.addList(node78, false);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator77.addArrayList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator77.addList(node83, false, context85);
        com.google.javascript.rhino.Node node87 = null;
        codeGenerator77.addAllSiblings(node87);
        com.google.javascript.rhino.Node node89 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context91 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator77.addList(node89, false, context91);
        codeGenerator61.addList(node74, true, context91);
        codeGenerator37.addList(node57, false, context91);
        codeGenerator1.addList(node33, false, context91);
        com.google.javascript.rhino.Node node96 = null;
        codeGenerator1.addList(node96, false);
        java.lang.Class<?> wildcardClass99 = codeGenerator1.getClass();
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context91 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context91.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addList(node18, false);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator2.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator2.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node25, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.nio.charset.CharsetEncoder charsetEncoder1 = null;
        java.lang.String str2 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a", charsetEncoder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a/" + "'", str2, "/a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a/");
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, false);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/'/\"\\\\\"4ahi!a4\\\\\"\"/'/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator18 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17);
        com.google.javascript.rhino.Node node19 = null;
        codeGenerator18.addList(node19, false);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator18.addAllSiblings(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator28.addArrayList(node29);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator28.addList(node31, true);
        com.google.javascript.rhino.Node node34 = null;
        codeGenerator28.addAllSiblings(node34);
        com.google.javascript.rhino.Node node36 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context38 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator28.addList(node36, false, context38);
        codeGenerator18.addList(node24, true, context38);
        com.google.javascript.rhino.Node node41 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer43 = null;
        java.nio.charset.Charset charset44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer43, charset44);
        com.google.javascript.rhino.Node node46 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context48 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator45.addList(node46, true, context48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator45.addList(node50, false, context52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator45.addList(node54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator45.addList(node56, false, context58);
        codeGenerator18.addList(node41, true, context58);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator18.addList(node61, true);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator18.addList(node64, true, context66);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node16, context66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context38 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context38.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context48 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context48.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node11, 0);
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
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context24 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node22, true, context24);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator21.addList(node26, false, context28);
        codeGenerator2.addList(node17, true, context28);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addArrayList(node38);
        com.google.javascript.rhino.Node node40 = null;
        codeGenerator34.addList(node40);
        com.google.javascript.rhino.Node node42 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer44 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator45 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer44);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator45.addList(node46, false);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator45.addAllSiblings(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator55.addArrayList(node56);
        com.google.javascript.rhino.Node node58 = null;
        codeGenerator55.addList(node58, true);
        com.google.javascript.rhino.Node node61 = null;
        codeGenerator55.addAllSiblings(node61);
        com.google.javascript.rhino.Node node63 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context65 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator55.addList(node63, false, context65);
        codeGenerator45.addList(node51, true, context65);
        com.google.javascript.rhino.Node node68 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer70 = null;
        java.nio.charset.Charset charset71 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator72 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer70, charset71);
        com.google.javascript.rhino.Node node73 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context75 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node73, true, context75);
        com.google.javascript.rhino.Node node77 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context79 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node77, false, context79);
        com.google.javascript.rhino.Node node81 = null;
        codeGenerator72.addList(node81);
        com.google.javascript.rhino.Node node83 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context85 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator72.addList(node83, false, context85);
        codeGenerator45.addList(node68, true, context85);
        codeGenerator34.addList(node42, false, context85);
        codeGenerator2.addList(node31, true, context85);
        com.google.javascript.rhino.Node node90 = null;
        codeGenerator2.addList(node90);
        com.google.javascript.rhino.Node node92 = null;
        codeGenerator2.addList(node92, true);
        com.google.javascript.rhino.Node node95 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node95);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context24 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context24.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context65 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context65.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context75 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context75.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context79 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context79.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context85 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context85.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addArrayList(node8);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addArrayList(node10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer14 = null;
        java.nio.charset.Charset charset15 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator16 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer14, charset15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context19 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node17, true, context19);
        com.google.javascript.rhino.Node node21 = null;
        codeGenerator16.addAllSiblings(node21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator16.addList(node23, true);
        com.google.javascript.rhino.Node node26 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context28 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator16.addList(node26, true, context28);
        codeGenerator2.addList(node12, false, context28);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator2.addAllSiblings(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(" ahi!a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context19 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context19.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context28 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context28.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator2.addList(node7, false, context9);
        java.lang.Class<?> wildcardClass11 = context9.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addArrayList(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addList(node22, false);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator21.addArrayList(node25);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addArrayList(node43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator42.addList(node45, true);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addAllSiblings(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator42.addList(node50, false, context52);
        codeGenerator32.addList(node38, true, context52);
        com.google.javascript.rhino.Node node55 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer57 = null;
        java.nio.charset.Charset charset58 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator59 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer57, charset58);
        com.google.javascript.rhino.Node node60 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context62 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node60, true, context62);
        com.google.javascript.rhino.Node node64 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context66 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node64, false, context66);
        com.google.javascript.rhino.Node node68 = null;
        codeGenerator59.addList(node68);
        com.google.javascript.rhino.Node node70 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context72 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator59.addList(node70, false, context72);
        codeGenerator32.addList(node55, true, context72);
        codeGenerator21.addList(node29, false, context72);
        codeGenerator2.addList(node18, true, context72);
        java.lang.Class<?> wildcardClass77 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context62 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context62.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context66 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context66.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context72 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context72.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK;
        codeGenerator1.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator1.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator1.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer19 = null;
        java.nio.charset.Charset charset20 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator21 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer19, charset20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator21.addArrayList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator21.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator21.addAllSiblings(node27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator21.addList(node29, false, context31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator21.addList(node33);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        codeGenerator21.addList(node35, false, context42);
        codeGenerator1.addList(node17, true, context42);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator1.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator1.addAllSiblings(node48);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("\"\\\" 44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44 \\\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.PRESERVE_BLOCK));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer12 = null;
        java.nio.charset.Charset charset13 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator14 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer12, charset13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context17 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node15, true, context17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node19, false, context21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator14.addList(node23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator14.addList(node25, false, context27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addList(node33, false);
        com.google.javascript.rhino.Node node36 = null;
        codeGenerator32.addAllSiblings(node36);
        com.google.javascript.rhino.Node node38 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer40 = null;
        java.nio.charset.Charset charset41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer40, charset41);
        com.google.javascript.rhino.Node node43 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context45 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator42.addList(node43, true, context45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator42.addList(node47);
        com.google.javascript.rhino.Node node49 = null;
        codeGenerator42.addList(node49);
        com.google.javascript.rhino.Node node51 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer53 = null;
        java.nio.charset.Charset charset54 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator55 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer53, charset54);
        com.google.javascript.rhino.Node node56 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context58 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator55.addList(node56, true, context58);
        codeGenerator42.addList(node51, false, context58);
        codeGenerator32.addList(node38, false, context58);
        codeGenerator14.addList(node29, true, context58);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node11, context58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context17 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context17.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context45 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context45.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context58 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context58.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer13 = null;
        java.nio.charset.Charset charset14 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator15 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer13, charset14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context18 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator15.addList(node16, true, context18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator15.addList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator15.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer26 = null;
        java.nio.charset.Charset charset27 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator28 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer26, charset27);
        com.google.javascript.rhino.Node node29 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context31 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator28.addList(node29, true, context31);
        codeGenerator15.addList(node24, false, context31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node11, (int) (short) 1, context31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context18 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context18.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context31 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context31.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator11.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator11.addList(node14, true);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator11.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context21 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator11.addList(node19, false, context21);
        codeGenerator1.addList(node7, true, context21);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator1.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator1.addArrayList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator1.addList(node29, true);
        com.google.javascript.rhino.Node node32 = null;
        codeGenerator1.addAllSiblings(node32);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context21 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context21.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("//\"4#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#\\\"4ahi!a4\\\" hi! \\\"4ahi!a4\\\"#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#4\"//");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addList(node12, false);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        codeGenerator19.addArrayList(node20);
        com.google.javascript.rhino.Node node22 = null;
        codeGenerator19.addList(node22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24, true);
        com.google.javascript.rhino.Node node27 = null;
        codeGenerator19.addList(node27);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator19.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer33 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator34 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator34.addList(node35, false);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator34.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer42 = null;
        java.nio.charset.Charset charset43 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator44 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer42, charset43);
        com.google.javascript.rhino.Node node45 = null;
        codeGenerator44.addArrayList(node45);
        com.google.javascript.rhino.Node node47 = null;
        codeGenerator44.addList(node47, true);
        com.google.javascript.rhino.Node node50 = null;
        codeGenerator44.addAllSiblings(node50);
        com.google.javascript.rhino.Node node52 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context54 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator44.addList(node52, false, context54);
        codeGenerator34.addList(node40, true, context54);
        com.google.javascript.rhino.Node node57 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer59 = null;
        java.nio.charset.Charset charset60 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator61 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer59, charset60);
        com.google.javascript.rhino.Node node62 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context64 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node62, true, context64);
        com.google.javascript.rhino.Node node66 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context68 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node66, false, context68);
        com.google.javascript.rhino.Node node70 = null;
        codeGenerator61.addList(node70);
        com.google.javascript.rhino.Node node72 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context74 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator61.addList(node72, false, context74);
        codeGenerator34.addList(node57, true, context74);
        codeGenerator19.addList(node31, true, context74);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, (int) (byte) 10, context74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context54 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context54.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context64 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context64.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context68 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context68.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context74 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context74.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        boolean boolean1 = com.google.javascript.jscomp.CodeGenerator.isSimpleNumber("\"/'/\\\"4ahi!a4\\\"/'/\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString(" ///4ahi!a4/// ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\" ///4ahi!a4/// \"" + "'", str1, "\" ///4ahi!a4/// \"");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9, true);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator2.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator2.addAllSiblings(node18);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7, true);
        com.google.javascript.rhino.Node node10 = null;
        codeGenerator2.addList(node10);
        com.google.javascript.rhino.Node node12 = null;
        codeGenerator2.addArrayList(node12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addAllSiblings(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addAllSiblings(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator2.addList(node13, true);
        java.lang.Class<?> wildcardClass16 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node7, (int) '4');
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
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer11 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator12 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator12.addList(node13, false);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator12.addAllSiblings(node16);
        com.google.javascript.rhino.Node node18 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer20 = null;
        java.nio.charset.Charset charset21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer20, charset21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addArrayList(node23);
        com.google.javascript.rhino.Node node25 = null;
        codeGenerator22.addList(node25, true);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator22.addAllSiblings(node28);
        com.google.javascript.rhino.Node node30 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context32 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator22.addList(node30, false, context32);
        codeGenerator12.addList(node18, true, context32);
        com.google.javascript.rhino.Node node35 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer37 = null;
        java.nio.charset.Charset charset38 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator39 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer37, charset38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node40, true, context42);
        com.google.javascript.rhino.Node node44 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context46 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node44, false, context46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator39.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context52 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator39.addList(node50, false, context52);
        codeGenerator12.addList(node35, true, context52);
        codeGenerator1.addList(node9, false, context52);
        com.google.javascript.rhino.Node node56 = null;
        codeGenerator1.addList(node56, true);
        com.google.javascript.rhino.Node node59 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.addExpr(node59, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context32 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context32.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context46 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context46.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context52 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context52.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"##//\\\"hi!\\\"/hi!/\\\"hi!\\\"//hi!//\\\"hi!\\\"/hi!/\\\"hi!\\\"///hi!/hi!//\\\"hi!\\\"/hi!/\\\"hi!\\\"////\\\"hi!\\\"/hi!/\\\"hi!\\\"//##\"" + "'", str1, "\"##//\\\"hi!\\\"/hi!/\\\"hi!\\\"//hi!//\\\"hi!\\\"/hi!/\\\"hi!\\\"///hi!/hi!//\\\"hi!\\\"/hi!/\\\"hi!\\\"////\\\"hi!\\\"/hi!/\\\"hi!\\\"//##\"");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addAllSiblings(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator1.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator1.addList(node9, false);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.tagAsStrict();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("'4/#/\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"4ahi!a4\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"/#/4'");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/'4/#/\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"4ahi!a4\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"/#/4'/" + "'", str1, "/'4/#/\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"4ahi!a4\"/\\\\\"hi!\\\\\"/\"/hi!/\"/\\\\\"hi!\\\\\"/\"/#/4'/");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer8 = null;
        java.nio.charset.Charset charset9 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator10 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer8, charset9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator10.addArrayList(node11);
        com.google.javascript.rhino.Node node13 = null;
        codeGenerator10.addArrayList(node13);
        com.google.javascript.rhino.Node node15 = null;
        codeGenerator10.addAllSiblings(node15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator10.addArrayList(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator22 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21);
        com.google.javascript.rhino.Node node23 = null;
        codeGenerator22.addList(node23, false);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator22.addAllSiblings(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        codeGenerator32.addArrayList(node33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator32.addList(node35, true);
        com.google.javascript.rhino.Node node38 = null;
        codeGenerator32.addAllSiblings(node38);
        com.google.javascript.rhino.Node node40 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context42 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator32.addList(node40, false, context42);
        codeGenerator22.addList(node28, true, context42);
        codeGenerator10.addList(node19, false, context42);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add(node7, context42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context42 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context42.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node7, false, context9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        com.google.javascript.rhino.Node node13 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context15 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node13, false, context15);
        com.google.javascript.rhino.Node node17 = null;
        codeGenerator2.addAllSiblings(node17);
        com.google.javascript.rhino.Node node19 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer21 = null;
        java.nio.charset.Charset charset22 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator23 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer21, charset22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator23.addArrayList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator23.addList(node26, true);
        com.google.javascript.rhino.Node node29 = null;
        codeGenerator23.addAllSiblings(node29);
        com.google.javascript.rhino.Node node31 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context33 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator23.addList(node31, false, context33);
        com.google.javascript.rhino.Node node35 = null;
        codeGenerator23.addList(node35);
        com.google.javascript.rhino.Node node37 = null;
        codeGenerator23.addArrayList(node37);
        com.google.javascript.rhino.Node node39 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer41 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator42 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer41);
        com.google.javascript.rhino.Node node43 = null;
        codeGenerator42.addList(node43, false);
        com.google.javascript.rhino.Node node46 = null;
        codeGenerator42.addArrayList(node46);
        com.google.javascript.rhino.Node node48 = null;
        codeGenerator42.addList(node48);
        com.google.javascript.rhino.Node node50 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer52 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator53 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer52);
        com.google.javascript.rhino.Node node54 = null;
        codeGenerator53.addList(node54, false);
        com.google.javascript.rhino.Node node57 = null;
        codeGenerator53.addAllSiblings(node57);
        com.google.javascript.rhino.Node node59 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer61 = null;
        java.nio.charset.Charset charset62 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator63 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer61, charset62);
        com.google.javascript.rhino.Node node64 = null;
        codeGenerator63.addArrayList(node64);
        com.google.javascript.rhino.Node node66 = null;
        codeGenerator63.addList(node66, true);
        com.google.javascript.rhino.Node node69 = null;
        codeGenerator63.addAllSiblings(node69);
        com.google.javascript.rhino.Node node71 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context73 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator63.addList(node71, false, context73);
        codeGenerator53.addList(node59, true, context73);
        com.google.javascript.rhino.Node node76 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer78 = null;
        java.nio.charset.Charset charset79 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator80 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer78, charset79);
        com.google.javascript.rhino.Node node81 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context83 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator80.addList(node81, true, context83);
        com.google.javascript.rhino.Node node85 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context87 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator80.addList(node85, false, context87);
        com.google.javascript.rhino.Node node89 = null;
        codeGenerator80.addList(node89);
        com.google.javascript.rhino.Node node91 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context93 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator80.addList(node91, false, context93);
        codeGenerator53.addList(node76, true, context93);
        codeGenerator42.addList(node50, false, context93);
        codeGenerator23.addList(node39, true, context93);
        codeGenerator2.addList(node19, false, context93);
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context15 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context15.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context33 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context33.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context73 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context73.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context83 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context83.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context87 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context87.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context93 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context93.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addArrayList(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node11, true, context13);
        com.google.javascript.rhino.Node node15 = null;
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addExpr(node15, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context13 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context13.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("/\"4/hi!/4\"/");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "//\"4/hi!/4\"//" + "'", str1, "//\"4/hi!/4\"//");
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("/a/4 ///4ahi!a4/// 4/\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"4ahi!a4a    aa    a\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"\"\\\"'/\\\\\\\"hi!\\\\\\\"/'\\\"\"/4 ///4ahi!a4/// 4/a/");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addAllSiblings(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addAllSiblings(node9);
        com.google.javascript.rhino.Node node11 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context13 = null;
        codeGenerator2.addList(node11, false, context13);
        com.google.javascript.rhino.Node node15 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer17 = null;
        java.nio.charset.Charset charset18 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator19 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer17, charset18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context22 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator19.addList(node20, true, context22);
        com.google.javascript.rhino.Node node24 = null;
        codeGenerator19.addList(node24);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator19.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer30 = null;
        java.nio.charset.Charset charset31 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator32 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer30, charset31);
        com.google.javascript.rhino.Node node33 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context35 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator32.addList(node33, true, context35);
        codeGenerator19.addList(node28, false, context35);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.addLeftExpr(node15, 1, context35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context22 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context22.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context35 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context35.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.escapeToDoubleQuotedJsString("##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"##\"" + "'", str1, "\"##\"");
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context5 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator2.addList(node3, true, context5);
        com.google.javascript.rhino.Node node7 = null;
        codeGenerator2.addArrayList(node7);
        com.google.javascript.rhino.Node node9 = null;
        codeGenerator2.addList(node9);
        com.google.javascript.rhino.Node node11 = null;
        codeGenerator2.addList(node11);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("/ \"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\"4//4\"aa/44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44ahi!a44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44hi!44#//hi!/4ahi!a4/hi!//#4ahi!a4 hi! 4ahi!a4#//hi!/4ahi!a4/hi!//#44/aa\" /");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context5 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context5.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer9 = null;
        java.nio.charset.Charset charset10 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator11 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer9, charset10);
        com.google.javascript.rhino.Node node12 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context14 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator11.addList(node12, true, context14);
        com.google.javascript.rhino.Node node16 = null;
        codeGenerator11.addList(node16);
        com.google.javascript.rhino.Node node18 = null;
        codeGenerator11.addList(node18);
        com.google.javascript.rhino.Node node20 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer22 = null;
        java.nio.charset.Charset charset23 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator24 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer22, charset23);
        com.google.javascript.rhino.Node node25 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context27 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator24.addList(node25, true, context27);
        codeGenerator11.addList(node20, false, context27);
        codeGenerator1.addList(node7, true, context27);
        com.google.javascript.rhino.Node node31 = null;
        codeGenerator1.addArrayList(node31);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator1.add("/4 hi! 4/");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context14 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context14.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
        org.junit.Assert.assertTrue("'" + context27 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context27.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator1 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0);
        com.google.javascript.rhino.Node node2 = null;
        codeGenerator1.addList(node2, false);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator1.addArrayList(node5);
        com.google.javascript.rhino.Node node7 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context9 = com.google.javascript.jscomp.CodeGenerator.Context.OTHER;
        codeGenerator1.addList(node7, false, context9);
        java.lang.Class<?> wildcardClass11 = context9.getClass();
        org.junit.Assert.assertTrue("'" + context9 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.OTHER + "'", context9.equals(com.google.javascript.jscomp.CodeGenerator.Context.OTHER));
        org.junit.Assert.assertNotNull(wildcardClass11);
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
        codeGenerator1.addAllSiblings(node5);
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        com.google.javascript.rhino.Node node14 = null;
        codeGenerator2.addList(node14);
        com.google.javascript.rhino.Node node16 = null;
        com.google.javascript.jscomp.CodeConsumer codeConsumer18 = null;
        java.nio.charset.Charset charset19 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator20 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer18, charset19);
        com.google.javascript.rhino.Node node21 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context23 = com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE;
        codeGenerator20.addList(node21, true, context23);
        codeGenerator2.addList(node16, false, context23);
        com.google.javascript.rhino.Node node26 = null;
        codeGenerator2.addList(node26);
        com.google.javascript.rhino.Node node28 = null;
        codeGenerator2.addList(node28, true);
        // The following exception was thrown during execution in test generation
        try {
            codeGenerator2.add("##//\"hi!\"/hi!/\"hi!\"//hi!//\"hi!\"/hi!/\"hi!\"///hi!/hi!//\"hi!\"/hi!/\"hi!\"////\"hi!\"/hi!/\"hi!\"//##");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertTrue("'" + context23 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE + "'", context23.equals(com.google.javascript.jscomp.CodeGenerator.Context.BEFORE_DANGLING_ELSE));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        com.google.javascript.jscomp.CodeConsumer codeConsumer0 = null;
        java.nio.charset.Charset charset1 = null;
        com.google.javascript.jscomp.CodeGenerator codeGenerator2 = new com.google.javascript.jscomp.CodeGenerator(codeConsumer0, charset1);
        com.google.javascript.rhino.Node node3 = null;
        codeGenerator2.addArrayList(node3);
        com.google.javascript.rhino.Node node5 = null;
        codeGenerator2.addList(node5, true);
        com.google.javascript.rhino.Node node8 = null;
        codeGenerator2.addAllSiblings(node8);
        com.google.javascript.rhino.Node node10 = null;
        com.google.javascript.jscomp.CodeGenerator.Context context12 = com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR;
        codeGenerator2.addList(node10, false, context12);
        java.lang.Class<?> wildcardClass14 = codeGenerator2.getClass();
        org.junit.Assert.assertTrue("'" + context12 + "' != '" + com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR + "'", context12.equals(com.google.javascript.jscomp.CodeGenerator.Context.START_OF_EXPR));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        double double1 = com.google.javascript.jscomp.CodeGenerator.getSimpleNumber("'\"hi!\"'");
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        java.lang.String str1 = com.google.javascript.jscomp.CodeGenerator.regexpEscape("\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"/" + "'", str1, "/\"4/\\\"ahi!a\\\"///#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#/4ahi!a4/#/\\\"/hi!/\\\"4ahi!a4\\\"/hi!/\\\"/#///\\\"ahi!a\\\"/4\"/");
    }
}

